// Generated from c:\Users\USUARIO\Desktop\Proyecto1_OLC2_2S2023_202101648\SwiftGrammar.g4 by ANTLR 4.9.2

    import "Proyecto1_OLC2_2S2023_202101648/interfaces"
    import "Proyecto1_OLC2_2S2023_202101648/Environment"
    import "Proyecto1_OLC2_2S2023_202101648/expressions"
    import "Proyecto1_OLC2_2S2023_202101648/instructions"
    import "strings"

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SwiftGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, BOOL=3, STR=4, TRU=5, FAL=6, PRINT=7, IF=8, ELSE=9, WHILE=10, 
		FOR=11, IN=12, VAR=13, LET=14, NIL=15, BREAK=16, CONTINUE=17, APPEND=18, 
		REMOVELAST=19, REMOVE=20, AT=21, ISEMPTY=22, COUNT=23, ARRAY=24, RETURN=25, 
		FUNC=26, STRUCT=27, GUARD=28, NUMBER=29, STRING=30, ID=31, DIFE=32, IG_IG=33, 
		NOT=34, OR=35, AND=36, IGUAL=37, MAYIG=38, MENIG=39, MAYOR=40, MENOR=41, 
		MULT=42, DIV=43, SUM=44, RES=45, MOD=46, PAR_IZQ=47, PAR_DER=48, LLAVE_IZQ=49, 
		LLAVE_DER=50, DOSPUNTOS=51, COR_IZQ=52, COR_DER=53, COMA=54, CIERRAPREGUNTA=55, 
		PUNTOCOMA=56, PUNTO=57, FLECHA=58, WHITESPACE=59, COMMENT=60, LINE_COMMENT=61;
	public static final int
		RULE_s = 0, RULE_block = 1, RULE_instruction = 2, RULE_structCreation = 3, 
		RULE_listStructDec = 4, RULE_printstmt = 5, RULE_blockelsif = 6, RULE_ifstmt = 7, 
		RULE_whilestmt = 8, RULE_guardstmt = 9, RULE_forstmt = 10, RULE_declarationstmt = 11, 
		RULE_asignationstmt = 12, RULE_function = 13, RULE_listParamsFunc = 14, 
		RULE_callFuncionIns = 15, RULE_types = 16, RULE_typesmatriz = 17, RULE_exprFor = 18, 
		RULE_expr = 19, RULE_conversionstmt = 20, RULE_exprvector = 21, RULE_listParams = 22, 
		RULE_listArray = 23, RULE_callFuncion = 24, RULE_listParamsCall = 25, 
		RULE_listStructExp = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "block", "instruction", "structCreation", "listStructDec", "printstmt", 
			"blockelsif", "ifstmt", "whilestmt", "guardstmt", "forstmt", "declarationstmt", 
			"asignationstmt", "function", "listParamsFunc", "callFuncionIns", "types", 
			"typesmatriz", "exprFor", "expr", "conversionstmt", "exprvector", "listParams", 
			"listArray", "callFuncion", "listParamsCall", "listStructExp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Int'", "'Float'", "'Bool'", "'String'", "'true'", "'false'", 
			"'print'", "'if'", "'else'", "'while'", "'for'", "'in'", "'var'", "'let'", 
			"'nil'", "'break'", "'continue'", "'append'", "'removeLast'", "'remove'", 
			"'at'", "'isEmpty'", "'count'", "'array'", "'return'", "'func'", "'struct'", 
			"'guard'", null, null, null, "'!='", "'=='", "'!'", "'||'", "'&&'", "'='", 
			"'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'+'", "'-'", "'%'", "'('", 
			"')'", "'{'", "'}'", "':'", "'['", "']'", "','", "'?'", "';'", "'.'", 
			"'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "BOOL", "STR", "TRU", "FAL", "PRINT", "IF", "ELSE", 
			"WHILE", "FOR", "IN", "VAR", "LET", "NIL", "BREAK", "CONTINUE", "APPEND", 
			"REMOVELAST", "REMOVE", "AT", "ISEMPTY", "COUNT", "ARRAY", "RETURN", 
			"FUNC", "STRUCT", "GUARD", "NUMBER", "STRING", "ID", "DIFE", "IG_IG", 
			"NOT", "OR", "AND", "IGUAL", "MAYIG", "MENIG", "MAYOR", "MENOR", "MULT", 
			"DIV", "SUM", "RES", "MOD", "PAR_IZQ", "PAR_DER", "LLAVE_IZQ", "LLAVE_DER", 
			"DOSPUNTOS", "COR_IZQ", "COR_DER", "COMA", "CIERRAPREGUNTA", "PUNTOCOMA", 
			"PUNTO", "FLECHA", "WHITESPACE", "COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SwiftGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SwiftGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public []interface{} code;
		public BlockContext block;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SwiftGrammarParser.EOF, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			((SContext)_localctx).block = block();
			setState(55);
			match(EOF);
			   
			        _localctx.code = ((SContext)_localctx).block.blk
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public []interface{} blk;
		public InstructionContext instruction;
		public List<InstructionContext> ins = new ArrayList<InstructionContext>();
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);

		    _localctx.blk = []interface{}{}
		    var listInt []IInstructionContext
		  
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58);
				((BlockContext)_localctx).instruction = instruction();
				((BlockContext)_localctx).ins.add(((BlockContext)_localctx).instruction);
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << VAR) | (1L << LET) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << FUNC) | (1L << STRUCT) | (1L << GUARD) | (1L << ID))) != 0) );

			        listInt = localctx.(*BlockContext).GetIns()
			        for _, e := range listInt {
			            _localctx.blk = append(_localctx.blk, e.GetInst())
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionContext extends ParserRuleContext {
		public interfaces.Instruction inst;
		public PrintstmtContext printstmt;
		public IfstmtContext ifstmt;
		public DeclarationstmtContext declarationstmt;
		public AsignationstmtContext asignationstmt;
		public WhilestmtContext whilestmt;
		public ForstmtContext forstmt;
		public GuardstmtContext guardstmt;
		public FunctionContext function;
		public StructCreationContext structCreation;
		public CallFuncionInsContext callFuncionIns;
		public Token BREAK;
		public Token CONTINUE;
		public Token ID;
		public ExprContext expr;
		public Token RETURN;
		public PrintstmtContext printstmt() {
			return getRuleContext(PrintstmtContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(SwiftGrammarParser.PUNTOCOMA, 0); }
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public DeclarationstmtContext declarationstmt() {
			return getRuleContext(DeclarationstmtContext.class,0);
		}
		public AsignationstmtContext asignationstmt() {
			return getRuleContext(AsignationstmtContext.class,0);
		}
		public WhilestmtContext whilestmt() {
			return getRuleContext(WhilestmtContext.class,0);
		}
		public ForstmtContext forstmt() {
			return getRuleContext(ForstmtContext.class,0);
		}
		public GuardstmtContext guardstmt() {
			return getRuleContext(GuardstmtContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public StructCreationContext structCreation() {
			return getRuleContext(StructCreationContext.class,0);
		}
		public CallFuncionInsContext callFuncionIns() {
			return getRuleContext(CallFuncionInsContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(SwiftGrammarParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(SwiftGrammarParser.CONTINUE, 0); }
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode PUNTO() { return getToken(SwiftGrammarParser.PUNTO, 0); }
		public TerminalNode APPEND() { return getToken(SwiftGrammarParser.APPEND, 0); }
		public TerminalNode PAR_IZQ() { return getToken(SwiftGrammarParser.PAR_IZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(SwiftGrammarParser.PAR_DER, 0); }
		public TerminalNode REMOVELAST() { return getToken(SwiftGrammarParser.REMOVELAST, 0); }
		public TerminalNode REMOVE() { return getToken(SwiftGrammarParser.REMOVE, 0); }
		public TerminalNode AT() { return getToken(SwiftGrammarParser.AT, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(SwiftGrammarParser.DOSPUNTOS, 0); }
		public TerminalNode RETURN() { return getToken(SwiftGrammarParser.RETURN, 0); }
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		int _la;
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				((InstructionContext)_localctx).printstmt = printstmt();
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(66);
					match(PUNTOCOMA);
					}
				}

				 _localctx.inst = ((InstructionContext)_localctx).printstmt.prnt
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				((InstructionContext)_localctx).ifstmt = ifstmt();
				 _localctx.inst = ((InstructionContext)_localctx).ifstmt.ifinst 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				((InstructionContext)_localctx).declarationstmt = declarationstmt();
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(75);
					match(PUNTOCOMA);
					}
				}

				 _localctx.inst = ((InstructionContext)_localctx).declarationstmt.dec 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				((InstructionContext)_localctx).asignationstmt = asignationstmt();
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(81);
					match(PUNTOCOMA);
					}
				}

				 _localctx.inst = ((InstructionContext)_localctx).asignationstmt.asig 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				((InstructionContext)_localctx).whilestmt = whilestmt();
				 _localctx.inst = ((InstructionContext)_localctx).whilestmt.whileinst 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(89);
				((InstructionContext)_localctx).forstmt = forstmt();
				 _localctx.inst = ((InstructionContext)_localctx).forstmt.forinst 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(92);
				((InstructionContext)_localctx).guardstmt = guardstmt();
				 _localctx.inst = ((InstructionContext)_localctx).guardstmt.gd 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(95);
				((InstructionContext)_localctx).function = function();
				_localctx.inst = ((InstructionContext)_localctx).function.fun
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(98);
				((InstructionContext)_localctx).structCreation = structCreation();
				 _localctx.inst = ((InstructionContext)_localctx).structCreation.dec 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(101);
				((InstructionContext)_localctx).callFuncionIns = callFuncionIns();
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(102);
					match(PUNTOCOMA);
					}
				}

				_localctx.inst = ((InstructionContext)_localctx).callFuncionIns.cf
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(107);
				((InstructionContext)_localctx).BREAK = match(BREAK);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(108);
					match(PUNTOCOMA);
					}
				}

				_localctx.inst = instructions.NewBreak((((InstructionContext)_localctx).BREAK!=null?((InstructionContext)_localctx).BREAK.getLine():0), (((InstructionContext)_localctx).BREAK!=null?((InstructionContext)_localctx).BREAK.getCharPositionInLine():0))
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(112);
				((InstructionContext)_localctx).CONTINUE = match(CONTINUE);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(113);
					match(PUNTOCOMA);
					}
				}

				_localctx.inst = instructions.NewContinue((((InstructionContext)_localctx).CONTINUE!=null?((InstructionContext)_localctx).CONTINUE.getLine():0), (((InstructionContext)_localctx).CONTINUE!=null?((InstructionContext)_localctx).CONTINUE.getCharPositionInLine():0))
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(117);
				((InstructionContext)_localctx).ID = match(ID);
				setState(118);
				match(PUNTO);
				setState(119);
				match(APPEND);
				setState(120);
				match(PAR_IZQ);
				setState(121);
				((InstructionContext)_localctx).expr = expr(0);
				setState(122);
				match(PAR_DER);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(123);
					match(PUNTOCOMA);
					}
				}

				_localctx.inst = instructions.NewAppend((((InstructionContext)_localctx).ID!=null?((InstructionContext)_localctx).ID.getLine():0), (((InstructionContext)_localctx).ID!=null?((InstructionContext)_localctx).ID.getCharPositionInLine():0), (((InstructionContext)_localctx).ID!=null?((InstructionContext)_localctx).ID.getText():null), ((InstructionContext)_localctx).expr.e)
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(128);
				((InstructionContext)_localctx).ID = match(ID);
				setState(129);
				match(PUNTO);
				setState(130);
				match(REMOVELAST);
				setState(131);
				match(PAR_IZQ);
				setState(132);
				match(PAR_DER);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(133);
					match(PUNTOCOMA);
					}
				}

				_localctx.inst = instructions.NewRemoveLast((((InstructionContext)_localctx).ID!=null?((InstructionContext)_localctx).ID.getLine():0), (((InstructionContext)_localctx).ID!=null?((InstructionContext)_localctx).ID.getCharPositionInLine():0), (((InstructionContext)_localctx).ID!=null?((InstructionContext)_localctx).ID.getText():null))
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(137);
				((InstructionContext)_localctx).ID = match(ID);
				setState(138);
				match(PUNTO);
				setState(139);
				match(REMOVE);
				setState(140);
				match(PAR_IZQ);
				setState(141);
				match(AT);
				setState(142);
				match(DOSPUNTOS);
				setState(143);
				((InstructionContext)_localctx).expr = expr(0);
				setState(144);
				match(PAR_DER);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(145);
					match(PUNTOCOMA);
					}
				}

				_localctx.inst = instructions.NewRemoveAt((((InstructionContext)_localctx).ID!=null?((InstructionContext)_localctx).ID.getLine():0), (((InstructionContext)_localctx).ID!=null?((InstructionContext)_localctx).ID.getCharPositionInLine():0), (((InstructionContext)_localctx).ID!=null?((InstructionContext)_localctx).ID.getText():null), ((InstructionContext)_localctx).expr.e)
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(150);
				((InstructionContext)_localctx).RETURN = match(RETURN);
				setState(151);
				((InstructionContext)_localctx).expr = expr(0);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(152);
					match(PUNTOCOMA);
					}
				}

				_localctx.inst = instructions.NewReturn((((InstructionContext)_localctx).RETURN!=null?((InstructionContext)_localctx).RETURN.getLine():0), (((InstructionContext)_localctx).RETURN!=null?((InstructionContext)_localctx).RETURN.getCharPositionInLine():0), ((InstructionContext)_localctx).expr.e)
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(157);
				((InstructionContext)_localctx).RETURN = match(RETURN);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(158);
					match(PUNTOCOMA);
					}
				}

				_localctx.inst = instructions.NewReturn((((InstructionContext)_localctx).RETURN!=null?((InstructionContext)_localctx).RETURN.getLine():0), (((InstructionContext)_localctx).RETURN!=null?((InstructionContext)_localctx).RETURN.getCharPositionInLine():0), nil)
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructCreationContext extends ParserRuleContext {
		public interfaces.Instruction dec;
		public Token STRUCT;
		public Token ID;
		public ListStructDecContext listStructDec;
		public TerminalNode STRUCT() { return getToken(SwiftGrammarParser.STRUCT, 0); }
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode LLAVE_IZQ() { return getToken(SwiftGrammarParser.LLAVE_IZQ, 0); }
		public ListStructDecContext listStructDec() {
			return getRuleContext(ListStructDecContext.class,0);
		}
		public TerminalNode LLAVE_DER() { return getToken(SwiftGrammarParser.LLAVE_DER, 0); }
		public StructCreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structCreation; }
	}

	public final StructCreationContext structCreation() throws RecognitionException {
		StructCreationContext _localctx = new StructCreationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_structCreation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			((StructCreationContext)_localctx).STRUCT = match(STRUCT);
			setState(165);
			((StructCreationContext)_localctx).ID = match(ID);
			setState(166);
			match(LLAVE_IZQ);
			setState(167);
			((StructCreationContext)_localctx).listStructDec = listStructDec(0);
			setState(168);
			match(LLAVE_DER);
			 _localctx.dec = instructions.NewStruct((((StructCreationContext)_localctx).STRUCT!=null?((StructCreationContext)_localctx).STRUCT.getLine():0), (((StructCreationContext)_localctx).STRUCT!=null?((StructCreationContext)_localctx).STRUCT.getCharPositionInLine():0), (((StructCreationContext)_localctx).ID!=null?((StructCreationContext)_localctx).ID.getText():null), ((StructCreationContext)_localctx).listStructDec.l) 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListStructDecContext extends ParserRuleContext {
		public []interface{} l;
		public ListStructDecContext list;
		public Token ID;
		public TypesContext types;
		public Token idp;
		public Token ids;
		public TerminalNode VAR() { return getToken(SwiftGrammarParser.VAR, 0); }
		public List<TerminalNode> ID() { return getTokens(SwiftGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SwiftGrammarParser.ID, i);
		}
		public TerminalNode DOSPUNTOS() { return getToken(SwiftGrammarParser.DOSPUNTOS, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode COMA() { return getToken(SwiftGrammarParser.COMA, 0); }
		public ListStructDecContext listStructDec() {
			return getRuleContext(ListStructDecContext.class,0);
		}
		public ListStructDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listStructDec; }
	}

	public final ListStructDecContext listStructDec() throws RecognitionException {
		return listStructDec(0);
	}

	private ListStructDecContext listStructDec(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListStructDecContext _localctx = new ListStructDecContext(_ctx, _parentState);
		ListStructDecContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_listStructDec, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(172);
				match(VAR);
				setState(173);
				((ListStructDecContext)_localctx).ID = match(ID);
				setState(174);
				match(DOSPUNTOS);
				setState(175);
				((ListStructDecContext)_localctx).types = types();

				                        var arr []interface{}
				                        newParams := environment.NewStructType((((ListStructDecContext)_localctx).ID!=null?((ListStructDecContext)_localctx).ID.getText():null), ((ListStructDecContext)_localctx).types.ty,"")
				                        arr = append(arr, newParams)
				                        _localctx.l = arr
				                    
				}
				break;
			case 2:
				{
				setState(178);
				match(VAR);
				setState(179);
				((ListStructDecContext)_localctx).idp = match(ID);
				setState(180);
				match(DOSPUNTOS);
				setState(181);
				((ListStructDecContext)_localctx).ids = match(ID);

				                        var arr []interface{}
				                        newParams := environment.NewStructType((((ListStructDecContext)_localctx).idp!=null?((ListStructDecContext)_localctx).idp.getText():null), environment.DEPENDIENTE,(((ListStructDecContext)_localctx).ids!=null?((ListStructDecContext)_localctx).ids.getText():null))
				                        arr = append(arr, newParams)
				                        _localctx.l = arr
				                    
				}
				break;
			case 3:
				{
				 _localctx.l = []interface{}{} 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(201);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ListStructDecContext(_parentctx, _parentState);
						_localctx.list = _prevctx;
						_localctx.list = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_listStructDec);
						setState(186);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(187);
						match(COMA);
						setState(188);
						match(VAR);
						setState(189);
						((ListStructDecContext)_localctx).ID = match(ID);
						setState(190);
						match(DOSPUNTOS);
						setState(191);
						((ListStructDecContext)_localctx).types = types();

						                                                          var arr []interface{}
						                                                          newParams := environment.NewStructType((((ListStructDecContext)_localctx).ID!=null?((ListStructDecContext)_localctx).ID.getText():null), ((ListStructDecContext)_localctx).types.ty,"")
						                                                          arr = append(((ListStructDecContext)_localctx).list.l, newParams)
						                                                          _localctx.l = arr
						                                                      
						}
						break;
					case 2:
						{
						_localctx = new ListStructDecContext(_parentctx, _parentState);
						_localctx.list = _prevctx;
						_localctx.list = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_listStructDec);
						setState(194);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(195);
						match(COMA);
						setState(196);
						match(VAR);
						setState(197);
						((ListStructDecContext)_localctx).idp = match(ID);
						setState(198);
						match(DOSPUNTOS);
						setState(199);
						((ListStructDecContext)_localctx).ids = match(ID);

						                                                          var arr []interface{}
						                                                          newParams := environment.NewStructType((((ListStructDecContext)_localctx).idp!=null?((ListStructDecContext)_localctx).idp.getText():null), environment.DEPENDIENTE,(((ListStructDecContext)_localctx).ids!=null?((ListStructDecContext)_localctx).ids.getText():null))
						                                                          arr = append(((ListStructDecContext)_localctx).list.l, newParams)
						                                                          _localctx.l = arr
						                                                      
						}
						break;
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrintstmtContext extends ParserRuleContext {
		public interfaces.Instruction prnt;
		public Token PRINT;
		public ListParamsContext listParams;
		public TerminalNode PRINT() { return getToken(SwiftGrammarParser.PRINT, 0); }
		public TerminalNode PAR_IZQ() { return getToken(SwiftGrammarParser.PAR_IZQ, 0); }
		public ListParamsContext listParams() {
			return getRuleContext(ListParamsContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(SwiftGrammarParser.PAR_DER, 0); }
		public PrintstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstmt; }
	}

	public final PrintstmtContext printstmt() throws RecognitionException {
		PrintstmtContext _localctx = new PrintstmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_printstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			((PrintstmtContext)_localctx).PRINT = match(PRINT);
			setState(207);
			match(PAR_IZQ);
			setState(208);
			((PrintstmtContext)_localctx).listParams = listParams(0);
			setState(209);
			match(PAR_DER);
			 _localctx.prnt = instructions.NewPrint((((PrintstmtContext)_localctx).PRINT!=null?((PrintstmtContext)_localctx).PRINT.getLine():0),(((PrintstmtContext)_localctx).PRINT!=null?((PrintstmtContext)_localctx).PRINT.getCharPositionInLine():0),((PrintstmtContext)_localctx).listParams.l)
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockelsifContext extends ParserRuleContext {
		public []interface{} blkif;
		public IfstmtContext ifstmt;
		public List<IfstmtContext> elseif = new ArrayList<IfstmtContext>();
		public List<IfstmtContext> ifstmt() {
			return getRuleContexts(IfstmtContext.class);
		}
		public IfstmtContext ifstmt(int i) {
			return getRuleContext(IfstmtContext.class,i);
		}
		public BlockelsifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockelsif; }
	}

	public final BlockelsifContext blockelsif() throws RecognitionException {
		BlockelsifContext _localctx = new BlockelsifContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_blockelsif);

		    _localctx.blkif = []interface{}{}
		    var listIfs []IIfstmtContext
		    
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(213); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(212);
					((BlockelsifContext)_localctx).ifstmt = ifstmt();
					((BlockelsifContext)_localctx).elseif.add(((BlockelsifContext)_localctx).ifstmt);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(215); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

			        listIfs = localctx.(*BlockelsifContext).GetElseif()
			        for _, e := range listIfs {
			            _localctx.blkif = append(_localctx.blkif, e.GetIfinst())
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfstmtContext extends ParserRuleContext {
		public interfaces.Instruction ifinst;
		public Token IF;
		public ExprContext expr;
		public BlockContext block;
		public BlockContext ifblck;
		public BlockContext elseblck;
		public BlockelsifContext blockelsif;
		public TerminalNode IF() { return getToken(SwiftGrammarParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> LLAVE_IZQ() { return getTokens(SwiftGrammarParser.LLAVE_IZQ); }
		public TerminalNode LLAVE_IZQ(int i) {
			return getToken(SwiftGrammarParser.LLAVE_IZQ, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> LLAVE_DER() { return getTokens(SwiftGrammarParser.LLAVE_DER); }
		public TerminalNode LLAVE_DER(int i) {
			return getToken(SwiftGrammarParser.LLAVE_DER, i);
		}
		public TerminalNode ELSE() { return getToken(SwiftGrammarParser.ELSE, 0); }
		public BlockelsifContext blockelsif() {
			return getRuleContext(BlockelsifContext.class,0);
		}
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifstmt);
		try {
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(220);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(221);
				match(LLAVE_IZQ);
				setState(222);
				((IfstmtContext)_localctx).block = block();
				setState(223);
				match(LLAVE_DER);
				 _localctx.ifinst = instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).block.blk, nil) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(227);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(228);
				match(LLAVE_IZQ);
				setState(229);
				((IfstmtContext)_localctx).ifblck = block();
				setState(230);
				match(LLAVE_DER);
				setState(231);
				match(ELSE);
				setState(232);
				match(LLAVE_IZQ);
				setState(233);
				((IfstmtContext)_localctx).elseblck = block();
				setState(234);
				match(LLAVE_DER);
				_localctx.ifinst = instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).ifblck.blk, ((IfstmtContext)_localctx).elseblck.blk)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(238);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(239);
				match(LLAVE_IZQ);
				setState(240);
				((IfstmtContext)_localctx).ifblck = block();
				setState(241);
				match(LLAVE_DER);
				setState(242);
				match(ELSE);
				setState(243);
				((IfstmtContext)_localctx).blockelsif = blockelsif();
				_localctx.ifinst = instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).ifblck.blk, ((IfstmtContext)_localctx).blockelsif.blkif)
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhilestmtContext extends ParserRuleContext {
		public interfaces.Instruction whileinst;
		public Token WHILE;
		public ExprContext expr;
		public BlockContext block;
		public TerminalNode WHILE() { return getToken(SwiftGrammarParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LLAVE_IZQ() { return getToken(SwiftGrammarParser.LLAVE_IZQ, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LLAVE_DER() { return getToken(SwiftGrammarParser.LLAVE_DER, 0); }
		public WhilestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestmt; }
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			((WhilestmtContext)_localctx).WHILE = match(WHILE);
			setState(249);
			((WhilestmtContext)_localctx).expr = expr(0);
			setState(250);
			match(LLAVE_IZQ);
			setState(251);
			((WhilestmtContext)_localctx).block = block();
			setState(252);
			match(LLAVE_DER);
			 _localctx.whileinst = instructions.NewWhile((((WhilestmtContext)_localctx).WHILE!=null?((WhilestmtContext)_localctx).WHILE.getLine():0), (((WhilestmtContext)_localctx).WHILE!=null?((WhilestmtContext)_localctx).WHILE.getCharPositionInLine():0), ((WhilestmtContext)_localctx).expr.e, ((WhilestmtContext)_localctx).block.blk) 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GuardstmtContext extends ParserRuleContext {
		public interfaces.Instruction gd;
		public Token GUARD;
		public ExprContext expr;
		public BlockContext block;
		public TerminalNode GUARD() { return getToken(SwiftGrammarParser.GUARD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(SwiftGrammarParser.ELSE, 0); }
		public TerminalNode LLAVE_IZQ() { return getToken(SwiftGrammarParser.LLAVE_IZQ, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LLAVE_DER() { return getToken(SwiftGrammarParser.LLAVE_DER, 0); }
		public GuardstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardstmt; }
	}

	public final GuardstmtContext guardstmt() throws RecognitionException {
		GuardstmtContext _localctx = new GuardstmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_guardstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			((GuardstmtContext)_localctx).GUARD = match(GUARD);
			setState(256);
			((GuardstmtContext)_localctx).expr = expr(0);
			setState(257);
			match(ELSE);
			setState(258);
			match(LLAVE_IZQ);
			setState(259);
			((GuardstmtContext)_localctx).block = block();
			setState(260);
			match(LLAVE_DER);
			 _localctx.gd = instructions.NewGuard((((GuardstmtContext)_localctx).GUARD!=null?((GuardstmtContext)_localctx).GUARD.getLine():0), (((GuardstmtContext)_localctx).GUARD!=null?((GuardstmtContext)_localctx).GUARD.getCharPositionInLine():0), ((GuardstmtContext)_localctx).expr.e, ((GuardstmtContext)_localctx).block.blk) 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForstmtContext extends ParserRuleContext {
		public interfaces.Instruction forinst;
		public Token FOR;
		public Token ID;
		public ExprForContext exprFor;
		public BlockContext block;
		public TerminalNode FOR() { return getToken(SwiftGrammarParser.FOR, 0); }
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode IN() { return getToken(SwiftGrammarParser.IN, 0); }
		public ExprForContext exprFor() {
			return getRuleContext(ExprForContext.class,0);
		}
		public TerminalNode LLAVE_IZQ() { return getToken(SwiftGrammarParser.LLAVE_IZQ, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LLAVE_DER() { return getToken(SwiftGrammarParser.LLAVE_DER, 0); }
		public ForstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstmt; }
	}

	public final ForstmtContext forstmt() throws RecognitionException {
		ForstmtContext _localctx = new ForstmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			((ForstmtContext)_localctx).FOR = match(FOR);
			setState(264);
			((ForstmtContext)_localctx).ID = match(ID);
			setState(265);
			match(IN);
			setState(266);
			((ForstmtContext)_localctx).exprFor = exprFor();
			setState(267);
			match(LLAVE_IZQ);
			setState(268);
			((ForstmtContext)_localctx).block = block();
			setState(269);
			match(LLAVE_DER);
			_localctx.forinst = instructions.NewFor((((ForstmtContext)_localctx).FOR!=null?((ForstmtContext)_localctx).FOR.getLine():0), (((ForstmtContext)_localctx).FOR!=null?((ForstmtContext)_localctx).FOR.getCharPositionInLine():0), (((ForstmtContext)_localctx).ID!=null?((ForstmtContext)_localctx).ID.getText():null), ((ForstmtContext)_localctx).exprFor.e, ((ForstmtContext)_localctx).block.blk)
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationstmtContext extends ParserRuleContext {
		public interfaces.Instruction dec;
		public Token VAR;
		public Token ID;
		public TypesContext types;
		public ExprContext expr;
		public ExprvectorContext exprvector;
		public TypesmatrizContext typesmatriz;
		public Token LET;
		public TerminalNode VAR() { return getToken(SwiftGrammarParser.VAR, 0); }
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(SwiftGrammarParser.DOSPUNTOS, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(SwiftGrammarParser.IGUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CIERRAPREGUNTA() { return getToken(SwiftGrammarParser.CIERRAPREGUNTA, 0); }
		public TerminalNode COR_IZQ() { return getToken(SwiftGrammarParser.COR_IZQ, 0); }
		public TerminalNode COR_DER() { return getToken(SwiftGrammarParser.COR_DER, 0); }
		public ExprvectorContext exprvector() {
			return getRuleContext(ExprvectorContext.class,0);
		}
		public TypesmatrizContext typesmatriz() {
			return getRuleContext(TypesmatrizContext.class,0);
		}
		public TerminalNode LET() { return getToken(SwiftGrammarParser.LET, 0); }
		public DeclarationstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationstmt; }
	}

	public final DeclarationstmtContext declarationstmt() throws RecognitionException {
		DeclarationstmtContext _localctx = new DeclarationstmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declarationstmt);
		try {
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				((DeclarationstmtContext)_localctx).VAR = match(VAR);
				setState(273);
				((DeclarationstmtContext)_localctx).ID = match(ID);
				setState(274);
				match(DOSPUNTOS);
				setState(275);
				((DeclarationstmtContext)_localctx).types = types();
				setState(276);
				match(IGUAL);
				setState(277);
				((DeclarationstmtContext)_localctx).expr = expr(0);
				 _localctx.dec = instructions.NewDeclaracion((((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getLine():0), (((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getCharPositionInLine():0), (((DeclarationstmtContext)_localctx).ID!=null?((DeclarationstmtContext)_localctx).ID.getText():null),true, ((DeclarationstmtContext)_localctx).types.ty, ((DeclarationstmtContext)_localctx).expr.e) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				((DeclarationstmtContext)_localctx).VAR = match(VAR);
				setState(281);
				((DeclarationstmtContext)_localctx).ID = match(ID);
				setState(282);
				match(IGUAL);
				setState(283);
				((DeclarationstmtContext)_localctx).expr = expr(0);
				 _localctx.dec = instructions.NewDeclaracion((((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getLine():0), (((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getCharPositionInLine():0), (((DeclarationstmtContext)_localctx).ID!=null?((DeclarationstmtContext)_localctx).ID.getText():null),true,environment.DEPENDIENTE, ((DeclarationstmtContext)_localctx).expr.e) 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
				((DeclarationstmtContext)_localctx).VAR = match(VAR);
				setState(287);
				((DeclarationstmtContext)_localctx).ID = match(ID);
				setState(288);
				match(DOSPUNTOS);
				setState(289);
				((DeclarationstmtContext)_localctx).types = types();
				setState(290);
				match(CIERRAPREGUNTA);
				 _localctx.dec = instructions.NewDeclaracion((((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getLine():0), (((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getCharPositionInLine():0), (((DeclarationstmtContext)_localctx).ID!=null?((DeclarationstmtContext)_localctx).ID.getText():null),true, ((DeclarationstmtContext)_localctx).types.ty, nil) 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(293);
				((DeclarationstmtContext)_localctx).VAR = match(VAR);
				setState(294);
				((DeclarationstmtContext)_localctx).ID = match(ID);
				setState(295);
				match(DOSPUNTOS);
				setState(296);
				match(COR_IZQ);
				setState(297);
				((DeclarationstmtContext)_localctx).types = types();
				setState(298);
				match(COR_DER);
				setState(299);
				match(IGUAL);
				setState(300);
				((DeclarationstmtContext)_localctx).exprvector = exprvector();
				 _localctx.dec = instructions.NewDeclaracionVector((((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getLine():0), (((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getCharPositionInLine():0), (((DeclarationstmtContext)_localctx).ID!=null?((DeclarationstmtContext)_localctx).ID.getText():null),true, ((DeclarationstmtContext)_localctx).types.ty, ((DeclarationstmtContext)_localctx).exprvector.exprv) 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(303);
				((DeclarationstmtContext)_localctx).VAR = match(VAR);
				setState(304);
				((DeclarationstmtContext)_localctx).ID = match(ID);
				setState(305);
				match(DOSPUNTOS);
				setState(306);
				((DeclarationstmtContext)_localctx).typesmatriz = typesmatriz();
				setState(307);
				match(IGUAL);
				setState(308);
				((DeclarationstmtContext)_localctx).expr = expr(0);
				 _localctx.dec = instructions.NewDeclaracionMatriz((((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getLine():0), (((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getCharPositionInLine():0), (((DeclarationstmtContext)_localctx).ID!=null?((DeclarationstmtContext)_localctx).ID.getText():null),true, ((DeclarationstmtContext)_localctx).typesmatriz.tm, ((DeclarationstmtContext)_localctx).expr.e) 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(311);
				((DeclarationstmtContext)_localctx).LET = match(LET);
				setState(312);
				((DeclarationstmtContext)_localctx).ID = match(ID);
				setState(313);
				match(DOSPUNTOS);
				setState(314);
				((DeclarationstmtContext)_localctx).types = types();
				setState(315);
				match(IGUAL);
				setState(316);
				((DeclarationstmtContext)_localctx).expr = expr(0);
				 _localctx.dec = instructions.NewDeclaracion((((DeclarationstmtContext)_localctx).LET!=null?((DeclarationstmtContext)_localctx).LET.getLine():0), (((DeclarationstmtContext)_localctx).LET!=null?((DeclarationstmtContext)_localctx).LET.getCharPositionInLine():0), (((DeclarationstmtContext)_localctx).ID!=null?((DeclarationstmtContext)_localctx).ID.getText():null),false, ((DeclarationstmtContext)_localctx).types.ty, ((DeclarationstmtContext)_localctx).expr.e) 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(319);
				((DeclarationstmtContext)_localctx).LET = match(LET);
				setState(320);
				((DeclarationstmtContext)_localctx).ID = match(ID);
				setState(321);
				match(IGUAL);
				setState(322);
				((DeclarationstmtContext)_localctx).expr = expr(0);
				 _localctx.dec = instructions.NewDeclaracion((((DeclarationstmtContext)_localctx).LET!=null?((DeclarationstmtContext)_localctx).LET.getLine():0), (((DeclarationstmtContext)_localctx).LET!=null?((DeclarationstmtContext)_localctx).LET.getCharPositionInLine():0), (((DeclarationstmtContext)_localctx).ID!=null?((DeclarationstmtContext)_localctx).ID.getText():null),false,environment.DEPENDIENTE, ((DeclarationstmtContext)_localctx).expr.e) 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignationstmtContext extends ParserRuleContext {
		public interfaces.Instruction asig;
		public Token ID;
		public ExprContext expr;
		public ExprContext index;
		public ExprContext listan;
		public Token op;
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(SwiftGrammarParser.IGUAL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COR_IZQ() { return getToken(SwiftGrammarParser.COR_IZQ, 0); }
		public TerminalNode COR_DER() { return getToken(SwiftGrammarParser.COR_DER, 0); }
		public TerminalNode SUM() { return getToken(SwiftGrammarParser.SUM, 0); }
		public TerminalNode RES() { return getToken(SwiftGrammarParser.RES, 0); }
		public AsignationstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignationstmt; }
	}

	public final AsignationstmtContext asignationstmt() throws RecognitionException {
		AsignationstmtContext _localctx = new AsignationstmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_asignationstmt);
		int _la;
		try {
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				((AsignationstmtContext)_localctx).ID = match(ID);
				setState(328);
				match(IGUAL);
				setState(329);
				((AsignationstmtContext)_localctx).expr = expr(0);
				 _localctx.asig = instructions.NewAsignacion((((AsignationstmtContext)_localctx).ID!=null?((AsignationstmtContext)_localctx).ID.getLine():0), (((AsignationstmtContext)_localctx).ID!=null?((AsignationstmtContext)_localctx).ID.getCharPositionInLine():0), (((AsignationstmtContext)_localctx).ID!=null?((AsignationstmtContext)_localctx).ID.getText():null), ((AsignationstmtContext)_localctx).expr.e) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				((AsignationstmtContext)_localctx).ID = match(ID);
				setState(333);
				match(COR_IZQ);
				setState(334);
				((AsignationstmtContext)_localctx).index = expr(0);
				setState(335);
				match(COR_DER);
				setState(336);
				match(IGUAL);
				setState(337);
				((AsignationstmtContext)_localctx).listan = expr(0);
				 _localctx.asig = instructions.NewAsignacionIndexVector((((AsignationstmtContext)_localctx).ID!=null?((AsignationstmtContext)_localctx).ID.getLine():0), (((AsignationstmtContext)_localctx).ID!=null?((AsignationstmtContext)_localctx).ID.getCharPositionInLine():0), (((AsignationstmtContext)_localctx).ID!=null?((AsignationstmtContext)_localctx).ID.getText():null), ((AsignationstmtContext)_localctx).index.e, ((AsignationstmtContext)_localctx).listan.e) 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(340);
				((AsignationstmtContext)_localctx).ID = match(ID);
				setState(341);
				((AsignationstmtContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==SUM || _la==RES) ) {
					((AsignationstmtContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(342);
				match(IGUAL);
				setState(343);
				((AsignationstmtContext)_localctx).expr = expr(0);
				_localctx.asig = instructions.NewOperacionAsignacion((((AsignationstmtContext)_localctx).ID!=null?((AsignationstmtContext)_localctx).ID.getLine():0), (((AsignationstmtContext)_localctx).ID!=null?((AsignationstmtContext)_localctx).ID.getCharPositionInLine():0), (((AsignationstmtContext)_localctx).ID!=null?((AsignationstmtContext)_localctx).ID.getText():null), ((AsignationstmtContext)_localctx).expr.e, (((AsignationstmtContext)_localctx).op!=null?((AsignationstmtContext)_localctx).op.getText():null))
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public interfaces.Instruction fun;
		public Token FUNC;
		public Token ID;
		public ListParamsFuncContext listParamsFunc;
		public BlockContext block;
		public TypesContext types;
		public TerminalNode FUNC() { return getToken(SwiftGrammarParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode PAR_IZQ() { return getToken(SwiftGrammarParser.PAR_IZQ, 0); }
		public ListParamsFuncContext listParamsFunc() {
			return getRuleContext(ListParamsFuncContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(SwiftGrammarParser.PAR_DER, 0); }
		public TerminalNode LLAVE_IZQ() { return getToken(SwiftGrammarParser.LLAVE_IZQ, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LLAVE_DER() { return getToken(SwiftGrammarParser.LLAVE_DER, 0); }
		public TerminalNode FLECHA() { return getToken(SwiftGrammarParser.FLECHA, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode COR_IZQ() { return getToken(SwiftGrammarParser.COR_IZQ, 0); }
		public TerminalNode COR_DER() { return getToken(SwiftGrammarParser.COR_DER, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function);
		try {
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				((FunctionContext)_localctx).FUNC = match(FUNC);
				setState(349);
				((FunctionContext)_localctx).ID = match(ID);
				setState(350);
				match(PAR_IZQ);
				setState(351);
				((FunctionContext)_localctx).listParamsFunc = listParamsFunc(0);
				setState(352);
				match(PAR_DER);
				setState(353);
				match(LLAVE_IZQ);
				setState(354);
				((FunctionContext)_localctx).block = block();
				setState(355);
				match(LLAVE_DER);
				_localctx.fun = instructions.NewFuncion((((FunctionContext)_localctx).FUNC!=null?((FunctionContext)_localctx).FUNC.getLine():0), (((FunctionContext)_localctx).FUNC!=null?((FunctionContext)_localctx).FUNC.getCharPositionInLine():0), (((FunctionContext)_localctx).ID!=null?((FunctionContext)_localctx).ID.getText():null), ((FunctionContext)_localctx).listParamsFunc.lpf,environment.NULL, ((FunctionContext)_localctx).block.blk)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				((FunctionContext)_localctx).FUNC = match(FUNC);
				setState(359);
				((FunctionContext)_localctx).ID = match(ID);
				setState(360);
				match(PAR_IZQ);
				setState(361);
				((FunctionContext)_localctx).listParamsFunc = listParamsFunc(0);
				setState(362);
				match(PAR_DER);
				setState(363);
				match(FLECHA);
				setState(364);
				((FunctionContext)_localctx).types = types();
				setState(365);
				match(LLAVE_IZQ);
				setState(366);
				((FunctionContext)_localctx).block = block();
				setState(367);
				match(LLAVE_DER);
				_localctx.fun = instructions.NewFuncion((((FunctionContext)_localctx).FUNC!=null?((FunctionContext)_localctx).FUNC.getLine():0), (((FunctionContext)_localctx).FUNC!=null?((FunctionContext)_localctx).FUNC.getCharPositionInLine():0), (((FunctionContext)_localctx).ID!=null?((FunctionContext)_localctx).ID.getText():null), ((FunctionContext)_localctx).listParamsFunc.lpf, ((FunctionContext)_localctx).types.ty, ((FunctionContext)_localctx).block.blk)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(370);
				((FunctionContext)_localctx).FUNC = match(FUNC);
				setState(371);
				((FunctionContext)_localctx).ID = match(ID);
				setState(372);
				match(PAR_IZQ);
				setState(373);
				((FunctionContext)_localctx).listParamsFunc = listParamsFunc(0);
				setState(374);
				match(PAR_DER);
				setState(375);
				match(FLECHA);
				setState(376);
				match(COR_IZQ);
				setState(377);
				types();
				setState(378);
				match(COR_DER);
				setState(379);
				match(LLAVE_IZQ);
				setState(380);
				((FunctionContext)_localctx).block = block();
				setState(381);
				match(LLAVE_DER);
				_localctx.fun = instructions.NewFuncion((((FunctionContext)_localctx).FUNC!=null?((FunctionContext)_localctx).FUNC.getLine():0), (((FunctionContext)_localctx).FUNC!=null?((FunctionContext)_localctx).FUNC.getCharPositionInLine():0), (((FunctionContext)_localctx).ID!=null?((FunctionContext)_localctx).ID.getText():null), ((FunctionContext)_localctx).listParamsFunc.lpf, environment.VECTOR, ((FunctionContext)_localctx).block.blk)
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListParamsFuncContext extends ParserRuleContext {
		public []interface{} lpf;
		public ListParamsFuncContext list;
		public Token ID;
		public TypesContext types;
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(SwiftGrammarParser.DOSPUNTOS, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode COR_IZQ() { return getToken(SwiftGrammarParser.COR_IZQ, 0); }
		public TerminalNode COR_DER() { return getToken(SwiftGrammarParser.COR_DER, 0); }
		public TerminalNode COMA() { return getToken(SwiftGrammarParser.COMA, 0); }
		public ListParamsFuncContext listParamsFunc() {
			return getRuleContext(ListParamsFuncContext.class,0);
		}
		public ListParamsFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listParamsFunc; }
	}

	public final ListParamsFuncContext listParamsFunc() throws RecognitionException {
		return listParamsFunc(0);
	}

	private ListParamsFuncContext listParamsFunc(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListParamsFuncContext _localctx = new ListParamsFuncContext(_ctx, _parentState);
		ListParamsFuncContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_listParamsFunc, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(387);
				((ListParamsFuncContext)_localctx).ID = match(ID);
				setState(388);
				match(DOSPUNTOS);
				setState(389);
				((ListParamsFuncContext)_localctx).types = types();

				    _localctx.lpf = []interface{}{}
				    newParam := instructions.NewDeclaracionParametros((((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getLine():0), (((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getCharPositionInLine():0), (((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getText():null), ((ListParamsFuncContext)_localctx).types.ty)
				    _localctx.lpf = append(_localctx.lpf, newParam)
				    
				}
				break;
			case 2:
				{
				setState(392);
				((ListParamsFuncContext)_localctx).ID = match(ID);
				setState(393);
				match(DOSPUNTOS);
				setState(394);
				match(COR_IZQ);
				setState(395);
				((ListParamsFuncContext)_localctx).types = types();
				setState(396);
				match(COR_DER);

				    _localctx.lpf = []interface{}{}
				    newParam := instructions.NewDeclaracionParametros((((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getLine():0), (((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getCharPositionInLine():0), (((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getText():null), environment.VECTOR)
				    _localctx.lpf = append(_localctx.lpf, newParam)
				    
				}
				break;
			case 3:
				{
				 _localctx.lpf = []interface{}{} 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(420);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(418);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ListParamsFuncContext(_parentctx, _parentState);
						_localctx.list = _prevctx;
						_localctx.list = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_listParamsFunc);
						setState(402);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(403);
						match(COMA);
						setState(404);
						((ListParamsFuncContext)_localctx).ID = match(ID);
						setState(405);
						match(DOSPUNTOS);
						setState(406);
						((ListParamsFuncContext)_localctx).types = types();

						              var arr []interface{}
						              newParam := instructions.NewDeclaracionParametros((((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getLine():0), (((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getCharPositionInLine():0), (((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getText():null), ((ListParamsFuncContext)_localctx).types.ty)
						              arr = append(((ListParamsFuncContext)_localctx).list.lpf, newParam)
						              _localctx.lpf = arr
						              
						}
						break;
					case 2:
						{
						_localctx = new ListParamsFuncContext(_parentctx, _parentState);
						_localctx.list = _prevctx;
						_localctx.list = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_listParamsFunc);
						setState(409);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(410);
						match(COMA);
						setState(411);
						((ListParamsFuncContext)_localctx).ID = match(ID);
						setState(412);
						match(DOSPUNTOS);
						setState(413);
						match(COR_IZQ);
						setState(414);
						((ListParamsFuncContext)_localctx).types = types();
						setState(415);
						match(COR_DER);

						              var arr []interface{}
						              newParam := instructions.NewDeclaracionParametros((((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getLine():0), (((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getCharPositionInLine():0), (((ListParamsFuncContext)_localctx).ID!=null?((ListParamsFuncContext)_localctx).ID.getText():null), environment.VECTOR)
						              arr = append(((ListParamsFuncContext)_localctx).list.lpf, newParam)
						              _localctx.lpf = arr
						              
						}
						break;
					}
					} 
				}
				setState(422);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CallFuncionInsContext extends ParserRuleContext {
		public interfaces.Expression cf;
		public Token ID;
		public ListParamsCallContext listParamsCall;
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode PAR_IZQ() { return getToken(SwiftGrammarParser.PAR_IZQ, 0); }
		public ListParamsCallContext listParamsCall() {
			return getRuleContext(ListParamsCallContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(SwiftGrammarParser.PAR_DER, 0); }
		public CallFuncionInsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFuncionIns; }
	}

	public final CallFuncionInsContext callFuncionIns() throws RecognitionException {
		CallFuncionInsContext _localctx = new CallFuncionInsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_callFuncionIns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			((CallFuncionInsContext)_localctx).ID = match(ID);
			setState(424);
			match(PAR_IZQ);
			setState(425);
			((CallFuncionInsContext)_localctx).listParamsCall = listParamsCall(0);
			setState(426);
			match(PAR_DER);
			 _localctx.cf = expressions.NewLlamadoFuncion((((CallFuncionInsContext)_localctx).ID!=null?((CallFuncionInsContext)_localctx).ID.getLine():0), (((CallFuncionInsContext)_localctx).ID!=null?((CallFuncionInsContext)_localctx).ID.getCharPositionInLine():0), (((CallFuncionInsContext)_localctx).ID!=null?((CallFuncionInsContext)_localctx).ID.getText():null), ((CallFuncionInsContext)_localctx).listParamsCall.l) 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypesContext extends ParserRuleContext {
		public environment.TipoExpresion ty;
		public TerminalNode INT() { return getToken(SwiftGrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(SwiftGrammarParser.FLOAT, 0); }
		public TerminalNode STR() { return getToken(SwiftGrammarParser.STR, 0); }
		public TerminalNode BOOL() { return getToken(SwiftGrammarParser.BOOL, 0); }
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_types);
		try {
			setState(437);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				match(INT);
				 _localctx.ty = environment.INTEGER 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				match(FLOAT);
				 _localctx.ty = environment.FLOAT 
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 3);
				{
				setState(433);
				match(STR);
				 _localctx.ty = environment.STRING 
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(435);
				match(BOOL);
				 _localctx.ty = environment.BOOLEAN 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypesmatrizContext extends ParserRuleContext {
		public []interface{} tm;
		public TypesmatrizContext list;
		public TypesContext types;
		public TerminalNode COR_IZQ() { return getToken(SwiftGrammarParser.COR_IZQ, 0); }
		public TerminalNode COR_DER() { return getToken(SwiftGrammarParser.COR_DER, 0); }
		public TypesmatrizContext typesmatriz() {
			return getRuleContext(TypesmatrizContext.class,0);
		}
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TypesmatrizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typesmatriz; }
	}

	public final TypesmatrizContext typesmatriz() throws RecognitionException {
		TypesmatrizContext _localctx = new TypesmatrizContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typesmatriz);
		try {
			setState(447);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COR_IZQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				match(COR_IZQ);
				setState(440);
				((TypesmatrizContext)_localctx).list = typesmatriz();
				setState(441);
				match(COR_DER);

				                                var arr []interface{}
				                                newTipo := environment.NewTipoArray(environment.ARRAY)
				                                arr = append(((TypesmatrizContext)_localctx).list.tm, newTipo)
				                                _localctx.tm = arr
				                            
				}
				break;
			case INT:
			case FLOAT:
			case BOOL:
			case STR:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				((TypesmatrizContext)_localctx).types = types();

				            _localctx.tm = []interface{}{}
				            newTipo := environment.NewTipoArray(((TypesmatrizContext)_localctx).types.ty)
				            _localctx.tm = append(_localctx.tm, newTipo)
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprForContext extends ParserRuleContext {
		public interfaces.Expression e;
		public ExprContext range1;
		public ExprContext range2;
		public ExprContext expr;
		public List<TerminalNode> PUNTO() { return getTokens(SwiftGrammarParser.PUNTO); }
		public TerminalNode PUNTO(int i) {
			return getToken(SwiftGrammarParser.PUNTO, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprFor; }
	}

	public final ExprForContext exprFor() throws RecognitionException {
		ExprForContext _localctx = new ExprForContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exprFor);
		try {
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				((ExprForContext)_localctx).range1 = expr(0);
				setState(450);
				match(PUNTO);
				setState(451);
				match(PUNTO);
				setState(452);
				match(PUNTO);
				setState(453);
				((ExprForContext)_localctx).range2 = expr(0);
				_localctx.e = expressions.NewForRange((((ExprForContext)_localctx).range1!=null?(((ExprForContext)_localctx).range1.start):null).GetLine(), (((ExprForContext)_localctx).range1!=null?(((ExprForContext)_localctx).range1.start):null).GetColumn(), ((ExprForContext)_localctx).range1.e, ((ExprForContext)_localctx).range2.e)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(456);
				((ExprForContext)_localctx).expr = expr(0);
				_localctx.e = ((ExprForContext)_localctx).expr.e
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public interfaces.Expression e;
		public ExprContext left;
		public Token RES;
		public ExprContext expr;
		public Token NOT;
		public Token ID;
		public ListStructExpContext listStructExp;
		public CallFuncionContext callFuncion;
		public ConversionstmtContext conversionstmt;
		public ListArrayContext list;
		public Token COR_IZQ;
		public ListParamsContext listParams;
		public Token NUMBER;
		public Token STRING;
		public Token TRU;
		public Token FAL;
		public Token NIL;
		public Token op;
		public ExprContext right;
		public TerminalNode RES() { return getToken(SwiftGrammarParser.RES, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SwiftGrammarParser.NOT, 0); }
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode PAR_IZQ() { return getToken(SwiftGrammarParser.PAR_IZQ, 0); }
		public ListStructExpContext listStructExp() {
			return getRuleContext(ListStructExpContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(SwiftGrammarParser.PAR_DER, 0); }
		public CallFuncionContext callFuncion() {
			return getRuleContext(CallFuncionContext.class,0);
		}
		public ConversionstmtContext conversionstmt() {
			return getRuleContext(ConversionstmtContext.class,0);
		}
		public TerminalNode PUNTO() { return getToken(SwiftGrammarParser.PUNTO, 0); }
		public TerminalNode COUNT() { return getToken(SwiftGrammarParser.COUNT, 0); }
		public TerminalNode ISEMPTY() { return getToken(SwiftGrammarParser.ISEMPTY, 0); }
		public ListArrayContext listArray() {
			return getRuleContext(ListArrayContext.class,0);
		}
		public TerminalNode COR_IZQ() { return getToken(SwiftGrammarParser.COR_IZQ, 0); }
		public ListParamsContext listParams() {
			return getRuleContext(ListParamsContext.class,0);
		}
		public TerminalNode COR_DER() { return getToken(SwiftGrammarParser.COR_DER, 0); }
		public TerminalNode NUMBER() { return getToken(SwiftGrammarParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(SwiftGrammarParser.STRING, 0); }
		public TerminalNode TRU() { return getToken(SwiftGrammarParser.TRU, 0); }
		public TerminalNode FAL() { return getToken(SwiftGrammarParser.FAL, 0); }
		public TerminalNode NIL() { return getToken(SwiftGrammarParser.NIL, 0); }
		public TerminalNode MULT() { return getToken(SwiftGrammarParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(SwiftGrammarParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SwiftGrammarParser.MOD, 0); }
		public TerminalNode SUM() { return getToken(SwiftGrammarParser.SUM, 0); }
		public TerminalNode MAYIG() { return getToken(SwiftGrammarParser.MAYIG, 0); }
		public TerminalNode MAYOR() { return getToken(SwiftGrammarParser.MAYOR, 0); }
		public TerminalNode MENIG() { return getToken(SwiftGrammarParser.MENIG, 0); }
		public TerminalNode MENOR() { return getToken(SwiftGrammarParser.MENOR, 0); }
		public TerminalNode IG_IG() { return getToken(SwiftGrammarParser.IG_IG, 0); }
		public TerminalNode DIFE() { return getToken(SwiftGrammarParser.DIFE, 0); }
		public TerminalNode AND() { return getToken(SwiftGrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(SwiftGrammarParser.OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(462);
				((ExprContext)_localctx).RES = match(RES);
				setState(463);
				((ExprContext)_localctx).left = ((ExprContext)_localctx).expr = expr(22);
				 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).RES!=null?((ExprContext)_localctx).RES.getLine():0), (((ExprContext)_localctx).RES!=null?((ExprContext)_localctx).RES.getCharPositionInLine():0), ((ExprContext)_localctx).left.e, "UNARIO", nil) 
				}
				break;
			case 2:
				{
				setState(466);
				((ExprContext)_localctx).NOT = match(NOT);
				setState(467);
				((ExprContext)_localctx).left = ((ExprContext)_localctx).expr = expr(16);
				_localctx.e = expressions.NewOperation((((ExprContext)_localctx).NOT!=null?((ExprContext)_localctx).NOT.getLine():0), (((ExprContext)_localctx).NOT!=null?((ExprContext)_localctx).NOT.getCharPositionInLine():0), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).NOT!=null?((ExprContext)_localctx).NOT.getText():null), nil)
				}
				break;
			case 3:
				{
				setState(470);
				((ExprContext)_localctx).ID = match(ID);
				setState(471);
				match(PAR_IZQ);
				setState(472);
				((ExprContext)_localctx).listStructExp = listStructExp(0);
				setState(473);
				match(PAR_DER);
				 _localctx.e = expressions.NewStructExp((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getCharPositionInLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null), ((ExprContext)_localctx).listStructExp.l ) 
				}
				break;
			case 4:
				{
				setState(476);
				((ExprContext)_localctx).callFuncion = callFuncion();
				_localctx.e = ((ExprContext)_localctx).callFuncion.cf
				}
				break;
			case 5:
				{
				setState(479);
				match(PAR_IZQ);
				setState(480);
				((ExprContext)_localctx).expr = expr(0);
				setState(481);
				match(PAR_DER);
				 _localctx.e = ((ExprContext)_localctx).expr.e 
				}
				break;
			case 6:
				{
				setState(484);
				((ExprContext)_localctx).conversionstmt = conversionstmt();
				 _localctx.e = ((ExprContext)_localctx).conversionstmt.conv 
				}
				break;
			case 7:
				{
				setState(487);
				((ExprContext)_localctx).ID = match(ID);
				setState(488);
				match(PUNTO);
				setState(489);
				match(COUNT);
				 _localctx.e = expressions.NewCount((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getCharPositionInLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null))
				}
				break;
			case 8:
				{
				setState(491);
				((ExprContext)_localctx).ID = match(ID);
				setState(492);
				match(PUNTO);
				setState(493);
				match(ISEMPTY);
				 _localctx.e = expressions.NewIsEmpty((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getCharPositionInLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null))
				}
				break;
			case 9:
				{
				setState(495);
				((ExprContext)_localctx).list = listArray(0);
				 _localctx.e = ((ExprContext)_localctx).list.p
				}
				break;
			case 10:
				{
				setState(498);
				((ExprContext)_localctx).COR_IZQ = match(COR_IZQ);
				setState(499);
				((ExprContext)_localctx).listParams = listParams(0);
				setState(500);
				match(COR_DER);
				 _localctx.e = expressions.NewArray((((ExprContext)_localctx).COR_IZQ!=null?((ExprContext)_localctx).COR_IZQ.getLine():0), (((ExprContext)_localctx).COR_IZQ!=null?((ExprContext)_localctx).COR_IZQ.getCharPositionInLine():0), ((ExprContext)_localctx).listParams.l) 
				}
				break;
			case 11:
				{
				setState(503);
				((ExprContext)_localctx).NUMBER = match(NUMBER);

				        if (strings.Contains((((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getText():null),".")){
				            num,err := strconv.ParseFloat((((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getText():null), 64);
				            if err!= nil{
				                fmt.Println(err)
				            }
				            _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getLine():0),(((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getCharPositionInLine():0),num,environment.FLOAT)
				        }else{
				            num,err := strconv.Atoi((((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getText():null))
				            if err!= nil{
				                fmt.Println(err)
				            }
				            _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getLine():0),(((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getCharPositionInLine():0),num,environment.INTEGER)
				        }
				    
				}
				break;
			case 12:
				{
				setState(505);
				((ExprContext)_localctx).STRING = match(STRING);

				        str := (((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getText():null)
				        _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getLine():0), (((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getCharPositionInLine():0), str[1:len(str)-1],environment.STRING)
				    
				}
				break;
			case 13:
				{
				setState(507);
				((ExprContext)_localctx).TRU = match(TRU);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).TRU!=null?((ExprContext)_localctx).TRU.getLine():0), (((ExprContext)_localctx).TRU!=null?((ExprContext)_localctx).TRU.getCharPositionInLine():0), true, environment.BOOLEAN) 
				}
				break;
			case 14:
				{
				setState(509);
				((ExprContext)_localctx).FAL = match(FAL);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).FAL!=null?((ExprContext)_localctx).FAL.getLine():0), (((ExprContext)_localctx).FAL!=null?((ExprContext)_localctx).FAL.getCharPositionInLine():0), false, environment.BOOLEAN) 
				}
				break;
			case 15:
				{
				setState(511);
				((ExprContext)_localctx).NIL = match(NIL);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).NIL!=null?((ExprContext)_localctx).NIL.getLine():0), (((ExprContext)_localctx).NIL!=null?((ExprContext)_localctx).NIL.getCharPositionInLine():0), nil, environment.NULL) 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(552);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(550);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(515);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(516);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(517);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(22);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(520);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(521);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SUM || _la==RES) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(522);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(21);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(525);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(526);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MAYIG || _la==MAYOR) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(527);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(20);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(530);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(531);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MENIG || _la==MENOR) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(532);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(19);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(535);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(536);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIFE || _la==IG_IG) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(537);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(18);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(540);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(541);
						((ExprContext)_localctx).op = match(AND);
						setState(542);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(16);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(545);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(546);
						((ExprContext)_localctx).op = match(OR);
						setState(547);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(15);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					}
					} 
				}
				setState(554);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConversionstmtContext extends ParserRuleContext {
		public interfaces.Expression conv;
		public Token INT;
		public ExprContext expr;
		public Token FLOAT;
		public Token STR;
		public TerminalNode INT() { return getToken(SwiftGrammarParser.INT, 0); }
		public TerminalNode PAR_IZQ() { return getToken(SwiftGrammarParser.PAR_IZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(SwiftGrammarParser.PAR_DER, 0); }
		public TerminalNode FLOAT() { return getToken(SwiftGrammarParser.FLOAT, 0); }
		public TerminalNode STR() { return getToken(SwiftGrammarParser.STR, 0); }
		public ConversionstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversionstmt; }
	}

	public final ConversionstmtContext conversionstmt() throws RecognitionException {
		ConversionstmtContext _localctx = new ConversionstmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_conversionstmt);
		try {
			setState(573);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(555);
				((ConversionstmtContext)_localctx).INT = match(INT);
				setState(556);
				match(PAR_IZQ);
				setState(557);
				((ConversionstmtContext)_localctx).expr = expr(0);
				setState(558);
				match(PAR_DER);
				 _localctx.conv = expressions.NewToInt((((ConversionstmtContext)_localctx).INT!=null?((ConversionstmtContext)_localctx).INT.getLine():0), (((ConversionstmtContext)_localctx).INT!=null?((ConversionstmtContext)_localctx).INT.getCharPositionInLine():0), ((ConversionstmtContext)_localctx).expr.e) 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(561);
				((ConversionstmtContext)_localctx).FLOAT = match(FLOAT);
				setState(562);
				match(PAR_IZQ);
				setState(563);
				((ConversionstmtContext)_localctx).expr = expr(0);
				setState(564);
				match(PAR_DER);
				 _localctx.conv = expressions.NewToFloat((((ConversionstmtContext)_localctx).FLOAT!=null?((ConversionstmtContext)_localctx).FLOAT.getLine():0), (((ConversionstmtContext)_localctx).FLOAT!=null?((ConversionstmtContext)_localctx).FLOAT.getCharPositionInLine():0), ((ConversionstmtContext)_localctx).expr.e) 
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 3);
				{
				setState(567);
				((ConversionstmtContext)_localctx).STR = match(STR);
				setState(568);
				match(PAR_IZQ);
				setState(569);
				((ConversionstmtContext)_localctx).expr = expr(0);
				setState(570);
				match(PAR_DER);
				 _localctx.conv = expressions.NewToString((((ConversionstmtContext)_localctx).STR!=null?((ConversionstmtContext)_localctx).STR.getLine():0), (((ConversionstmtContext)_localctx).STR!=null?((ConversionstmtContext)_localctx).STR.getCharPositionInLine():0), ((ConversionstmtContext)_localctx).expr.e) 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprvectorContext extends ParserRuleContext {
		public interfaces.Expression exprv;
		public Token COR_IZQ;
		public ListParamsContext listParams;
		public Token ID;
		public TerminalNode COR_IZQ() { return getToken(SwiftGrammarParser.COR_IZQ, 0); }
		public ListParamsContext listParams() {
			return getRuleContext(ListParamsContext.class,0);
		}
		public TerminalNode COR_DER() { return getToken(SwiftGrammarParser.COR_DER, 0); }
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public ExprvectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprvector; }
	}

	public final ExprvectorContext exprvector() throws RecognitionException {
		ExprvectorContext _localctx = new ExprvectorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exprvector);
		try {
			setState(585);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
				((ExprvectorContext)_localctx).COR_IZQ = match(COR_IZQ);
				setState(576);
				((ExprvectorContext)_localctx).listParams = listParams(0);
				setState(577);
				match(COR_DER);
				 _localctx.exprv = expressions.NewVector((((ExprvectorContext)_localctx).COR_IZQ!=null?((ExprvectorContext)_localctx).COR_IZQ.getLine():0), (((ExprvectorContext)_localctx).COR_IZQ!=null?((ExprvectorContext)_localctx).COR_IZQ.getCharPositionInLine():0), ((ExprvectorContext)_localctx).listParams.l) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				((ExprvectorContext)_localctx).COR_IZQ = match(COR_IZQ);
				setState(581);
				match(COR_DER);
				 _localctx.exprv = expressions.NewVector((((ExprvectorContext)_localctx).COR_IZQ!=null?((ExprvectorContext)_localctx).COR_IZQ.getLine():0), (((ExprvectorContext)_localctx).COR_IZQ!=null?((ExprvectorContext)_localctx).COR_IZQ.getCharPositionInLine():0), nil) 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(583);
				((ExprvectorContext)_localctx).ID = match(ID);
				 _localctx.exprv = expressions.NewLlamadoVar((((ExprvectorContext)_localctx).ID!=null?((ExprvectorContext)_localctx).ID.getLine():0), (((ExprvectorContext)_localctx).ID!=null?((ExprvectorContext)_localctx).ID.getCharPositionInLine():0), (((ExprvectorContext)_localctx).ID!=null?((ExprvectorContext)_localctx).ID.getText():null))
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListParamsContext extends ParserRuleContext {
		public []interface{} l;
		public ListParamsContext list;
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COMA() { return getToken(SwiftGrammarParser.COMA, 0); }
		public ListParamsContext listParams() {
			return getRuleContext(ListParamsContext.class,0);
		}
		public ListParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listParams; }
	}

	public final ListParamsContext listParams() throws RecognitionException {
		return listParams(0);
	}

	private ListParamsContext listParams(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListParamsContext _localctx = new ListParamsContext(_ctx, _parentState);
		ListParamsContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_listParams, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(588);
			((ListParamsContext)_localctx).expr = expr(0);

			            _localctx.l = []interface{}{}
			            _localctx.l = append(_localctx.l, ((ListParamsContext)_localctx).expr.e)
			        
			}
			_ctx.stop = _input.LT(-1);
			setState(598);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListParamsContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listParams);
					setState(591);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(592);
					match(COMA);
					setState(593);
					((ListParamsContext)_localctx).expr = expr(0);

					                                          var arr []interface{}
					                                          arr = append(((ListParamsContext)_localctx).list.l, ((ListParamsContext)_localctx).expr.e)
					                                          _localctx.l = arr
					                                      
					}
					} 
				}
				setState(600);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ListArrayContext extends ParserRuleContext {
		public interfaces.Expression p;
		public ListArrayContext list;
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode COR_IZQ() { return getToken(SwiftGrammarParser.COR_IZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COR_DER() { return getToken(SwiftGrammarParser.COR_DER, 0); }
		public ListArrayContext listArray() {
			return getRuleContext(ListArrayContext.class,0);
		}
		public TerminalNode PUNTO() { return getToken(SwiftGrammarParser.PUNTO, 0); }
		public ListArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listArray; }
	}

	public final ListArrayContext listArray() throws RecognitionException {
		return listArray(0);
	}

	private ListArrayContext listArray(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListArrayContext _localctx = new ListArrayContext(_ctx, _parentState);
		ListArrayContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_listArray, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(602);
			((ListArrayContext)_localctx).ID = match(ID);
			 _localctx.p = expressions.NewLlamadoVar((((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getLine():0), (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getCharPositionInLine():0), (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getText():null))
			}
			_ctx.stop = _input.LT(-1);
			setState(617);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(615);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new ListArrayContext(_parentctx, _parentState);
						_localctx.list = _prevctx;
						_localctx.list = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_listArray);
						setState(605);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(606);
						match(COR_IZQ);
						setState(607);
						((ListArrayContext)_localctx).expr = expr(0);
						setState(608);
						match(COR_DER);
						 _localctx.p = expressions.NewArrayAccess((((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetLine(), (((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetColumn(), ((ListArrayContext)_localctx).list.p, ((ListArrayContext)_localctx).expr.e) 
						}
						break;
					case 2:
						{
						_localctx = new ListArrayContext(_parentctx, _parentState);
						_localctx.list = _prevctx;
						_localctx.list = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_listArray);
						setState(611);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(612);
						match(PUNTO);
						setState(613);
						((ListArrayContext)_localctx).ID = match(ID);
						 _localctx.p = expressions.NewStructAccess((((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetLine(), (((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetColumn(), ((ListArrayContext)_localctx).list.p, (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getText():null))  
						}
						break;
					}
					} 
				}
				setState(619);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CallFuncionContext extends ParserRuleContext {
		public interfaces.Expression cf;
		public Token ID;
		public ListParamsCallContext listParamsCall;
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode PAR_IZQ() { return getToken(SwiftGrammarParser.PAR_IZQ, 0); }
		public ListParamsCallContext listParamsCall() {
			return getRuleContext(ListParamsCallContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(SwiftGrammarParser.PAR_DER, 0); }
		public CallFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFuncion; }
	}

	public final CallFuncionContext callFuncion() throws RecognitionException {
		CallFuncionContext _localctx = new CallFuncionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_callFuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			((CallFuncionContext)_localctx).ID = match(ID);
			setState(621);
			match(PAR_IZQ);
			setState(622);
			((CallFuncionContext)_localctx).listParamsCall = listParamsCall(0);
			setState(623);
			match(PAR_DER);
			 _localctx.cf = expressions.NewLlamadoFuncion((((CallFuncionContext)_localctx).ID!=null?((CallFuncionContext)_localctx).ID.getLine():0), (((CallFuncionContext)_localctx).ID!=null?((CallFuncionContext)_localctx).ID.getCharPositionInLine():0), (((CallFuncionContext)_localctx).ID!=null?((CallFuncionContext)_localctx).ID.getText():null), ((CallFuncionContext)_localctx).listParamsCall.l) 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListParamsCallContext extends ParserRuleContext {
		public []interface{} l;
		public ListParamsCallContext list;
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COMA() { return getToken(SwiftGrammarParser.COMA, 0); }
		public ListParamsCallContext listParamsCall() {
			return getRuleContext(ListParamsCallContext.class,0);
		}
		public ListParamsCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listParamsCall; }
	}

	public final ListParamsCallContext listParamsCall() throws RecognitionException {
		return listParamsCall(0);
	}

	private ListParamsCallContext listParamsCall(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListParamsCallContext _localctx = new ListParamsCallContext(_ctx, _parentState);
		ListParamsCallContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_listParamsCall, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(627);
				((ListParamsCallContext)_localctx).expr = expr(0);

				            _localctx.l = []interface{}{}
				            _localctx.l = append(_localctx.l, ((ListParamsCallContext)_localctx).expr.e)
				        
				}
				break;
			case 2:
				{

				        _localctx.l = []interface{}{}
				    
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(640);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListParamsCallContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listParamsCall);
					setState(633);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(634);
					match(COMA);
					setState(635);
					((ListParamsCallContext)_localctx).expr = expr(0);

					                                              var arr []interface{}
					                                              arr = append(((ListParamsCallContext)_localctx).list.l, ((ListParamsCallContext)_localctx).expr.e)
					                                              _localctx.l = arr
					                                          
					}
					} 
				}
				setState(642);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ListStructExpContext extends ParserRuleContext {
		public []interface{} l;
		public ListStructExpContext list;
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(SwiftGrammarParser.DOSPUNTOS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ListStructExpContext listStructExp() {
			return getRuleContext(ListStructExpContext.class,0);
		}
		public TerminalNode COMA() { return getToken(SwiftGrammarParser.COMA, 0); }
		public ListStructExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listStructExp; }
	}

	public final ListStructExpContext listStructExp() throws RecognitionException {
		return listStructExp(0);
	}

	private ListStructExpContext listStructExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListStructExpContext _localctx = new ListStructExpContext(_ctx, _parentState);
		ListStructExpContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_listStructExp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(644);
				((ListStructExpContext)_localctx).ID = match(ID);
				setState(645);
				match(DOSPUNTOS);
				setState(646);
				((ListStructExpContext)_localctx).expr = expr(0);

				                    var arr []interface{}
				                    StrExp := environment.NewStructContent((((ListStructExpContext)_localctx).ID!=null?((ListStructExpContext)_localctx).ID.getText():null), ((ListStructExpContext)_localctx).expr.e)
				                    arr = append(arr, StrExp)
				                    _localctx.l = arr
				                
				}
				break;
			case 2:
				{

				        _localctx.l = []interface{}{}
				    
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(663);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListStructExpContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listStructExp);
					setState(652);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(654);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMA) {
						{
						setState(653);
						match(COMA);
						}
					}

					setState(656);
					((ListStructExpContext)_localctx).ID = match(ID);
					setState(657);
					match(DOSPUNTOS);
					setState(658);
					((ListStructExpContext)_localctx).expr = expr(0);

					                                                      var arr []interface{}
					                                                      StrExp := environment.NewStructContent((((ListStructExpContext)_localctx).ID!=null?((ListStructExpContext)_localctx).ID.getText():null), ((ListStructExpContext)_localctx).expr.e)
					                                                      arr = append(((ListStructExpContext)_localctx).list.l, StrExp)
					                                                      _localctx.l = arr
					                                                  
					}
					} 
				}
				setState(665);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return listStructDec_sempred((ListStructDecContext)_localctx, predIndex);
		case 14:
			return listParamsFunc_sempred((ListParamsFuncContext)_localctx, predIndex);
		case 19:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 22:
			return listParams_sempred((ListParamsContext)_localctx, predIndex);
		case 23:
			return listArray_sempred((ListArrayContext)_localctx, predIndex);
		case 25:
			return listParamsCall_sempred((ListParamsCallContext)_localctx, predIndex);
		case 26:
			return listStructExp_sempred((ListStructExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean listStructDec_sempred(ListStructDecContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean listParamsFunc_sempred(ListParamsFuncContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 21);
		case 5:
			return precpred(_ctx, 20);
		case 6:
			return precpred(_ctx, 19);
		case 7:
			return precpred(_ctx, 18);
		case 8:
			return precpred(_ctx, 17);
		case 9:
			return precpred(_ctx, 15);
		case 10:
			return precpred(_ctx, 14);
		}
		return true;
	}
	private boolean listParams_sempred(ListParamsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listArray_sempred(ListArrayContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listParamsCall_sempred(ListParamsCallContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean listStructExp_sempred(ListStructExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u029d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\3\6\3>\n\3\r\3\16\3?"+
		"\3\3\3\3\3\4\3\4\5\4F\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4O\n\4\3\4\3\4"+
		"\3\4\3\4\5\4U\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4j\n\4\3\4\3\4\3\4\3\4\5\4p\n\4\3\4\3\4\3\4"+
		"\5\4u\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\177\n\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4\u0089\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4\u0095\n\4\3\4\3\4\3\4\3\4\3\4\5\4\u009c\n\4\3\4\3\4\3\4\3\4\5\4\u00a2"+
		"\n\4\3\4\5\4\u00a5\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00bb\n\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00cc\n\6\f\6\16\6\u00cf\13\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\6\b\u00d8\n\b\r\b\16\b\u00d9\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00f9\n\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u0148\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u015d\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0183\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0193\n\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\7\20\u01a5\n\20\f\20\16\20\u01a8\13\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u01b8\n\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u01c2\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u01ce\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u0204\n\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\7\25\u0229\n\25\f\25\16\25\u022c\13\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u0240\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u024c"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0257\n\30\f\30"+
		"\16\30\u025a\13\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\7\31\u026a\n\31\f\31\16\31\u026d\13\31\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\5\33\u027a\n\33\3\33\3\33"+
		"\3\33\3\33\3\33\7\33\u0281\n\33\f\33\16\33\u0284\13\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u028d\n\34\3\34\3\34\5\34\u0291\n\34\3\34\3"+
		"\34\3\34\3\34\3\34\7\34\u0298\n\34\f\34\16\34\u029b\13\34\3\34\2\t\n\36"+
		"(.\60\64\66\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\66\2\7\3\2./\4\2,-\60\60\4\2((**\4\2))++\3\2\"#\2\u02d8\28\3\2\2\2\4"+
		"=\3\2\2\2\6\u00a4\3\2\2\2\b\u00a6\3\2\2\2\n\u00ba\3\2\2\2\f\u00d0\3\2"+
		"\2\2\16\u00d7\3\2\2\2\20\u00f8\3\2\2\2\22\u00fa\3\2\2\2\24\u0101\3\2\2"+
		"\2\26\u0109\3\2\2\2\30\u0147\3\2\2\2\32\u015c\3\2\2\2\34\u0182\3\2\2\2"+
		"\36\u0192\3\2\2\2 \u01a9\3\2\2\2\"\u01b7\3\2\2\2$\u01c1\3\2\2\2&\u01cd"+
		"\3\2\2\2(\u0203\3\2\2\2*\u023f\3\2\2\2,\u024b\3\2\2\2.\u024d\3\2\2\2\60"+
		"\u025b\3\2\2\2\62\u026e\3\2\2\2\64\u0279\3\2\2\2\66\u028c\3\2\2\289\5"+
		"\4\3\29:\7\2\2\3:;\b\2\1\2;\3\3\2\2\2<>\5\6\4\2=<\3\2\2\2>?\3\2\2\2?="+
		"\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\b\3\1\2B\5\3\2\2\2CE\5\f\7\2DF\7:\2\2E"+
		"D\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\b\4\1\2H\u00a5\3\2\2\2IJ\5\20\t\2JK\b"+
		"\4\1\2K\u00a5\3\2\2\2LN\5\30\r\2MO\7:\2\2NM\3\2\2\2NO\3\2\2\2OP\3\2\2"+
		"\2PQ\b\4\1\2Q\u00a5\3\2\2\2RT\5\32\16\2SU\7:\2\2TS\3\2\2\2TU\3\2\2\2U"+
		"V\3\2\2\2VW\b\4\1\2W\u00a5\3\2\2\2XY\5\22\n\2YZ\b\4\1\2Z\u00a5\3\2\2\2"+
		"[\\\5\26\f\2\\]\b\4\1\2]\u00a5\3\2\2\2^_\5\24\13\2_`\b\4\1\2`\u00a5\3"+
		"\2\2\2ab\5\34\17\2bc\b\4\1\2c\u00a5\3\2\2\2de\5\b\5\2ef\b\4\1\2f\u00a5"+
		"\3\2\2\2gi\5 \21\2hj\7:\2\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\b\4\1\2l\u00a5"+
		"\3\2\2\2mo\7\22\2\2np\7:\2\2on\3\2\2\2op\3\2\2\2pq\3\2\2\2q\u00a5\b\4"+
		"\1\2rt\7\23\2\2su\7:\2\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2v\u00a5\b\4\1\2"+
		"wx\7!\2\2xy\7;\2\2yz\7\24\2\2z{\7\61\2\2{|\5(\25\2|~\7\62\2\2}\177\7:"+
		"\2\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\b\4\1\2\u0081"+
		"\u00a5\3\2\2\2\u0082\u0083\7!\2\2\u0083\u0084\7;\2\2\u0084\u0085\7\25"+
		"\2\2\u0085\u0086\7\61\2\2\u0086\u0088\7\62\2\2\u0087\u0089\7:\2\2\u0088"+
		"\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u00a5\b\4"+
		"\1\2\u008b\u008c\7!\2\2\u008c\u008d\7;\2\2\u008d\u008e\7\26\2\2\u008e"+
		"\u008f\7\61\2\2\u008f\u0090\7\27\2\2\u0090\u0091\7\65\2\2\u0091\u0092"+
		"\5(\25\2\u0092\u0094\7\62\2\2\u0093\u0095\7:\2\2\u0094\u0093\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\b\4\1\2\u0097\u00a5\3\2"+
		"\2\2\u0098\u0099\7\33\2\2\u0099\u009b\5(\25\2\u009a\u009c\7:\2\2\u009b"+
		"\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\b\4"+
		"\1\2\u009e\u00a5\3\2\2\2\u009f\u00a1\7\33\2\2\u00a0\u00a2\7:\2\2\u00a1"+
		"\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\b\4"+
		"\1\2\u00a4C\3\2\2\2\u00a4I\3\2\2\2\u00a4L\3\2\2\2\u00a4R\3\2\2\2\u00a4"+
		"X\3\2\2\2\u00a4[\3\2\2\2\u00a4^\3\2\2\2\u00a4a\3\2\2\2\u00a4d\3\2\2\2"+
		"\u00a4g\3\2\2\2\u00a4m\3\2\2\2\u00a4r\3\2\2\2\u00a4w\3\2\2\2\u00a4\u0082"+
		"\3\2\2\2\u00a4\u008b\3\2\2\2\u00a4\u0098\3\2\2\2\u00a4\u009f\3\2\2\2\u00a5"+
		"\7\3\2\2\2\u00a6\u00a7\7\35\2\2\u00a7\u00a8\7!\2\2\u00a8\u00a9\7\63\2"+
		"\2\u00a9\u00aa\5\n\6\2\u00aa\u00ab\7\64\2\2\u00ab\u00ac\b\5\1\2\u00ac"+
		"\t\3\2\2\2\u00ad\u00ae\b\6\1\2\u00ae\u00af\7\17\2\2\u00af\u00b0\7!\2\2"+
		"\u00b0\u00b1\7\65\2\2\u00b1\u00b2\5\"\22\2\u00b2\u00b3\b\6\1\2\u00b3\u00bb"+
		"\3\2\2\2\u00b4\u00b5\7\17\2\2\u00b5\u00b6\7!\2\2\u00b6\u00b7\7\65\2\2"+
		"\u00b7\u00b8\7!\2\2\u00b8\u00bb\b\6\1\2\u00b9\u00bb\b\6\1\2\u00ba\u00ad"+
		"\3\2\2\2\u00ba\u00b4\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00cd\3\2\2\2\u00bc"+
		"\u00bd\f\7\2\2\u00bd\u00be\78\2\2\u00be\u00bf\7\17\2\2\u00bf\u00c0\7!"+
		"\2\2\u00c0\u00c1\7\65\2\2\u00c1\u00c2\5\"\22\2\u00c2\u00c3\b\6\1\2\u00c3"+
		"\u00cc\3\2\2\2\u00c4\u00c5\f\6\2\2\u00c5\u00c6\78\2\2\u00c6\u00c7\7\17"+
		"\2\2\u00c7\u00c8\7!\2\2\u00c8\u00c9\7\65\2\2\u00c9\u00ca\7!\2\2\u00ca"+
		"\u00cc\b\6\1\2\u00cb\u00bc\3\2\2\2\u00cb\u00c4\3\2\2\2\u00cc\u00cf\3\2"+
		"\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\13\3\2\2\2\u00cf\u00cd"+
		"\3\2\2\2\u00d0\u00d1\7\t\2\2\u00d1\u00d2\7\61\2\2\u00d2\u00d3\5.\30\2"+
		"\u00d3\u00d4\7\62\2\2\u00d4\u00d5\b\7\1\2\u00d5\r\3\2\2\2\u00d6\u00d8"+
		"\5\20\t\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2"+
		"\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\b\b\1\2\u00dc\17"+
		"\3\2\2\2\u00dd\u00de\7\n\2\2\u00de\u00df\5(\25\2\u00df\u00e0\7\63\2\2"+
		"\u00e0\u00e1\5\4\3\2\u00e1\u00e2\7\64\2\2\u00e2\u00e3\b\t\1\2\u00e3\u00f9"+
		"\3\2\2\2\u00e4\u00e5\7\n\2\2\u00e5\u00e6\5(\25\2\u00e6\u00e7\7\63\2\2"+
		"\u00e7\u00e8\5\4\3\2\u00e8\u00e9\7\64\2\2\u00e9\u00ea\7\13\2\2\u00ea\u00eb"+
		"\7\63\2\2\u00eb\u00ec\5\4\3\2\u00ec\u00ed\7\64\2\2\u00ed\u00ee\b\t\1\2"+
		"\u00ee\u00f9\3\2\2\2\u00ef\u00f0\7\n\2\2\u00f0\u00f1\5(\25\2\u00f1\u00f2"+
		"\7\63\2\2\u00f2\u00f3\5\4\3\2\u00f3\u00f4\7\64\2\2\u00f4\u00f5\7\13\2"+
		"\2\u00f5\u00f6\5\16\b\2\u00f6\u00f7\b\t\1\2\u00f7\u00f9\3\2\2\2\u00f8"+
		"\u00dd\3\2\2\2\u00f8\u00e4\3\2\2\2\u00f8\u00ef\3\2\2\2\u00f9\21\3\2\2"+
		"\2\u00fa\u00fb\7\f\2\2\u00fb\u00fc\5(\25\2\u00fc\u00fd\7\63\2\2\u00fd"+
		"\u00fe\5\4\3\2\u00fe\u00ff\7\64\2\2\u00ff\u0100\b\n\1\2\u0100\23\3\2\2"+
		"\2\u0101\u0102\7\36\2\2\u0102\u0103\5(\25\2\u0103\u0104\7\13\2\2\u0104"+
		"\u0105\7\63\2\2\u0105\u0106\5\4\3\2\u0106\u0107\7\64\2\2\u0107\u0108\b"+
		"\13\1\2\u0108\25\3\2\2\2\u0109\u010a\7\r\2\2\u010a\u010b\7!\2\2\u010b"+
		"\u010c\7\16\2\2\u010c\u010d\5&\24\2\u010d\u010e\7\63\2\2\u010e\u010f\5"+
		"\4\3\2\u010f\u0110\7\64\2\2\u0110\u0111\b\f\1\2\u0111\27\3\2\2\2\u0112"+
		"\u0113\7\17\2\2\u0113\u0114\7!\2\2\u0114\u0115\7\65\2\2\u0115\u0116\5"+
		"\"\22\2\u0116\u0117\7\'\2\2\u0117\u0118\5(\25\2\u0118\u0119\b\r\1\2\u0119"+
		"\u0148\3\2\2\2\u011a\u011b\7\17\2\2\u011b\u011c\7!\2\2\u011c\u011d\7\'"+
		"\2\2\u011d\u011e\5(\25\2\u011e\u011f\b\r\1\2\u011f\u0148\3\2\2\2\u0120"+
		"\u0121\7\17\2\2\u0121\u0122\7!\2\2\u0122\u0123\7\65\2\2\u0123\u0124\5"+
		"\"\22\2\u0124\u0125\79\2\2\u0125\u0126\b\r\1\2\u0126\u0148\3\2\2\2\u0127"+
		"\u0128\7\17\2\2\u0128\u0129\7!\2\2\u0129\u012a\7\65\2\2\u012a\u012b\7"+
		"\66\2\2\u012b\u012c\5\"\22\2\u012c\u012d\7\67\2\2\u012d\u012e\7\'\2\2"+
		"\u012e\u012f\5,\27\2\u012f\u0130\b\r\1\2\u0130\u0148\3\2\2\2\u0131\u0132"+
		"\7\17\2\2\u0132\u0133\7!\2\2\u0133\u0134\7\65\2\2\u0134\u0135\5$\23\2"+
		"\u0135\u0136\7\'\2\2\u0136\u0137\5(\25\2\u0137\u0138\b\r\1\2\u0138\u0148"+
		"\3\2\2\2\u0139\u013a\7\20\2\2\u013a\u013b\7!\2\2\u013b\u013c\7\65\2\2"+
		"\u013c\u013d\5\"\22\2\u013d\u013e\7\'\2\2\u013e\u013f\5(\25\2\u013f\u0140"+
		"\b\r\1\2\u0140\u0148\3\2\2\2\u0141\u0142\7\20\2\2\u0142\u0143\7!\2\2\u0143"+
		"\u0144\7\'\2\2\u0144\u0145\5(\25\2\u0145\u0146\b\r\1\2\u0146\u0148\3\2"+
		"\2\2\u0147\u0112\3\2\2\2\u0147\u011a\3\2\2\2\u0147\u0120\3\2\2\2\u0147"+
		"\u0127\3\2\2\2\u0147\u0131\3\2\2\2\u0147\u0139\3\2\2\2\u0147\u0141\3\2"+
		"\2\2\u0148\31\3\2\2\2\u0149\u014a\7!\2\2\u014a\u014b\7\'\2\2\u014b\u014c"+
		"\5(\25\2\u014c\u014d\b\16\1\2\u014d\u015d\3\2\2\2\u014e\u014f\7!\2\2\u014f"+
		"\u0150\7\66\2\2\u0150\u0151\5(\25\2\u0151\u0152\7\67\2\2\u0152\u0153\7"+
		"\'\2\2\u0153\u0154\5(\25\2\u0154\u0155\b\16\1\2\u0155\u015d\3\2\2\2\u0156"+
		"\u0157\7!\2\2\u0157\u0158\t\2\2\2\u0158\u0159\7\'\2\2\u0159\u015a\5(\25"+
		"\2\u015a\u015b\b\16\1\2\u015b\u015d\3\2\2\2\u015c\u0149\3\2\2\2\u015c"+
		"\u014e\3\2\2\2\u015c\u0156\3\2\2\2\u015d\33\3\2\2\2\u015e\u015f\7\34\2"+
		"\2\u015f\u0160\7!\2\2\u0160\u0161\7\61\2\2\u0161\u0162\5\36\20\2\u0162"+
		"\u0163\7\62\2\2\u0163\u0164\7\63\2\2\u0164\u0165\5\4\3\2\u0165\u0166\7"+
		"\64\2\2\u0166\u0167\b\17\1\2\u0167\u0183\3\2\2\2\u0168\u0169\7\34\2\2"+
		"\u0169\u016a\7!\2\2\u016a\u016b\7\61\2\2\u016b\u016c\5\36\20\2\u016c\u016d"+
		"\7\62\2\2\u016d\u016e\7<\2\2\u016e\u016f\5\"\22\2\u016f\u0170\7\63\2\2"+
		"\u0170\u0171\5\4\3\2\u0171\u0172\7\64\2\2\u0172\u0173\b\17\1\2\u0173\u0183"+
		"\3\2\2\2\u0174\u0175\7\34\2\2\u0175\u0176\7!\2\2\u0176\u0177\7\61\2\2"+
		"\u0177\u0178\5\36\20\2\u0178\u0179\7\62\2\2\u0179\u017a\7<\2\2\u017a\u017b"+
		"\7\66\2\2\u017b\u017c\5\"\22\2\u017c\u017d\7\67\2\2\u017d\u017e\7\63\2"+
		"\2\u017e\u017f\5\4\3\2\u017f\u0180\7\64\2\2\u0180\u0181\b\17\1\2\u0181"+
		"\u0183\3\2\2\2\u0182\u015e\3\2\2\2\u0182\u0168\3\2\2\2\u0182\u0174\3\2"+
		"\2\2\u0183\35\3\2\2\2\u0184\u0185\b\20\1\2\u0185\u0186\7!\2\2\u0186\u0187"+
		"\7\65\2\2\u0187\u0188\5\"\22\2\u0188\u0189\b\20\1\2\u0189\u0193\3\2\2"+
		"\2\u018a\u018b\7!\2\2\u018b\u018c\7\65\2\2\u018c\u018d\7\66\2\2\u018d"+
		"\u018e\5\"\22\2\u018e\u018f\7\67\2\2\u018f\u0190\b\20\1\2\u0190\u0193"+
		"\3\2\2\2\u0191\u0193\b\20\1\2\u0192\u0184\3\2\2\2\u0192\u018a\3\2\2\2"+
		"\u0192\u0191\3\2\2\2\u0193\u01a6\3\2\2\2\u0194\u0195\f\7\2\2\u0195\u0196"+
		"\78\2\2\u0196\u0197\7!\2\2\u0197\u0198\7\65\2\2\u0198\u0199\5\"\22\2\u0199"+
		"\u019a\b\20\1\2\u019a\u01a5\3\2\2\2\u019b\u019c\f\6\2\2\u019c\u019d\7"+
		"8\2\2\u019d\u019e\7!\2\2\u019e\u019f\7\65\2\2\u019f\u01a0\7\66\2\2\u01a0"+
		"\u01a1\5\"\22\2\u01a1\u01a2\7\67\2\2\u01a2\u01a3\b\20\1\2\u01a3\u01a5"+
		"\3\2\2\2\u01a4\u0194\3\2\2\2\u01a4\u019b\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6"+
		"\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\37\3\2\2\2\u01a8\u01a6\3\2\2"+
		"\2\u01a9\u01aa\7!\2\2\u01aa\u01ab\7\61\2\2\u01ab\u01ac\5\64\33\2\u01ac"+
		"\u01ad\7\62\2\2\u01ad\u01ae\b\21\1\2\u01ae!\3\2\2\2\u01af\u01b0\7\3\2"+
		"\2\u01b0\u01b8\b\22\1\2\u01b1\u01b2\7\4\2\2\u01b2\u01b8\b\22\1\2\u01b3"+
		"\u01b4\7\6\2\2\u01b4\u01b8\b\22\1\2\u01b5\u01b6\7\5\2\2\u01b6\u01b8\b"+
		"\22\1\2\u01b7\u01af\3\2\2\2\u01b7\u01b1\3\2\2\2\u01b7\u01b3\3\2\2\2\u01b7"+
		"\u01b5\3\2\2\2\u01b8#\3\2\2\2\u01b9\u01ba\7\66\2\2\u01ba\u01bb\5$\23\2"+
		"\u01bb\u01bc\7\67\2\2\u01bc\u01bd\b\23\1\2\u01bd\u01c2\3\2\2\2\u01be\u01bf"+
		"\5\"\22\2\u01bf\u01c0\b\23\1\2\u01c0\u01c2\3\2\2\2\u01c1\u01b9\3\2\2\2"+
		"\u01c1\u01be\3\2\2\2\u01c2%\3\2\2\2\u01c3\u01c4\5(\25\2\u01c4\u01c5\7"+
		";\2\2\u01c5\u01c6\7;\2\2\u01c6\u01c7\7;\2\2\u01c7\u01c8\5(\25\2\u01c8"+
		"\u01c9\b\24\1\2\u01c9\u01ce\3\2\2\2\u01ca\u01cb\5(\25\2\u01cb\u01cc\b"+
		"\24\1\2\u01cc\u01ce\3\2\2\2\u01cd\u01c3\3\2\2\2\u01cd\u01ca\3\2\2\2\u01ce"+
		"\'\3\2\2\2\u01cf\u01d0\b\25\1\2\u01d0\u01d1\7/\2\2\u01d1\u01d2\5(\25\30"+
		"\u01d2\u01d3\b\25\1\2\u01d3\u0204\3\2\2\2\u01d4\u01d5\7$\2\2\u01d5\u01d6"+
		"\5(\25\22\u01d6\u01d7\b\25\1\2\u01d7\u0204\3\2\2\2\u01d8\u01d9\7!\2\2"+
		"\u01d9\u01da\7\61\2\2\u01da\u01db\5\66\34\2\u01db\u01dc\7\62\2\2\u01dc"+
		"\u01dd\b\25\1\2\u01dd\u0204\3\2\2\2\u01de\u01df\5\62\32\2\u01df\u01e0"+
		"\b\25\1\2\u01e0\u0204\3\2\2\2\u01e1\u01e2\7\61\2\2\u01e2\u01e3\5(\25\2"+
		"\u01e3\u01e4\7\62\2\2\u01e4\u01e5\b\25\1\2\u01e5\u0204\3\2\2\2\u01e6\u01e7"+
		"\5*\26\2\u01e7\u01e8\b\25\1\2\u01e8\u0204\3\2\2\2\u01e9\u01ea\7!\2\2\u01ea"+
		"\u01eb\7;\2\2\u01eb\u01ec\7\31\2\2\u01ec\u0204\b\25\1\2\u01ed\u01ee\7"+
		"!\2\2\u01ee\u01ef\7;\2\2\u01ef\u01f0\7\30\2\2\u01f0\u0204\b\25\1\2\u01f1"+
		"\u01f2\5\60\31\2\u01f2\u01f3\b\25\1\2\u01f3\u0204\3\2\2\2\u01f4\u01f5"+
		"\7\66\2\2\u01f5\u01f6\5.\30\2\u01f6\u01f7\7\67\2\2\u01f7\u01f8\b\25\1"+
		"\2\u01f8\u0204\3\2\2\2\u01f9\u01fa\7\37\2\2\u01fa\u0204\b\25\1\2\u01fb"+
		"\u01fc\7 \2\2\u01fc\u0204\b\25\1\2\u01fd\u01fe\7\7\2\2\u01fe\u0204\b\25"+
		"\1\2\u01ff\u0200\7\b\2\2\u0200\u0204\b\25\1\2\u0201\u0202\7\21\2\2\u0202"+
		"\u0204\b\25\1\2\u0203\u01cf\3\2\2\2\u0203\u01d4\3\2\2\2\u0203\u01d8\3"+
		"\2\2\2\u0203\u01de\3\2\2\2\u0203\u01e1\3\2\2\2\u0203\u01e6\3\2\2\2\u0203"+
		"\u01e9\3\2\2\2\u0203\u01ed\3\2\2\2\u0203\u01f1\3\2\2\2\u0203\u01f4\3\2"+
		"\2\2\u0203\u01f9\3\2\2\2\u0203\u01fb\3\2\2\2\u0203\u01fd\3\2\2\2\u0203"+
		"\u01ff\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u022a\3\2\2\2\u0205\u0206\f\27"+
		"\2\2\u0206\u0207\t\3\2\2\u0207\u0208\5(\25\30\u0208\u0209\b\25\1\2\u0209"+
		"\u0229\3\2\2\2\u020a\u020b\f\26\2\2\u020b\u020c\t\2\2\2\u020c\u020d\5"+
		"(\25\27\u020d\u020e\b\25\1\2\u020e\u0229\3\2\2\2\u020f\u0210\f\25\2\2"+
		"\u0210\u0211\t\4\2\2\u0211\u0212\5(\25\26\u0212\u0213\b\25\1\2\u0213\u0229"+
		"\3\2\2\2\u0214\u0215\f\24\2\2\u0215\u0216\t\5\2\2\u0216\u0217\5(\25\25"+
		"\u0217\u0218\b\25\1\2\u0218\u0229\3\2\2\2\u0219\u021a\f\23\2\2\u021a\u021b"+
		"\t\6\2\2\u021b\u021c\5(\25\24\u021c\u021d\b\25\1\2\u021d\u0229\3\2\2\2"+
		"\u021e\u021f\f\21\2\2\u021f\u0220\7&\2\2\u0220\u0221\5(\25\22\u0221\u0222"+
		"\b\25\1\2\u0222\u0229\3\2\2\2\u0223\u0224\f\20\2\2\u0224\u0225\7%\2\2"+
		"\u0225\u0226\5(\25\21\u0226\u0227\b\25\1\2\u0227\u0229\3\2\2\2\u0228\u0205"+
		"\3\2\2\2\u0228\u020a\3\2\2\2\u0228\u020f\3\2\2\2\u0228\u0214\3\2\2\2\u0228"+
		"\u0219\3\2\2\2\u0228\u021e\3\2\2\2\u0228\u0223\3\2\2\2\u0229\u022c\3\2"+
		"\2\2\u022a\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b)\3\2\2\2\u022c\u022a"+
		"\3\2\2\2\u022d\u022e\7\3\2\2\u022e\u022f\7\61\2\2\u022f\u0230\5(\25\2"+
		"\u0230\u0231\7\62\2\2\u0231\u0232\b\26\1\2\u0232\u0240\3\2\2\2\u0233\u0234"+
		"\7\4\2\2\u0234\u0235\7\61\2\2\u0235\u0236\5(\25\2\u0236\u0237\7\62\2\2"+
		"\u0237\u0238\b\26\1\2\u0238\u0240\3\2\2\2\u0239\u023a\7\6\2\2\u023a\u023b"+
		"\7\61\2\2\u023b\u023c\5(\25\2\u023c\u023d\7\62\2\2\u023d\u023e\b\26\1"+
		"\2\u023e\u0240\3\2\2\2\u023f\u022d\3\2\2\2\u023f\u0233\3\2\2\2\u023f\u0239"+
		"\3\2\2\2\u0240+\3\2\2\2\u0241\u0242\7\66\2\2\u0242\u0243\5.\30\2\u0243"+
		"\u0244\7\67\2\2\u0244\u0245\b\27\1\2\u0245\u024c\3\2\2\2\u0246\u0247\7"+
		"\66\2\2\u0247\u0248\7\67\2\2\u0248\u024c\b\27\1\2\u0249\u024a\7!\2\2\u024a"+
		"\u024c\b\27\1\2\u024b\u0241\3\2\2\2\u024b\u0246\3\2\2\2\u024b\u0249\3"+
		"\2\2\2\u024c-\3\2\2\2\u024d\u024e\b\30\1\2\u024e\u024f\5(\25\2\u024f\u0250"+
		"\b\30\1\2\u0250\u0258\3\2\2\2\u0251\u0252\f\4\2\2\u0252\u0253\78\2\2\u0253"+
		"\u0254\5(\25\2\u0254\u0255\b\30\1\2\u0255\u0257\3\2\2\2\u0256\u0251\3"+
		"\2\2\2\u0257\u025a\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259"+
		"/\3\2\2\2\u025a\u0258\3\2\2\2\u025b\u025c\b\31\1\2\u025c\u025d\7!\2\2"+
		"\u025d\u025e\b\31\1\2\u025e\u026b\3\2\2\2\u025f\u0260\f\5\2\2\u0260\u0261"+
		"\7\66\2\2\u0261\u0262\5(\25\2\u0262\u0263\7\67\2\2\u0263\u0264\b\31\1"+
		"\2\u0264\u026a\3\2\2\2\u0265\u0266\f\4\2\2\u0266\u0267\7;\2\2\u0267\u0268"+
		"\7!\2\2\u0268\u026a\b\31\1\2\u0269\u025f\3\2\2\2\u0269\u0265\3\2\2\2\u026a"+
		"\u026d\3\2\2\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026c\61\3\2\2"+
		"\2\u026d\u026b\3\2\2\2\u026e\u026f\7!\2\2\u026f\u0270\7\61\2\2\u0270\u0271"+
		"\5\64\33\2\u0271\u0272\7\62\2\2\u0272\u0273\b\32\1\2\u0273\63\3\2\2\2"+
		"\u0274\u0275\b\33\1\2\u0275\u0276\5(\25\2\u0276\u0277\b\33\1\2\u0277\u027a"+
		"\3\2\2\2\u0278\u027a\b\33\1\2\u0279\u0274\3\2\2\2\u0279\u0278\3\2\2\2"+
		"\u027a\u0282\3\2\2\2\u027b\u027c\f\5\2\2\u027c\u027d\78\2\2\u027d\u027e"+
		"\5(\25\2\u027e\u027f\b\33\1\2\u027f\u0281\3\2\2\2\u0280\u027b\3\2\2\2"+
		"\u0281\u0284\3\2\2\2\u0282\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283\65"+
		"\3\2\2\2\u0284\u0282\3\2\2\2\u0285\u0286\b\34\1\2\u0286\u0287\7!\2\2\u0287"+
		"\u0288\7\65\2\2\u0288\u0289\5(\25\2\u0289\u028a\b\34\1\2\u028a\u028d\3"+
		"\2\2\2\u028b\u028d\b\34\1\2\u028c\u0285\3\2\2\2\u028c\u028b\3\2\2\2\u028d"+
		"\u0299\3\2\2\2\u028e\u0290\f\5\2\2\u028f\u0291\78\2\2\u0290\u028f\3\2"+
		"\2\2\u0290\u0291\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293\7!\2\2\u0293"+
		"\u0294\7\65\2\2\u0294\u0295\5(\25\2\u0295\u0296\b\34\1\2\u0296\u0298\3"+
		"\2\2\2\u0297\u028e\3\2\2\2\u0298\u029b\3\2\2\2\u0299\u0297\3\2\2\2\u0299"+
		"\u029a\3\2\2\2\u029a\67\3\2\2\2\u029b\u0299\3\2\2\2*?ENTiot~\u0088\u0094"+
		"\u009b\u00a1\u00a4\u00ba\u00cb\u00cd\u00d9\u00f8\u0147\u015c\u0182\u0192"+
		"\u01a4\u01a6\u01b7\u01c1\u01cd\u0203\u0228\u022a\u023f\u024b\u0258\u0269"+
		"\u026b\u0279\u0282\u028c\u0290\u0299";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}