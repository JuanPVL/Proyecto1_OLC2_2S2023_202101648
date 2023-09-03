package expressions

import(
	"Proyecto1_OLC2_2S2023_202101648/Environment"
	"Proyecto1_OLC2_2S2023_202101648/interfaces"
	"fmt"
)

type ArrayAccess struct {
	Lin 		int
	Col 		int
	Array		interfaces.Expression
	Index		interfaces.Expression
}

func NewArrayAccess(lin int, col int, array interfaces.Expression, index interfaces.Expression) ArrayAccess {
	exp := ArrayAccess{lin,col,array,index}
	return exp
}

func (p ArrayAccess) Ejecutar(ast *environment.AST, env interface{}) environment.Symbol {

	var tempArray environment.Symbol
	tempArray = p.Array.Ejecutar(ast,env)

	if tempArray.Tipo == environment.ARRAY {
		var tempIndex environment.Symbol
		tempIndex = p.Index.Ejecutar(ast,env)
		var tempValor interface{}
		tempValor = tempArray.Valor
		
		if tempIndex.Valor.(int) >= 0 && tempIndex.Valor.(int) < len(tempValor.([]interface{})) {
			valorRetorno := tempValor.([]interface{})[(tempIndex.Valor.(int))].(environment.Symbol)
			return valorRetorno
		} else {
			ast.SetErrors("Indice fuera de limite")
			fmt.Println("Indice: ", tempIndex.Valor.(int))
			fmt.Println("Tamaño: ", len(tempValor.([]interface{})))
		}
	} else {
		ast.SetErrors("No es un arreglo")
	}
	return environment.Symbol{
		Lin: p.Lin,
		Col: p.Col,
		Tipo: environment.NULL,
		Valor: 0,
		Mutable: true,
	}
}