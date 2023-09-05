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
		FOR=11, IN=12, VAR=13, LET=14, NIL=15, NUMBER=16, STRING=17, ID=18, DIFE=19, 
		IG_IG=20, NOT=21, OR=22, AND=23, IGUAL=24, MAYIG=25, MENIG=26, MAYOR=27, 
		MENOR=28, MULT=29, DIV=30, SUM=31, RES=32, MOD=33, PAR_IZQ=34, PAR_DER=35, 
		LLAVE_IZQ=36, LLAVE_DER=37, DOSPUNTOS=38, COR_IZQ=39, COR_DER=40, COMA=41, 
		CIERRAPREGUNTA=42, PUNTOCOMA=43, PUNTO=44, WHITESPACE=45, COMMENT=46, 
		LINE_COMMENT=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "FLOAT", "BOOL", "STR", "TRU", "FAL", "PRINT", "IF", "ELSE", "WHILE", 
			"FOR", "IN", "VAR", "LET", "NIL", "NUMBER", "STRING", "ID", "DIFE", "IG_IG", 
			"NOT", "OR", "AND", "IGUAL", "MAYIG", "MENIG", "MAYOR", "MENOR", "MULT", 
			"DIV", "SUM", "RES", "MOD", "PAR_IZQ", "PAR_DER", "LLAVE_IZQ", "LLAVE_DER", 
			"DOSPUNTOS", "COR_IZQ", "COR_DER", "COMA", "CIERRAPREGUNTA", "PUNTOCOMA", 
			"PUNTO", "WHITESPACE", "COMMENT", "LINE_COMMENT", "ESC_SEQ"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u0125\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\21\6\21\u00ad\n\21\r\21\16\21\u00ae\3\21\3\21\6\21\u00b3\n\21\r"+
		"\21\16\21\u00b4\5\21\u00b7\n\21\3\22\3\22\7\22\u00bb\n\22\f\22\16\22\u00be"+
		"\13\22\3\22\3\22\3\23\3\23\7\23\u00c4\n\23\f\23\16\23\u00c7\13\23\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)"+
		"\3*\3*\3+\3+\3,\3,\3-\3-\3.\6.\u0104\n.\r.\16.\u0105\3.\3.\3/\3/\3/\3"+
		"/\7/\u010e\n/\f/\16/\u0111\13/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\7\60"+
		"\u011c\n\60\f\60\16\60\u011f\13\60\3\60\3\60\3\61\3\61\3\61\3\u010f\2"+
		"\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\2\3\2\t\3\2\62;\3\2$$"+
		"\5\2C\\aac|\6\2\62;C\\aac|\6\2\13\f\17\17\"\"^^\4\2\f\f\17\17\t\2\"#%"+
		"%--/\60<<BB]_\2\u012b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\3c\3\2\2\2\5g\3\2\2\2\7m\3\2\2\2\tr\3\2\2\2\13y\3\2"+
		"\2\2\r~\3\2\2\2\17\u0084\3\2\2\2\21\u008a\3\2\2\2\23\u008d\3\2\2\2\25"+
		"\u0092\3\2\2\2\27\u0098\3\2\2\2\31\u009c\3\2\2\2\33\u009f\3\2\2\2\35\u00a3"+
		"\3\2\2\2\37\u00a7\3\2\2\2!\u00ac\3\2\2\2#\u00b8\3\2\2\2%\u00c1\3\2\2\2"+
		"\'\u00c8\3\2\2\2)\u00cb\3\2\2\2+\u00ce\3\2\2\2-\u00d0\3\2\2\2/\u00d3\3"+
		"\2\2\2\61\u00d6\3\2\2\2\63\u00d8\3\2\2\2\65\u00db\3\2\2\2\67\u00de\3\2"+
		"\2\29\u00e0\3\2\2\2;\u00e2\3\2\2\2=\u00e4\3\2\2\2?\u00e6\3\2\2\2A\u00e8"+
		"\3\2\2\2C\u00ea\3\2\2\2E\u00ec\3\2\2\2G\u00ee\3\2\2\2I\u00f0\3\2\2\2K"+
		"\u00f2\3\2\2\2M\u00f4\3\2\2\2O\u00f6\3\2\2\2Q\u00f8\3\2\2\2S\u00fa\3\2"+
		"\2\2U\u00fc\3\2\2\2W\u00fe\3\2\2\2Y\u0100\3\2\2\2[\u0103\3\2\2\2]\u0109"+
		"\3\2\2\2_\u0117\3\2\2\2a\u0122\3\2\2\2cd\7K\2\2de\7p\2\2ef\7v\2\2f\4\3"+
		"\2\2\2gh\7H\2\2hi\7n\2\2ij\7q\2\2jk\7c\2\2kl\7v\2\2l\6\3\2\2\2mn\7D\2"+
		"\2no\7q\2\2op\7q\2\2pq\7n\2\2q\b\3\2\2\2rs\7U\2\2st\7v\2\2tu\7t\2\2uv"+
		"\7k\2\2vw\7p\2\2wx\7i\2\2x\n\3\2\2\2yz\7v\2\2z{\7t\2\2{|\7w\2\2|}\7g\2"+
		"\2}\f\3\2\2\2~\177\7h\2\2\177\u0080\7c\2\2\u0080\u0081\7n\2\2\u0081\u0082"+
		"\7u\2\2\u0082\u0083\7g\2\2\u0083\16\3\2\2\2\u0084\u0085\7r\2\2\u0085\u0086"+
		"\7t\2\2\u0086\u0087\7k\2\2\u0087\u0088\7p\2\2\u0088\u0089\7v\2\2\u0089"+
		"\20\3\2\2\2\u008a\u008b\7k\2\2\u008b\u008c\7h\2\2\u008c\22\3\2\2\2\u008d"+
		"\u008e\7g\2\2\u008e\u008f\7n\2\2\u008f\u0090\7u\2\2\u0090\u0091\7g\2\2"+
		"\u0091\24\3\2\2\2\u0092\u0093\7y\2\2\u0093\u0094\7j\2\2\u0094\u0095\7"+
		"k\2\2\u0095\u0096\7n\2\2\u0096\u0097\7g\2\2\u0097\26\3\2\2\2\u0098\u0099"+
		"\7h\2\2\u0099\u009a\7q\2\2\u009a\u009b\7t\2\2\u009b\30\3\2\2\2\u009c\u009d"+
		"\7k\2\2\u009d\u009e\7p\2\2\u009e\32\3\2\2\2\u009f\u00a0\7x\2\2\u00a0\u00a1"+
		"\7c\2\2\u00a1\u00a2\7t\2\2\u00a2\34\3\2\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5"+
		"\7g\2\2\u00a5\u00a6\7v\2\2\u00a6\36\3\2\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9"+
		"\7k\2\2\u00a9\u00aa\7n\2\2\u00aa \3\2\2\2\u00ab\u00ad\t\2\2\2\u00ac\u00ab"+
		"\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b6\3\2\2\2\u00b0\u00b2\7\60\2\2\u00b1\u00b3\t\2\2\2\u00b2\u00b1\3"+
		"\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b7\3\2\2\2\u00b6\u00b0\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\"\3\2\2\2"+
		"\u00b8\u00bc\7$\2\2\u00b9\u00bb\n\3\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00be"+
		"\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00bf\u00c0\7$\2\2\u00c0$\3\2\2\2\u00c1\u00c5\t\4\2\2\u00c2"+
		"\u00c4\t\5\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6&\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9"+
		"\7#\2\2\u00c9\u00ca\7?\2\2\u00ca(\3\2\2\2\u00cb\u00cc\7?\2\2\u00cc\u00cd"+
		"\7?\2\2\u00cd*\3\2\2\2\u00ce\u00cf\7#\2\2\u00cf,\3\2\2\2\u00d0\u00d1\7"+
		"~\2\2\u00d1\u00d2\7~\2\2\u00d2.\3\2\2\2\u00d3\u00d4\7(\2\2\u00d4\u00d5"+
		"\7(\2\2\u00d5\60\3\2\2\2\u00d6\u00d7\7?\2\2\u00d7\62\3\2\2\2\u00d8\u00d9"+
		"\7@\2\2\u00d9\u00da\7?\2\2\u00da\64\3\2\2\2\u00db\u00dc\7>\2\2\u00dc\u00dd"+
		"\7?\2\2\u00dd\66\3\2\2\2\u00de\u00df\7@\2\2\u00df8\3\2\2\2\u00e0\u00e1"+
		"\7>\2\2\u00e1:\3\2\2\2\u00e2\u00e3\7,\2\2\u00e3<\3\2\2\2\u00e4\u00e5\7"+
		"\61\2\2\u00e5>\3\2\2\2\u00e6\u00e7\7-\2\2\u00e7@\3\2\2\2\u00e8\u00e9\7"+
		"/\2\2\u00e9B\3\2\2\2\u00ea\u00eb\7\'\2\2\u00ebD\3\2\2\2\u00ec\u00ed\7"+
		"*\2\2\u00edF\3\2\2\2\u00ee\u00ef\7+\2\2\u00efH\3\2\2\2\u00f0\u00f1\7}"+
		"\2\2\u00f1J\3\2\2\2\u00f2\u00f3\7\177\2\2\u00f3L\3\2\2\2\u00f4\u00f5\7"+
		"<\2\2\u00f5N\3\2\2\2\u00f6\u00f7\7]\2\2\u00f7P\3\2\2\2\u00f8\u00f9\7_"+
		"\2\2\u00f9R\3\2\2\2\u00fa\u00fb\7.\2\2\u00fbT\3\2\2\2\u00fc\u00fd\7A\2"+
		"\2\u00fdV\3\2\2\2\u00fe\u00ff\7=\2\2\u00ffX\3\2\2\2\u0100\u0101\7\60\2"+
		"\2\u0101Z\3\2\2\2\u0102\u0104\t\6\2\2\u0103\u0102\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0108\b.\2\2\u0108\\\3\2\2\2\u0109\u010a\7\61\2\2\u010a\u010b\7,\2\2"+
		"\u010b\u010f\3\2\2\2\u010c\u010e\13\2\2\2\u010d\u010c\3\2\2\2\u010e\u0111"+
		"\3\2\2\2\u010f\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0112\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0112\u0113\7,\2\2\u0113\u0114\7\61\2\2\u0114\u0115\3\2"+
		"\2\2\u0115\u0116\b/\2\2\u0116^\3\2\2\2\u0117\u0118\7\61\2\2\u0118\u0119"+
		"\7\61\2\2\u0119\u011d\3\2\2\2\u011a\u011c\n\7\2\2\u011b\u011a\3\2\2\2"+
		"\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120"+
		"\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\b\60\2\2\u0121`\3\2\2\2\u0122"+
		"\u0123\7^\2\2\u0123\u0124\t\b\2\2\u0124b\3\2\2\2\13\2\u00ae\u00b4\u00b6"+
		"\u00bc\u00c5\u0105\u010f\u011d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}