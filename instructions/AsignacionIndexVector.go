package instructions	

import(
	"Proyecto1_OLC2_2S2023_202101648/Environment"
	"Proyecto1_OLC2_2S2023_202101648/interfaces"
	"strconv"
	"fmt"
)

type AsignacionIndexVector struct {
	Lin 		int
	Col 		int
	Id 			string
	Index 	interfaces.Expression
	Expresion2 	interfaces.Expression
}

func NewAsignacionIndexVector(lin int, col int,id string, val1 interfaces.Expression,val2 interfaces.Expression) AsignacionIndexVector{
	instr := AsignacionIndexVector{lin, col,id, val1,val2}
	return instr
}

func (p AsignacionIndexVector) Ejecutar(ast *environment.AST, env interface{}) environment.Symbol {
	index := p.Index.Ejecutar(ast,env)
	fmt.Println("Valor de index: ",index.Valor)
	result := p.Expresion2.Ejecutar(ast,env)
	linea := strconv.Itoa(p.Lin)
	columna := strconv.Itoa(p.Col)
	tmpArreglo := env.(environment.Environment).GetVariable(p.Id,ast,linea,columna)
			temparr := tmpArreglo.Valor.([]interface{})
			//verificar que se tengan elementos
			if len(temparr) > 0{
				//verificar que el indice pueda ser accedido
				if index.Tipo == environment.INTEGER{
					//verificar que no sea nulo
					if index.Valor != nil{
						i := index.Valor.(int)
						fmt.Println("Valor de i: ",i)
						//verificar que el indice este dentro del rango
						if i >= 0 && i < len(temparr){
							temparr = insertar(temparr,i,result)
							tmpArreglo.Valor = temparr
							env.(environment.Environment).SetVariable(p.Id, tmpArreglo,ast)
						} else {
							ast.SetErrors(environment.ErrorS{Lin: linea, Col: columna, Descripcion: "El indice esta fuera de rango", Ambito: env.(environment.Environment).Id})
						}
					} else {
						ast.SetErrors(environment.ErrorS{Lin: linea, Col: columna, Descripcion: "El indice no puede ser nulo", Ambito: env.(environment.Environment).Id})
					} 
				} else {
					ast.SetErrors(environment.ErrorS{Lin: linea, Col: columna, Descripcion: "El indice no es un entero", Ambito: env.(environment.Environment).Id})
				}
			} else {
				ast.SetErrors(environment.ErrorS{Lin: linea, Col: columna, Descripcion: "El arreglo no tiene elementos", Ambito: env.(environment.Environment).Id})
			}
	return result
}

func insertar(a []interface{},index int, value interface{}) []interface{} {
	if index > len(a) {
		return a
	} else {
		a = append(a[:index+1], a[index:]...)
		a[index] = value
		return a
	}
}