package instructions	

import(
	"Proyecto1_OLC2_2S2023_202101648/Environment"
	"Proyecto1_OLC2_2S2023_202101648/interfaces"
)

type Declaracion struct {
	Lin 		int
	Col 		int
	Id 			string
	Mutable		bool
	Tipo 		environment.TipoExpresion
	Expresion 	interfaces.Expression
}

func NewDeclaracion(lin int, col int,id string, mut bool, tipo environment.TipoExpresion, val interfaces.Expression) Declaracion{
	instr := Declaracion{lin, col,id,mut, tipo, val}
	return instr
}

func (va Declaracion) Ejecutar(ast *environment.AST, env interface{}) interface{} {

	if va.Expresion == nil && va.Mutable == true {
		env.(environment.Environment).SaveVariable(va.Id, environment.Symbol{Lin: va.Lin, Col: va.Col, Tipo: va.Tipo, Valor: nil, Mutable: va.Mutable})
	} else {
		var result environment.Symbol
		result = va.Expresion.Ejecutar(ast,env)
		result.Mutable = va.Mutable
		if result.Tipo == environment.ARRAY {
			if va.ArrayValidation(result) {
				env.(environment.Environment).SaveVariable(va.Id, result)
			} else {
				ast.SetErrors("Estructura de array no valida")
			}
		} else if result.Tipo == va.Tipo {
			env.(environment.Environment).SaveVariable(va.Id, result)
		} else if va.Tipo == environment.DEPENDIENTE {
			env.(environment.Environment).SaveVariable(va.Id, result)
		} else {
			ast.SetErrors("Tipos de datos no coinciden")
		}
		//return nil
	}
	return nil	
} 

func (va Declaracion) ArrayValidation(result environment.Symbol) bool {
	return true
}