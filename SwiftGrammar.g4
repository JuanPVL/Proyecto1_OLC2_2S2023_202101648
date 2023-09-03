grammar SwiftGrammar; 
// import SwiftLexer; 

options {
  tokenVocab = SwiftLexer;
}

@header {
    import "Proyecto1_OLC2_2S2023_202101648/interfaces"
    import "Proyecto1_OLC2_2S2023_202101648/Environment"
    import "Proyecto1_OLC2_2S2023_202101648/expressions"
    import "Proyecto1_OLC2_2S2023_202101648/instructions"
    import "strings"
}


s returns [[]interface{} code]
: block EOF
    {   
        $code = $block.blk
    }
;

block returns [[]interface{} blk]
@init{
    $blk = []interface{}{}
    var listInt []IInstructionContext
  }
: ins+=instruction+
    {
        listInt = localctx.(*BlockContext).GetIns()
        for _, e := range listInt {
            $blk = append($blk, e.GetInst())
        }
    }
;

instruction returns [interfaces.Instruction inst]
: printstmt { $inst = $printstmt.prnt}
| ifstmt { $inst = $ifstmt.ifinst }
| declarationstmt { $inst = $declarationstmt.dec }
| asignationstmt { $inst = $asignationstmt.asig }
| whilestmt { $inst = $whilestmt.whileinst }
;

printstmt returns [interfaces.Instruction prnt]
: PRINT PAR_IZQ listParams PAR_DER { $prnt = instructions.NewPrint($PRINT.line,$PRINT.pos,$listParams.l)}
;


blockelsif returns [[]interface{} blkif]
@init{
    $blkif = []interface{}{}
    var listIfs []IIfstmtContext
    }
: elseif+=ifstmt+ 
    {
        listIfs = localctx.(*BlockelsifContext).GetElseif()
        for _, e := range listIfs {
            $blkif = append($blkif, e.GetIfinst())
        }
    }
;

ifstmt returns [interfaces.Instruction ifinst]
: IF expr LLAVE_IZQ block LLAVE_DER { $ifinst = instructions.NewIf($IF.line, $IF.pos, $expr.e, $block.blk, nil) }
| IF expr LLAVE_IZQ ifblck=block LLAVE_DER ELSE LLAVE_IZQ elseblck=block LLAVE_DER {$ifinst = instructions.NewIf($IF.line, $IF.pos, $expr.e, $ifblck.blk, $elseblck.blk)}
| IF expr LLAVE_IZQ ifblck=block LLAVE_DER ELSE blockelsif {$ifinst = instructions.NewIf($IF.line, $IF.pos, $expr.e, $ifblck.blk, $blockelsif.blkif)}
;

whilestmt returns [interfaces.Instruction whileinst]
: WHILE expr LLAVE_IZQ block LLAVE_DER { $whileinst = instructions.NewWhile($WHILE.line, $WHILE.pos, $expr.e, $block.blk) }
;

declarationstmt returns [interfaces.Instruction dec]
: VAR ID DOSPUNTOS types IGUAL expr  { $dec = instructions.NewDeclaracion($VAR.line, $VAR.pos, $ID.text,true, $types.ty, $expr.e) }
| VAR ID IGUAL expr { $dec = instructions.NewDeclaracion($VAR.line, $VAR.pos, $ID.text,true,environment.DEPENDIENTE, $expr.e) }
| VAR ID DOSPUNTOS types CIERRAPREGUNTA { $dec = instructions.NewDeclaracion($VAR.line, $VAR.pos, $ID.text,true, $types.ty, nil) }
| LET ID DOSPUNTOS types IGUAL expr { $dec = instructions.NewDeclaracion($LET.line, $LET.pos, $ID.text,false, $types.ty, $expr.e) }
| LET ID IGUAL expr { $dec = instructions.NewDeclaracion($LET.line, $LET.pos, $ID.text,false,environment.DEPENDIENTE, $expr.e) }
;

asignationstmt returns [interfaces.Instruction asig]
: ID IGUAL expr { $asig = instructions.NewAsignacion($ID.line, $ID.pos, $ID.text, $expr.e) }
;

types returns[environment.TipoExpresion ty]
: INT { $ty = environment.INTEGER }
| FLOAT { $ty = environment.FLOAT }
| STR { $ty = environment.STRING }
| BOOL { $ty = environment.BOOLEAN }
| COR_IZQ COR_DER { $ty = environment.ARRAY }
;

expr returns [interfaces.Expression e]
: RES left=expr { $e = expressions.NewOperation($RES.line, $RES.pos, $left.e, "UNARIO", nil) }
| left=expr op=(MULT|DIV|MOD) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=(SUM|RES) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=(MAYIG|MAYOR) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=(MENIG|MENOR) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=(IG_IG|DIFE) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| NOT left=expr {$e = expressions.NewOperation($NOT.line, $NOT.pos, $left.e, $NOT.text, nil)}
| left=expr op=AND right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=OR right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| PAR_IZQ expr PAR_DER { $e = $expr.e }
| list=listArray { $e = $list.p}
| COR_IZQ listParams COR_DER { $e = expressions.NewArray($COR_IZQ.line, $COR_IZQ.pos, $listParams.l) }
| NUMBER                             
    {
        if (strings.Contains($NUMBER.text,".")){
            num,err := strconv.ParseFloat($NUMBER.text, 64);
            if err!= nil{
                fmt.Println(err)
            }
            $e = expressions.NewPrimitive($NUMBER.line,$NUMBER.pos,num,environment.FLOAT)
        }else{
            num,err := strconv.Atoi($NUMBER.text)
            if err!= nil{
                fmt.Println(err)
            }
            $e = expressions.NewPrimitive($NUMBER.line,$NUMBER.pos,num,environment.INTEGER)
        }
    }
| STRING
    {
        str := $STRING.text
        $e = expressions.NewPrimitive($STRING.line, $STRING.pos, str[1:len(str)-1],environment.STRING)
    }                        
| TRU { $e = expressions.NewPrimitive($TRU.line, $TRU.pos, true, environment.BOOLEAN) }
| FAL { $e = expressions.NewPrimitive($FAL.line, $FAL.pos, false, environment.BOOLEAN) }
;

listParams returns[[]interface{} l]
: list=listParams COMA expr {
                                var arr []interface{}
                                arr = append($list.l, $expr.e)
                                $l = arr
                            }   
| expr {
            $l = []interface{}{}
            $l = append($l, $expr.e)
        }
;

listArray returns[interfaces.Expression p]
: list = listArray COR_IZQ expr COR_DER { $p = expressions.NewArrayAccess($list.start.GetLine(), $list.start.GetColumn(), $list.p, $expr.e) }
| ID { $p = expressions.NewLlamadoVar($ID.line, $ID.pos, $ID.text)}
;