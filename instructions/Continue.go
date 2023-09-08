package instructions

import (
	"Proyecto1_OLC2_2S2023_202101648/Environment"
	"fmt"
	//"Proyecto1_OLC2_2S2023_202101648/interfaces"
)

type Continue struct {
	Lin 		int
	Col 		int
}

func NewContinue(lin int, col int) Continue {
	return Continue{lin,col}
}

func (p Continue) Ejecutar(ast *environment.AST, env interface{}) environment.Symbol {
	var resultado environment.Symbol
	resultado = environment.Symbol{Lin: p.Lin, Col: p.Col, Tipo: environment.NULL, Valor: "continue", Mutable: false,BreakFlag: false,ContinueFlag: true}
	fmt.Print("ENCONTRE  Continue")
	return resultado
}
