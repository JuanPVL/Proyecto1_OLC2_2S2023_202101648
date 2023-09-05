package environment

type Symbol struct {
	Lin  int
	Col  int
	Tipo TipoExpresion
	Valor interface{}
	Mutable bool
	BreakFlag bool
	ContinueFlag bool
	ReturnFlag bool
}