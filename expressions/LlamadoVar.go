package expressions

import(
	"Proyecto1_OLC2_2S2023_202101648/Environment"
)

type LlamadoVar struct {
	Lin 		int
	Col 		int
	Id 			string
}

func NewLlamadoVar(lin int, col int, id string) LlamadoVar {
	exp := LlamadoVar{lin,col,id}
	return exp
}

func (p LlamadoVar) Ejecutar(ast *environment.AST, env interface{}) environment.Symbol {
	resultado := env.(environment.Environment).GetVariable(p.Id)
	return resultado
}