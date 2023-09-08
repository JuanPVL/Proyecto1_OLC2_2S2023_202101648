package instructions	

import(
	"Proyecto1_OLC2_2S2023_202101648/Environment"
	"Proyecto1_OLC2_2S2023_202101648/interfaces"
)

type Asignacion struct {
	Lin 		int
	Col 		int
	Id 			string
	Expresion 	interfaces.Expression
}

func NewAsignacion(lin int, col int,id string, val interfaces.Expression) Asignacion{
	instr := Asignacion{lin, col,id, val}
	return instr
}

func (va Asignacion) Ejecutar(ast *environment.AST, env interface{}) environment.Symbol {
	var result environment.Symbol
	result = va.Expresion.Ejecutar(ast,env)
	env.(environment.Environment).SetVariable(va.Id, result,ast)
	return result
}