package main

import (
	"Proyecto1_OLC2_2S2023_202101648/Environment"
	"Proyecto1_OLC2_2S2023_202101648/interfaces"
	"Proyecto1_OLC2_2S2023_202101648/parser"
	"strconv"

	"github.com/antlr4-go/antlr/v4"
	"github.com/gofiber/fiber/v2"
	"github.com/gofiber/fiber/v2/middleware/cors"
)

type TreeShapeListener struct {
	*parser.BaseSwiftGrammarListener
	Code []interface{}
}

type Resp struct {
	Output  string
	ErroresP string
	TablaSimbs string
	Flag    bool
	Message string
}

type Message struct {
	Content string `json:"content"`
}

func handleInterpreter(c *fiber.Ctx) error {
	var message Message
	if err := c.BodyParser(&message); err != nil {
		return err
	}
	//Entrada
	code := message.Content
	//Leyendo entrada
	input := antlr.NewInputStream(code)
	lexer := parser.NewSwiftLexer(input)
	tokens := antlr.NewCommonTokenStream(lexer, antlr.TokenDefaultChannel)
	//creacion de parser
	p := parser.NewSwiftGrammarParser(tokens)
	p.BuildParseTrees = true
	//p.RemoveErrorListeners()
	//p.AddErrorListener(antlr.Error)
	tree := p.S()
	//listener
	var listener *TreeShapeListener = NewTreeShapeListener()
	antlr.ParseTreeWalkerDefault.Walk(listener, tree)
	Code := listener.Code
	//create ast
	var Ast environment.AST
	//create env
	var globalEnv environment.Environment = environment.NewEnvironment(nil, "GLOBAL")
	//ejecución
	for _, inst := range Code {
		inst.(interfaces.Instruction).Ejecutar(&Ast, globalEnv)
	}
	var ConsoleOut = ""
	var grapherrors = ""
	var graphTS = ""
	var contadorsito = 1
	errorsitos := Ast.GetErrors()
	simbolitos := Ast.GetTablaSimbolos()
	grapherrors = "digraph Errores {\n parent [shape=none\n label=<\n <table border= '1' cellspacing=\"0\">\n <tr><td bgcolor=\"#FFD352\">No.</td><td bgcolor=\"#FFD352\">Descripcion</td><td bgcolor=\"#FFD352\">Ambito</td><td bgcolor=\"#FFD352\">Linea</td><td bgcolor=\"#FFD352\">Columna</td></tr>\n"

	for _, errorl := range errorsitos {
		ConsoleOut += "Error en la linea " + errorl.(environment.ErrorS).Lin + " y columna " + errorl.(environment.ErrorS).Col + " " + errorl.(environment.ErrorS).Descripcion + "\n"
		grapherrors += "<tr><td>" + strconv.Itoa(contadorsito) + "</td><td>" + errorl.(environment.ErrorS).Descripcion + "</td><td>" + errorl.(environment.ErrorS).Ambito + "</td><td>" + errorl.(environment.ErrorS).Lin + "</td><td>" + errorl.(environment.ErrorS).Col + "</td></tr>\n"
		contadorsito++
	}
	grapherrors += "</table>>];\n}"
	ConsoleOut += Ast.GetPrint()

	graphTS = "digraph TSimbolos {\n parent [shape=none\n label=<\n <table border= '1' cellspacing=\"0\">\n <tr><td bgcolor=\"#FFD352\">ID</td><td bgcolor=\"#FFD352\">Tipo Simbolo</td><td bgcolor=\"#FFD352\">Tipo Dato</td><td bgcolor=\"#FFD352\">Ambito</td><td bgcolor=\"#FFD352\">Linea</td><td bgcolor=\"#FFD352\">Columna</td></tr>\n"
	
	for _, simbolito := range simbolitos {
		graphTS += "<tr><td>" + simbolito.(environment.SimbolTabla).Id + "</td><td>" + simbolito.(environment.SimbolTabla).TipoSimbolo + "</td><td>" + simbolito.(environment.SimbolTabla).TipoDato + "</td><td>" + simbolito.(environment.SimbolTabla).Ambito + "</td><td>" + simbolito.(environment.SimbolTabla).Lin + "</td><td>" + simbolito.(environment.SimbolTabla).Col + "</td></tr>\n"
	}
	graphTS += "</table>>];\n}"

	response := Resp{
		Output:  ConsoleOut,
		ErroresP: grapherrors,
		TablaSimbs: graphTS,
		Flag:    true,
		Message: "<3 Ejecución realizada con éxito <3",
	}
	return c.Status(fiber.StatusOK).JSON(response)
}

func main() {
	app := fiber.New()
	app.Use(cors.New())
	app.Post("/Interpreter", handleInterpreter)
	app.Listen(":3002")
}

func NewTreeShapeListener() *TreeShapeListener {
	return new(TreeShapeListener)
}

func (this *TreeShapeListener) ExitS(ctx *parser.SContext) {
	this.Code = ctx.GetCode()
}
