// Generated from c:\Users\USUARIO\Desktop\Proyecto1_OLC2_2S2023_202101648\SwiftLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SwiftLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "FLOAT", "BOOL", "STR", "TRU", "FAL", "PRINT", "IF", "ELSE", "WHILE", 
			"FOR", "IN", "VAR", "LET", "NIL", "BREAK", "CONTINUE", "APPEND", "REMOVELAST", 
			"REMOVE", "AT", "ISEMPTY", "COUNT", "ARRAY", "RETURN", "FUNC", "STRUCT", 
			"GUARD", "NUMBER", "STRING", "ID", "DIFE", "IG_IG", "NOT", "OR", "AND", 
			"IGUAL", "MAYIG", "MENIG", "MAYOR", "MENOR", "MULT", "DIV", "SUM", "RES", 
			"MOD", "PAR_IZQ", "PAR_DER", "LLAVE_IZQ", "LLAVE_DER", "DOSPUNTOS", "COR_IZQ", 
			"COR_DER", "COMA", "CIERRAPREGUNTA", "PUNTOCOMA", "PUNTO", "FLECHA", 
			"WHITESPACE", "COMMENT", "LINE_COMMENT", "ESC_SEQ"
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


	public SwiftLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SwiftLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2?\u019c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\6\36\u0121"+
		"\n\36\r\36\16\36\u0122\3\36\3\36\6\36\u0127\n\36\r\36\16\36\u0128\5\36"+
		"\u012b\n\36\3\37\3\37\7\37\u012f\n\37\f\37\16\37\u0132\13\37\3\37\3\37"+
		"\3 \3 \7 \u0138\n \f \16 \u013b\13 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3"+
		"$\3%\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3"+
		".\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65"+
		"\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3;\3<\6<\u017b\n<\r<\16<"+
		"\u017c\3<\3<\3=\3=\3=\3=\7=\u0185\n=\f=\16=\u0188\13=\3=\3=\3=\3=\3=\3"+
		">\3>\3>\3>\7>\u0193\n>\f>\16>\u0196\13>\3>\3>\3?\3?\3?\3\u0186\2@\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w=y>{?}\2\3\2\t\3\2\62;\3\2$$\5\2C\\aac|\6\2\62;C\\aac|\6\2\13\f\17"+
		"\17\"\"^^\4\2\f\f\17\17\t\2\"#%%--/\60<<BB]_\2\u01a2\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3"+
		"\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\3\177\3"+
		"\2\2\2\5\u0083\3\2\2\2\7\u0089\3\2\2\2\t\u008e\3\2\2\2\13\u0095\3\2\2"+
		"\2\r\u009a\3\2\2\2\17\u00a0\3\2\2\2\21\u00a6\3\2\2\2\23\u00a9\3\2\2\2"+
		"\25\u00ae\3\2\2\2\27\u00b4\3\2\2\2\31\u00b8\3\2\2\2\33\u00bb\3\2\2\2\35"+
		"\u00bf\3\2\2\2\37\u00c3\3\2\2\2!\u00c7\3\2\2\2#\u00cd\3\2\2\2%\u00d6\3"+
		"\2\2\2\'\u00dd\3\2\2\2)\u00e8\3\2\2\2+\u00ef\3\2\2\2-\u00f2\3\2\2\2/\u00fa"+
		"\3\2\2\2\61\u0100\3\2\2\2\63\u0106\3\2\2\2\65\u010d\3\2\2\2\67\u0112\3"+
		"\2\2\29\u0119\3\2\2\2;\u0120\3\2\2\2=\u012c\3\2\2\2?\u0135\3\2\2\2A\u013c"+
		"\3\2\2\2C\u013f\3\2\2\2E\u0142\3\2\2\2G\u0144\3\2\2\2I\u0147\3\2\2\2K"+
		"\u014a\3\2\2\2M\u014c\3\2\2\2O\u014f\3\2\2\2Q\u0152\3\2\2\2S\u0154\3\2"+
		"\2\2U\u0156\3\2\2\2W\u0158\3\2\2\2Y\u015a\3\2\2\2[\u015c\3\2\2\2]\u015e"+
		"\3\2\2\2_\u0160\3\2\2\2a\u0162\3\2\2\2c\u0164\3\2\2\2e\u0166\3\2\2\2g"+
		"\u0168\3\2\2\2i\u016a\3\2\2\2k\u016c\3\2\2\2m\u016e\3\2\2\2o\u0170\3\2"+
		"\2\2q\u0172\3\2\2\2s\u0174\3\2\2\2u\u0176\3\2\2\2w\u017a\3\2\2\2y\u0180"+
		"\3\2\2\2{\u018e\3\2\2\2}\u0199\3\2\2\2\177\u0080\7K\2\2\u0080\u0081\7"+
		"p\2\2\u0081\u0082\7v\2\2\u0082\4\3\2\2\2\u0083\u0084\7H\2\2\u0084\u0085"+
		"\7n\2\2\u0085\u0086\7q\2\2\u0086\u0087\7c\2\2\u0087\u0088\7v\2\2\u0088"+
		"\6\3\2\2\2\u0089\u008a\7D\2\2\u008a\u008b\7q\2\2\u008b\u008c\7q\2\2\u008c"+
		"\u008d\7n\2\2\u008d\b\3\2\2\2\u008e\u008f\7U\2\2\u008f\u0090\7v\2\2\u0090"+
		"\u0091\7t\2\2\u0091\u0092\7k\2\2\u0092\u0093\7p\2\2\u0093\u0094\7i\2\2"+
		"\u0094\n\3\2\2\2\u0095\u0096\7v\2\2\u0096\u0097\7t\2\2\u0097\u0098\7w"+
		"\2\2\u0098\u0099\7g\2\2\u0099\f\3\2\2\2\u009a\u009b\7h\2\2\u009b\u009c"+
		"\7c\2\2\u009c\u009d\7n\2\2\u009d\u009e\7u\2\2\u009e\u009f\7g\2\2\u009f"+
		"\16\3\2\2\2\u00a0\u00a1\7r\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3\7k\2\2\u00a3"+
		"\u00a4\7p\2\2\u00a4\u00a5\7v\2\2\u00a5\20\3\2\2\2\u00a6\u00a7\7k\2\2\u00a7"+
		"\u00a8\7h\2\2\u00a8\22\3\2\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7n\2\2\u00ab"+
		"\u00ac\7u\2\2\u00ac\u00ad\7g\2\2\u00ad\24\3\2\2\2\u00ae\u00af\7y\2\2\u00af"+
		"\u00b0\7j\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3\7g\2\2"+
		"\u00b3\26\3\2\2\2\u00b4\u00b5\7h\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7"+
		"t\2\2\u00b7\30\3\2\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7p\2\2\u00ba\32"+
		"\3\2\2\2\u00bb\u00bc\7x\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7t\2\2\u00be"+
		"\34\3\2\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7v\2\2\u00c2"+
		"\36\3\2\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7n\2\2\u00c6"+
		" \3\2\2\2\u00c7\u00c8\7d\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7g\2\2\u00ca"+
		"\u00cb\7c\2\2\u00cb\u00cc\7m\2\2\u00cc\"\3\2\2\2\u00cd\u00ce\7e\2\2\u00ce"+
		"\u00cf\7q\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7k\2\2"+
		"\u00d2\u00d3\7p\2\2\u00d3\u00d4\7w\2\2\u00d4\u00d5\7g\2\2\u00d5$\3\2\2"+
		"\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7r\2\2\u00d8\u00d9\7r\2\2\u00d9\u00da"+
		"\7g\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7f\2\2\u00dc&\3\2\2\2\u00dd\u00de"+
		"\7t\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7o\2\2\u00e0\u00e1\7q\2\2\u00e1"+
		"\u00e2\7x\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7N\2\2\u00e4\u00e5\7c\2\2"+
		"\u00e5\u00e6\7u\2\2\u00e6\u00e7\7v\2\2\u00e7(\3\2\2\2\u00e8\u00e9\7t\2"+
		"\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7o\2\2\u00eb\u00ec\7q\2\2\u00ec\u00ed"+
		"\7x\2\2\u00ed\u00ee\7g\2\2\u00ee*\3\2\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1"+
		"\7v\2\2\u00f1,\3\2\2\2\u00f2\u00f3\7k\2\2\u00f3\u00f4\7u\2\2\u00f4\u00f5"+
		"\7G\2\2\u00f5\u00f6\7o\2\2\u00f6\u00f7\7r\2\2\u00f7\u00f8\7v\2\2\u00f8"+
		"\u00f9\7{\2\2\u00f9.\3\2\2\2\u00fa\u00fb\7e\2\2\u00fb\u00fc\7q\2\2\u00fc"+
		"\u00fd\7w\2\2\u00fd\u00fe\7p\2\2\u00fe\u00ff\7v\2\2\u00ff\60\3\2\2\2\u0100"+
		"\u0101\7c\2\2\u0101\u0102\7t\2\2\u0102\u0103\7t\2\2\u0103\u0104\7c\2\2"+
		"\u0104\u0105\7{\2\2\u0105\62\3\2\2\2\u0106\u0107\7t\2\2\u0107\u0108\7"+
		"g\2\2\u0108\u0109\7v\2\2\u0109\u010a\7w\2\2\u010a\u010b\7t\2\2\u010b\u010c"+
		"\7p\2\2\u010c\64\3\2\2\2\u010d\u010e\7h\2\2\u010e\u010f\7w\2\2\u010f\u0110"+
		"\7p\2\2\u0110\u0111\7e\2\2\u0111\66\3\2\2\2\u0112\u0113\7u\2\2\u0113\u0114"+
		"\7v\2\2\u0114\u0115\7t\2\2\u0115\u0116\7w\2\2\u0116\u0117\7e\2\2\u0117"+
		"\u0118\7v\2\2\u01188\3\2\2\2\u0119\u011a\7i\2\2\u011a\u011b\7w\2\2\u011b"+
		"\u011c\7c\2\2\u011c\u011d\7t\2\2\u011d\u011e\7f\2\2\u011e:\3\2\2\2\u011f"+
		"\u0121\t\2\2\2\u0120\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0120\3\2"+
		"\2\2\u0122\u0123\3\2\2\2\u0123\u012a\3\2\2\2\u0124\u0126\7\60\2\2\u0125"+
		"\u0127\t\2\2\2\u0126\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0126\3\2"+
		"\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0124\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b<\3\2\2\2\u012c\u0130\7$\2\2\u012d\u012f\n\3\2\2\u012e"+
		"\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2"+
		"\2\2\u0131\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\7$\2\2\u0134"+
		">\3\2\2\2\u0135\u0139\t\4\2\2\u0136\u0138\t\5\2\2\u0137\u0136\3\2\2\2"+
		"\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a@\3"+
		"\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\7#\2\2\u013d\u013e\7?\2\2\u013e"+
		"B\3\2\2\2\u013f\u0140\7?\2\2\u0140\u0141\7?\2\2\u0141D\3\2\2\2\u0142\u0143"+
		"\7#\2\2\u0143F\3\2\2\2\u0144\u0145\7~\2\2\u0145\u0146\7~\2\2\u0146H\3"+
		"\2\2\2\u0147\u0148\7(\2\2\u0148\u0149\7(\2\2\u0149J\3\2\2\2\u014a\u014b"+
		"\7?\2\2\u014bL\3\2\2\2\u014c\u014d\7@\2\2\u014d\u014e\7?\2\2\u014eN\3"+
		"\2\2\2\u014f\u0150\7>\2\2\u0150\u0151\7?\2\2\u0151P\3\2\2\2\u0152\u0153"+
		"\7@\2\2\u0153R\3\2\2\2\u0154\u0155\7>\2\2\u0155T\3\2\2\2\u0156\u0157\7"+
		",\2\2\u0157V\3\2\2\2\u0158\u0159\7\61\2\2\u0159X\3\2\2\2\u015a\u015b\7"+
		"-\2\2\u015bZ\3\2\2\2\u015c\u015d\7/\2\2\u015d\\\3\2\2\2\u015e\u015f\7"+
		"\'\2\2\u015f^\3\2\2\2\u0160\u0161\7*\2\2\u0161`\3\2\2\2\u0162\u0163\7"+
		"+\2\2\u0163b\3\2\2\2\u0164\u0165\7}\2\2\u0165d\3\2\2\2\u0166\u0167\7\177"+
		"\2\2\u0167f\3\2\2\2\u0168\u0169\7<\2\2\u0169h\3\2\2\2\u016a\u016b\7]\2"+
		"\2\u016bj\3\2\2\2\u016c\u016d\7_\2\2\u016dl\3\2\2\2\u016e\u016f\7.\2\2"+
		"\u016fn\3\2\2\2\u0170\u0171\7A\2\2\u0171p\3\2\2\2\u0172\u0173\7=\2\2\u0173"+
		"r\3\2\2\2\u0174\u0175\7\60\2\2\u0175t\3\2\2\2\u0176\u0177\7/\2\2\u0177"+
		"\u0178\7@\2\2\u0178v\3\2\2\2\u0179\u017b\t\6\2\2\u017a\u0179\3\2\2\2\u017b"+
		"\u017c\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\3\2"+
		"\2\2\u017e\u017f\b<\2\2\u017fx\3\2\2\2\u0180\u0181\7\61\2\2\u0181\u0182"+
		"\7,\2\2\u0182\u0186\3\2\2\2\u0183\u0185\13\2\2\2\u0184\u0183\3\2\2\2\u0185"+
		"\u0188\3\2\2\2\u0186\u0187\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0189\3\2"+
		"\2\2\u0188\u0186\3\2\2\2\u0189\u018a\7,\2\2\u018a\u018b\7\61\2\2\u018b"+
		"\u018c\3\2\2\2\u018c\u018d\b=\2\2\u018dz\3\2\2\2\u018e\u018f\7\61\2\2"+
		"\u018f\u0190\7\61\2\2\u0190\u0194\3\2\2\2\u0191\u0193\n\7\2\2\u0192\u0191"+
		"\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195"+
		"\u0197\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u0198\b>\2\2\u0198|\3\2\2\2\u0199"+
		"\u019a\7^\2\2\u019a\u019b\t\b\2\2\u019b~\3\2\2\2\13\2\u0122\u0128\u012a"+
		"\u0130\u0139\u017c\u0186\u0194\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}