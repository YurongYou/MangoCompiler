// Generated from /Users/youyurong/Dropbox/course/Compiler/Mango/src/cn/ficos/Compiler/Syntax/Mango.g4 by ANTLR 4.5.1
package cn.ficos.Compiler.Syntax;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MangoParser extends Parser {
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, INT = 16, STRING = 17,
            BOOL = 18, NULL = 19, IF = 20, ELSE = 21, ELSEIF = 22, WHILE = 23, FOR = 24, NEW = 25,
            RETURN = 26, BREAK = 27, CONTINUE = 28, PPLUS = 29, MMINUS = 30, MULT = 31, DIV = 32,
            MOD = 33, PLUS = 34, MINUS = 35, SHIFT_L = 36, SHIFT_R = 37, LESS = 38, LARGE = 39,
            LEQ = 40, GEQ = 41, EQ = 42, NEQ = 43, BIT_AND = 44, BIT_XOR = 45, BIT_OR = 46, BIT_NOT = 47,
            LOG_NOT = 48, LOG_AND = 49, LOG_OR = 50, DIM = 51, ID = 52, LINE_COMMENT = 53, WS = 54;
    public static final int
            RULE_prog = 0, RULE_decl = 1, RULE_varDecl = 2, RULE_atom = 3, RULE_type = 4,
            RULE_funcDecl = 5, RULE_formalParameterList = 6, RULE_formalParameter = 7,
            RULE_block = 8, RULE_stmt = 9, RULE_jump = 10, RULE_selection = 11, RULE_subSelection = 12,
            RULE_iteration = 13, RULE_expr = 14, RULE_creationExpr = 15, RULE_exprList = 16,
            RULE_classDecl = 17, RULE_classBlock = 18, RULE_memberDecl = 19, RULE_constant = 20;
    public static final String[] ruleNames = {
            "prog", "decl", "varDecl", "atom", "type", "funcDecl", "formalParameterList",
            "formalParameter", "block", "stmt", "jump", "selection", "subSelection",
            "iteration", "expr", "creationExpr", "exprList", "classDecl", "classBlock",
            "memberDecl", "constant"
    };
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\38\u012f\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\7\2.\n\2\f\2\16\2\61\13\2" +
                    "\3\3\3\3\3\3\5\3\66\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4B\n" +
                    "\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6K\n\6\f\6\16\6N\13\6\3\7\3\7\5\7R\n" +
                    "\7\3\7\3\7\3\7\5\7W\n\7\3\7\3\7\3\7\3\b\3\b\3\b\7\b_\n\b\f\b\16\bb\13" +
                    "\b\3\t\3\t\3\t\3\n\3\n\7\ni\n\n\f\n\16\nl\13\n\3\n\3\n\3\13\3\13\3\13" +
                    "\3\13\3\13\3\13\3\13\3\13\3\13\5\13y\n\13\3\f\3\f\5\f}\n\f\3\f\3\f\3\f" +
                    "\3\f\3\f\5\f\u0084\n\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u008c\n\r\f\r\16\r" +
                    "\u008f\13\r\3\r\3\r\5\r\u0093\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3" +
                    "\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a4\n\17\3\17\3\17\5\17" +
                    "\u00a8\n\17\3\17\3\17\5\17\u00ac\n\17\3\17\3\17\5\17\u00b0\n\17\3\20\3" +
                    "\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3" +
                    "\20\3\20\3\20\5\20\u00c4\n\20\3\20\3\20\5\20\u00c8\n\20\3\20\3\20\3\20" +
                    "\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20" +
                    "\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20" +
                    "\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20" +
                    "\3\20\3\20\3\20\5\20\u00fa\n\20\3\20\7\20\u00fd\n\20\f\20\16\20\u0100" +
                    "\13\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0108\n\21\f\21\16\21\u010b" +
                    "\13\21\3\21\3\21\5\21\u010f\n\21\3\22\3\22\3\22\7\22\u0114\n\22\f\22\16" +
                    "\22\u0117\13\22\3\23\3\23\3\23\3\23\3\24\3\24\7\24\u011f\n\24\f\24\16" +
                    "\24\u0122\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u012b\n\25\3\26" +
                    "\3\26\3\26\2\4\n\36\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2" +
                    "\n\4\2\5\7\66\66\3\2\37 \3\2$%\3\2!#\3\2&\'\3\2(+\3\2,-\3\2\22\25\u014f" +
                    "\2/\3\2\2\2\4\65\3\2\2\2\6A\3\2\2\2\bC\3\2\2\2\nE\3\2\2\2\fQ\3\2\2\2\16" +
                    "[\3\2\2\2\20c\3\2\2\2\22f\3\2\2\2\24x\3\2\2\2\26\u0083\3\2\2\2\30\u0085" +
                    "\3\2\2\2\32\u0094\3\2\2\2\34\u00af\3\2\2\2\36\u00c7\3\2\2\2 \u010e\3\2" +
                    "\2\2\"\u0110\3\2\2\2$\u0118\3\2\2\2&\u011c\3\2\2\2(\u012a\3\2\2\2*\u012c" +
                    "\3\2\2\2,.\5\4\3\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\3\3" +
                    "\2\2\2\61/\3\2\2\2\62\66\5\6\4\2\63\66\5\f\7\2\64\66\5$\23\2\65\62\3\2" +
                    "\2\2\65\63\3\2\2\2\65\64\3\2\2\2\66\5\3\2\2\2\678\5\n\6\289\7\66\2\29" +
                    ":\7\3\2\2:B\3\2\2\2;<\5\n\6\2<=\7\66\2\2=>\7\4\2\2>?\5\36\20\2?@\7\3\2" +
                    "\2@B\3\2\2\2A\67\3\2\2\2A;\3\2\2\2B\7\3\2\2\2CD\t\2\2\2D\t\3\2\2\2EF\b" +
                    "\6\1\2FG\5\b\5\2GL\3\2\2\2HI\f\3\2\2IK\7\65\2\2JH\3\2\2\2KN\3\2\2\2LJ" +
                    "\3\2\2\2LM\3\2\2\2M\13\3\2\2\2NL\3\2\2\2OR\5\n\6\2PR\7\b\2\2QO\3\2\2\2" +
                    "QP\3\2\2\2RS\3\2\2\2ST\7\66\2\2TV\7\t\2\2UW\5\16\b\2VU\3\2\2\2VW\3\2\2" +
                    "\2WX\3\2\2\2XY\7\n\2\2YZ\5\22\n\2Z\r\3\2\2\2[`\5\20\t\2\\]\7\13\2\2]_" +
                    "\5\20\t\2^\\\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\17\3\2\2\2b`\3\2\2" +
                    "\2cd\5\n\6\2de\7\66\2\2e\21\3\2\2\2fj\7\f\2\2gi\5\24\13\2hg\3\2\2\2il" +
                    "\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7\r\2\2n\23\3\2\2\2" +
                    "oy\7\3\2\2pq\5\36\20\2qr\7\3\2\2ry\3\2\2\2sy\5\22\n\2ty\5\30\r\2uy\5\34" +
                    "\17\2vy\5\26\f\2wy\5\6\4\2xo\3\2\2\2xp\3\2\2\2xs\3\2\2\2xt\3\2\2\2xu\3" +
                    "\2\2\2xv\3\2\2\2xw\3\2\2\2y\25\3\2\2\2z|\7\34\2\2{}\5\36\20\2|{\3\2\2" +
                    "\2|}\3\2\2\2}~\3\2\2\2~\u0084\7\3\2\2\177\u0080\7\35\2\2\u0080\u0084\7" +
                    "\3\2\2\u0081\u0082\7\36\2\2\u0082\u0084\7\3\2\2\u0083z\3\2\2\2\u0083\177" +
                    "\3\2\2\2\u0083\u0081\3\2\2\2\u0084\27\3\2\2\2\u0085\u0086\7\26\2\2\u0086" +
                    "\u0087\7\t\2\2\u0087\u0088\5\36\20\2\u0088\u0089\7\n\2\2\u0089\u008d\5" +
                    "\24\13\2\u008a\u008c\5\32\16\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2" +
                    "\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0092\3\2\2\2\u008f\u008d" +
                    "\3\2\2\2\u0090\u0091\7\27\2\2\u0091\u0093\5\24\13\2\u0092\u0090\3\2\2" +
                    "\2\u0092\u0093\3\2\2\2\u0093\31\3\2\2\2\u0094\u0095\7\30\2\2\u0095\u0096" +
                    "\7\t\2\2\u0096\u0097\5\36\20\2\u0097\u0098\7\n\2\2\u0098\u0099\5\24\13" +
                    "\2\u0099\33\3\2\2\2\u009a\u009b\7\31\2\2\u009b\u009c\7\t\2\2\u009c\u009d" +
                    "\5\36\20\2\u009d\u009e\7\n\2\2\u009e\u009f\5\24\13\2\u009f\u00b0\3\2\2" +
                    "\2\u00a0\u00a1\7\32\2\2\u00a1\u00a3\7\t\2\2\u00a2\u00a4\5\36\20\2\u00a3" +
                    "\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\7\3" +
                    "\2\2\u00a6\u00a8\5\36\20\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8" +
                    "\u00a9\3\2\2\2\u00a9\u00ab\7\3\2\2\u00aa\u00ac\5\36\20\2\u00ab\u00aa\3" +
                    "\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7\n\2\2\u00ae" +
                    "\u00b0\5\24\13\2\u00af\u009a\3\2\2\2\u00af\u00a0\3\2\2\2\u00b0\35\3\2" +
                    "\2\2\u00b1\u00b2\b\20\1\2\u00b2\u00b3\t\3\2\2\u00b3\u00c8\5\36\20\22\u00b4" +
                    "\u00b5\t\4\2\2\u00b5\u00c8\5\36\20\21\u00b6\u00b7\7\62\2\2\u00b7\u00c8" +
                    "\5\36\20\20\u00b8\u00b9\7\61\2\2\u00b9\u00c8\5\36\20\17\u00ba\u00bb\7" +
                    "\t\2\2\u00bb\u00bc\5\36\20\2\u00bc\u00bd\7\n\2\2\u00bd\u00c8\3\2\2\2\u00be" +
                    "\u00c8\5*\26\2\u00bf\u00c8\7\66\2\2\u00c0\u00c1\7\66\2\2\u00c1\u00c3\7" +
                    "\t\2\2\u00c2\u00c4\5\"\22\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4" +
                    "\u00c5\3\2\2\2\u00c5\u00c8\7\n\2\2\u00c6\u00c8\5 \21\2\u00c7\u00b1\3\2" +
                    "\2\2\u00c7\u00b4\3\2\2\2\u00c7\u00b6\3\2\2\2\u00c7\u00b8\3\2\2\2\u00c7" +
                    "\u00ba\3\2\2\2\u00c7\u00be\3\2\2\2\u00c7\u00bf\3\2\2\2\u00c7\u00c0\3\2" +
                    "\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00fe\3\2\2\2\u00c9\u00ca\f\r\2\2\u00ca" +
                    "\u00cb\t\5\2\2\u00cb\u00fd\5\36\20\16\u00cc\u00cd\f\f\2\2\u00cd\u00ce" +
                    "\t\4\2\2\u00ce\u00fd\5\36\20\r\u00cf\u00d0\f\13\2\2\u00d0\u00d1\t\6\2" +
                    "\2\u00d1\u00fd\5\36\20\f\u00d2\u00d3\f\n\2\2\u00d3\u00d4\t\7\2\2\u00d4" +
                    "\u00fd\5\36\20\13\u00d5\u00d6\f\t\2\2\u00d6\u00d7\t\b\2\2\u00d7\u00fd" +
                    "\5\36\20\n\u00d8\u00d9\f\b\2\2\u00d9\u00da\7.\2\2\u00da\u00fd\5\36\20" +
                    "\t\u00db\u00dc\f\7\2\2\u00dc\u00dd\7/\2\2\u00dd\u00fd\5\36\20\b\u00de" +
                    "\u00df\f\6\2\2\u00df\u00e0\7\60\2\2\u00e0\u00fd\5\36\20\7\u00e1\u00e2" +
                    "\f\5\2\2\u00e2\u00e3\7\63\2\2\u00e3\u00fd\5\36\20\6\u00e4\u00e5\f\4\2" +
                    "\2\u00e5\u00e6\7\64\2\2\u00e6\u00fd\5\36\20\5\u00e7\u00e8\f\3\2\2\u00e8" +
                    "\u00e9\7\4\2\2\u00e9\u00fd\5\36\20\3\u00ea\u00eb\f\27\2\2\u00eb\u00fd" +
                    "\t\3\2\2\u00ec\u00ed\f\25\2\2\u00ed\u00ee\7\16\2\2\u00ee\u00ef\5\36\20" +
                    "\2\u00ef\u00f0\7\17\2\2\u00f0\u00fd\3\2\2\2\u00f1\u00f2\f\24\2\2\u00f2" +
                    "\u00f3\7\20\2\2\u00f3\u00fd\7\66\2\2\u00f4\u00f5\f\23\2\2\u00f5\u00f6" +
                    "\7\20\2\2\u00f6\u00f7\7\66\2\2\u00f7\u00f9\7\t\2\2\u00f8\u00fa\5\"\22" +
                    "\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd" +
                    "\7\n\2\2\u00fc\u00c9\3\2\2\2\u00fc\u00cc\3\2\2\2\u00fc\u00cf\3\2\2\2\u00fc" +
                    "\u00d2\3\2\2\2\u00fc\u00d5\3\2\2\2\u00fc\u00d8\3\2\2\2\u00fc\u00db\3\2" +
                    "\2\2\u00fc\u00de\3\2\2\2\u00fc\u00e1\3\2\2\2\u00fc\u00e4\3\2\2\2\u00fc" +
                    "\u00e7\3\2\2\2\u00fc\u00ea\3\2\2\2\u00fc\u00ec\3\2\2\2\u00fc\u00f1\3\2" +
                    "\2\2\u00fc\u00f4\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe" +
                    "\u00ff\3\2\2\2\u00ff\37\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\7\33\2" +
                    "\2\u0102\u0103\5\b\5\2\u0103\u0104\7\16\2\2\u0104\u0105\5\36\20\2\u0105" +
                    "\u0109\7\17\2\2\u0106\u0108\7\65\2\2\u0107\u0106\3\2\2\2\u0108\u010b\3" +
                    "\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010f\3\2\2\2\u010b" +
                    "\u0109\3\2\2\2\u010c\u010d\7\33\2\2\u010d\u010f\5\b\5\2\u010e\u0101\3" +
                    "\2\2\2\u010e\u010c\3\2\2\2\u010f!\3\2\2\2\u0110\u0115\5\36\20\2\u0111" +
                    "\u0112\7\13\2\2\u0112\u0114\5\36\20\2\u0113\u0111\3\2\2\2\u0114\u0117" +
                    "\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116#\3\2\2\2\u0117" +
                    "\u0115\3\2\2\2\u0118\u0119\7\21\2\2\u0119\u011a\7\66\2\2\u011a\u011b\5" +
                    "&\24\2\u011b%\3\2\2\2\u011c\u0120\7\f\2\2\u011d\u011f\5(\25\2\u011e\u011d" +
                    "\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121" +
                    "\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\7\r\2\2\u0124\'\3\2\2\2" +
                    "\u0125\u0126\5\n\6\2\u0126\u0127\7\66\2\2\u0127\u0128\7\3\2\2\u0128\u012b" +
                    "\3\2\2\2\u0129\u012b\5\f\7\2\u012a\u0125\3\2\2\2\u012a\u0129\3\2\2\2\u012b" +
                    ")\3\2\2\2\u012c\u012d\t\t\2\2\u012d+\3\2\2\2\35/\65ALQV`jx|\u0083\u008d" +
                    "\u0092\u00a3\u00a7\u00ab\u00af\u00c3\u00c7\u00f9\u00fc\u00fe\u0109\u010e" +
                    "\u0115\u0120\u012a";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
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

    static {
        RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION);
    }

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

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public MangoParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
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
    public ATN getATN() {
        return _ATN;
    }

    public final ProgContext prog() throws RecognitionException {
        ProgContext _localctx = new ProgContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_prog);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(45);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__14) | (1L << ID))) != 0)) {
                    {
                        {
                            setState(42);
                            decl();
                        }
                    }
                    setState(47);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final DeclContext decl() throws RecognitionException {
        DeclContext _localctx = new DeclContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_decl);
        try {
            setState(51);
            switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(48);
                    varDecl();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(49);
                    funcDecl();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(50);
                    classDecl();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final VarDeclContext varDecl() throws RecognitionException {
        VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_varDecl);
        try {
            setState(63);
            switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(53);
                    type(0);
                    setState(54);
                    match(ID);
                    setState(55);
                    match(T__0);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(57);
                    type(0);
                    setState(58);
                    match(ID);
                    setState(59);
                    match(T__1);
                    setState(60);
                    expr(0);
                    setState(61);
                    match(T__0);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final AtomContext atom() throws RecognitionException {
        AtomContext _localctx = new AtomContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_atom);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(65);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << ID))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TypeContext type() throws RecognitionException {
        return type(0);
    }

    private TypeContext type(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        TypeContext _localctx = new TypeContext(_ctx, _parentState);
        TypeContext _prevctx = _localctx;
        int _startState = 8;
        enterRecursionRule(_localctx, 8, RULE_type, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(68);
                    atom();
                }
                _ctx.stop = _input.LT(-1);
                setState(74);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new TypeContext(_parentctx, _parentState);
                                pushNewRecursionContext(_localctx, _startState, RULE_type);
                                setState(70);
                                if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                                setState(71);
                                match(DIM);
                            }
                        }
                    }
                    setState(76);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public final FuncDeclContext funcDecl() throws RecognitionException {
        FuncDeclContext _localctx = new FuncDeclContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_funcDecl);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(79);
                switch (_input.LA(1)) {
                    case T__2:
                    case T__3:
                    case T__4:
                    case ID: {
                        setState(77);
                        type(0);
                    }
                    break;
                    case T__5: {
                        setState(78);
                        match(T__5);
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(81);
                match(ID);
                setState(82);
                match(T__6);
                setState(84);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << ID))) != 0)) {
                    {
                        setState(83);
                        formalParameterList();
                    }
                }

                setState(86);
                match(T__7);
                setState(87);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FormalParameterListContext formalParameterList() throws RecognitionException {
        FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_formalParameterList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(89);
                formalParameter();
                setState(94);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__8) {
                    {
                        {
                            setState(90);
                            match(T__8);
                            setState(91);
                            formalParameter();
                        }
                    }
                    setState(96);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FormalParameterContext formalParameter() throws RecognitionException {
        FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_formalParameter);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(97);
                type(0);
                setState(98);
                match(ID);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final BlockContext block() throws RecognitionException {
        BlockContext _localctx = new BlockContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_block);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(100);
                match(T__9);
                setState(104);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__9) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << NULL) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << NEW) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << PPLUS) | (1L << MMINUS) | (1L << PLUS) | (1L << MINUS) | (1L << BIT_NOT) | (1L << LOG_NOT) | (1L << ID))) != 0)) {
                    {
                        {
                            setState(101);
                            stmt();
                        }
                    }
                    setState(106);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(107);
                match(T__10);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final StmtContext stmt() throws RecognitionException {
        StmtContext _localctx = new StmtContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_stmt);
        try {
            setState(118);
            switch (getInterpreter().adaptivePredict(_input, 8, _ctx)) {
                case 1:
                    _localctx = new EmptyStmtContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(109);
                    match(T__0);
                }
                break;
                case 2:
                    _localctx = new ExprStmtContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(110);
                    expr(0);
                    setState(111);
                    match(T__0);
                }
                break;
                case 3:
                    _localctx = new CompoundStmtContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(113);
                    block();
                }
                break;
                case 4:
                    _localctx = new SelectionStmtContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(114);
                    selection();
                }
                break;
                case 5:
                    _localctx = new IterationStmtContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(115);
                    iteration();
                }
                break;
                case 6:
                    _localctx = new JumpStmtContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(116);
                    jump();
                }
                break;
                case 7:
                    _localctx = new VarDeclStmtContext(_localctx);
                    enterOuterAlt(_localctx, 7);
                {
                    setState(117);
                    varDecl();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final JumpContext jump() throws RecognitionException {
        JumpContext _localctx = new JumpContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_jump);
        int _la;
        try {
            setState(129);
            switch (_input.LA(1)) {
                case RETURN:
                    _localctx = new ReturnStmtContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(120);
                    match(RETURN);
                    setState(122);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << NULL) | (1L << NEW) | (1L << PPLUS) | (1L << MMINUS) | (1L << PLUS) | (1L << MINUS) | (1L << BIT_NOT) | (1L << LOG_NOT) | (1L << ID))) != 0)) {
                        {
                            setState(121);
                            expr(0);
                        }
                    }

                    setState(124);
                    match(T__0);
                }
                break;
                case BREAK:
                    _localctx = new BreakStmtContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(125);
                    match(BREAK);
                    setState(126);
                    match(T__0);
                }
                break;
                case CONTINUE:
                    _localctx = new ContinueStmtContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(127);
                    match(CONTINUE);
                    setState(128);
                    match(T__0);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final SelectionContext selection() throws RecognitionException {
        SelectionContext _localctx = new SelectionContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_selection);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(131);
                match(IF);
                setState(132);
                match(T__6);
                setState(133);
                expr(0);
                setState(134);
                match(T__7);
                setState(135);
                stmt();
                setState(139);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 11, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(136);
                                subSelection();
                            }
                        }
                    }
                    setState(141);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 11, _ctx);
                }
                setState(144);
                switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
                    case 1: {
                        setState(142);
                        match(ELSE);
                        setState(143);
                        stmt();
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final SubSelectionContext subSelection() throws RecognitionException {
        SubSelectionContext _localctx = new SubSelectionContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_subSelection);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(146);
                match(ELSEIF);
                setState(147);
                match(T__6);
                setState(148);
                expr(0);
                setState(149);
                match(T__7);
                setState(150);
                stmt();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final IterationContext iteration() throws RecognitionException {
        IterationContext _localctx = new IterationContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_iteration);
        int _la;
        try {
            setState(173);
            switch (_input.LA(1)) {
                case WHILE:
                    _localctx = new WhileLoopContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(152);
                    match(WHILE);
                    setState(153);
                    match(T__6);
                    setState(154);
                    expr(0);
                    setState(155);
                    match(T__7);
                    setState(156);
                    stmt();
                }
                break;
                case FOR:
                    _localctx = new ForLoopContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(158);
                    match(FOR);
                    setState(159);
                    match(T__6);
                    setState(161);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << NULL) | (1L << NEW) | (1L << PPLUS) | (1L << MMINUS) | (1L << PLUS) | (1L << MINUS) | (1L << BIT_NOT) | (1L << LOG_NOT) | (1L << ID))) != 0)) {
                        {
                            setState(160);
                            ((ForLoopContext) _localctx).init = expr(0);
                        }
                    }

                    setState(163);
                    match(T__0);
                    setState(165);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << NULL) | (1L << NEW) | (1L << PPLUS) | (1L << MMINUS) | (1L << PLUS) | (1L << MINUS) | (1L << BIT_NOT) | (1L << LOG_NOT) | (1L << ID))) != 0)) {
                        {
                            setState(164);
                            ((ForLoopContext) _localctx).condition = expr(0);
                        }
                    }

                    setState(167);
                    match(T__0);
                    setState(169);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << NULL) | (1L << NEW) | (1L << PPLUS) | (1L << MMINUS) | (1L << PLUS) | (1L << MINUS) | (1L << BIT_NOT) | (1L << LOG_NOT) | (1L << ID))) != 0)) {
                        {
                            setState(168);
                            ((ForLoopContext) _localctx).after = expr(0);
                        }
                    }

                    setState(171);
                    match(T__7);
                    setState(172);
                    stmt();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ExprContext expr() throws RecognitionException {
        return expr(0);
    }

    private ExprContext expr(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        ExprContext _localctx = new ExprContext(_ctx, _parentState);
        ExprContext _prevctx = _localctx;
        int _startState = 28;
        enterRecursionRule(_localctx, 28, RULE_expr, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(197);
                switch (getInterpreter().adaptivePredict(_input, 18, _ctx)) {
                    case 1: {
                        _localctx = new SelfOpPreContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(176);
                        ((SelfOpPreContext) _localctx).op = _input.LT(1);
                        _la = _input.LA(1);
                        if (!(_la == PPLUS || _la == MMINUS)) {
                            ((SelfOpPreContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                        } else {
                            consume();
                        }
                        setState(177);
                        expr(16);
                    }
                    break;
                    case 2: {
                        _localctx = new SignContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(178);
                        ((SignContext) _localctx).op = _input.LT(1);
                        _la = _input.LA(1);
                        if (!(_la == PLUS || _la == MINUS)) {
                            ((SignContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                        } else {
                            consume();
                        }
                        setState(179);
                        expr(15);
                    }
                    break;
                    case 3: {
                        _localctx = new LogNotContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(180);
                        ((LogNotContext) _localctx).op = match(LOG_NOT);
                        setState(181);
                        expr(14);
                    }
                    break;
                    case 4: {
                        _localctx = new BitNotContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(182);
                        ((BitNotContext) _localctx).op = match(BIT_NOT);
                        setState(183);
                        expr(13);
                    }
                    break;
                    case 5: {
                        _localctx = new BracketContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(184);
                        match(T__6);
                        setState(185);
                        expr(0);
                        setState(186);
                        match(T__7);
                    }
                    break;
                    case 6: {
                        _localctx = new ConstantLeafContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(188);
                        constant();
                    }
                    break;
                    case 7: {
                        _localctx = new IDLeafContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(189);
                        match(ID);
                    }
                    break;
                    case 8: {
                        _localctx = new CallContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(190);
                        match(ID);
                        setState(191);
                        match(T__6);
                        setState(193);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << NULL) | (1L << NEW) | (1L << PPLUS) | (1L << MMINUS) | (1L << PLUS) | (1L << MINUS) | (1L << BIT_NOT) | (1L << LOG_NOT) | (1L << ID))) != 0)) {
                            {
                                setState(192);
                                exprList();
                            }
                        }

                        setState(195);
                        match(T__7);
                    }
                    break;
                    case 9: {
                        _localctx = new CreationContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(196);
                        creationExpr();
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(252);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 21, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(250);
                            switch (getInterpreter().adaptivePredict(_input, 20, _ctx)) {
                                case 1: {
                                    _localctx = new BinaryContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(199);
                                    if (!(precpred(_ctx, 11)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                                    setState(200);
                                    ((BinaryContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0))) {
                                        ((BinaryContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        consume();
                                    }
                                    setState(201);
                                    expr(12);
                                }
                                break;
                                case 2: {
                                    _localctx = new BinaryContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(202);
                                    if (!(precpred(_ctx, 10)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                                    setState(203);
                                    ((BinaryContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == PLUS || _la == MINUS)) {
                                        ((BinaryContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        consume();
                                    }
                                    setState(204);
                                    expr(11);
                                }
                                break;
                                case 3: {
                                    _localctx = new BinaryContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(205);
                                    if (!(precpred(_ctx, 9)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                                    setState(206);
                                    ((BinaryContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == SHIFT_L || _la == SHIFT_R)) {
                                        ((BinaryContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        consume();
                                    }
                                    setState(207);
                                    expr(10);
                                }
                                break;
                                case 4: {
                                    _localctx = new LogBinaryContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(208);
                                    if (!(precpred(_ctx, 8)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                                    setState(209);
                                    ((LogBinaryContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LARGE) | (1L << LEQ) | (1L << GEQ))) != 0))) {
                                        ((LogBinaryContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        consume();
                                    }
                                    setState(210);
                                    expr(9);
                                }
                                break;
                                case 5: {
                                    _localctx = new LogBinaryContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(211);
                                    if (!(precpred(_ctx, 7)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                                    setState(212);
                                    ((LogBinaryContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == EQ || _la == NEQ)) {
                                        ((LogBinaryContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        consume();
                                    }
                                    setState(213);
                                    expr(8);
                                }
                                break;
                                case 6: {
                                    _localctx = new BinaryContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(214);
                                    if (!(precpred(_ctx, 6)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                                    setState(215);
                                    ((BinaryContext) _localctx).op = match(BIT_AND);
                                    setState(216);
                                    expr(7);
                                }
                                break;
                                case 7: {
                                    _localctx = new BinaryContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(217);
                                    if (!(precpred(_ctx, 5)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                                    setState(218);
                                    ((BinaryContext) _localctx).op = match(BIT_XOR);
                                    setState(219);
                                    expr(6);
                                }
                                break;
                                case 8: {
                                    _localctx = new BinaryContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(220);
                                    if (!(precpred(_ctx, 4)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    setState(221);
                                    ((BinaryContext) _localctx).op = match(BIT_OR);
                                    setState(222);
                                    expr(5);
                                }
                                break;
                                case 9: {
                                    _localctx = new LogBinaryContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(223);
                                    if (!(precpred(_ctx, 3)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(224);
                                    ((LogBinaryContext) _localctx).op = match(LOG_AND);
                                    setState(225);
                                    expr(4);
                                }
                                break;
                                case 10: {
                                    _localctx = new LogBinaryContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(226);
                                    if (!(precpred(_ctx, 2)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                    setState(227);
                                    ((LogBinaryContext) _localctx).op = match(LOG_OR);
                                    setState(228);
                                    expr(3);
                                }
                                break;
                                case 11: {
                                    _localctx = new AssignContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(229);
                                    if (!(precpred(_ctx, 1)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                                    setState(230);
                                    match(T__1);
                                    setState(231);
                                    expr(1);
                                }
                                break;
                                case 12: {
                                    _localctx = new SelfOpPostContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(232);
                                    if (!(precpred(_ctx, 21)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 21)");
                                    setState(233);
                                    ((SelfOpPostContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == PPLUS || _la == MMINUS)) {
                                        ((SelfOpPostContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        consume();
                                    }
                                }
                                break;
                                case 13: {
                                    _localctx = new IndexContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(234);
                                    if (!(precpred(_ctx, 19)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 19)");
                                    setState(235);
                                    match(T__11);
                                    setState(236);
                                    expr(0);
                                    setState(237);
                                    match(T__12);
                                }
                                break;
                                case 14: {
                                    _localctx = new FieldAccessContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(239);
                                    if (!(precpred(_ctx, 18)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 18)");
                                    setState(240);
                                    match(T__13);
                                    setState(241);
                                    match(ID);
                                }
                                break;
                                case 15: {
                                    _localctx = new ClassFuncAccessContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(242);
                                    if (!(precpred(_ctx, 17)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 17)");
                                    setState(243);
                                    match(T__13);
                                    setState(244);
                                    match(ID);
                                    setState(245);
                                    match(T__6);
                                    setState(247);
                                    _la = _input.LA(1);
                                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << NULL) | (1L << NEW) | (1L << PPLUS) | (1L << MMINUS) | (1L << PLUS) | (1L << MINUS) | (1L << BIT_NOT) | (1L << LOG_NOT) | (1L << ID))) != 0)) {
                                        {
                                            setState(246);
                                            exprList();
                                        }
                                    }

                                    setState(249);
                                    match(T__7);
                                }
                                break;
                            }
                        }
                    }
                    setState(254);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 21, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public final CreationExprContext creationExpr() throws RecognitionException {
        CreationExprContext _localctx = new CreationExprContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_creationExpr);
        try {
            int _alt;
            setState(268);
            switch (getInterpreter().adaptivePredict(_input, 23, _ctx)) {
                case 1:
                    _localctx = new ArrayCreateContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(255);
                    match(NEW);
                    setState(256);
                    atom();
                    setState(257);
                    match(T__11);
                    setState(258);
                    expr(0);
                    setState(259);
                    match(T__12);
                    setState(263);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 22, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(260);
                                    match(DIM);
                                }
                            }
                        }
                        setState(265);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 22, _ctx);
                    }
                }
                break;
                case 2:
                    _localctx = new AtomCreateContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(266);
                    match(NEW);
                    setState(267);
                    atom();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ExprListContext exprList() throws RecognitionException {
        ExprListContext _localctx = new ExprListContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_exprList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(270);
                expr(0);
                setState(275);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__8) {
                    {
                        {
                            setState(271);
                            match(T__8);
                            setState(272);
                            expr(0);
                        }
                    }
                    setState(277);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ClassDeclContext classDecl() throws RecognitionException {
        ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_classDecl);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(278);
                match(T__14);
                setState(279);
                match(ID);
                setState(280);
                classBlock();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ClassBlockContext classBlock() throws RecognitionException {
        ClassBlockContext _localctx = new ClassBlockContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_classBlock);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(282);
                match(T__9);
                setState(286);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << ID))) != 0)) {
                    {
                        {
                            setState(283);
                            memberDecl();
                        }
                    }
                    setState(288);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(289);
                match(T__10);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final MemberDeclContext memberDecl() throws RecognitionException {
        MemberDeclContext _localctx = new MemberDeclContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_memberDecl);
        try {
            setState(296);
            switch (getInterpreter().adaptivePredict(_input, 26, _ctx)) {
                case 1:
                    _localctx = new ClassFieldContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(291);
                    type(0);
                    setState(292);
                    match(ID);
                    setState(293);
                    match(T__0);
                }
                break;
                case 2:
                    _localctx = new ClassFunctionContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(295);
                    funcDecl();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ConstantContext constant() throws RecognitionException {
        ConstantContext _localctx = new ConstantContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_constant);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(298);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << NULL))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 4:
                return type_sempred((TypeContext) _localctx, predIndex);
            case 14:
                return expr_sempred((ExprContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean type_sempred(TypeContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 1);
        }
        return true;
    }

    private boolean expr_sempred(ExprContext _localctx, int predIndex) {
        switch (predIndex) {
            case 1:
                return precpred(_ctx, 11);
            case 2:
                return precpred(_ctx, 10);
            case 3:
                return precpred(_ctx, 9);
            case 4:
                return precpred(_ctx, 8);
            case 5:
                return precpred(_ctx, 7);
            case 6:
                return precpred(_ctx, 6);
            case 7:
                return precpred(_ctx, 5);
            case 8:
                return precpred(_ctx, 4);
            case 9:
                return precpred(_ctx, 3);
            case 10:
                return precpred(_ctx, 2);
            case 11:
                return precpred(_ctx, 1);
            case 12:
                return precpred(_ctx, 21);
            case 13:
                return precpred(_ctx, 19);
            case 14:
                return precpred(_ctx, 18);
            case 15:
                return precpred(_ctx, 17);
        }
        return true;
    }

    public static class ProgContext extends ParserRuleContext {
        public ProgContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<DeclContext> decl() {
            return getRuleContexts(DeclContext.class);
        }

        public DeclContext decl(int i) {
            return getRuleContext(DeclContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_prog;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterProg(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitProg(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitProg(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class DeclContext extends ParserRuleContext {
        public DeclContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public VarDeclContext varDecl() {
            return getRuleContext(VarDeclContext.class, 0);
        }

        public FuncDeclContext funcDecl() {
            return getRuleContext(FuncDeclContext.class, 0);
        }

        public ClassDeclContext classDecl() {
            return getRuleContext(ClassDeclContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_decl;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterDecl(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitDecl(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitDecl(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class VarDeclContext extends ParserRuleContext {
        public VarDeclContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public TerminalNode ID() {
            return getToken(MangoParser.ID, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_varDecl;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterVarDecl(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitVarDecl(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitVarDecl(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AtomContext extends ParserRuleContext {
        public AtomContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ID() {
            return getToken(MangoParser.ID, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_atom;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterAtom(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitAtom(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitAtom(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class TypeContext extends ParserRuleContext {
        public TypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public AtomContext atom() {
            return getRuleContext(AtomContext.class, 0);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public TerminalNode DIM() {
            return getToken(MangoParser.DIM, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_type;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitType(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FuncDeclContext extends ParserRuleContext {
        public FuncDeclContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ID() {
            return getToken(MangoParser.ID, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public FormalParameterListContext formalParameterList() {
            return getRuleContext(FormalParameterListContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_funcDecl;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterFuncDecl(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitFuncDecl(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitFuncDecl(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FormalParameterListContext extends ParserRuleContext {
        public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<FormalParameterContext> formalParameter() {
            return getRuleContexts(FormalParameterContext.class);
        }

        public FormalParameterContext formalParameter(int i) {
            return getRuleContext(FormalParameterContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_formalParameterList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterFormalParameterList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitFormalParameterList(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor)
                return ((MangoVisitor<? extends T>) visitor).visitFormalParameterList(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FormalParameterContext extends ParserRuleContext {
        public FormalParameterContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public TerminalNode ID() {
            return getToken(MangoParser.ID, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_formalParameter;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterFormalParameter(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitFormalParameter(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor)
                return ((MangoVisitor<? extends T>) visitor).visitFormalParameter(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BlockContext extends ParserRuleContext {
        public BlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<StmtContext> stmt() {
            return getRuleContexts(StmtContext.class);
        }

        public StmtContext stmt(int i) {
            return getRuleContext(StmtContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterBlock(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitBlock(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitBlock(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class StmtContext extends ParserRuleContext {
        public StmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public StmtContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_stmt;
        }

        public void copyFrom(StmtContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class ExprStmtContext extends StmtContext {
        public ExprStmtContext(StmtContext ctx) {
            copyFrom(ctx);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterExprStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitExprStmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitExprStmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class JumpStmtContext extends StmtContext {
        public JumpStmtContext(StmtContext ctx) {
            copyFrom(ctx);
        }

        public JumpContext jump() {
            return getRuleContext(JumpContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterJumpStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitJumpStmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitJumpStmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class CompoundStmtContext extends StmtContext {
        public CompoundStmtContext(StmtContext ctx) {
            copyFrom(ctx);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterCompoundStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitCompoundStmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitCompoundStmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class VarDeclStmtContext extends StmtContext {
        public VarDeclStmtContext(StmtContext ctx) {
            copyFrom(ctx);
        }

        public VarDeclContext varDecl() {
            return getRuleContext(VarDeclContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterVarDeclStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitVarDeclStmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitVarDeclStmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SelectionStmtContext extends StmtContext {
        public SelectionStmtContext(StmtContext ctx) {
            copyFrom(ctx);
        }

        public SelectionContext selection() {
            return getRuleContext(SelectionContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterSelectionStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitSelectionStmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitSelectionStmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class EmptyStmtContext extends StmtContext {
        public EmptyStmtContext(StmtContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterEmptyStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitEmptyStmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitEmptyStmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IterationStmtContext extends StmtContext {
        public IterationStmtContext(StmtContext ctx) {
            copyFrom(ctx);
        }

        public IterationContext iteration() {
            return getRuleContext(IterationContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterIterationStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitIterationStmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitIterationStmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class JumpContext extends ParserRuleContext {
        public JumpContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public JumpContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_jump;
        }

        public void copyFrom(JumpContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class ContinueStmtContext extends JumpContext {
        public ContinueStmtContext(JumpContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode CONTINUE() {
            return getToken(MangoParser.CONTINUE, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterContinueStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitContinueStmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitContinueStmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BreakStmtContext extends JumpContext {
        public BreakStmtContext(JumpContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode BREAK() {
            return getToken(MangoParser.BREAK, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterBreakStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitBreakStmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitBreakStmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ReturnStmtContext extends JumpContext {
        public ReturnStmtContext(JumpContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode RETURN() {
            return getToken(MangoParser.RETURN, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterReturnStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitReturnStmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitReturnStmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SelectionContext extends ParserRuleContext {
        public SelectionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode IF() {
            return getToken(MangoParser.IF, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public List<StmtContext> stmt() {
            return getRuleContexts(StmtContext.class);
        }

        public StmtContext stmt(int i) {
            return getRuleContext(StmtContext.class, i);
        }

        public List<SubSelectionContext> subSelection() {
            return getRuleContexts(SubSelectionContext.class);
        }

        public SubSelectionContext subSelection(int i) {
            return getRuleContext(SubSelectionContext.class, i);
        }

        public TerminalNode ELSE() {
            return getToken(MangoParser.ELSE, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_selection;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterSelection(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitSelection(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitSelection(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SubSelectionContext extends ParserRuleContext {
        public SubSelectionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ELSEIF() {
            return getToken(MangoParser.ELSEIF, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public StmtContext stmt() {
            return getRuleContext(StmtContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_subSelection;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterSubSelection(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitSubSelection(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitSubSelection(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IterationContext extends ParserRuleContext {
        public IterationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public IterationContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_iteration;
        }

        public void copyFrom(IterationContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class ForLoopContext extends IterationContext {
        public ExprContext init;
        public ExprContext condition;
        public ExprContext after;

        public ForLoopContext(IterationContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode FOR() {
            return getToken(MangoParser.FOR, 0);
        }

        public StmtContext stmt() {
            return getRuleContext(StmtContext.class, 0);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterForLoop(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitForLoop(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitForLoop(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class WhileLoopContext extends IterationContext {
        public WhileLoopContext(IterationContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode WHILE() {
            return getToken(MangoParser.WHILE, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public StmtContext stmt() {
            return getRuleContext(StmtContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterWhileLoop(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitWhileLoop(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitWhileLoop(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ExprContext extends ParserRuleContext {
        public ExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ExprContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr;
        }

        public void copyFrom(ExprContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class BracketContext extends ExprContext {
        public BracketContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterBracket(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitBracket(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitBracket(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class CallContext extends ExprContext {
        public CallContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode ID() {
            return getToken(MangoParser.ID, 0);
        }

        public ExprListContext exprList() {
            return getRuleContext(ExprListContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class CreationContext extends ExprContext {
        public CreationContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public CreationExprContext creationExpr() {
            return getRuleContext(CreationExprContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterCreation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitCreation(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitCreation(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SelfOpPostContext extends ExprContext {
        public Token op;

        public SelfOpPostContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode PPLUS() {
            return getToken(MangoParser.PPLUS, 0);
        }

        public TerminalNode MMINUS() {
            return getToken(MangoParser.MMINUS, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterSelfOpPost(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitSelfOpPost(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitSelfOpPost(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IndexContext extends ExprContext {
        public IndexContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterIndex(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitIndex(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitIndex(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IDLeafContext extends ExprContext {
        public IDLeafContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode ID() {
            return getToken(MangoParser.ID, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterIDLeaf(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitIDLeaf(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitIDLeaf(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class LogNotContext extends ExprContext {
        public Token op;

        public LogNotContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode LOG_NOT() {
            return getToken(MangoParser.LOG_NOT, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterLogNot(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitLogNot(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitLogNot(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SelfOpPreContext extends ExprContext {
        public Token op;

        public SelfOpPreContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode PPLUS() {
            return getToken(MangoParser.PPLUS, 0);
        }

        public TerminalNode MMINUS() {
            return getToken(MangoParser.MMINUS, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterSelfOpPre(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitSelfOpPre(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitSelfOpPre(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class LogBinaryContext extends ExprContext {
        public Token op;

        public LogBinaryContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode LESS() {
            return getToken(MangoParser.LESS, 0);
        }

        public TerminalNode LARGE() {
            return getToken(MangoParser.LARGE, 0);
        }

        public TerminalNode LEQ() {
            return getToken(MangoParser.LEQ, 0);
        }

        public TerminalNode GEQ() {
            return getToken(MangoParser.GEQ, 0);
        }

        public TerminalNode EQ() {
            return getToken(MangoParser.EQ, 0);
        }

        public TerminalNode NEQ() {
            return getToken(MangoParser.NEQ, 0);
        }

        public TerminalNode LOG_AND() {
            return getToken(MangoParser.LOG_AND, 0);
        }

        public TerminalNode LOG_OR() {
            return getToken(MangoParser.LOG_OR, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterLogBinary(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitLogBinary(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitLogBinary(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ConstantLeafContext extends ExprContext {
        public ConstantLeafContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public ConstantContext constant() {
            return getRuleContext(ConstantContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterConstantLeaf(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitConstantLeaf(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitConstantLeaf(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BinaryContext extends ExprContext {
        public Token op;

        public BinaryContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode MULT() {
            return getToken(MangoParser.MULT, 0);
        }

        public TerminalNode DIV() {
            return getToken(MangoParser.DIV, 0);
        }

        public TerminalNode MOD() {
            return getToken(MangoParser.MOD, 0);
        }

        public TerminalNode PLUS() {
            return getToken(MangoParser.PLUS, 0);
        }

        public TerminalNode MINUS() {
            return getToken(MangoParser.MINUS, 0);
        }

        public TerminalNode SHIFT_L() {
            return getToken(MangoParser.SHIFT_L, 0);
        }

        public TerminalNode SHIFT_R() {
            return getToken(MangoParser.SHIFT_R, 0);
        }

        public TerminalNode BIT_AND() {
            return getToken(MangoParser.BIT_AND, 0);
        }

        public TerminalNode BIT_XOR() {
            return getToken(MangoParser.BIT_XOR, 0);
        }

        public TerminalNode BIT_OR() {
            return getToken(MangoParser.BIT_OR, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterBinary(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitBinary(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitBinary(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SignContext extends ExprContext {
        public Token op;

        public SignContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode PLUS() {
            return getToken(MangoParser.PLUS, 0);
        }

        public TerminalNode MINUS() {
            return getToken(MangoParser.MINUS, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterSign(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitSign(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitSign(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AssignContext extends ExprContext {
        public AssignContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterAssign(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitAssign(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitAssign(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BitNotContext extends ExprContext {
        public Token op;

        public BitNotContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode BIT_NOT() {
            return getToken(MangoParser.BIT_NOT, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterBitNot(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitBitNot(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitBitNot(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FieldAccessContext extends ExprContext {
        public FieldAccessContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode ID() {
            return getToken(MangoParser.ID, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterFieldAccess(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitFieldAccess(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitFieldAccess(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ClassFuncAccessContext extends ExprContext {
        public ClassFuncAccessContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode ID() {
            return getToken(MangoParser.ID, 0);
        }

        public ExprListContext exprList() {
            return getRuleContext(ExprListContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterClassFuncAccess(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitClassFuncAccess(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor)
                return ((MangoVisitor<? extends T>) visitor).visitClassFuncAccess(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class CreationExprContext extends ParserRuleContext {
        public CreationExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public CreationExprContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_creationExpr;
        }

        public void copyFrom(CreationExprContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class AtomCreateContext extends CreationExprContext {
        public AtomCreateContext(CreationExprContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode NEW() {
            return getToken(MangoParser.NEW, 0);
        }

        public AtomContext atom() {
            return getRuleContext(AtomContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterAtomCreate(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitAtomCreate(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitAtomCreate(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ArrayCreateContext extends CreationExprContext {
        public ArrayCreateContext(CreationExprContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode NEW() {
            return getToken(MangoParser.NEW, 0);
        }

        public AtomContext atom() {
            return getRuleContext(AtomContext.class, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterArrayCreate(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitArrayCreate(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitArrayCreate(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ExprListContext extends ParserRuleContext {
        public ExprListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_exprList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterExprList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitExprList(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitExprList(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ClassDeclContext extends ParserRuleContext {
        public ClassDeclContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ID() {
            return getToken(MangoParser.ID, 0);
        }

        public ClassBlockContext classBlock() {
            return getRuleContext(ClassBlockContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_classDecl;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterClassDecl(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitClassDecl(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitClassDecl(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ClassBlockContext extends ParserRuleContext {
        public ClassBlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<MemberDeclContext> memberDecl() {
            return getRuleContexts(MemberDeclContext.class);
        }

        public MemberDeclContext memberDecl(int i) {
            return getRuleContext(MemberDeclContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_classBlock;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterClassBlock(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitClassBlock(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitClassBlock(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class MemberDeclContext extends ParserRuleContext {
        public MemberDeclContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public MemberDeclContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_memberDecl;
        }

        public void copyFrom(MemberDeclContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class ClassFunctionContext extends MemberDeclContext {
        public ClassFunctionContext(MemberDeclContext ctx) {
            copyFrom(ctx);
        }

        public FuncDeclContext funcDecl() {
            return getRuleContext(FuncDeclContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterClassFunction(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitClassFunction(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitClassFunction(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ClassFieldContext extends MemberDeclContext {
        public ClassFieldContext(MemberDeclContext ctx) {
            copyFrom(ctx);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public TerminalNode ID() {
            return getToken(MangoParser.ID, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterClassField(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitClassField(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitClassField(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ConstantContext extends ParserRuleContext {
        public ConstantContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode NULL() {
            return getToken(MangoParser.NULL, 0);
        }

        public TerminalNode INT() {
            return getToken(MangoParser.INT, 0);
        }

        public TerminalNode STRING() {
            return getToken(MangoParser.STRING, 0);
        }

        public TerminalNode BOOL() {
            return getToken(MangoParser.BOOL, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_constant;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterConstant(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitConstant(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitConstant(this);
            else return visitor.visitChildren(this);
        }
    }
}