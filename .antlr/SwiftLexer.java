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
		FOR=11, IN=12, VAR=13, LET=14, NIL=15, BREAK=16, NUMBER=17, STRING=18, 
		ID=19, DIFE=20, IG_IG=21, NOT=22, OR=23, AND=24, IGUAL=25, MAYIG=26, MENIG=27, 
		MAYOR=28, MENOR=29, MULT=30, DIV=31, SUM=32, RES=33, MOD=34, PAR_IZQ=35, 
		PAR_DER=36, LLAVE_IZQ=37, LLAVE_DER=38, DOSPUNTOS=39, COR_IZQ=40, COR_DER=41, 
		COMA=42, CIERRAPREGUNTA=43, PUNTOCOMA=44, PUNTO=45, WHITESPACE=46, COMMENT=47, 
		LINE_COMMENT=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "FLOAT", "BOOL", "STR", "TRU", "FAL", "PRINT", "IF", "ELSE", "WHILE", 
			"FOR", "IN", "VAR", "LET", "NIL", "BREAK", "NUMBER", "STRING", "ID", 
			"DIFE", "IG_IG", "NOT", "OR", "AND", "IGUAL", "MAYIG", "MENIG", "MAYOR", 
			"MENOR", "MULT", "DIV", "SUM", "RES", "MOD", "PAR_IZQ", "PAR_DER", "LLAVE_IZQ", 
			"LLAVE_DER", "DOSPUNTOS", "COR_IZQ", "COR_DER", "COMA", "CIERRAPREGUNTA", 
			"PUNTOCOMA", "PUNTO", "WHITESPACE", "COMMENT", "LINE_COMMENT", "ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Int'", "'Float'", "'Bool'", "'String'", "'true'", "'false'", 
			"'print'", "'if'", "'else'", "'while'", "'for'", "'in'", "'var'", "'let'", 
			"'nil'", "'break'", null, null, null, "'!='", "'=='", "'!'", "'||'", 
			"'&&'", "'='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'+'", "'-'", 
			"'%'", "'('", "')'", "'{'", "'}'", "':'", "'['", "']'", "','", "'?'", 
			"';'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "BOOL", "STR", "TRU", "FAL", "PRINT", "IF", "ELSE", 
			"WHILE", "FOR", "IN", "VAR", "LET", "NIL", "BREAK", "NUMBER", "STRING", 
			"ID", "DIFE", "IG_IG", "NOT", "OR", "AND", "IGUAL", "MAYIG", "MENIG", 
			"MAYOR", "MENOR", "MULT", "DIV", "SUM", "RES", "MOD", "PAR_IZQ", "PAR_DER", 
			"LLAVE_IZQ", "LLAVE_DER", "DOSPUNTOS", "COR_IZQ", "COR_DER", "COMA", 
			"CIERRAPREGUNTA", "PUNTOCOMA", "PUNTO", "WHITESPACE", "COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u012d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\6\22\u00b5\n\22\r\22"+
		"\16\22\u00b6\3\22\3\22\6\22\u00bb\n\22\r\22\16\22\u00bc\5\22\u00bf\n\22"+
		"\3\23\3\23\7\23\u00c3\n\23\f\23\16\23\u00c6\13\23\3\23\3\23\3\24\3\24"+
		"\7\24\u00cc\n\24\f\24\16\24\u00cf\13\24\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$"+
		"\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\6"+
		"/\u010c\n/\r/\16/\u010d\3/\3/\3\60\3\60\3\60\3\60\7\60\u0116\n\60\f\60"+
		"\16\60\u0119\13\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u0124"+
		"\n\61\f\61\16\61\u0127\13\61\3\61\3\61\3\62\3\62\3\62\3\u0117\2\63\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\2\3\2\t\3\2\62;\3\2$$\5\2"+
		"C\\aac|\6\2\62;C\\aac|\6\2\13\f\17\17\"\"^^\4\2\f\f\17\17\t\2\"#%%--/"+
		"\60<<BB]_\2\u0133\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\3e\3\2\2\2\5i\3\2\2\2\7o\3\2\2\2\tt\3\2\2\2\13"+
		"{\3\2\2\2\r\u0080\3\2\2\2\17\u0086\3\2\2\2\21\u008c\3\2\2\2\23\u008f\3"+
		"\2\2\2\25\u0094\3\2\2\2\27\u009a\3\2\2\2\31\u009e\3\2\2\2\33\u00a1\3\2"+
		"\2\2\35\u00a5\3\2\2\2\37\u00a9\3\2\2\2!\u00ad\3\2\2\2#\u00b4\3\2\2\2%"+
		"\u00c0\3\2\2\2\'\u00c9\3\2\2\2)\u00d0\3\2\2\2+\u00d3\3\2\2\2-\u00d6\3"+
		"\2\2\2/\u00d8\3\2\2\2\61\u00db\3\2\2\2\63\u00de\3\2\2\2\65\u00e0\3\2\2"+
		"\2\67\u00e3\3\2\2\29\u00e6\3\2\2\2;\u00e8\3\2\2\2=\u00ea\3\2\2\2?\u00ec"+
		"\3\2\2\2A\u00ee\3\2\2\2C\u00f0\3\2\2\2E\u00f2\3\2\2\2G\u00f4\3\2\2\2I"+
		"\u00f6\3\2\2\2K\u00f8\3\2\2\2M\u00fa\3\2\2\2O\u00fc\3\2\2\2Q\u00fe\3\2"+
		"\2\2S\u0100\3\2\2\2U\u0102\3\2\2\2W\u0104\3\2\2\2Y\u0106\3\2\2\2[\u0108"+
		"\3\2\2\2]\u010b\3\2\2\2_\u0111\3\2\2\2a\u011f\3\2\2\2c\u012a\3\2\2\2e"+
		"f\7K\2\2fg\7p\2\2gh\7v\2\2h\4\3\2\2\2ij\7H\2\2jk\7n\2\2kl\7q\2\2lm\7c"+
		"\2\2mn\7v\2\2n\6\3\2\2\2op\7D\2\2pq\7q\2\2qr\7q\2\2rs\7n\2\2s\b\3\2\2"+
		"\2tu\7U\2\2uv\7v\2\2vw\7t\2\2wx\7k\2\2xy\7p\2\2yz\7i\2\2z\n\3\2\2\2{|"+
		"\7v\2\2|}\7t\2\2}~\7w\2\2~\177\7g\2\2\177\f\3\2\2\2\u0080\u0081\7h\2\2"+
		"\u0081\u0082\7c\2\2\u0082\u0083\7n\2\2\u0083\u0084\7u\2\2\u0084\u0085"+
		"\7g\2\2\u0085\16\3\2\2\2\u0086\u0087\7r\2\2\u0087\u0088\7t\2\2\u0088\u0089"+
		"\7k\2\2\u0089\u008a\7p\2\2\u008a\u008b\7v\2\2\u008b\20\3\2\2\2\u008c\u008d"+
		"\7k\2\2\u008d\u008e\7h\2\2\u008e\22\3\2\2\2\u008f\u0090\7g\2\2\u0090\u0091"+
		"\7n\2\2\u0091\u0092\7u\2\2\u0092\u0093\7g\2\2\u0093\24\3\2\2\2\u0094\u0095"+
		"\7y\2\2\u0095\u0096\7j\2\2\u0096\u0097\7k\2\2\u0097\u0098\7n\2\2\u0098"+
		"\u0099\7g\2\2\u0099\26\3\2\2\2\u009a\u009b\7h\2\2\u009b\u009c\7q\2\2\u009c"+
		"\u009d\7t\2\2\u009d\30\3\2\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7p\2\2\u00a0"+
		"\32\3\2\2\2\u00a1\u00a2\7x\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7t\2\2\u00a4"+
		"\34\3\2\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7v\2\2\u00a8"+
		"\36\3\2\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7n\2\2\u00ac"+
		" \3\2\2\2\u00ad\u00ae\7d\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7g\2\2\u00b0"+
		"\u00b1\7c\2\2\u00b1\u00b2\7m\2\2\u00b2\"\3\2\2\2\u00b3\u00b5\t\2\2\2\u00b4"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00be\3\2\2\2\u00b8\u00ba\7\60\2\2\u00b9\u00bb\t\2\2\2\u00ba"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00bf\3\2\2\2\u00be\u00b8\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"$\3\2\2\2\u00c0\u00c4\7$\2\2\u00c1\u00c3\n\3\2\2\u00c2\u00c1\3\2\2\2\u00c3"+
		"\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2"+
		"\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7$\2\2\u00c8&\3\2\2\2\u00c9\u00cd"+
		"\t\4\2\2\u00ca\u00cc\t\5\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce(\3\2\2\2\u00cf\u00cd\3\2\2\2"+
		"\u00d0\u00d1\7#\2\2\u00d1\u00d2\7?\2\2\u00d2*\3\2\2\2\u00d3\u00d4\7?\2"+
		"\2\u00d4\u00d5\7?\2\2\u00d5,\3\2\2\2\u00d6\u00d7\7#\2\2\u00d7.\3\2\2\2"+
		"\u00d8\u00d9\7~\2\2\u00d9\u00da\7~\2\2\u00da\60\3\2\2\2\u00db\u00dc\7"+
		"(\2\2\u00dc\u00dd\7(\2\2\u00dd\62\3\2\2\2\u00de\u00df\7?\2\2\u00df\64"+
		"\3\2\2\2\u00e0\u00e1\7@\2\2\u00e1\u00e2\7?\2\2\u00e2\66\3\2\2\2\u00e3"+
		"\u00e4\7>\2\2\u00e4\u00e5\7?\2\2\u00e58\3\2\2\2\u00e6\u00e7\7@\2\2\u00e7"+
		":\3\2\2\2\u00e8\u00e9\7>\2\2\u00e9<\3\2\2\2\u00ea\u00eb\7,\2\2\u00eb>"+
		"\3\2\2\2\u00ec\u00ed\7\61\2\2\u00ed@\3\2\2\2\u00ee\u00ef\7-\2\2\u00ef"+
		"B\3\2\2\2\u00f0\u00f1\7/\2\2\u00f1D\3\2\2\2\u00f2\u00f3\7\'\2\2\u00f3"+
		"F\3\2\2\2\u00f4\u00f5\7*\2\2\u00f5H\3\2\2\2\u00f6\u00f7\7+\2\2\u00f7J"+
		"\3\2\2\2\u00f8\u00f9\7}\2\2\u00f9L\3\2\2\2\u00fa\u00fb\7\177\2\2\u00fb"+
		"N\3\2\2\2\u00fc\u00fd\7<\2\2\u00fdP\3\2\2\2\u00fe\u00ff\7]\2\2\u00ffR"+
		"\3\2\2\2\u0100\u0101\7_\2\2\u0101T\3\2\2\2\u0102\u0103\7.\2\2\u0103V\3"+
		"\2\2\2\u0104\u0105\7A\2\2\u0105X\3\2\2\2\u0106\u0107\7=\2\2\u0107Z\3\2"+
		"\2\2\u0108\u0109\7\60\2\2\u0109\\\3\2\2\2\u010a\u010c\t\6\2\2\u010b\u010a"+
		"\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u0110\b/\2\2\u0110^\3\2\2\2\u0111\u0112\7\61\2\2"+
		"\u0112\u0113\7,\2\2\u0113\u0117\3\2\2\2\u0114\u0116\13\2\2\2\u0115\u0114"+
		"\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118"+
		"\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011b\7,\2\2\u011b\u011c\7\61"+
		"\2\2\u011c\u011d\3\2\2\2\u011d\u011e\b\60\2\2\u011e`\3\2\2\2\u011f\u0120"+
		"\7\61\2\2\u0120\u0121\7\61\2\2\u0121\u0125\3\2\2\2\u0122\u0124\n\7\2\2"+
		"\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126"+
		"\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u0129\b\61\2\2"+
		"\u0129b\3\2\2\2\u012a\u012b\7^\2\2\u012b\u012c\t\b\2\2\u012cd\3\2\2\2"+
		"\13\2\u00b6\u00bc\u00be\u00c4\u00cd\u010d\u0117\u0125\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}