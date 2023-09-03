package instructions

import (
	"Proyecto1_OLC2_2S2023_202101648/Environment"
	"Proyecto1_OLC2_2S2023_202101648/interfaces"
)

type If struct {
	Lin 		int
	Col 		int
	Condicion 	interfaces.Expression
	Bloque 		[]interface{}
	ElseBloque 	[]interface{}
}

func NewIf(lin int, col int, condition interfaces.Expression, bloque []interface{}, elsebloque []interface{}) If {
	ifInstr := If{lin, col, condition, bloque, elsebloque}
	return ifInstr
}

func (p If) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	var condicion environment.Symbol
	condicion = p.Condicion.Ejecutar(ast,env)

	if condicion.Tipo != environment.BOOLEAN {
		ast.SetErrors("La condicion no es booleana")
		return nil
	}

	if condicion.Valor == true {
		var ifEnv environment.Environment
		ifEnv = environment.NewEnvironment(env.(environment.Environment),"IF")
		for _, inst := range p.Bloque {
			inst.(interfaces.Instruction).Ejecutar(ast,ifEnv)
		}
		return nil
	} else {
		var elseEnv environment.Environment
		elseEnv = environment.NewEnvironment(env.(environment.Environment),"ELSE")
		for _, inst := range p.ElseBloque {
			inst.(interfaces.Instruction).Ejecutar(ast,elseEnv)
		}
		return nil
	}
	return nil
}

