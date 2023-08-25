package expressions

import(
	"Proyecto1_OLC2_2S2023_202101648/Environment"
	"Proyecto1_OLC2_2S2023_202101648/interfaces"
	"fmt"
	"strconv"
)

type Operacion struct {
	Lin 			int
	Col 			int
	Operador_izq	interfaces.Expression
	Operador 		string
	Operador_der	interfaces.Expression
}

func NewOperation(lin int, col int, op1 interfaces.Expression, operador string, op2 interfaces.Expression) Operacion {
	exp := Operacion{Lin: lin, Col: col, Operador_izq: op1, Operador: operador, Operador_der: op2}
	return exp
}

func (o Operacion) Ejecutar(ast *environment.AST, env interface{}) environment.Symbol {
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

	var op1, op2 environment.Symbol
	op1 = o.Operador_izq.Ejecutar(ast,env)
	op2 = o.Operador_der.Ejecutar(ast,env)
	switch o.Operador {
		case "+":
			{
				dominante = tabla_dominante[op1.Tipo][op2.Tipo]

				if dominante == environment.INTEGER {
					return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: dominante, Valor: op1.Valor.(int) + op2.Valor.(int)}
				} else if dominante == environment.FLOAT {
					val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", op1.Valor), 64)
					val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", op2.Valor), 64)
					return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: dominante, Valor: val1 + val2}
				} else if dominante == environment.STRING {
					r1 := fmt.Sprintf("%v", op1.Valor)
					r2 := fmt.Sprintf("%v", op2.Valor)
					return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: dominante, Valor: r1 + r2}
				} else {
					ast.SetErrors("Error de tipos en la suma")
				}
			}
		case "-":
			{
				dominante = tabla_dominante[op1.Tipo][op2.Tipo]

				if dominante == environment.INTEGER {
					return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: dominante, Valor: op1.Valor.(int) - op2.Valor.(int)}
				} else if dominante == environment.FLOAT {
					val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", op1.Valor), 64)
					val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", op2.Valor), 64)
					return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: dominante, Valor: val1 - val2}
				} else {
					ast.SetErrors("Error de tipos en la resta")
				}
			}
		case "*":
			{
				dominante = tabla_dominante[op1.Tipo][op2.Tipo]
				if dominante == environment.INTEGER {
					return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: dominante, Valor: op1.Valor.(int) * op2.Valor.(int)}
				} else if dominante == environment.FLOAT {
					val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", op1.Valor), 64)
					val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", op2.Valor), 64)
					return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: dominante, Valor: val1 * val2}
				} else {
					ast.SetErrors("Error de tipos en la multiplicacion")
				}
			}
		case "/":
			{
				dominante = tabla_dominante[op1.Tipo][op2.Tipo]
				if dominante == environment.INTEGER {
					if op2.Valor.(int) != 0 {
						return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: dominante, Valor: op1.Valor.(int) / op2.Valor.(int)}
					} else {
						ast.SetErrors("No puede dividir entre cero")
					}

				} else if dominante == environment.FLOAT {
					val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", op1.Valor), 64)
					val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", op2.Valor), 64)
					if val2 != 0 {
						return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: dominante, Valor: val1 / val2}
					} else {
						ast.SetErrors("No puede dividir entre cero")
					}
				} else {
					ast.SetErrors("Error de tipos en la division")
				}
			}
		case "<":
			{
				dominante = tabla_dominante[op1.Tipo][op2.Tipo]
				if dominante == environment.INTEGER {
					return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: environment.BOOLEAN, Valor: op1.Valor.(int) < op2.Valor.(int)}
				} else if dominante == environment.FLOAT {
					val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", op1.Valor), 64)
					val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", op2.Valor), 64)
					return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: environment.BOOLEAN, Valor: val1 < val2}
				} else {
					ast.SetErrors("Error de tipos en la comparacion menor que")
				}
			}
		case ">":
			{
				dominante = tabla_dominante[op1.Tipo][op2.Tipo]
				if dominante == environment.INTEGER {
					return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: environment.BOOLEAN, Valor: op1.Valor.(int) > op2.Valor.(int)}
				} else if dominante == environment.FLOAT {
					val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", op1.Valor), 64)
					val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", op2.Valor), 64)
					return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: environment.BOOLEAN, Valor: val1 > val2}
				} else {
					ast.SetErrors("Error de tipos en la comparacion mayor que")
				}
			}
		case "<=":
			{
				dominante = tabla_dominante[op1.Tipo][op2.Tipo]
				if dominante == environment.INTEGER {
					return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: environment.BOOLEAN, Valor: op1.Valor.(int) <= op2.Valor.(int)}
				} else if dominante == environment.FLOAT {
					val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", op1.Valor), 64)
					val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", op2.Valor), 64)
					return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: environment.BOOLEAN, Valor: val1 <= val2}
				} else {
					ast.SetErrors("Error de tipos en la comparacion menor igual que")
				}
			}
		case ">=":
			{
				dominante = tabla_dominante[op1.Tipo][op2.Tipo]
				if dominante == environment.INTEGER {
					return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: environment.BOOLEAN, Valor: op1.Valor.(int) >= op2.Valor.(int)}
				} else if dominante == environment.FLOAT {
					val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", op1.Valor), 64)
					val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", op2.Valor), 64)
					return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: environment.BOOLEAN, Valor: val1 >= val2}
				} else {
					ast.SetErrors("Error de tipos en la comparacion mayor igual que")
				}
			}
		case "==":
			{
				if op1.Tipo == op2.Tipo {
					return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: environment.BOOLEAN, Valor: op1.Valor == op2.Valor}
				} else {
					ast.SetErrors("Error de tipos en la comparacion igual que")
				}
			}
		case "!=":
			{
				if op1.Tipo == op2.Tipo {
					return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: environment.BOOLEAN, Valor: op1.Valor != op2.Valor}
				} else {
					ast.SetErrors("Error de tipos en la comparacion diferente que")
				}
			}
		case "&&":
			{
				if(op1.Tipo == environment.BOOLEAN && op2.Tipo == environment.BOOLEAN){
					return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: environment.BOOLEAN, Valor: op1.Valor.(bool) && op2.Valor.(bool)}
				} else {
					ast.SetErrors("Error de tipos en la comparacion AND")
				}
			}
		case "||":
			{
				if(op1.Tipo == environment.BOOLEAN && op2.Tipo == environment.BOOLEAN){
					return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: environment.BOOLEAN, Valor: op1.Valor.(bool) || op2.Valor.(bool)}
				} else {
					ast.SetErrors("Error de tipos en la comparacion OR")
				}
			}
		}
		
		var result interface{}
		return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: environment.NULL, Valor: result}
}