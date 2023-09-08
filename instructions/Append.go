package instructions

import (
	"Proyecto1_OLC2_2S2023_202101648/Environment"
	"Proyecto1_OLC2_2S2023_202101648/interfaces"
	//"fmt"
	"strconv"
)

type Append struct {
	Lin 		int
	Col 		int
	Id 			string
	Expresion 	interfaces.Expression
}

func NewAppend(lin int, col int,id string, val interfaces.Expression) Append{
	instr := Append{lin, col,id, val}
	return instr
}

func (va Append) Ejecutar(ast *environment.AST, env interface{}) environment.Symbol {
	var tmpvector environment.Symbol
	linea := strconv.Itoa(va.Lin)
	columna := strconv.Itoa(va.Col)
	tmpvector = env.(environment.Environment).GetVariable(va.Id,ast,linea,columna)
	tmpexp := va.Expresion.Ejecutar(ast,env)

	if tmpvector.Tipo == environment.VECTOR {
		if(tmpexp.Tipo == tmpvector.VectorTipo) {
			tmpvector.Valor = append(tmpvector.Valor.([]interface{}),tmpexp)
			env.(environment.Environment).SetVariable(va.Id, tmpvector,ast)
			return tmpvector
		} else {
			ast.SetErrors(environment.ErrorS{Lin: linea, Col: columna, Descripcion: "El tipo de dato no es valido", Ambito: env.(environment.Environment).Id})
			return environment.Symbol{Lin: va.Lin, Col: va.Col, Tipo: environment.NULL, Valor: nil, Mutable: true}
		}
	}
	ast.SetErrors(environment.ErrorS{Lin: linea, Col: columna, Descripcion: "La variable no es un vector", Ambito: env.(environment.Environment).Id})
	return environment.Symbol{Lin: va.Lin, Col: va.Col, Tipo: environment.NULL, Valor: nil, Mutable: true}
}
