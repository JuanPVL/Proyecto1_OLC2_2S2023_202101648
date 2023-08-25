package instructions	

import(
	"Proyecto1_OLC2_2S2023_202101648/Environment"
	"Proyecto1_OLC2_2S2023_202101648/interfaces"
)

type Declaracion struct {
	Lin 		int
	Col 		int
	Id 			string
	Tipo 		environment.TipoExpresion
	Expresion 	interfaces.Expression
}

func NewDeclaracion(lin int, col int, id string, tipo environment.TipoExpresion, val interfaces.Expression) Declaracion{
	instr := Declaracion{lin, col, id, tipo, val}
	return instr
}

func (va Declaracion) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	var result environment.Symbol
	result = va.Expresion.Ejecutar(ast,env)

	if result.Tipo == environment.ARRAY {
		if va.ArrayValidation(result) {
			env.(environment.Environment).SaveVariable(va.Id, result)
		} else {
			ast.SetErrors("Estructura de array no valida")
		}
	} else if result.Tipo == va.Tipo {
		env.(environment.Environment).SaveVariable(va.Id, result)
	} else {
		ast.SetErrors("Tipos de datos no coinciden")
	}
	return nil
} 

func (va Declaracion) ArrayValidation(result environment.Symbol) bool {
	return true
}