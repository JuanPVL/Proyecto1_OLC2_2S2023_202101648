package expressions

import(
	"Proyecto1_OLC2_2S2023_202101648/Environment"
	"Proyecto1_OLC2_2S2023_202101648/interfaces"
	"fmt"
	"strconv"
)

type OperacionAsignacion struct {
	Lin 		int
	Col 		int
	Id 			string
	Valor 		interfaces.Expression
	Operador 	string
}

func NewOperacionAsignacion(lin int, col int, id string, val interfaces.Expression, op string) OperacionAsignacion {
	return OperacionAsignacion{lin,col,id,val,op}
}

func (p OperacionAsignacion) Ejecutar(ast *environment.AST, env interface{}) environment.Symbol {
	var dominante environment.TipoExpresion

	tabla_dominante := [5][5]environment.TipoExpresion{
		// INT						FLOAT				STRING			BOOLEAN					NULL	
		{environment.INTEGER, environment.FLOAT, environment.STRING, environment.BOOLEAN, environment.NULL},
		//FlOAT
		{environment.FLOAT, environment.FLOAT, environment.STRING, environment.NULL, environment.NULL},
		//STRING
		{environment.STRING, environment.STRING, environment.STRING, environment.STRING, environment.NULL},
		//BOOLEAN
		{environment.BOOLEAN, environment.NULL, environment.STRING, environment.BOOLEAN, environment.NULL},
		//NULL
		{environment.NULL, environment.NULL, environment.NULL, environment.NULL, environment.NULL},
	}
}