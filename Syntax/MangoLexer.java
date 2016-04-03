// Generated from /Users/youyurong/Dropbox/课程/Compiler/Mango/src/Syntax/Mango.g4 by ANTLR 4.5.1
package Syntax;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MangoLexer extends Lexer {
	static {
		RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	public static final int
			T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
			T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, INT = 16, STRING = 17,
			BOOL = 18, NULL = 19, IF = 20, ELSE = 21, ELSEIF = 22, WHILE = 23, FOR = 24, NEW = 25,
			RETURN = 26, BREAK = 27, CONTINUE = 28, PPLUS = 29, MMINUS = 30, MULT = 31, DIV = 32,
			MOD = 33, PLUS = 34, MINUS = 35, SHIFT_L = 36, SHIFT_R = 37, LESS = 38, LARGE = 39,
			LEQ = 40, GEQ = 41, EQ = 42, NEQ = 43, BIT_AND = 44, BIT_XOR = 45, BIT_OR = 46, BIT_NOT = 47,
			LOG_NOT = 48, LOG_AND = 49, LOG_OR = 50, DIM = 51, ID = 52, LINE_COMMENT = 53, WS = 54;
	public static String[] modeNames = {
			"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8",
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "INT", "STRING",
			"ESC", "BOOL", "NULL", "IF", "ELSE", "ELSEIF", "WHILE", "FOR", "NEW",
			"RETURN", "BREAK", "CONTINUE", "PPLUS", "MMINUS", "MULT", "DIV", "MOD",
			"PLUS", "MINUS", "SHIFT_L", "SHIFT_R", "LESS", "LARGE", "LEQ", "GEQ",
			"EQ", "NEQ", "BIT_AND", "BIT_XOR", "BIT_OR", "BIT_NOT", "LOG_NOT", "LOG_AND",
			"LOG_OR", "DIM", "ID", "ID_LETTER", "DIGIT", "LINE_COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
			null, "';'", "'='", "'bool'", "'int'", "'string'", "'void'", "'('", "')'",
			"','", "'{'", "'}'", "'['", "']'", "'.'", "'class'", null, null, null,
			"'null'", "'if'", "'else'", "'else if'", "'while'", "'for'", "'new'",
			"'return'", "'break'", "'continue'", "'++'", "'--'", "'*'", "'/'", "'%'",
			"'+'", "'-'", "'<<'", "'>>'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='",
			"'&'", "'^'", "'|'", "'~'", "'!'", "'&&'", "'||'", "'[]'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
			null, null, null, null, null, null, null, null, null, null, null, null,
			null, null, null, null, "INT", "STRING", "BOOL", "NULL", "IF", "ELSE",
			"ELSEIF", "WHILE", "FOR", "NEW", "RETURN", "BREAK", "CONTINUE", "PPLUS",
			"MMINUS", "MULT", "DIV", "MOD", "PLUS", "MINUS", "SHIFT_L", "SHIFT_R",
			"LESS", "LARGE", "LEQ", "GEQ", "EQ", "NEQ", "BIT_AND", "BIT_XOR", "BIT_OR",
			"BIT_NOT", "LOG_NOT", "LOG_AND", "LOG_OR", "DIM", "ID", "LINE_COMMENT",
			"WS"
	};
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


	public MangoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	@Override
	public String getGrammarFileName() {
		return "Mango.g4";
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public String[] getModeNames() {
		return modeNames;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public static final String _serializedATN =
			"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\28\u0159\b\1\4\2\t" +
					"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
					"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
					"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
					"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
					"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
					",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
					"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\3\3\3\3" +
					"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7" +
					"\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3" +
					"\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\5\21\u00a6\n\21\3\21" +
					"\6\21\u00a9\n\21\r\21\16\21\u00aa\3\22\3\22\3\22\7\22\u00b0\n\22\f\22" +
					"\16\22\u00b3\13\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3" +
					"\24\3\24\3\24\3\24\5\24\u00c3\n\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26" +
					"\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30" +
					"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33" +
					"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36" +
					"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3" +
					"!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3*" +
					"\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62" +
					"\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\7\66\u013a" +
					"\n\66\f\66\16\66\u013d\13\66\3\67\3\67\38\38\39\39\39\39\79\u0147\n9\f" +
					"9\169\u014a\139\39\59\u014d\n9\39\39\39\39\3:\6:\u0154\n:\r:\16:\u0155" +
					"\3:\3:\3\u0148\2;\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31" +
					"\16\33\17\35\20\37\21!\22#\23%\2\'\24)\25+\26-\27/\30\61\31\63\32\65\33" +
					"\67\349\35;\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62e\63g" +
					"\64i\65k\66m\2o\2q\67s8\3\2\7\4\2$$^^\5\2$$^^pp\5\2C\\aac|\3\2\62;\5\2" +
					"\13\f\17\17\"\"\u015f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2" +
					"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25" +
					"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2" +
					"\2\2\2!\3\2\2\2\2#\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2" +
					"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3" +
					"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2" +
					"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2" +
					"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3" +
					"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2" +
					"\2\2q\3\2\2\2\2s\3\2\2\2\3u\3\2\2\2\5w\3\2\2\2\7y\3\2\2\2\t~\3\2\2\2\13" +
					"\u0082\3\2\2\2\r\u0089\3\2\2\2\17\u008e\3\2\2\2\21\u0090\3\2\2\2\23\u0092" +
					"\3\2\2\2\25\u0094\3\2\2\2\27\u0096\3\2\2\2\31\u0098\3\2\2\2\33\u009a\3" +
					"\2\2\2\35\u009c\3\2\2\2\37\u009e\3\2\2\2!\u00a5\3\2\2\2#\u00ac\3\2\2\2" +
					"%\u00b6\3\2\2\2\'\u00c2\3\2\2\2)\u00c4\3\2\2\2+\u00c9\3\2\2\2-\u00cc\3" +
					"\2\2\2/\u00d1\3\2\2\2\61\u00d9\3\2\2\2\63\u00df\3\2\2\2\65\u00e3\3\2\2" +
					"\2\67\u00e7\3\2\2\29\u00ee\3\2\2\2;\u00f4\3\2\2\2=\u00fd\3\2\2\2?\u0100" +
					"\3\2\2\2A\u0103\3\2\2\2C\u0105\3\2\2\2E\u0107\3\2\2\2G\u0109\3\2\2\2I" +
					"\u010b\3\2\2\2K\u010d\3\2\2\2M\u0110\3\2\2\2O\u0113\3\2\2\2Q\u0115\3\2" +
					"\2\2S\u0117\3\2\2\2U\u011a\3\2\2\2W\u011d\3\2\2\2Y\u0120\3\2\2\2[\u0123" +
					"\3\2\2\2]\u0125\3\2\2\2_\u0127\3\2\2\2a\u0129\3\2\2\2c\u012b\3\2\2\2e" +
					"\u012d\3\2\2\2g\u0130\3\2\2\2i\u0133\3\2\2\2k\u0136\3\2\2\2m\u013e\3\2" +
					"\2\2o\u0140\3\2\2\2q\u0142\3\2\2\2s\u0153\3\2\2\2uv\7=\2\2v\4\3\2\2\2" +
					"wx\7?\2\2x\6\3\2\2\2yz\7d\2\2z{\7q\2\2{|\7q\2\2|}\7n\2\2}\b\3\2\2\2~\177" +
					"\7k\2\2\177\u0080\7p\2\2\u0080\u0081\7v\2\2\u0081\n\3\2\2\2\u0082\u0083" +
					"\7u\2\2\u0083\u0084\7v\2\2\u0084\u0085\7t\2\2\u0085\u0086\7k\2\2\u0086" +
					"\u0087\7p\2\2\u0087\u0088\7i\2\2\u0088\f\3\2\2\2\u0089\u008a\7x\2\2\u008a" +
					"\u008b\7q\2\2\u008b\u008c\7k\2\2\u008c\u008d\7f\2\2\u008d\16\3\2\2\2\u008e" +
					"\u008f\7*\2\2\u008f\20\3\2\2\2\u0090\u0091\7+\2\2\u0091\22\3\2\2\2\u0092" +
					"\u0093\7.\2\2\u0093\24\3\2\2\2\u0094\u0095\7}\2\2\u0095\26\3\2\2\2\u0096" +
					"\u0097\7\177\2\2\u0097\30\3\2\2\2\u0098\u0099\7]\2\2\u0099\32\3\2\2\2" +
					"\u009a\u009b\7_\2\2\u009b\34\3\2\2\2\u009c\u009d\7\60\2\2\u009d\36\3\2" +
					"\2\2\u009e\u009f\7e\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2" +
					"\7u\2\2\u00a2\u00a3\7u\2\2\u00a3 \3\2\2\2\u00a4\u00a6\7/\2\2\u00a5\u00a4" +
					"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a9\5o8\2\u00a8" +
					"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2" +
					"\2\2\u00ab\"\3\2\2\2\u00ac\u00b1\7$\2\2\u00ad\u00b0\n\2\2\2\u00ae\u00b0" +
					"\5%\23\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1" +
					"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2" +
					"\2\2\u00b4\u00b5\7$\2\2\u00b5$\3\2\2\2\u00b6\u00b7\7^\2\2\u00b7\u00b8" +
					"\t\3\2\2\u00b8&\3\2\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc" +
					"\7w\2\2\u00bc\u00c3\7g\2\2\u00bd\u00be\7h\2\2\u00be\u00bf\7c\2\2\u00bf" +
					"\u00c0\7n\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c3\7g\2\2\u00c2\u00b9\3\2\2" +
					"\2\u00c2\u00bd\3\2\2\2\u00c3(\3\2\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7" +
					"w\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8\7n\2\2\u00c8*\3\2\2\2\u00c9\u00ca" +
					"\7k\2\2\u00ca\u00cb\7h\2\2\u00cb,\3\2\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce" +
					"\7n\2\2\u00ce\u00cf\7u\2\2\u00cf\u00d0\7g\2\2\u00d0.\3\2\2\2\u00d1\u00d2" +
					"\7g\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7u\2\2\u00d4\u00d5\7g\2\2\u00d5" +
					"\u00d6\7\"\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7h\2\2\u00d8\60\3\2\2\2" +
					"\u00d9\u00da\7y\2\2\u00da\u00db\7j\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd" +
					"\7n\2\2\u00dd\u00de\7g\2\2\u00de\62\3\2\2\2\u00df\u00e0\7h\2\2\u00e0\u00e1" +
					"\7q\2\2\u00e1\u00e2\7t\2\2\u00e2\64\3\2\2\2\u00e3\u00e4\7p\2\2\u00e4\u00e5" +
					"\7g\2\2\u00e5\u00e6\7y\2\2\u00e6\66\3\2\2\2\u00e7\u00e8\7t\2\2\u00e8\u00e9" +
					"\7g\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb\7w\2\2\u00eb\u00ec\7t\2\2\u00ec" +
					"\u00ed\7p\2\2\u00ed8\3\2\2\2\u00ee\u00ef\7d\2\2\u00ef\u00f0\7t\2\2\u00f0" +
					"\u00f1\7g\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3\7m\2\2\u00f3:\3\2\2\2\u00f4" +
					"\u00f5\7e\2\2\u00f5\u00f6\7q\2\2\u00f6\u00f7\7p\2\2\u00f7\u00f8\7v\2\2" +
					"\u00f8\u00f9\7k\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fb\7w\2\2\u00fb\u00fc" +
					"\7g\2\2\u00fc<\3\2\2\2\u00fd\u00fe\7-\2\2\u00fe\u00ff\7-\2\2\u00ff>\3" +
					"\2\2\2\u0100\u0101\7/\2\2\u0101\u0102\7/\2\2\u0102@\3\2\2\2\u0103\u0104" +
					"\7,\2\2\u0104B\3\2\2\2\u0105\u0106\7\61\2\2\u0106D\3\2\2\2\u0107\u0108" +
					"\7\'\2\2\u0108F\3\2\2\2\u0109\u010a\7-\2\2\u010aH\3\2\2\2\u010b\u010c" +
					"\7/\2\2\u010cJ\3\2\2\2\u010d\u010e\7>\2\2\u010e\u010f\7>\2\2\u010fL\3" +
					"\2\2\2\u0110\u0111\7@\2\2\u0111\u0112\7@\2\2\u0112N\3\2\2\2\u0113\u0114" +
					"\7>\2\2\u0114P\3\2\2\2\u0115\u0116\7@\2\2\u0116R\3\2\2\2\u0117\u0118\7" +
					">\2\2\u0118\u0119\7?\2\2\u0119T\3\2\2\2\u011a\u011b\7@\2\2\u011b\u011c" +
					"\7?\2\2\u011cV\3\2\2\2\u011d\u011e\7?\2\2\u011e\u011f\7?\2\2\u011fX\3" +
					"\2\2\2\u0120\u0121\7#\2\2\u0121\u0122\7?\2\2\u0122Z\3\2\2\2\u0123\u0124" +
					"\7(\2\2\u0124\\\3\2\2\2\u0125\u0126\7`\2\2\u0126^\3\2\2\2\u0127\u0128" +
					"\7~\2\2\u0128`\3\2\2\2\u0129\u012a\7\u0080\2\2\u012ab\3\2\2\2\u012b\u012c" +
					"\7#\2\2\u012cd\3\2\2\2\u012d\u012e\7(\2\2\u012e\u012f\7(\2\2\u012ff\3" +
					"\2\2\2\u0130\u0131\7~\2\2\u0131\u0132\7~\2\2\u0132h\3\2\2\2\u0133\u0134" +
					"\7]\2\2\u0134\u0135\7_\2\2\u0135j\3\2\2\2\u0136\u013b\5m\67\2\u0137\u013a" +
					"\5m\67\2\u0138\u013a\5o8\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a" +
					"\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013cl\3\2\2\2" +
					"\u013d\u013b\3\2\2\2\u013e\u013f\t\4\2\2\u013fn\3\2\2\2\u0140\u0141\t" +
					"\5\2\2\u0141p\3\2\2\2\u0142\u0143\7\61\2\2\u0143\u0144\7\61\2\2\u0144" +
					"\u0148\3\2\2\2\u0145\u0147\13\2\2\2\u0146\u0145\3\2\2\2\u0147\u014a\3" +
					"\2\2\2\u0148\u0149\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014c\3\2\2\2\u014a" +
					"\u0148\3\2\2\2\u014b\u014d\7\17\2\2\u014c\u014b\3\2\2\2\u014c\u014d\3" +
					"\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\7\f\2\2\u014f\u0150\3\2\2\2\u0150" +
					"\u0151\b9\2\2\u0151r\3\2\2\2\u0152\u0154\t\6\2\2\u0153\u0152\3\2\2\2\u0154" +
					"\u0155\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2" +
					"\2\2\u0157\u0158\b:\2\2\u0158t\3\2\2\2\r\2\u00a5\u00aa\u00af\u00b1\u00c2" +
					"\u0139\u013b\u0148\u014c\u0155\3\b\2\2";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}