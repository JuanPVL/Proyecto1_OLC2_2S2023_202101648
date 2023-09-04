package expressions

import(
	"Proyecto1_OLC2_2S2023_202101648/Environment"
	"Proyecto1_OLC2_2S2023_202101648/interfaces"
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
	
}