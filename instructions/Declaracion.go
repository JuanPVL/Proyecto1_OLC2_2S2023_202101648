package instructions	

import(
	"Proyecto1_OLC2_2S2023_202101648/Environment"
	"Proyecto1_OLC2_2S2023_202101648/interfaces"
	"strconv"
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

func (va Declaracion) Ejecutar(ast *environment.AST, env interface{}) environment.Symbol {

	if va.Expresion == nil && va.Mutable == true {
		env.(environment.Environment).SaveVariable(va.Id, environment.Symbol{Lin: va.Lin, Col: va.Col, Tipo: va.Tipo, Valor: nil, Mutable: va.Mutable},ast)
	} else {
		var result environment.Symbol
		result = va.Expresion.Ejecutar(ast,env)
		result.Mutable = va.Mutable
		if result.Tipo == environment.ARRAY {
			if va.ArrayValidation(result) {
				env.(environment.Environment).SaveVariable(va.Id, result,ast)
			} else {
				linea := strconv.Itoa(va.Lin)
				columna := strconv.Itoa(va.Col)
				ast.SetErrors(environment.ErrorS{Lin: linea, Col: columna, Descripcion: "El arreglo no es valido", Ambito: env.(environment.Environment).Id})
			}
		} else if result.Tipo == va.Tipo {
			env.(environment.Environment).SaveVariable(va.Id, result,ast)
		} else if va.Tipo == environment.DEPENDIENTE {
			env.(environment.Environment).SaveVariable(va.Id, result,ast)
		} else {
			linea := strconv.Itoa(va.Lin)
			columna := strconv.Itoa(va.Col)
			ast.SetErrors(environment.ErrorS{Lin: linea, Col: columna, Descripcion: "El tipo de dato no es valido", Ambito: env.(environment.Environment).Id})
		}
		//return nil
	}
	return environment.Symbol{Lin: va.Lin, Col: va.Col, Tipo: environment.NULL, Valor: nil, Mutable: true}
} 

func (va Declaracion) ArrayValidation(result environment.Symbol) bool {
	return true
}