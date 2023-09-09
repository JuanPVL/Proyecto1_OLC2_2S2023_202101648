package instructions

import (
	"Proyecto1_OLC2_2S2023_202101648/Environment"
	"strconv"
)

type Struct struct {
	Lin     int
	Col     int
	Id      string
	ListAtr []interface{}
}

func NewStruct(lin int, col int, id string, list []interface{}) Struct {
	instr := Struct{lin, col, id, list}
	return instr
}

func (p Struct) Ejecutar(ast *environment.AST, env interface{}) environment.Symbol {
	linea := strconv.Itoa(p.Lin)
	columna := strconv.Itoa(p.Col)
	env.(environment.Environment).SaveStruct(p.Id, p.ListAtr, ast, linea, columna)
	return environment.Symbol{Lin: p.Lin, Col: p.Col, Tipo: environment.STRUCT, Valor: nil, Mutable: true}
}