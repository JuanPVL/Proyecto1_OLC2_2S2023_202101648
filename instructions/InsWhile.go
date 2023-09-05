package instructions

import (
	"Proyecto1_OLC2_2S2023_202101648/Environment"
	"Proyecto1_OLC2_2S2023_202101648/interfaces"
	"fmt"
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

func (p While) Ejecutar(ast *environment.AST, env interface{}) environment.Symbol {
	var condicion environment.Symbol
	//breakBandera := false
	das:for{
		condicion = p.Condicion.Ejecutar(ast,env)

		if condicion.Tipo != environment.BOOLEAN {
			ast.SetErrors("La condicion no es booleana")
			return environment.Symbol{Lin: p.Lin, Col: p.Col, Tipo: environment.NULL, Valor: nil, Mutable: true}
		}
		if condicion.Valor == true {
			var whileEnv environment.Environment
			whileEnv = environment.NewEnvironment(env.(environment.Environment),"WHILE")
	
			 for _, instr := range p.Bloque {
				val := instr.(interfaces.Instruction).Ejecutar(ast,whileEnv)
				fmt.Println("VALOR DE Val: ",val.Valor)
				if val.BreakFlag == true || val.Tipo == environment.BREAKY || val.Valor == "break"{
					fmt.Print("ENCONTRE BREAK en while")
					break das
				}
			}
		} else {
			break
		}	
	}
	return environment.Symbol{Lin: p.Lin, Col: p.Col, Tipo: environment.NULL, Valor: nil, Mutable: true}
}