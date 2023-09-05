package instructions

import (
	"Proyecto1_OLC2_2S2023_202101648/Environment"
	"fmt"
	//"Proyecto1_OLC2_2S2023_202101648/interfaces"
)

type Break struct {
	Lin 		int
	Col 		int
}

func NewBreak(lin int, col int) Break {
	return Break{lin,col}
}

func (p Break) Ejecutar(ast *environment.AST, env interface{}) environment.Symbol {
	var resultado environment.Symbol
	resultado = environment.Symbol{Lin: p.Lin, Col: p.Col, Tipo: environment.BREAKY, Valor: "break", Mutable: false,BreakFlag: true}
	fmt.Print("ENCONTRE BREAK")
	return resultado
}
