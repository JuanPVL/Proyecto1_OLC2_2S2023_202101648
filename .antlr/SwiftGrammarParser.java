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
		VAR=11, LET=12, NIL=13, NUMBER=14, STRING=15, ID=16, DIFE=17, IG_IG=18, 
		NOT=19, OR=20, AND=21, IGUAL=22, MAYIG=23, MENIG=24, MAYOR=25, MENOR=26, 
		MULT=27, DIV=28, SUM=29, RES=30, MOD=31, PAR_IZQ=32, PAR_DER=33, LLAVE_IZQ=34, 
		LLAVE_DER=35, DOSPUNTOS=36, COR_IZQ=37, COR_DER=38, COMA=39, CIERRAPREGUNTA=40, 
		WHITESPACE=41, COMMENT=42, LINE_COMMENT=43;
	public static final int
		RULE_s = 0, RULE_block = 1, RULE_instruction = 2, RULE_printstmt = 3, 
		RULE_blockelsif = 4, RULE_ifstmt = 5, RULE_whilestmt = 6, RULE_declarationstmt = 7, 
		RULE_asignationstmt = 8, RULE_types = 9, RULE_expr = 10, RULE_conversionstmt = 11, 
		RULE_listParams = 12, RULE_listArray = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "block", "instruction", "printstmt", "blockelsif", "ifstmt", "whilestmt", 
			"declarationstmt", "asignationstmt", "types", "expr", "conversionstmt", 
			"listParams", "listArray"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Int'", "'Float'", "'Bool'", "'String'", "'true'", "'false'", 
			"'print'", "'if'", "'else'", "'while'", "'var'", "'let'", "'nil'", null, 
			null, null, "'!='", "'=='", "'!'", "'||'", "'&&'", "'='", "'>='", "'<='", 
			"'>'", "'<'", "'*'", "'/'", "'+'", "'-'", "'%'", "'('", "')'", "'{'", 
			"'}'", "':'", "'['", "']'", "','", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "BOOL", "STR", "TRU", "FAL", "PRINT", "IF", "ELSE", 
			"WHILE", "VAR", "LET", "NIL", "NUMBER", "STRING", "ID", "DIFE", "IG_IG", 
			"NOT", "OR", "AND", "IGUAL", "MAYIG", "MENIG", "MAYOR", "MENOR", "MULT", 
			"DIV", "SUM", "RES", "MOD", "PAR_IZQ", "PAR_DER", "LLAVE_IZQ", "LLAVE_DER", 
			"DOSPUNTOS", "COR_IZQ", "COR_DER", "COMA", "CIERRAPREGUNTA", "WHITESPACE", 
			"COMMENT", "LINE_COMMENT"
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
			setState(28);
			((SContext)_localctx).block = block();
			setState(29);
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
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				((BlockContext)_localctx).instruction = instruction();
				((BlockContext)_localctx).ins.add(((BlockContext)_localctx).instruction);
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << VAR) | (1L << LET) | (1L << ID))) != 0) );

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
		public PrintstmtContext printstmt() {
			return getRuleContext(PrintstmtContext.class,0);
		}
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
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				((InstructionContext)_localctx).printstmt = printstmt();
				 _localctx.inst = ((InstructionContext)_localctx).printstmt.prnt
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				((InstructionContext)_localctx).ifstmt = ifstmt();
				 _localctx.inst = ((InstructionContext)_localctx).ifstmt.ifinst 
				}
				break;
			case VAR:
			case LET:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				((InstructionContext)_localctx).declarationstmt = declarationstmt();
				 _localctx.inst = ((InstructionContext)_localctx).declarationstmt.dec 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				((InstructionContext)_localctx).asignationstmt = asignationstmt();
				 _localctx.inst = ((InstructionContext)_localctx).asignationstmt.asig 
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(51);
				((InstructionContext)_localctx).whilestmt = whilestmt();
				 _localctx.inst = ((InstructionContext)_localctx).whilestmt.whileinst 
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
		enterRule(_localctx, 6, RULE_printstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			((PrintstmtContext)_localctx).PRINT = match(PRINT);
			setState(57);
			match(PAR_IZQ);
			setState(58);
			((PrintstmtContext)_localctx).listParams = listParams(0);
			setState(59);
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
		enterRule(_localctx, 8, RULE_blockelsif);

		    _localctx.blkif = []interface{}{}
		    var listIfs []IIfstmtContext
		    
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(62);
					((BlockelsifContext)_localctx).ifstmt = ifstmt();
					((BlockelsifContext)_localctx).elseif.add(((BlockelsifContext)_localctx).ifstmt);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(65); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
		enterRule(_localctx, 10, RULE_ifstmt);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(70);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(71);
				match(LLAVE_IZQ);
				setState(72);
				((IfstmtContext)_localctx).block = block();
				setState(73);
				match(LLAVE_DER);
				 _localctx.ifinst = instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).block.blk, nil) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(77);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(78);
				match(LLAVE_IZQ);
				setState(79);
				((IfstmtContext)_localctx).ifblck = block();
				setState(80);
				match(LLAVE_DER);
				setState(81);
				match(ELSE);
				setState(82);
				match(LLAVE_IZQ);
				setState(83);
				((IfstmtContext)_localctx).elseblck = block();
				setState(84);
				match(LLAVE_DER);
				_localctx.ifinst = instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).ifblck.blk, ((IfstmtContext)_localctx).elseblck.blk)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(88);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(89);
				match(LLAVE_IZQ);
				setState(90);
				((IfstmtContext)_localctx).ifblck = block();
				setState(91);
				match(LLAVE_DER);
				setState(92);
				match(ELSE);
				setState(93);
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
		enterRule(_localctx, 12, RULE_whilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			((WhilestmtContext)_localctx).WHILE = match(WHILE);
			setState(99);
			((WhilestmtContext)_localctx).expr = expr(0);
			setState(100);
			match(LLAVE_IZQ);
			setState(101);
			((WhilestmtContext)_localctx).block = block();
			setState(102);
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

	public static class DeclarationstmtContext extends ParserRuleContext {
		public interfaces.Instruction dec;
		public Token VAR;
		public Token ID;
		public TypesContext types;
		public ExprContext expr;
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
		public TerminalNode LET() { return getToken(SwiftGrammarParser.LET, 0); }
		public DeclarationstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationstmt; }
	}

	public final DeclarationstmtContext declarationstmt() throws RecognitionException {
		DeclarationstmtContext _localctx = new DeclarationstmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declarationstmt);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				((DeclarationstmtContext)_localctx).VAR = match(VAR);
				setState(106);
				((DeclarationstmtContext)_localctx).ID = match(ID);
				setState(107);
				match(DOSPUNTOS);
				setState(108);
				((DeclarationstmtContext)_localctx).types = types();
				setState(109);
				match(IGUAL);
				setState(110);
				((DeclarationstmtContext)_localctx).expr = expr(0);
				 _localctx.dec = instructions.NewDeclaracion((((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getLine():0), (((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getCharPositionInLine():0), (((DeclarationstmtContext)_localctx).ID!=null?((DeclarationstmtContext)_localctx).ID.getText():null),true, ((DeclarationstmtContext)_localctx).types.ty, ((DeclarationstmtContext)_localctx).expr.e) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				((DeclarationstmtContext)_localctx).VAR = match(VAR);
				setState(114);
				((DeclarationstmtContext)_localctx).ID = match(ID);
				setState(115);
				match(IGUAL);
				setState(116);
				((DeclarationstmtContext)_localctx).expr = expr(0);
				 _localctx.dec = instructions.NewDeclaracion((((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getLine():0), (((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getCharPositionInLine():0), (((DeclarationstmtContext)_localctx).ID!=null?((DeclarationstmtContext)_localctx).ID.getText():null),true,environment.DEPENDIENTE, ((DeclarationstmtContext)_localctx).expr.e) 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				((DeclarationstmtContext)_localctx).VAR = match(VAR);
				setState(120);
				((DeclarationstmtContext)_localctx).ID = match(ID);
				setState(121);
				match(DOSPUNTOS);
				setState(122);
				((DeclarationstmtContext)_localctx).types = types();
				setState(123);
				match(CIERRAPREGUNTA);
				 _localctx.dec = instructions.NewDeclaracion((((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getLine():0), (((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getCharPositionInLine():0), (((DeclarationstmtContext)_localctx).ID!=null?((DeclarationstmtContext)_localctx).ID.getText():null),true, ((DeclarationstmtContext)_localctx).types.ty, nil) 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				((DeclarationstmtContext)_localctx).LET = match(LET);
				setState(127);
				((DeclarationstmtContext)_localctx).ID = match(ID);
				setState(128);
				match(DOSPUNTOS);
				setState(129);
				((DeclarationstmtContext)_localctx).types = types();
				setState(130);
				match(IGUAL);
				setState(131);
				((DeclarationstmtContext)_localctx).expr = expr(0);
				 _localctx.dec = instructions.NewDeclaracion((((DeclarationstmtContext)_localctx).LET!=null?((DeclarationstmtContext)_localctx).LET.getLine():0), (((DeclarationstmtContext)_localctx).LET!=null?((DeclarationstmtContext)_localctx).LET.getCharPositionInLine():0), (((DeclarationstmtContext)_localctx).ID!=null?((DeclarationstmtContext)_localctx).ID.getText():null),false, ((DeclarationstmtContext)_localctx).types.ty, ((DeclarationstmtContext)_localctx).expr.e) 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
				((DeclarationstmtContext)_localctx).LET = match(LET);
				setState(135);
				((DeclarationstmtContext)_localctx).ID = match(ID);
				setState(136);
				match(IGUAL);
				setState(137);
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
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(SwiftGrammarParser.IGUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AsignationstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignationstmt; }
	}

	public final AsignationstmtContext asignationstmt() throws RecognitionException {
		AsignationstmtContext _localctx = new AsignationstmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_asignationstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			((AsignationstmtContext)_localctx).ID = match(ID);
			setState(143);
			match(IGUAL);
			setState(144);
			((AsignationstmtContext)_localctx).expr = expr(0);
			 _localctx.asig = instructions.NewAsignacion((((AsignationstmtContext)_localctx).ID!=null?((AsignationstmtContext)_localctx).ID.getLine():0), (((AsignationstmtContext)_localctx).ID!=null?((AsignationstmtContext)_localctx).ID.getCharPositionInLine():0), (((AsignationstmtContext)_localctx).ID!=null?((AsignationstmtContext)_localctx).ID.getText():null), ((AsignationstmtContext)_localctx).expr.e) 
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
		public TerminalNode COR_IZQ() { return getToken(SwiftGrammarParser.COR_IZQ, 0); }
		public TerminalNode COR_DER() { return getToken(SwiftGrammarParser.COR_DER, 0); }
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_types);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(INT);
				 _localctx.ty = environment.INTEGER 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(FLOAT);
				 _localctx.ty = environment.FLOAT 
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				match(STR);
				 _localctx.ty = environment.STRING 
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				match(BOOL);
				 _localctx.ty = environment.BOOLEAN 
				}
				break;
			case COR_IZQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				match(COR_IZQ);
				setState(156);
				match(COR_DER);
				 _localctx.ty = environment.ARRAY 
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

	public static class ExprContext extends ParserRuleContext {
		public interfaces.Expression e;
		public ExprContext left;
		public Token RES;
		public ExprContext expr;
		public Token NOT;
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
		public TerminalNode PAR_IZQ() { return getToken(SwiftGrammarParser.PAR_IZQ, 0); }
		public TerminalNode PAR_DER() { return getToken(SwiftGrammarParser.PAR_DER, 0); }
		public ConversionstmtContext conversionstmt() {
			return getRuleContext(ConversionstmtContext.class,0);
		}
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RES:
				{
				setState(161);
				((ExprContext)_localctx).RES = match(RES);
				setState(162);
				((ExprContext)_localctx).left = ((ExprContext)_localctx).expr = expr(18);
				 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).RES!=null?((ExprContext)_localctx).RES.getLine():0), (((ExprContext)_localctx).RES!=null?((ExprContext)_localctx).RES.getCharPositionInLine():0), ((ExprContext)_localctx).left.e, "UNARIO", nil) 
				}
				break;
			case NOT:
				{
				setState(165);
				((ExprContext)_localctx).NOT = match(NOT);
				setState(166);
				((ExprContext)_localctx).left = ((ExprContext)_localctx).expr = expr(12);
				_localctx.e = expressions.NewOperation((((ExprContext)_localctx).NOT!=null?((ExprContext)_localctx).NOT.getLine():0), (((ExprContext)_localctx).NOT!=null?((ExprContext)_localctx).NOT.getCharPositionInLine():0), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).NOT!=null?((ExprContext)_localctx).NOT.getText():null), nil)
				}
				break;
			case PAR_IZQ:
				{
				setState(169);
				match(PAR_IZQ);
				setState(170);
				((ExprContext)_localctx).expr = expr(0);
				setState(171);
				match(PAR_DER);
				 _localctx.e = ((ExprContext)_localctx).expr.e 
				}
				break;
			case INT:
			case FLOAT:
			case STR:
				{
				setState(174);
				((ExprContext)_localctx).conversionstmt = conversionstmt();
				 _localctx.e = ((ExprContext)_localctx).conversionstmt.conv 
				}
				break;
			case ID:
				{
				setState(177);
				((ExprContext)_localctx).list = listArray(0);
				 _localctx.e = ((ExprContext)_localctx).list.p
				}
				break;
			case COR_IZQ:
				{
				setState(180);
				((ExprContext)_localctx).COR_IZQ = match(COR_IZQ);
				setState(181);
				((ExprContext)_localctx).listParams = listParams(0);
				setState(182);
				match(COR_DER);
				 _localctx.e = expressions.NewArray((((ExprContext)_localctx).COR_IZQ!=null?((ExprContext)_localctx).COR_IZQ.getLine():0), (((ExprContext)_localctx).COR_IZQ!=null?((ExprContext)_localctx).COR_IZQ.getCharPositionInLine():0), ((ExprContext)_localctx).listParams.l) 
				}
				break;
			case NUMBER:
				{
				setState(185);
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
			case STRING:
				{
				setState(187);
				((ExprContext)_localctx).STRING = match(STRING);

				        str := (((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getText():null)
				        _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getLine():0), (((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getCharPositionInLine():0), str[1:len(str)-1],environment.STRING)
				    
				}
				break;
			case TRU:
				{
				setState(189);
				((ExprContext)_localctx).TRU = match(TRU);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).TRU!=null?((ExprContext)_localctx).TRU.getLine():0), (((ExprContext)_localctx).TRU!=null?((ExprContext)_localctx).TRU.getCharPositionInLine():0), true, environment.BOOLEAN) 
				}
				break;
			case FAL:
				{
				setState(191);
				((ExprContext)_localctx).FAL = match(FAL);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).FAL!=null?((ExprContext)_localctx).FAL.getLine():0), (((ExprContext)_localctx).FAL!=null?((ExprContext)_localctx).FAL.getCharPositionInLine():0), false, environment.BOOLEAN) 
				}
				break;
			case NIL:
				{
				setState(193);
				((ExprContext)_localctx).NIL = match(NIL);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).NIL!=null?((ExprContext)_localctx).NIL.getLine():0), (((ExprContext)_localctx).NIL!=null?((ExprContext)_localctx).NIL.getCharPositionInLine():0), nil, environment.NULL) 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(232);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(197);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(198);
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
						setState(199);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(18);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(202);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(203);
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
						setState(204);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(17);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(207);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(208);
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
						setState(209);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(16);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(212);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(213);
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
						setState(214);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(15);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(217);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(218);
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
						setState(219);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(14);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(222);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(223);
						((ExprContext)_localctx).op = match(AND);
						setState(224);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(12);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(227);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(228);
						((ExprContext)_localctx).op = match(OR);
						setState(229);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(11);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		enterRule(_localctx, 22, RULE_conversionstmt);
		try {
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				((ConversionstmtContext)_localctx).INT = match(INT);
				setState(238);
				match(PAR_IZQ);
				setState(239);
				((ConversionstmtContext)_localctx).expr = expr(0);
				setState(240);
				match(PAR_DER);
				 _localctx.conv = expressions.NewToInt((((ConversionstmtContext)_localctx).INT!=null?((ConversionstmtContext)_localctx).INT.getLine():0), (((ConversionstmtContext)_localctx).INT!=null?((ConversionstmtContext)_localctx).INT.getCharPositionInLine():0), ((ConversionstmtContext)_localctx).expr.e) 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				((ConversionstmtContext)_localctx).FLOAT = match(FLOAT);
				setState(244);
				match(PAR_IZQ);
				setState(245);
				((ConversionstmtContext)_localctx).expr = expr(0);
				setState(246);
				match(PAR_DER);
				 _localctx.conv = expressions.NewToFloat((((ConversionstmtContext)_localctx).FLOAT!=null?((ConversionstmtContext)_localctx).FLOAT.getLine():0), (((ConversionstmtContext)_localctx).FLOAT!=null?((ConversionstmtContext)_localctx).FLOAT.getCharPositionInLine():0), ((ConversionstmtContext)_localctx).expr.e) 
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				((ConversionstmtContext)_localctx).STR = match(STR);
				setState(250);
				match(PAR_IZQ);
				setState(251);
				((ConversionstmtContext)_localctx).expr = expr(0);
				setState(252);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_listParams, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(258);
			((ListParamsContext)_localctx).expr = expr(0);

			            _localctx.l = []interface{}{}
			            _localctx.l = append(_localctx.l, ((ListParamsContext)_localctx).expr.e)
			        
			}
			_ctx.stop = _input.LT(-1);
			setState(268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
					setState(261);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(262);
					match(COMA);
					setState(263);
					((ListParamsContext)_localctx).expr = expr(0);

					                                          var arr []interface{}
					                                          arr = append(((ListParamsContext)_localctx).list.l, ((ListParamsContext)_localctx).expr.e)
					                                          _localctx.l = arr
					                                      
					}
					} 
				}
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_listArray, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(272);
			((ListArrayContext)_localctx).ID = match(ID);
			 _localctx.p = expressions.NewLlamadoVar((((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getLine():0), (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getCharPositionInLine():0), (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getText():null))
			}
			_ctx.stop = _input.LT(-1);
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListArrayContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listArray);
					setState(275);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(276);
					match(COR_IZQ);
					setState(277);
					((ListArrayContext)_localctx).expr = expr(0);
					setState(278);
					match(COR_DER);
					 _localctx.p = expressions.NewArrayAccess((((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetLine(), (((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetColumn(), ((ListArrayContext)_localctx).list.p, ((ListArrayContext)_localctx).expr.e) 
					}
					} 
				}
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 12:
			return listParams_sempred((ListParamsContext)_localctx, predIndex);
		case 13:
			return listArray_sempred((ListArrayContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		}
		return true;
	}
	private boolean listParams_sempred(ListParamsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listArray_sempred(ListArrayContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u0121\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\3\6\3$\n\3\r"+
		"\3\16\3%\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\49\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\6\6B\n\6\r\6\16\6C\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7c\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u008f\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u00a1\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c6\n\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00eb\n\f"+
		"\f\f\16\f\u00ee\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\5\r\u0102\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\7\16\u010d\n\16\f\16\16\16\u0110\13\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u011c\n\17\f\17\16\17\u011f\13\17"+
		"\3\17\2\5\26\32\34\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\7\4\2\35\36"+
		"!!\3\2\37 \4\2\31\31\33\33\4\2\32\32\34\34\3\2\23\24\2\u0137\2\36\3\2"+
		"\2\2\4#\3\2\2\2\68\3\2\2\2\b:\3\2\2\2\nA\3\2\2\2\fb\3\2\2\2\16d\3\2\2"+
		"\2\20\u008e\3\2\2\2\22\u0090\3\2\2\2\24\u00a0\3\2\2\2\26\u00c5\3\2\2\2"+
		"\30\u0101\3\2\2\2\32\u0103\3\2\2\2\34\u0111\3\2\2\2\36\37\5\4\3\2\37 "+
		"\7\2\2\3 !\b\2\1\2!\3\3\2\2\2\"$\5\6\4\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2"+
		"\2%&\3\2\2\2&\'\3\2\2\2\'(\b\3\1\2(\5\3\2\2\2)*\5\b\5\2*+\b\4\1\2+9\3"+
		"\2\2\2,-\5\f\7\2-.\b\4\1\2.9\3\2\2\2/\60\5\20\t\2\60\61\b\4\1\2\619\3"+
		"\2\2\2\62\63\5\22\n\2\63\64\b\4\1\2\649\3\2\2\2\65\66\5\16\b\2\66\67\b"+
		"\4\1\2\679\3\2\2\28)\3\2\2\28,\3\2\2\28/\3\2\2\28\62\3\2\2\28\65\3\2\2"+
		"\29\7\3\2\2\2:;\7\t\2\2;<\7\"\2\2<=\5\32\16\2=>\7#\2\2>?\b\5\1\2?\t\3"+
		"\2\2\2@B\5\f\7\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\b"+
		"\6\1\2F\13\3\2\2\2GH\7\n\2\2HI\5\26\f\2IJ\7$\2\2JK\5\4\3\2KL\7%\2\2LM"+
		"\b\7\1\2Mc\3\2\2\2NO\7\n\2\2OP\5\26\f\2PQ\7$\2\2QR\5\4\3\2RS\7%\2\2ST"+
		"\7\13\2\2TU\7$\2\2UV\5\4\3\2VW\7%\2\2WX\b\7\1\2Xc\3\2\2\2YZ\7\n\2\2Z["+
		"\5\26\f\2[\\\7$\2\2\\]\5\4\3\2]^\7%\2\2^_\7\13\2\2_`\5\n\6\2`a\b\7\1\2"+
		"ac\3\2\2\2bG\3\2\2\2bN\3\2\2\2bY\3\2\2\2c\r\3\2\2\2de\7\f\2\2ef\5\26\f"+
		"\2fg\7$\2\2gh\5\4\3\2hi\7%\2\2ij\b\b\1\2j\17\3\2\2\2kl\7\r\2\2lm\7\22"+
		"\2\2mn\7&\2\2no\5\24\13\2op\7\30\2\2pq\5\26\f\2qr\b\t\1\2r\u008f\3\2\2"+
		"\2st\7\r\2\2tu\7\22\2\2uv\7\30\2\2vw\5\26\f\2wx\b\t\1\2x\u008f\3\2\2\2"+
		"yz\7\r\2\2z{\7\22\2\2{|\7&\2\2|}\5\24\13\2}~\7*\2\2~\177\b\t\1\2\177\u008f"+
		"\3\2\2\2\u0080\u0081\7\16\2\2\u0081\u0082\7\22\2\2\u0082\u0083\7&\2\2"+
		"\u0083\u0084\5\24\13\2\u0084\u0085\7\30\2\2\u0085\u0086\5\26\f\2\u0086"+
		"\u0087\b\t\1\2\u0087\u008f\3\2\2\2\u0088\u0089\7\16\2\2\u0089\u008a\7"+
		"\22\2\2\u008a\u008b\7\30\2\2\u008b\u008c\5\26\f\2\u008c\u008d\b\t\1\2"+
		"\u008d\u008f\3\2\2\2\u008ek\3\2\2\2\u008es\3\2\2\2\u008ey\3\2\2\2\u008e"+
		"\u0080\3\2\2\2\u008e\u0088\3\2\2\2\u008f\21\3\2\2\2\u0090\u0091\7\22\2"+
		"\2\u0091\u0092\7\30\2\2\u0092\u0093\5\26\f\2\u0093\u0094\b\n\1\2\u0094"+
		"\23\3\2\2\2\u0095\u0096\7\3\2\2\u0096\u00a1\b\13\1\2\u0097\u0098\7\4\2"+
		"\2\u0098\u00a1\b\13\1\2\u0099\u009a\7\6\2\2\u009a\u00a1\b\13\1\2\u009b"+
		"\u009c\7\5\2\2\u009c\u00a1\b\13\1\2\u009d\u009e\7\'\2\2\u009e\u009f\7"+
		"(\2\2\u009f\u00a1\b\13\1\2\u00a0\u0095\3\2\2\2\u00a0\u0097\3\2\2\2\u00a0"+
		"\u0099\3\2\2\2\u00a0\u009b\3\2\2\2\u00a0\u009d\3\2\2\2\u00a1\25\3\2\2"+
		"\2\u00a2\u00a3\b\f\1\2\u00a3\u00a4\7 \2\2\u00a4\u00a5\5\26\f\24\u00a5"+
		"\u00a6\b\f\1\2\u00a6\u00c6\3\2\2\2\u00a7\u00a8\7\25\2\2\u00a8\u00a9\5"+
		"\26\f\16\u00a9\u00aa\b\f\1\2\u00aa\u00c6\3\2\2\2\u00ab\u00ac\7\"\2\2\u00ac"+
		"\u00ad\5\26\f\2\u00ad\u00ae\7#\2\2\u00ae\u00af\b\f\1\2\u00af\u00c6\3\2"+
		"\2\2\u00b0\u00b1\5\30\r\2\u00b1\u00b2\b\f\1\2\u00b2\u00c6\3\2\2\2\u00b3"+
		"\u00b4\5\34\17\2\u00b4\u00b5\b\f\1\2\u00b5\u00c6\3\2\2\2\u00b6\u00b7\7"+
		"\'\2\2\u00b7\u00b8\5\32\16\2\u00b8\u00b9\7(\2\2\u00b9\u00ba\b\f\1\2\u00ba"+
		"\u00c6\3\2\2\2\u00bb\u00bc\7\20\2\2\u00bc\u00c6\b\f\1\2\u00bd\u00be\7"+
		"\21\2\2\u00be\u00c6\b\f\1\2\u00bf\u00c0\7\7\2\2\u00c0\u00c6\b\f\1\2\u00c1"+
		"\u00c2\7\b\2\2\u00c2\u00c6\b\f\1\2\u00c3\u00c4\7\17\2\2\u00c4\u00c6\b"+
		"\f\1\2\u00c5\u00a2\3\2\2\2\u00c5\u00a7\3\2\2\2\u00c5\u00ab\3\2\2\2\u00c5"+
		"\u00b0\3\2\2\2\u00c5\u00b3\3\2\2\2\u00c5\u00b6\3\2\2\2\u00c5\u00bb\3\2"+
		"\2\2\u00c5\u00bd\3\2\2\2\u00c5\u00bf\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c6\u00ec\3\2\2\2\u00c7\u00c8\f\23\2\2\u00c8\u00c9\t"+
		"\2\2\2\u00c9\u00ca\5\26\f\24\u00ca\u00cb\b\f\1\2\u00cb\u00eb\3\2\2\2\u00cc"+
		"\u00cd\f\22\2\2\u00cd\u00ce\t\3\2\2\u00ce\u00cf\5\26\f\23\u00cf\u00d0"+
		"\b\f\1\2\u00d0\u00eb\3\2\2\2\u00d1\u00d2\f\21\2\2\u00d2\u00d3\t\4\2\2"+
		"\u00d3\u00d4\5\26\f\22\u00d4\u00d5\b\f\1\2\u00d5\u00eb\3\2\2\2\u00d6\u00d7"+
		"\f\20\2\2\u00d7\u00d8\t\5\2\2\u00d8\u00d9\5\26\f\21\u00d9\u00da\b\f\1"+
		"\2\u00da\u00eb\3\2\2\2\u00db\u00dc\f\17\2\2\u00dc\u00dd\t\6\2\2\u00dd"+
		"\u00de\5\26\f\20\u00de\u00df\b\f\1\2\u00df\u00eb\3\2\2\2\u00e0\u00e1\f"+
		"\r\2\2\u00e1\u00e2\7\27\2\2\u00e2\u00e3\5\26\f\16\u00e3\u00e4\b\f\1\2"+
		"\u00e4\u00eb\3\2\2\2\u00e5\u00e6\f\f\2\2\u00e6\u00e7\7\26\2\2\u00e7\u00e8"+
		"\5\26\f\r\u00e8\u00e9\b\f\1\2\u00e9\u00eb\3\2\2\2\u00ea\u00c7\3\2\2\2"+
		"\u00ea\u00cc\3\2\2\2\u00ea\u00d1\3\2\2\2\u00ea\u00d6\3\2\2\2\u00ea\u00db"+
		"\3\2\2\2\u00ea\u00e0\3\2\2\2\u00ea\u00e5\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\27\3\2\2\2\u00ee\u00ec\3\2\2"+
		"\2\u00ef\u00f0\7\3\2\2\u00f0\u00f1\7\"\2\2\u00f1\u00f2\5\26\f\2\u00f2"+
		"\u00f3\7#\2\2\u00f3\u00f4\b\r\1\2\u00f4\u0102\3\2\2\2\u00f5\u00f6\7\4"+
		"\2\2\u00f6\u00f7\7\"\2\2\u00f7\u00f8\5\26\f\2\u00f8\u00f9\7#\2\2\u00f9"+
		"\u00fa\b\r\1\2\u00fa\u0102\3\2\2\2\u00fb\u00fc\7\6\2\2\u00fc\u00fd\7\""+
		"\2\2\u00fd\u00fe\5\26\f\2\u00fe\u00ff\7#\2\2\u00ff\u0100\b\r\1\2\u0100"+
		"\u0102\3\2\2\2\u0101\u00ef\3\2\2\2\u0101\u00f5\3\2\2\2\u0101\u00fb\3\2"+
		"\2\2\u0102\31\3\2\2\2\u0103\u0104\b\16\1\2\u0104\u0105\5\26\f\2\u0105"+
		"\u0106\b\16\1\2\u0106\u010e\3\2\2\2\u0107\u0108\f\4\2\2\u0108\u0109\7"+
		")\2\2\u0109\u010a\5\26\f\2\u010a\u010b\b\16\1\2\u010b\u010d\3\2\2\2\u010c"+
		"\u0107\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2"+
		"\2\2\u010f\33\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\b\17\1\2\u0112\u0113"+
		"\7\22\2\2\u0113\u0114\b\17\1\2\u0114\u011d\3\2\2\2\u0115\u0116\f\4\2\2"+
		"\u0116\u0117\7\'\2\2\u0117\u0118\5\26\f\2\u0118\u0119\7(\2\2\u0119\u011a"+
		"\b\17\1\2\u011a\u011c\3\2\2\2\u011b\u0115\3\2\2\2\u011c\u011f\3\2\2\2"+
		"\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\35\3\2\2\2\u011f\u011d"+
		"\3\2\2\2\16%8Cb\u008e\u00a0\u00c5\u00ea\u00ec\u0101\u010e\u011d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}