package instructions	

import(
	"Proyecto1_OLC2_2S2023_202101648/Environment"
	"Proyecto1_OLC2_2S2023_202101648/interfaces"
	"fmt"
)

type Print struct {
	Lin 		int
	Col 		int
	Valor 		interface{}
}

func NewPrint(lin int, col int, val interface{}) Print {
	return Print{lin,col,val}
}

func (p Print) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	valorAImprimir := p.Valor.(interfaces.Expression).Ejecutar(ast,env)
	consoleOut := fmt.Sprintf("%v",valorAImprimir.Valor)
	ast.SetPrint(consoleOut + "\n")
	return nil
}

