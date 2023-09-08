// Code generated from SwiftGrammar.g4 by ANTLR 4.13.0. DO NOT EDIT.

package parser // SwiftGrammar
import "github.com/antlr4-go/antlr/v4"

// SwiftGrammarListener is a complete listener for a parse tree produced by SwiftGrammarParser.
type SwiftGrammarListener interface {
	antlr.ParseTreeListener

	// EnterS is called when entering the s production.
	EnterS(c *SContext)

	// EnterBlock is called when entering the block production.
	EnterBlock(c *BlockContext)

	// EnterInstruction is called when entering the instruction production.
	EnterInstruction(c *InstructionContext)

	// EnterPrintstmt is called when entering the printstmt production.
	EnterPrintstmt(c *PrintstmtContext)

	// EnterBlockelsif is called when entering the blockelsif production.
	EnterBlockelsif(c *BlockelsifContext)

	// EnterIfstmt is called when entering the ifstmt production.
	EnterIfstmt(c *IfstmtContext)

	// EnterWhilestmt is called when entering the whilestmt production.
	EnterWhilestmt(c *WhilestmtContext)

	// EnterForstmt is called when entering the forstmt production.
	EnterForstmt(c *ForstmtContext)

	// EnterDeclarationstmt is called when entering the declarationstmt production.
	EnterDeclarationstmt(c *DeclarationstmtContext)

	// EnterAsignationstmt is called when entering the asignationstmt production.
	EnterAsignationstmt(c *AsignationstmtContext)

	// EnterTypes is called when entering the types production.
	EnterTypes(c *TypesContext)

	// EnterTypesmatriz is called when entering the typesmatriz production.
	EnterTypesmatriz(c *TypesmatrizContext)

	// EnterExprFor is called when entering the exprFor production.
	EnterExprFor(c *ExprForContext)

	// EnterExpr is called when entering the expr production.
	EnterExpr(c *ExprContext)

	// EnterConversionstmt is called when entering the conversionstmt production.
	EnterConversionstmt(c *ConversionstmtContext)

	// EnterExprvector is called when entering the exprvector production.
	EnterExprvector(c *ExprvectorContext)

	// EnterListParams is called when entering the listParams production.
	EnterListParams(c *ListParamsContext)

	// EnterListArray is called when entering the listArray production.
	EnterListArray(c *ListArrayContext)

	// ExitS is called when exiting the s production.
	ExitS(c *SContext)

	// ExitBlock is called when exiting the block production.
	ExitBlock(c *BlockContext)

	// ExitInstruction is called when exiting the instruction production.
	ExitInstruction(c *InstructionContext)

	// ExitPrintstmt is called when exiting the printstmt production.
	ExitPrintstmt(c *PrintstmtContext)

	// ExitBlockelsif is called when exiting the blockelsif production.
	ExitBlockelsif(c *BlockelsifContext)

	// ExitIfstmt is called when exiting the ifstmt production.
	ExitIfstmt(c *IfstmtContext)

	// ExitWhilestmt is called when exiting the whilestmt production.
	ExitWhilestmt(c *WhilestmtContext)

	// ExitForstmt is called when exiting the forstmt production.
	ExitForstmt(c *ForstmtContext)

	// ExitDeclarationstmt is called when exiting the declarationstmt production.
	ExitDeclarationstmt(c *DeclarationstmtContext)

	// ExitAsignationstmt is called when exiting the asignationstmt production.
	ExitAsignationstmt(c *AsignationstmtContext)

	// ExitTypes is called when exiting the types production.
	ExitTypes(c *TypesContext)

	// ExitTypesmatriz is called when exiting the typesmatriz production.
	ExitTypesmatriz(c *TypesmatrizContext)

	// ExitExprFor is called when exiting the exprFor production.
	ExitExprFor(c *ExprForContext)

	// ExitExpr is called when exiting the expr production.
	ExitExpr(c *ExprContext)

	// ExitConversionstmt is called when exiting the conversionstmt production.
	ExitConversionstmt(c *ConversionstmtContext)

	// ExitExprvector is called when exiting the exprvector production.
	ExitExprvector(c *ExprvectorContext)

	// ExitListParams is called when exiting the listParams production.
	ExitListParams(c *ListParamsContext)

	// ExitListArray is called when exiting the listArray production.
	ExitListArray(c *ListArrayContext)
}
