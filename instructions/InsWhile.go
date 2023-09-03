package instructions

import (
	"Proyecto1_OLC2_2S2023_202101648/Environment"
	"Proyecto1_OLC2_2S2023_202101648/interfaces"
)

type While struct {
	Lin 		int
	Col 		int
	Condicion 	interfaces.Expression
	Bloque 		[]interface{}
}

func NewWhile(lin int, col int, condition interfaces.Expression, bloque []interface{}) While {
	whileInstr := While{lin, col, condition, bloque}
	return whileInstr
}

func (p While) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	var condicion environment.Symbol

	for{
		condicion = p.Condicion.Ejecutar(ast,env)

		if condicion.Tipo != environment.BOOLEAN {
			ast.SetErrors("La condicion no es booleana")
			return nil
		}
		if condicion.Valor == true {
			var whileEnv environment.Environment
			whileEnv = environment.NewEnvironment(env.(environment.Environment),"WHILE")
	
			for _, instr := range p.Bloque {
				instr.(interfaces.Instruction).Ejecutar(ast,whileEnv)
			}
		} else {
			break
		}	
	}
	return nil
}