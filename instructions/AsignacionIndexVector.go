package instructions	

import(
	"Proyecto1_OLC2_2S2023_202101648/Environment"
	"Proyecto1_OLC2_2S2023_202101648/interfaces"
)

type AsignacionIndexVector struct {
	Lin 		int
	Col 		int
	Id 			string
	Expresion 	interfaces.Expression
}