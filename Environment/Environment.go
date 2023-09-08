package environment

import (
	"fmt"
	"strconv"
)

type Environment struct {
	Anterior interface{}
	Tabla	 map[string]Symbol
	Id	     string
}

func NewEnvironment(anterior interface{},id string) Environment{
	return Environment{
		Anterior: anterior,
		Tabla: make(map[string]Symbol),
		Id: id,
	}
}

func (env Environment) SaveVariable(id string,value Symbol,ast *AST) {
	var tipo = ""
	if variable, ok := env.Tabla[id]; ok {
		fmt.Println("Variable ya declarada: ",variable)
		return
	}
	if value.Tipo == INTEGER {
		tipo = "Int"
	} else if value.Tipo == FLOAT {
		tipo = "Float"
	} else if value.Tipo == STRING {
		tipo = "String"
	} else if value.Tipo == BOOLEAN {
		tipo = "Bool"
	} else if value.Tipo == VECTOR {
		tipo = "Vector"
	}
	linea := strconv.Itoa(value.Lin)
	columna := strconv.Itoa(value.Col)
	ast.SetTablaSimbolos(SimbolTabla{Lin: linea, Col: columna, TipoSimbolo: "Variable", TipoDato: tipo, Ambito: env.Id,Id: id})
	env.Tabla[id] = value
}

func (env Environment) GetVariable(id string,ast *AST,linea string, columna string) Symbol {
	var tmpEnv Environment
	tmpEnv = env
	for {
		if variable, ok := tmpEnv.Tabla[id]; ok {
			return variable
		}
		if tmpEnv.Anterior == nil {
			break
		} else {
			tmpEnv = tmpEnv.Anterior.(Environment)
		}
	}
	fmt.Println("Variable no declarada: ",id)
	ast.SetErrors(ErrorS{Lin: linea, Col: columna, Descripcion: "Variable no declarada " + id, Ambito: env.Id})
	return Symbol{Lin: 0, Col: 0, Tipo: NULL, Valor: 0}
}

func (env Environment) SetVariable(id string, value Symbol,ast *AST) Symbol {
	var tmpEnv Environment
	tmpEnv = env
	for {
		if variable, ok := tmpEnv.Tabla[id]; ok {
			if tmpEnv.Tabla[id].Mutable == true{
				if tmpEnv.Tabla[id].Tipo == value.Tipo {
					tmpEnv.Tabla[id] = value
					return variable
				} else {
					fmt.Println("Tipo de dato incorrecto: ")
					linea := strconv.Itoa(value.Lin)
					columna := strconv.Itoa(value.Col)
					ast.SetErrors(ErrorS{Lin: linea, Col: columna, Descripcion: "Tipo de dato incorrecto" , Ambito: env.Id})
					return Symbol{Lin: 0, Col: 0, Tipo: NULL, Valor: 0}
				}
			} else {
				fmt.Println("Variable no mutable: " , tmpEnv.Tabla[id].Valor)
				linea := strconv.Itoa(value.Lin)
				columna := strconv.Itoa(value.Col)
				ast.SetErrors(ErrorS{Lin: linea, Col: columna, Descripcion: "Variable no mutable" , Ambito: env.Id})
				return Symbol{Lin: 0, Col: 0, Tipo: NULL, Valor: 0}
			}
		}
		if tmpEnv.Anterior == nil {
			break
		} else {
			tmpEnv = tmpEnv.Anterior.(Environment)
		}
	}
	fmt.Println("Variable no declarada: ",id)
	linea := strconv.Itoa(value.Lin)
	columna := strconv.Itoa(value.Col)
	ast.SetErrors(ErrorS{Lin: linea, Col: columna, Descripcion: "Variable no declarada" , Ambito: env.Id})
	return Symbol{Lin: 0, Col: 0, Tipo: NULL, Valor: 0}
}