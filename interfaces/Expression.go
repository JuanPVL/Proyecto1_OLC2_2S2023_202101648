package interfaces

import "Proyecto1_OLC2_2S2023_202101648/Environment"

type Expression interface {
	Ejecutar(ast *environment.AST, env interface{}) environment.Symbol
}