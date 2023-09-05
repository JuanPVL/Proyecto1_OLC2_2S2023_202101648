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
		FOR=11, IN=12, VAR=13, LET=14, NIL=15, NUMBER=16, STRING=17, ID=18, DIFE=19, 
		IG_IG=20, NOT=21, OR=22, AND=23, IGUAL=24, MAYIG=25, MENIG=26, MAYOR=27, 
		MENOR=28, MULT=29, DIV=30, SUM=31, RES=32, MOD=33, PAR_IZQ=34, PAR_DER=35, 
		LLAVE_IZQ=36, LLAVE_DER=37, DOSPUNTOS=38, COR_IZQ=39, COR_DER=40, COMA=41, 
		CIERRAPREGUNTA=42, PUNTOCOMA=43, PUNTO=44, WHITESPACE=45, COMMENT=46, 
		LINE_COMMENT=47;
	public static final int
		RULE_s = 0, RULE_block = 1, RULE_instruction = 2, RULE_printstmt = 3, 
		RULE_blockelsif = 4, RULE_ifstmt = 5, RULE_whilestmt = 6, RULE_forstmt = 7, 
		RULE_declarationstmt = 8, RULE_asignationstmt = 9, RULE_types = 10, RULE_exprFor = 11, 
		RULE_expr = 12, RULE_conversionstmt = 13, RULE_listParams = 14, RULE_listArray = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "block", "instruction", "printstmt", "blockelsif", "ifstmt", "whilestmt", 
			"forstmt", "declarationstmt", "asignationstmt", "types", "exprFor", "expr", 
			"conversionstmt", "listParams", "listArray"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Int'", "'Float'", "'Bool'", "'String'", "'true'", "'false'", 
			"'print'", "'if'", "'else'", "'while'", "'for'", "'in'", "'var'", "'let'", 
			"'nil'", null, null, null, "'!='", "'=='", "'!'", "'||'", "'&&'", "'='", 
			"'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'+'", "'-'", "'%'", "'('", 
			"')'", "'{'", "'}'", "':'", "'['", "']'", "','", "'?'", "';'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "BOOL", "STR", "TRU", "FAL", "PRINT", "IF", "ELSE", 
			"WHILE", "FOR", "IN", "VAR", "LET", "NIL", "NUMBER", "STRING", "ID", 
			"DIFE", "IG_IG", "NOT", "OR", "AND", "IGUAL", "MAYIG", "MENIG", "MAYOR", 
			"MENOR", "MULT", "DIV", "SUM", "RES", "MOD", "PAR_IZQ", "PAR_DER", "LLAVE_IZQ", 
			"LLAVE_DER", "DOSPUNTOS", "COR_IZQ", "COR_DER", "COMA", "CIERRAPREGUNTA", 
			"PUNTOCOMA", "PUNTO", "WHITESPACE", "COMMENT", "LINE_COMMENT"
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
			setState(32);
			((SContext)_localctx).block = block();
			setState(33);
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
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				((BlockContext)_localctx).instruction = instruction();
				((BlockContext)_localctx).ins.add(((BlockContext)_localctx).instruction);
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << VAR) | (1L << LET) | (1L << ID))) != 0) );

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
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				((InstructionContext)_localctx).printstmt = printstmt();
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(44);
					match(PUNTOCOMA);
					}
				}

				 _localctx.inst = ((InstructionContext)_localctx).printstmt.prnt
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				((InstructionContext)_localctx).ifstmt = ifstmt();
				 _localctx.inst = ((InstructionContext)_localctx).ifstmt.ifinst 
				}
				break;
			case VAR:
			case LET:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				((InstructionContext)_localctx).declarationstmt = declarationstmt();
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(53);
					match(PUNTOCOMA);
					}
				}

				 _localctx.inst = ((InstructionContext)_localctx).declarationstmt.dec 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				((InstructionContext)_localctx).asignationstmt = asignationstmt();
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(59);
					match(PUNTOCOMA);
					}
				}

				 _localctx.inst = ((InstructionContext)_localctx).asignationstmt.asig 
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				((InstructionContext)_localctx).whilestmt = whilestmt();
				 _localctx.inst = ((InstructionContext)_localctx).whilestmt.whileinst 
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(67);
				((InstructionContext)_localctx).forstmt = forstmt();
				 _localctx.inst = ((InstructionContext)_localctx).forstmt.forinst 
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
			setState(72);
			((PrintstmtContext)_localctx).PRINT = match(PRINT);
			setState(73);
			match(PAR_IZQ);
			setState(74);
			((PrintstmtContext)_localctx).listParams = listParams(0);
			setState(75);
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
			setState(79); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(78);
					((BlockelsifContext)_localctx).ifstmt = ifstmt();
					((BlockelsifContext)_localctx).elseif.add(((BlockelsifContext)_localctx).ifstmt);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(81); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(86);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(87);
				match(LLAVE_IZQ);
				setState(88);
				((IfstmtContext)_localctx).block = block();
				setState(89);
				match(LLAVE_DER);
				 _localctx.ifinst = instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).block.blk, nil) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(93);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(94);
				match(LLAVE_IZQ);
				setState(95);
				((IfstmtContext)_localctx).ifblck = block();
				setState(96);
				match(LLAVE_DER);
				setState(97);
				match(ELSE);
				setState(98);
				match(LLAVE_IZQ);
				setState(99);
				((IfstmtContext)_localctx).elseblck = block();
				setState(100);
				match(LLAVE_DER);
				_localctx.ifinst = instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).ifblck.blk, ((IfstmtContext)_localctx).elseblck.blk)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(104);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(105);
				match(LLAVE_IZQ);
				setState(106);
				((IfstmtContext)_localctx).ifblck = block();
				setState(107);
				match(LLAVE_DER);
				setState(108);
				match(ELSE);
				setState(109);
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
			setState(114);
			((WhilestmtContext)_localctx).WHILE = match(WHILE);
			setState(115);
			((WhilestmtContext)_localctx).expr = expr(0);
			setState(116);
			match(LLAVE_IZQ);
			setState(117);
			((WhilestmtContext)_localctx).block = block();
			setState(118);
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

	public static class ForstmtContext extends ParserRuleContext {
		public interfaces.Instruction forinst;
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
		enterRule(_localctx, 14, RULE_forstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(FOR);
			setState(122);
			match(ID);
			setState(123);
			match(IN);
			setState(124);
			exprFor();
			setState(125);
			match(LLAVE_IZQ);
			setState(126);
			block();
			setState(127);
			match(LLAVE_DER);

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
		enterRule(_localctx, 16, RULE_declarationstmt);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				((DeclarationstmtContext)_localctx).VAR = match(VAR);
				setState(131);
				((DeclarationstmtContext)_localctx).ID = match(ID);
				setState(132);
				match(DOSPUNTOS);
				setState(133);
				((DeclarationstmtContext)_localctx).types = types();
				setState(134);
				match(IGUAL);
				setState(135);
				((DeclarationstmtContext)_localctx).expr = expr(0);
				 _localctx.dec = instructions.NewDeclaracion((((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getLine():0), (((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getCharPositionInLine():0), (((DeclarationstmtContext)_localctx).ID!=null?((DeclarationstmtContext)_localctx).ID.getText():null),true, ((DeclarationstmtContext)_localctx).types.ty, ((DeclarationstmtContext)_localctx).expr.e) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				((DeclarationstmtContext)_localctx).VAR = match(VAR);
				setState(139);
				((DeclarationstmtContext)_localctx).ID = match(ID);
				setState(140);
				match(IGUAL);
				setState(141);
				((DeclarationstmtContext)_localctx).expr = expr(0);
				 _localctx.dec = instructions.NewDeclaracion((((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getLine():0), (((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getCharPositionInLine():0), (((DeclarationstmtContext)_localctx).ID!=null?((DeclarationstmtContext)_localctx).ID.getText():null),true,environment.DEPENDIENTE, ((DeclarationstmtContext)_localctx).expr.e) 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				((DeclarationstmtContext)_localctx).VAR = match(VAR);
				setState(145);
				((DeclarationstmtContext)_localctx).ID = match(ID);
				setState(146);
				match(DOSPUNTOS);
				setState(147);
				((DeclarationstmtContext)_localctx).types = types();
				setState(148);
				match(CIERRAPREGUNTA);
				 _localctx.dec = instructions.NewDeclaracion((((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getLine():0), (((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getCharPositionInLine():0), (((DeclarationstmtContext)_localctx).ID!=null?((DeclarationstmtContext)_localctx).ID.getText():null),true, ((DeclarationstmtContext)_localctx).types.ty, nil) 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				((DeclarationstmtContext)_localctx).LET = match(LET);
				setState(152);
				((DeclarationstmtContext)_localctx).ID = match(ID);
				setState(153);
				match(DOSPUNTOS);
				setState(154);
				((DeclarationstmtContext)_localctx).types = types();
				setState(155);
				match(IGUAL);
				setState(156);
				((DeclarationstmtContext)_localctx).expr = expr(0);
				 _localctx.dec = instructions.NewDeclaracion((((DeclarationstmtContext)_localctx).LET!=null?((DeclarationstmtContext)_localctx).LET.getLine():0), (((DeclarationstmtContext)_localctx).LET!=null?((DeclarationstmtContext)_localctx).LET.getCharPositionInLine():0), (((DeclarationstmtContext)_localctx).ID!=null?((DeclarationstmtContext)_localctx).ID.getText():null),false, ((DeclarationstmtContext)_localctx).types.ty, ((DeclarationstmtContext)_localctx).expr.e) 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(159);
				((DeclarationstmtContext)_localctx).LET = match(LET);
				setState(160);
				((DeclarationstmtContext)_localctx).ID = match(ID);
				setState(161);
				match(IGUAL);
				setState(162);
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
		public Token op;
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(SwiftGrammarParser.IGUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SUM() { return getToken(SwiftGrammarParser.SUM, 0); }
		public TerminalNode RES() { return getToken(SwiftGrammarParser.RES, 0); }
		public AsignationstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignationstmt; }
	}

	public final AsignationstmtContext asignationstmt() throws RecognitionException {
		AsignationstmtContext _localctx = new AsignationstmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_asignationstmt);
		int _la;
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				((AsignationstmtContext)_localctx).ID = match(ID);
				setState(168);
				match(IGUAL);
				setState(169);
				((AsignationstmtContext)_localctx).expr = expr(0);
				 _localctx.asig = instructions.NewAsignacion((((AsignationstmtContext)_localctx).ID!=null?((AsignationstmtContext)_localctx).ID.getLine():0), (((AsignationstmtContext)_localctx).ID!=null?((AsignationstmtContext)_localctx).ID.getCharPositionInLine():0), (((AsignationstmtContext)_localctx).ID!=null?((AsignationstmtContext)_localctx).ID.getText():null), ((AsignationstmtContext)_localctx).expr.e) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				((AsignationstmtContext)_localctx).ID = match(ID);
				setState(173);
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
				setState(174);
				match(IGUAL);
				setState(175);
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
		enterRule(_localctx, 20, RULE_types);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(INT);
				 _localctx.ty = environment.INTEGER 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(FLOAT);
				 _localctx.ty = environment.FLOAT 
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				match(STR);
				 _localctx.ty = environment.STRING 
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				match(BOOL);
				 _localctx.ty = environment.BOOLEAN 
				}
				break;
			case COR_IZQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(188);
				match(COR_IZQ);
				setState(189);
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
		enterRule(_localctx, 22, RULE_exprFor);
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				((ExprForContext)_localctx).range1 = expr(0);
				setState(194);
				match(PUNTO);
				setState(195);
				match(PUNTO);
				setState(196);
				match(PUNTO);
				setState(197);
				((ExprForContext)_localctx).range2 = expr(0);

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RES:
				{
				setState(206);
				((ExprContext)_localctx).RES = match(RES);
				setState(207);
				((ExprContext)_localctx).left = ((ExprContext)_localctx).expr = expr(18);
				 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).RES!=null?((ExprContext)_localctx).RES.getLine():0), (((ExprContext)_localctx).RES!=null?((ExprContext)_localctx).RES.getCharPositionInLine():0), ((ExprContext)_localctx).left.e, "UNARIO", nil) 
				}
				break;
			case NOT:
				{
				setState(210);
				((ExprContext)_localctx).NOT = match(NOT);
				setState(211);
				((ExprContext)_localctx).left = ((ExprContext)_localctx).expr = expr(12);
				_localctx.e = expressions.NewOperation((((ExprContext)_localctx).NOT!=null?((ExprContext)_localctx).NOT.getLine():0), (((ExprContext)_localctx).NOT!=null?((ExprContext)_localctx).NOT.getCharPositionInLine():0), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).NOT!=null?((ExprContext)_localctx).NOT.getText():null), nil)
				}
				break;
			case PAR_IZQ:
				{
				setState(214);
				match(PAR_IZQ);
				setState(215);
				((ExprContext)_localctx).expr = expr(0);
				setState(216);
				match(PAR_DER);
				 _localctx.e = ((ExprContext)_localctx).expr.e 
				}
				break;
			case INT:
			case FLOAT:
			case STR:
				{
				setState(219);
				((ExprContext)_localctx).conversionstmt = conversionstmt();
				 _localctx.e = ((ExprContext)_localctx).conversionstmt.conv 
				}
				break;
			case ID:
				{
				setState(222);
				((ExprContext)_localctx).list = listArray(0);
				 _localctx.e = ((ExprContext)_localctx).list.p
				}
				break;
			case COR_IZQ:
				{
				setState(225);
				((ExprContext)_localctx).COR_IZQ = match(COR_IZQ);
				setState(226);
				((ExprContext)_localctx).listParams = listParams(0);
				setState(227);
				match(COR_DER);
				 _localctx.e = expressions.NewArray((((ExprContext)_localctx).COR_IZQ!=null?((ExprContext)_localctx).COR_IZQ.getLine():0), (((ExprContext)_localctx).COR_IZQ!=null?((ExprContext)_localctx).COR_IZQ.getCharPositionInLine():0), ((ExprContext)_localctx).listParams.l) 
				}
				break;
			case NUMBER:
				{
				setState(230);
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
				setState(232);
				((ExprContext)_localctx).STRING = match(STRING);

				        str := (((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getText():null)
				        _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getLine():0), (((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getCharPositionInLine():0), str[1:len(str)-1],environment.STRING)
				    
				}
				break;
			case TRU:
				{
				setState(234);
				((ExprContext)_localctx).TRU = match(TRU);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).TRU!=null?((ExprContext)_localctx).TRU.getLine():0), (((ExprContext)_localctx).TRU!=null?((ExprContext)_localctx).TRU.getCharPositionInLine():0), true, environment.BOOLEAN) 
				}
				break;
			case FAL:
				{
				setState(236);
				((ExprContext)_localctx).FAL = match(FAL);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).FAL!=null?((ExprContext)_localctx).FAL.getLine():0), (((ExprContext)_localctx).FAL!=null?((ExprContext)_localctx).FAL.getCharPositionInLine():0), false, environment.BOOLEAN) 
				}
				break;
			case NIL:
				{
				setState(238);
				((ExprContext)_localctx).NIL = match(NIL);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).NIL!=null?((ExprContext)_localctx).NIL.getLine():0), (((ExprContext)_localctx).NIL!=null?((ExprContext)_localctx).NIL.getCharPositionInLine():0), nil, environment.NULL) 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(277);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(242);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(243);
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
						setState(244);
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
						setState(247);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(248);
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
						setState(249);
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
						setState(252);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(253);
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
						setState(254);
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
						setState(257);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(258);
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
						setState(259);
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
						setState(262);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(263);
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
						setState(264);
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
						setState(267);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(268);
						((ExprContext)_localctx).op = match(AND);
						setState(269);
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
						setState(272);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(273);
						((ExprContext)_localctx).op = match(OR);
						setState(274);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(11);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					}
					} 
				}
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		enterRule(_localctx, 26, RULE_conversionstmt);
		try {
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				((ConversionstmtContext)_localctx).INT = match(INT);
				setState(283);
				match(PAR_IZQ);
				setState(284);
				((ConversionstmtContext)_localctx).expr = expr(0);
				setState(285);
				match(PAR_DER);
				 _localctx.conv = expressions.NewToInt((((ConversionstmtContext)_localctx).INT!=null?((ConversionstmtContext)_localctx).INT.getLine():0), (((ConversionstmtContext)_localctx).INT!=null?((ConversionstmtContext)_localctx).INT.getCharPositionInLine():0), ((ConversionstmtContext)_localctx).expr.e) 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				((ConversionstmtContext)_localctx).FLOAT = match(FLOAT);
				setState(289);
				match(PAR_IZQ);
				setState(290);
				((ConversionstmtContext)_localctx).expr = expr(0);
				setState(291);
				match(PAR_DER);
				 _localctx.conv = expressions.NewToFloat((((ConversionstmtContext)_localctx).FLOAT!=null?((ConversionstmtContext)_localctx).FLOAT.getLine():0), (((ConversionstmtContext)_localctx).FLOAT!=null?((ConversionstmtContext)_localctx).FLOAT.getCharPositionInLine():0), ((ConversionstmtContext)_localctx).expr.e) 
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				((ConversionstmtContext)_localctx).STR = match(STR);
				setState(295);
				match(PAR_IZQ);
				setState(296);
				((ConversionstmtContext)_localctx).expr = expr(0);
				setState(297);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_listParams, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(303);
			((ListParamsContext)_localctx).expr = expr(0);

			            _localctx.l = []interface{}{}
			            _localctx.l = append(_localctx.l, ((ListParamsContext)_localctx).expr.e)
			        
			}
			_ctx.stop = _input.LT(-1);
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
					setState(306);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(307);
					match(COMA);
					setState(308);
					((ListParamsContext)_localctx).expr = expr(0);

					                                          var arr []interface{}
					                                          arr = append(((ListParamsContext)_localctx).list.l, ((ListParamsContext)_localctx).expr.e)
					                                          _localctx.l = arr
					                                      
					}
					} 
				}
				setState(315);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_listArray, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(317);
			((ListArrayContext)_localctx).ID = match(ID);
			 _localctx.p = expressions.NewLlamadoVar((((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getLine():0), (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getCharPositionInLine():0), (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getText():null))
			}
			_ctx.stop = _input.LT(-1);
			setState(328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
					setState(320);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(321);
					match(COR_IZQ);
					setState(322);
					((ListArrayContext)_localctx).expr = expr(0);
					setState(323);
					match(COR_DER);
					 _localctx.p = expressions.NewArrayAccess((((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetLine(), (((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetColumn(), ((ListArrayContext)_localctx).list.p, ((ListArrayContext)_localctx).expr.e) 
					}
					} 
				}
				setState(330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 14:
			return listParams_sempred((ListParamsContext)_localctx, predIndex);
		case 15:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u014e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\3\2\3\3\6\3(\n\3\r\3\16\3)\3\3\3\3\3\4\3\4\5\4\60\n\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\49\n\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4I\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\6\6R\n\6\r\6\16\6S\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7s\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a8\n\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b5\n\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c2\n\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ce\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u00f3\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0118\n\16\f\16"+
		"\16\16\u011b\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u012f\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u013a\n\20\f\20\16\20\u013d\13\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0149\n\21\f\21"+
		"\16\21\u014c\13\21\3\21\2\5\32\36 \22\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \2\7\3\2!\"\4\2\37 ##\4\2\33\33\35\35\4\2\34\34\36\36\3\2\25\26"+
		"\2\u0168\2\"\3\2\2\2\4\'\3\2\2\2\6H\3\2\2\2\bJ\3\2\2\2\nQ\3\2\2\2\fr\3"+
		"\2\2\2\16t\3\2\2\2\20{\3\2\2\2\22\u00a7\3\2\2\2\24\u00b4\3\2\2\2\26\u00c1"+
		"\3\2\2\2\30\u00cd\3\2\2\2\32\u00f2\3\2\2\2\34\u012e\3\2\2\2\36\u0130\3"+
		"\2\2\2 \u013e\3\2\2\2\"#\5\4\3\2#$\7\2\2\3$%\b\2\1\2%\3\3\2\2\2&(\5\6"+
		"\4\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\b\3\1\2,\5"+
		"\3\2\2\2-/\5\b\5\2.\60\7-\2\2/.\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\62"+
		"\b\4\1\2\62I\3\2\2\2\63\64\5\f\7\2\64\65\b\4\1\2\65I\3\2\2\2\668\5\22"+
		"\n\2\679\7-\2\28\67\3\2\2\289\3\2\2\29:\3\2\2\2:;\b\4\1\2;I\3\2\2\2<>"+
		"\5\24\13\2=?\7-\2\2>=\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\b\4\1\2AI\3\2\2\2"+
		"BC\5\16\b\2CD\b\4\1\2DI\3\2\2\2EF\5\20\t\2FG\b\4\1\2GI\3\2\2\2H-\3\2\2"+
		"\2H\63\3\2\2\2H\66\3\2\2\2H<\3\2\2\2HB\3\2\2\2HE\3\2\2\2I\7\3\2\2\2JK"+
		"\7\t\2\2KL\7$\2\2LM\5\36\20\2MN\7%\2\2NO\b\5\1\2O\t\3\2\2\2PR\5\f\7\2"+
		"QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\b\6\1\2V\13\3\2\2"+
		"\2WX\7\n\2\2XY\5\32\16\2YZ\7&\2\2Z[\5\4\3\2[\\\7\'\2\2\\]\b\7\1\2]s\3"+
		"\2\2\2^_\7\n\2\2_`\5\32\16\2`a\7&\2\2ab\5\4\3\2bc\7\'\2\2cd\7\13\2\2d"+
		"e\7&\2\2ef\5\4\3\2fg\7\'\2\2gh\b\7\1\2hs\3\2\2\2ij\7\n\2\2jk\5\32\16\2"+
		"kl\7&\2\2lm\5\4\3\2mn\7\'\2\2no\7\13\2\2op\5\n\6\2pq\b\7\1\2qs\3\2\2\2"+
		"rW\3\2\2\2r^\3\2\2\2ri\3\2\2\2s\r\3\2\2\2tu\7\f\2\2uv\5\32\16\2vw\7&\2"+
		"\2wx\5\4\3\2xy\7\'\2\2yz\b\b\1\2z\17\3\2\2\2{|\7\r\2\2|}\7\24\2\2}~\7"+
		"\16\2\2~\177\5\30\r\2\177\u0080\7&\2\2\u0080\u0081\5\4\3\2\u0081\u0082"+
		"\7\'\2\2\u0082\u0083\b\t\1\2\u0083\21\3\2\2\2\u0084\u0085\7\17\2\2\u0085"+
		"\u0086\7\24\2\2\u0086\u0087\7(\2\2\u0087\u0088\5\26\f\2\u0088\u0089\7"+
		"\32\2\2\u0089\u008a\5\32\16\2\u008a\u008b\b\n\1\2\u008b\u00a8\3\2\2\2"+
		"\u008c\u008d\7\17\2\2\u008d\u008e\7\24\2\2\u008e\u008f\7\32\2\2\u008f"+
		"\u0090\5\32\16\2\u0090\u0091\b\n\1\2\u0091\u00a8\3\2\2\2\u0092\u0093\7"+
		"\17\2\2\u0093\u0094\7\24\2\2\u0094\u0095\7(\2\2\u0095\u0096\5\26\f\2\u0096"+
		"\u0097\7,\2\2\u0097\u0098\b\n\1\2\u0098\u00a8\3\2\2\2\u0099\u009a\7\20"+
		"\2\2\u009a\u009b\7\24\2\2\u009b\u009c\7(\2\2\u009c\u009d\5\26\f\2\u009d"+
		"\u009e\7\32\2\2\u009e\u009f\5\32\16\2\u009f\u00a0\b\n\1\2\u00a0\u00a8"+
		"\3\2\2\2\u00a1\u00a2\7\20\2\2\u00a2\u00a3\7\24\2\2\u00a3\u00a4\7\32\2"+
		"\2\u00a4\u00a5\5\32\16\2\u00a5\u00a6\b\n\1\2\u00a6\u00a8\3\2\2\2\u00a7"+
		"\u0084\3\2\2\2\u00a7\u008c\3\2\2\2\u00a7\u0092\3\2\2\2\u00a7\u0099\3\2"+
		"\2\2\u00a7\u00a1\3\2\2\2\u00a8\23\3\2\2\2\u00a9\u00aa\7\24\2\2\u00aa\u00ab"+
		"\7\32\2\2\u00ab\u00ac\5\32\16\2\u00ac\u00ad\b\13\1\2\u00ad\u00b5\3\2\2"+
		"\2\u00ae\u00af\7\24\2\2\u00af\u00b0\t\2\2\2\u00b0\u00b1\7\32\2\2\u00b1"+
		"\u00b2\5\32\16\2\u00b2\u00b3\b\13\1\2\u00b3\u00b5\3\2\2\2\u00b4\u00a9"+
		"\3\2\2\2\u00b4\u00ae\3\2\2\2\u00b5\25\3\2\2\2\u00b6\u00b7\7\3\2\2\u00b7"+
		"\u00c2\b\f\1\2\u00b8\u00b9\7\4\2\2\u00b9\u00c2\b\f\1\2\u00ba\u00bb\7\6"+
		"\2\2\u00bb\u00c2\b\f\1\2\u00bc\u00bd\7\5\2\2\u00bd\u00c2\b\f\1\2\u00be"+
		"\u00bf\7)\2\2\u00bf\u00c0\7*\2\2\u00c0\u00c2\b\f\1\2\u00c1\u00b6\3\2\2"+
		"\2\u00c1\u00b8\3\2\2\2\u00c1\u00ba\3\2\2\2\u00c1\u00bc\3\2\2\2\u00c1\u00be"+
		"\3\2\2\2\u00c2\27\3\2\2\2\u00c3\u00c4\5\32\16\2\u00c4\u00c5\7.\2\2\u00c5"+
		"\u00c6\7.\2\2\u00c6\u00c7\7.\2\2\u00c7\u00c8\5\32\16\2\u00c8\u00c9\b\r"+
		"\1\2\u00c9\u00ce\3\2\2\2\u00ca\u00cb\5\32\16\2\u00cb\u00cc\b\r\1\2\u00cc"+
		"\u00ce\3\2\2\2\u00cd\u00c3\3\2\2\2\u00cd\u00ca\3\2\2\2\u00ce\31\3\2\2"+
		"\2\u00cf\u00d0\b\16\1\2\u00d0\u00d1\7\"\2\2\u00d1\u00d2\5\32\16\24\u00d2"+
		"\u00d3\b\16\1\2\u00d3\u00f3\3\2\2\2\u00d4\u00d5\7\27\2\2\u00d5\u00d6\5"+
		"\32\16\16\u00d6\u00d7\b\16\1\2\u00d7\u00f3\3\2\2\2\u00d8\u00d9\7$\2\2"+
		"\u00d9\u00da\5\32\16\2\u00da\u00db\7%\2\2\u00db\u00dc\b\16\1\2\u00dc\u00f3"+
		"\3\2\2\2\u00dd\u00de\5\34\17\2\u00de\u00df\b\16\1\2\u00df\u00f3\3\2\2"+
		"\2\u00e0\u00e1\5 \21\2\u00e1\u00e2\b\16\1\2\u00e2\u00f3\3\2\2\2\u00e3"+
		"\u00e4\7)\2\2\u00e4\u00e5\5\36\20\2\u00e5\u00e6\7*\2\2\u00e6\u00e7\b\16"+
		"\1\2\u00e7\u00f3\3\2\2\2\u00e8\u00e9\7\22\2\2\u00e9\u00f3\b\16\1\2\u00ea"+
		"\u00eb\7\23\2\2\u00eb\u00f3\b\16\1\2\u00ec\u00ed\7\7\2\2\u00ed\u00f3\b"+
		"\16\1\2\u00ee\u00ef\7\b\2\2\u00ef\u00f3\b\16\1\2\u00f0\u00f1\7\21\2\2"+
		"\u00f1\u00f3\b\16\1\2\u00f2\u00cf\3\2\2\2\u00f2\u00d4\3\2\2\2\u00f2\u00d8"+
		"\3\2\2\2\u00f2\u00dd\3\2\2\2\u00f2\u00e0\3\2\2\2\u00f2\u00e3\3\2\2\2\u00f2"+
		"\u00e8\3\2\2\2\u00f2\u00ea\3\2\2\2\u00f2\u00ec\3\2\2\2\u00f2\u00ee\3\2"+
		"\2\2\u00f2\u00f0\3\2\2\2\u00f3\u0119\3\2\2\2\u00f4\u00f5\f\23\2\2\u00f5"+
		"\u00f6\t\3\2\2\u00f6\u00f7\5\32\16\24\u00f7\u00f8\b\16\1\2\u00f8\u0118"+
		"\3\2\2\2\u00f9\u00fa\f\22\2\2\u00fa\u00fb\t\2\2\2\u00fb\u00fc\5\32\16"+
		"\23\u00fc\u00fd\b\16\1\2\u00fd\u0118\3\2\2\2\u00fe\u00ff\f\21\2\2\u00ff"+
		"\u0100\t\4\2\2\u0100\u0101\5\32\16\22\u0101\u0102\b\16\1\2\u0102\u0118"+
		"\3\2\2\2\u0103\u0104\f\20\2\2\u0104\u0105\t\5\2\2\u0105\u0106\5\32\16"+
		"\21\u0106\u0107\b\16\1\2\u0107\u0118\3\2\2\2\u0108\u0109\f\17\2\2\u0109"+
		"\u010a\t\6\2\2\u010a\u010b\5\32\16\20\u010b\u010c\b\16\1\2\u010c\u0118"+
		"\3\2\2\2\u010d\u010e\f\r\2\2\u010e\u010f\7\31\2\2\u010f\u0110\5\32\16"+
		"\16\u0110\u0111\b\16\1\2\u0111\u0118\3\2\2\2\u0112\u0113\f\f\2\2\u0113"+
		"\u0114\7\30\2\2\u0114\u0115\5\32\16\r\u0115\u0116\b\16\1\2\u0116\u0118"+
		"\3\2\2\2\u0117\u00f4\3\2\2\2\u0117\u00f9\3\2\2\2\u0117\u00fe\3\2\2\2\u0117"+
		"\u0103\3\2\2\2\u0117\u0108\3\2\2\2\u0117\u010d\3\2\2\2\u0117\u0112\3\2"+
		"\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\33\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\7\3\2\2\u011d\u011e\7$\2\2"+
		"\u011e\u011f\5\32\16\2\u011f\u0120\7%\2\2\u0120\u0121\b\17\1\2\u0121\u012f"+
		"\3\2\2\2\u0122\u0123\7\4\2\2\u0123\u0124\7$\2\2\u0124\u0125\5\32\16\2"+
		"\u0125\u0126\7%\2\2\u0126\u0127\b\17\1\2\u0127\u012f\3\2\2\2\u0128\u0129"+
		"\7\6\2\2\u0129\u012a\7$\2\2\u012a\u012b\5\32\16\2\u012b\u012c\7%\2\2\u012c"+
		"\u012d\b\17\1\2\u012d\u012f\3\2\2\2\u012e\u011c\3\2\2\2\u012e\u0122\3"+
		"\2\2\2\u012e\u0128\3\2\2\2\u012f\35\3\2\2\2\u0130\u0131\b\20\1\2\u0131"+
		"\u0132\5\32\16\2\u0132\u0133\b\20\1\2\u0133\u013b\3\2\2\2\u0134\u0135"+
		"\f\4\2\2\u0135\u0136\7+\2\2\u0136\u0137\5\32\16\2\u0137\u0138\b\20\1\2"+
		"\u0138\u013a\3\2\2\2\u0139\u0134\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139"+
		"\3\2\2\2\u013b\u013c\3\2\2\2\u013c\37\3\2\2\2\u013d\u013b\3\2\2\2\u013e"+
		"\u013f\b\21\1\2\u013f\u0140\7\24\2\2\u0140\u0141\b\21\1\2\u0141\u014a"+
		"\3\2\2\2\u0142\u0143\f\4\2\2\u0143\u0144\7)\2\2\u0144\u0145\5\32\16\2"+
		"\u0145\u0146\7*\2\2\u0146\u0147\b\21\1\2\u0147\u0149\3\2\2\2\u0148\u0142"+
		"\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"!\3\2\2\2\u014c\u014a\3\2\2\2\23)/8>HSr\u00a7\u00b4\u00c1\u00cd\u00f2"+
		"\u0117\u0119\u012e\u013b\u014a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}