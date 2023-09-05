package expressions

import (
	"Proyecto1_OLC2_2S2023_202101648/Environment"
	"Proyecto1_OLC2_2S2023_202101648/interfaces"
	//"fmt"
)

type ForRange struct {
	Lin 		int
	Col 		int
	range1 		interfaces.Expression
	range2 		interfaces.Expression
}

func NewForRange(lin int, col int, r1 interfaces.Expression, r2 interfaces.Expression) ForRange {
	return ForRange{lin,col,r1,r2}
}

func (p ForRange) Ejecutar(ast *environment.AST, env interface{}) environment.Symbol {
	var rang1,rang2 environment.Symbol
	var rango []interface{}

	rang1 = p.range1.Ejecutar(ast,env)
	rang2 = p.range2.Ejecutar(ast,env)
	
	if (rang1.Valor.(int) < rang2.Valor.(int)+1) && (rang1.Tipo == environment.INTEGER) && (rang2.Tipo == environment.INTEGER) {
		var tmpVal environment.Symbol
		index := rang1.Valor.(int)
		tmpVal = environment.Symbol{Lin: p.Lin, Col: p.Col, Tipo: environment.INTEGER, Valor: index, Mutable: true}
		rango = append(rango,tmpVal)
		for {
			index++
			if index < rang2.Valor.(int)+1 {
				tmpVal = environment.Symbol{Lin: p.Lin, Col: p.Col, Tipo: environment.INTEGER, Valor: index, Mutable: true}
				rango = append(rango,tmpVal)
			} else {
				break
			}
		}
	} else {
		ast.SetErrors("Error en los indices")
	}
	return environment.Symbol{Lin: p.Lin, Col: p.Col, Tipo: environment.ARRAY, Valor: rango, Mutable: true}
}