// Generated from /Users/youyurong/Dropbox/课程/Compiler/Mango/src/Syntax/Mango.g4 by ANTLR 4.5.1
package Syntax;

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

	public MangoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public static class DeclContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class, 0);
		}
		public FuncDeclContext funcDecl() {
			return getRuleContext(FuncDeclContext.class, 0);
		}
		public ClassDeclContext classDecl() {
			return getRuleContext(ClassDeclContext.class, 0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public static class VarDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class, 0);
		}

		public TerminalNode ID() {
			return getToken(MangoParser.ID, 0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode ID() {
			return getToken(MangoParser.ID, 0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public static class TypeContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class, 0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class, 0);
		}

		public TerminalNode DIM() {
			return getToken(MangoParser.DIM, 0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public static class FuncDeclContext extends ParserRuleContext {
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
		public FuncDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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
				case ID:
				{
					setState(77);
					type(0);
				}
				break;
				case T__5:
				{
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class, 0);
		}

		public TerminalNode ID() {
			return getToken(MangoParser.ID, 0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_stmt;
		}

		public StmtContext() {
		}
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprStmtContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public ExprStmtContext(StmtContext ctx) {
			copyFrom(ctx);
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
		public JumpContext jump() {
			return getRuleContext(JumpContext.class, 0);
		}

		public JumpStmtContext(StmtContext ctx) {
			copyFrom(ctx);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class, 0);
		}

		public CompoundStmtContext(StmtContext ctx) {
			copyFrom(ctx);
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
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class, 0);
		}

		public VarDeclStmtContext(StmtContext ctx) {
			copyFrom(ctx);
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
		public SelectionContext selection() {
			return getRuleContext(SelectionContext.class, 0);
		}

		public SelectionStmtContext(StmtContext ctx) {
			copyFrom(ctx);
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
		public IterationContext iteration() {
			return getRuleContext(IterationContext.class, 0);
		}

		public IterationStmtContext(StmtContext ctx) {
			copyFrom(ctx);
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

	public static class JumpContext extends ParserRuleContext {
		public JumpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_jump;
		}

		public JumpContext() {
		}
		public void copyFrom(JumpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ContinueStmtContext extends JumpContext {
		public TerminalNode CONTINUE() {
			return getToken(MangoParser.CONTINUE, 0);
		}

		public ContinueStmtContext(JumpContext ctx) {
			copyFrom(ctx);
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
		public TerminalNode BREAK() {
			return getToken(MangoParser.BREAK, 0);
		}

		public BreakStmtContext(JumpContext ctx) {
			copyFrom(ctx);
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
		public TerminalNode RETURN() {
			return getToken(MangoParser.RETURN, 0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public ReturnStmtContext(JumpContext ctx) {
			copyFrom(ctx);
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

	public final JumpContext jump() throws RecognitionException {
		JumpContext _localctx = new JumpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_jump);
		try {
			setState(128);
			switch (_input.LA(1)) {
				case RETURN:
					_localctx = new ReturnStmtContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(120);
					match(RETURN);
					setState(121);
					expr(0);
					setState(122);
					match(T__0);
				}
				break;
				case BREAK:
					_localctx = new BreakStmtContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(124);
					match(BREAK);
					setState(125);
					match(T__0);
				}
				break;
				case CONTINUE:
					_localctx = new ContinueStmtContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(126);
					match(CONTINUE);
					setState(127);
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

	public static class SelectionContext extends ParserRuleContext {
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
		public SelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final SelectionContext selection() throws RecognitionException {
		SelectionContext _localctx = new SelectionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_selection);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(130);
				match(IF);
				setState(131);
				match(T__6);
				setState(132);
				expr(0);
				setState(133);
				match(T__7);
				setState(134);
				stmt();
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 10, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(135);
								subSelection();
					}
						}
				}
					setState(140);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 10, _ctx);
			}
				setState(143);
				switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
					case 1: {
				setState(141);
						match(ELSE);
						setState(142);
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

	public static class SubSelectionContext extends ParserRuleContext {
		public TerminalNode ELSEIF() {
			return getToken(MangoParser.ELSEIF, 0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class, 0);
		}
		public SubSelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final SubSelectionContext subSelection() throws RecognitionException {
		SubSelectionContext _localctx = new SubSelectionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_subSelection);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(145);
				match(ELSEIF);
				setState(146);
				match(T__6);
				setState(147);
				expr(0);
				setState(148);
				match(T__7);
				setState(149);
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

	public static class IterationContext extends ParserRuleContext {
		public IterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_iteration;
		}

		public IterationContext() {
		}
		public void copyFrom(IterationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForLoopContext extends IterationContext {
		public ExprContext init;
		public ExprContext condition;
		public ExprContext after;

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

		public ForLoopContext(IterationContext ctx) {
			copyFrom(ctx);
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
		public TerminalNode WHILE() {
			return getToken(MangoParser.WHILE, 0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class, 0);
		}

		public WhileLoopContext(IterationContext ctx) {
			copyFrom(ctx);
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

	public final IterationContext iteration() throws RecognitionException {
		IterationContext _localctx = new IterationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_iteration);
		int _la;
		try {
			setState(172);
			switch (_input.LA(1)) {
				case WHILE:
					_localctx = new WhileLoopContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(151);
					match(WHILE);
					setState(152);
					match(T__6);
					setState(153);
					expr(0);
					setState(154);
					match(T__7);
					setState(155);
					stmt();
				}
				break;
				case FOR:
					_localctx = new ForLoopContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(157);
					match(FOR);
					setState(158);
					match(T__6);
					setState(160);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << NULL) | (1L << NEW) | (1L << PPLUS) | (1L << MMINUS) | (1L << PLUS) | (1L << MINUS) | (1L << BIT_NOT) | (1L << LOG_NOT) | (1L << ID))) != 0)) {
						{
							setState(159);
							((ForLoopContext) _localctx).init = expr(0);
					}
					}

					setState(162);
					match(T__0);
					setState(164);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << NULL) | (1L << NEW) | (1L << PPLUS) | (1L << MMINUS) | (1L << PLUS) | (1L << MINUS) | (1L << BIT_NOT) | (1L << LOG_NOT) | (1L << ID))) != 0)) {
						{
							setState(163);
							((ForLoopContext) _localctx).condition = expr(0);
					}
					}

					setState(166);
					match(T__0);
					setState(168);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << NULL) | (1L << NEW) | (1L << PPLUS) | (1L << MMINUS) | (1L << PLUS) | (1L << MINUS) | (1L << BIT_NOT) | (1L << LOG_NOT) | (1L << ID))) != 0)) {
						{
							setState(167);
							((ForLoopContext) _localctx).after = expr(0);
					}
					}

					setState(170);
					match(T__7);
					setState(171);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expr;
		}

		public ExprContext() {
		}
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BracketContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public BracketContext(ExprContext ctx) {
			copyFrom(ctx);
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
		public TerminalNode ID() {
			return getToken(MangoParser.ID, 0);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class, 0);
		}

		public CallContext(ExprContext ctx) {
			copyFrom(ctx);
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
		public CreationExprContext creationExpr() {
			return getRuleContext(CreationExprContext.class, 0);
		}

		public CreationContext(ExprContext ctx) {
			copyFrom(ctx);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public TerminalNode PPLUS() {
			return getToken(MangoParser.PPLUS, 0);
		}

		public TerminalNode MMINUS() {
			return getToken(MangoParser.MMINUS, 0);
		}

		public SelfOpPostContext(ExprContext ctx) {
			copyFrom(ctx);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public IndexContext(ExprContext ctx) {
			copyFrom(ctx);
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
		public TerminalNode ID() {
			return getToken(MangoParser.ID, 0);
		}

		public IDLeafContext(ExprContext ctx) {
			copyFrom(ctx);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public TerminalNode LOG_NOT() {
			return getToken(MangoParser.LOG_NOT, 0);
		}

		public LogNotContext(ExprContext ctx) {
			copyFrom(ctx);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public TerminalNode PPLUS() {
			return getToken(MangoParser.PPLUS, 0);
		}

		public TerminalNode MMINUS() {
			return getToken(MangoParser.MMINUS, 0);
		}

		public SelfOpPreContext(ExprContext ctx) {
			copyFrom(ctx);
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

		public LogBinaryContext(ExprContext ctx) {
			copyFrom(ctx);
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
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class, 0);
		}

		public ConstantLeafContext(ExprContext ctx) {
			copyFrom(ctx);
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

		public BinaryContext(ExprContext ctx) {
			copyFrom(ctx);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public TerminalNode PLUS() {
			return getToken(MangoParser.PLUS, 0);
		}

		public TerminalNode MINUS() {
			return getToken(MangoParser.MINUS, 0);
		}

		public SignContext(ExprContext ctx) {
			copyFrom(ctx);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public AssignContext(ExprContext ctx) {
			copyFrom(ctx);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public TerminalNode BIT_NOT() {
			return getToken(MangoParser.BIT_NOT, 0);
		}

		public BitNotContext(ExprContext ctx) {
			copyFrom(ctx);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public TerminalNode ID() {
			return getToken(MangoParser.ID, 0);
		}

		public FieldAccessContext(ExprContext ctx) {
			copyFrom(ctx);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public TerminalNode ID() {
			return getToken(MangoParser.ID, 0);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class, 0);
		}

		public ClassFuncAccessContext(ExprContext ctx) {
			copyFrom(ctx);
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
				setState(196);
				switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
					case 1: {
						_localctx = new SelfOpPreContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;

						setState(175);
						((SelfOpPreContext) _localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if (!(_la == PPLUS || _la == MMINUS)) {
							((SelfOpPreContext) _localctx).op = (Token) _errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(176);
						expr(16);
					}
					break;
					case 2: {
						_localctx = new SignContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(177);
						((SignContext) _localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if (!(_la == PLUS || _la == MINUS)) {
							((SignContext) _localctx).op = (Token) _errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(178);
						expr(15);
					}
					break;
					case 3: {
						_localctx = new LogNotContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(179);
						((LogNotContext) _localctx).op = match(LOG_NOT);
						setState(180);
						expr(14);
					}
					break;
					case 4: {
						_localctx = new BitNotContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(181);
						((BitNotContext) _localctx).op = match(BIT_NOT);
						setState(182);
						expr(13);
					}
					break;
					case 5: {
						_localctx = new BracketContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(183);
						match(T__6);
						setState(184);
						expr(0);
						setState(185);
						match(T__7);
					}
					break;
					case 6: {
						_localctx = new ConstantLeafContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(187);
						constant();
					}
					break;
					case 7: {
						_localctx = new IDLeafContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(188);
						match(ID);
					}
					break;
					case 8: {
						_localctx = new CallContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(189);
						match(ID);
						setState(190);
						match(T__6);
						setState(192);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << NULL) | (1L << NEW) | (1L << PPLUS) | (1L << MMINUS) | (1L << PLUS) | (1L << MINUS) | (1L << BIT_NOT) | (1L << LOG_NOT) | (1L << ID))) != 0)) {
							{
								setState(191);
								exprList();
					}
						}

						setState(194);
						match(T__7);
					}
					break;
					case 9: {
						_localctx = new CreationContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(195);
						creationExpr();
					}
					break;
				}
				_ctx.stop = _input.LT(-1);
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 20, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(249);
							switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
								case 1: {
									_localctx = new BinaryContext(new ExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(198);
									if (!(precpred(_ctx, 11)))
										throw new FailedPredicateException(this, "precpred(_ctx, 11)");
									setState(199);
									((BinaryContext) _localctx).op = _input.LT(1);
						_la = _input.LA(1);
									if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0))) {
										((BinaryContext) _localctx).op = (Token) _errHandler.recoverInline(this);
						} else {
							consume();
						}
									setState(200);
									expr(12);
								}
								break;
								case 2: {
									_localctx = new BinaryContext(new ExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(201);
									if (!(precpred(_ctx, 10)))
										throw new FailedPredicateException(this, "precpred(_ctx, 10)");
									setState(202);
									((BinaryContext) _localctx).op = _input.LT(1);
						_la = _input.LA(1);
									if (!(_la == PLUS || _la == MINUS)) {
										((BinaryContext) _localctx).op = (Token) _errHandler.recoverInline(this);
						} else {
							consume();
						}
									setState(203);
									expr(11);
						}
								break;
								case 3:
						{
							_localctx = new BinaryContext(new ExprContext(_parentctx, _parentState));
							pushNewRecursionContext(_localctx, _startState, RULE_expr);
							setState(204);
							if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
							setState(205);
							((BinaryContext) _localctx).op = _input.LT(1);
						_la = _input.LA(1);
							if (!(_la == SHIFT_L || _la == SHIFT_R)) {
								((BinaryContext) _localctx).op = (Token) _errHandler.recoverInline(this);
						} else {
							consume();
						}
							setState(206);
							expr(10);
						}
								break;
								case 4: {
									_localctx = new LogBinaryContext(new ExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(207);
									if (!(precpred(_ctx, 8)))
										throw new FailedPredicateException(this, "precpred(_ctx, 8)");
									setState(208);
									((LogBinaryContext) _localctx).op = _input.LT(1);
						_la = _input.LA(1);
									if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LARGE) | (1L << LEQ) | (1L << GEQ))) != 0))) {
										((LogBinaryContext) _localctx).op = (Token) _errHandler.recoverInline(this);
						} else {
							consume();
						}
									setState(209);
									expr(9);
						}
								break;
								case 5:
						{
							_localctx = new LogBinaryContext(new ExprContext(_parentctx, _parentState));
							pushNewRecursionContext(_localctx, _startState, RULE_expr);
							setState(210);
							if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
							setState(211);
							((LogBinaryContext) _localctx).op = _input.LT(1);
						_la = _input.LA(1);
							if (!(_la == EQ || _la == NEQ)) {
								((LogBinaryContext) _localctx).op = (Token) _errHandler.recoverInline(this);
						} else {
							consume();
						}
							setState(212);
							expr(8);
						}
								break;
								case 6: {
									_localctx = new BinaryContext(new ExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(213);
									if (!(precpred(_ctx, 6)))
										throw new FailedPredicateException(this, "precpred(_ctx, 6)");
									setState(214);
									((BinaryContext) _localctx).op = match(BIT_AND);
									setState(215);
									expr(7);
								}
								break;
								case 7: {
									_localctx = new BinaryContext(new ExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(216);
									if (!(precpred(_ctx, 5)))
										throw new FailedPredicateException(this, "precpred(_ctx, 5)");
									setState(217);
									((BinaryContext) _localctx).op = match(BIT_XOR);
									setState(218);
									expr(6);
								}
								break;
								case 8: {
									_localctx = new BinaryContext(new ExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(219);
									if (!(precpred(_ctx, 4)))
										throw new FailedPredicateException(this, "precpred(_ctx, 4)");
									setState(220);
									((BinaryContext) _localctx).op = match(BIT_OR);
									setState(221);
									expr(5);
								}
								break;
								case 9: {
									_localctx = new LogBinaryContext(new ExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(222);
									if (!(precpred(_ctx, 3)))
										throw new FailedPredicateException(this, "precpred(_ctx, 3)");
									setState(223);
									((LogBinaryContext) _localctx).op = match(LOG_AND);
									setState(224);
									expr(4);
								}
								break;
								case 10: {
									_localctx = new LogBinaryContext(new ExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(225);
									if (!(precpred(_ctx, 2)))
										throw new FailedPredicateException(this, "precpred(_ctx, 2)");
									setState(226);
									((LogBinaryContext) _localctx).op = match(LOG_OR);
									setState(227);
									expr(3);
								}
								break;
								case 11: {
									_localctx = new AssignContext(new ExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(228);
									if (!(precpred(_ctx, 1)))
										throw new FailedPredicateException(this, "precpred(_ctx, 1)");
									setState(229);
									match(T__1);
									setState(230);
									expr(1);
								}
								break;
								case 12: {
									_localctx = new SelfOpPostContext(new ExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(231);
									if (!(precpred(_ctx, 21)))
										throw new FailedPredicateException(this, "precpred(_ctx, 21)");
									setState(232);
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
									setState(233);
									if (!(precpred(_ctx, 19)))
										throw new FailedPredicateException(this, "precpred(_ctx, 19)");
									setState(234);
									match(T__11);
									setState(235);
						expr(0);
									setState(236);
									match(T__12);
								}
								break;
								case 14: {
									_localctx = new FieldAccessContext(new ExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(238);
									if (!(precpred(_ctx, 18)))
										throw new FailedPredicateException(this, "precpred(_ctx, 18)");
									setState(239);
									match(T__13);
									setState(240);
						match(ID);
								}
								break;
								case 15: {
									_localctx = new ClassFuncAccessContext(new ExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(241);
									if (!(precpred(_ctx, 17)))
										throw new FailedPredicateException(this, "precpred(_ctx, 17)");
									setState(242);
									match(T__13);
									setState(243);
						match(ID);
									setState(244);
						match(T__6);
									setState(246);
						_la = _input.LA(1);
									if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << NULL) | (1L << NEW) | (1L << PPLUS) | (1L << MMINUS) | (1L << PLUS) | (1L << MINUS) | (1L << BIT_NOT) | (1L << LOG_NOT) | (1L << ID))) != 0)) {
							{
								setState(245);
								exprList();
							}
						}

									setState(248);
						match(T__7);
						}
								break;
					}
						}
				}
					setState(253);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 20, _ctx);
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

	public static class CreationExprContext extends ParserRuleContext {
		public CreationExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_creationExpr;
		}

		public CreationExprContext() {
		}
		public void copyFrom(CreationExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtomCreateContext extends CreationExprContext {
		public TerminalNode NEW() {
			return getToken(MangoParser.NEW, 0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class, 0);
		}

		public AtomCreateContext(CreationExprContext ctx) {
			copyFrom(ctx);
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
		public TerminalNode NEW() {
			return getToken(MangoParser.NEW, 0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class, 0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public ArrayCreateContext(CreationExprContext ctx) {
			copyFrom(ctx);
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

	public final CreationExprContext creationExpr() throws RecognitionException {
		CreationExprContext _localctx = new CreationExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_creationExpr);
		try {
			int _alt;
			setState(267);
			switch (getInterpreter().adaptivePredict(_input, 22, _ctx)) {
				case 1:
					_localctx = new ArrayCreateContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(254);
					match(NEW);
					setState(255);
					atom();
					setState(256);
					match(T__11);
					setState(257);
					expr(0);
					setState(258);
					match(T__12);
					setState(262);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 21, _ctx);
					while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
						if (_alt == 1) {
							{
								{
									setState(259);
									match(DIM);
						}
							}
						}
						setState(264);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 21, _ctx);
				}
				}
				break;
				case 2:
					_localctx = new AtomCreateContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(265);
					match(NEW);
					setState(266);
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

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(269);
				expr(0);
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == T__8) {
					{
						{
							setState(270);
							match(T__8);
							setState(271);
				expr(0);
						}
					}
					setState(276);
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

	public static class ClassDeclContext extends ParserRuleContext {
		public TerminalNode ID() {
			return getToken(MangoParser.ID, 0);
		}
		public ClassBlockContext classBlock() {
			return getRuleContext(ClassBlockContext.class, 0);
		}
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(277);
				match(T__14);
				setState(278);
				match(ID);
				setState(279);
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

	public static class ClassBlockContext extends ParserRuleContext {
		public List<MemberDeclContext> memberDecl() {
			return getRuleContexts(MemberDeclContext.class);
		}
		public MemberDeclContext memberDecl(int i) {
			return getRuleContext(MemberDeclContext.class, i);
		}
		public ClassBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final ClassBlockContext classBlock() throws RecognitionException {
		ClassBlockContext _localctx = new ClassBlockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_classBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(281);
				match(T__9);
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << ID))) != 0)) {
					{
						{
							setState(282);
							memberDecl();
						}
					}
					setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
				setState(288);
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

	public static class MemberDeclContext extends ParserRuleContext {
		public MemberDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_memberDecl;
		}

		public MemberDeclContext() {
		}
		public void copyFrom(MemberDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassFunctionContext extends MemberDeclContext {
		public FuncDeclContext funcDecl() {
			return getRuleContext(FuncDeclContext.class, 0);
		}

		public ClassFunctionContext(MemberDeclContext ctx) {
			copyFrom(ctx);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class, 0);
		}

		public TerminalNode ID() {
			return getToken(MangoParser.ID, 0);
		}

		public ClassFieldContext(MemberDeclContext ctx) {
			copyFrom(ctx);
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

	public final MemberDeclContext memberDecl() throws RecognitionException {
		MemberDeclContext _localctx = new MemberDeclContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_memberDecl);
		try {
			setState(295);
			switch (getInterpreter().adaptivePredict(_input, 25, _ctx)) {
				case 1:
					_localctx = new ClassFieldContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(290);
				type(0);
					setState(291);
				match(ID);
					setState(292);
				match(T__0);
				}
				break;
				case 2:
					_localctx = new ClassFunctionContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(294);
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

	public static class ConstantContext extends ParserRuleContext {
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

		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(297);
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

	public static final String _serializedATN =
			"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\38\u012e\4\2\t\2\4" +
					"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
					"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
					"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\7\2.\n\2\f\2\16\2\61\13\2" +
					"\3\3\3\3\3\3\5\3\66\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4B\n" +
					"\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6K\n\6\f\6\16\6N\13\6\3\7\3\7\5\7R\n" +
					"\7\3\7\3\7\3\7\5\7W\n\7\3\7\3\7\3\7\3\b\3\b\3\b\7\b_\n\b\f\b\16\bb\13" +
					"\b\3\t\3\t\3\t\3\n\3\n\7\ni\n\n\f\n\16\nl\13\n\3\n\3\n\3\13\3\13\3\13" +
					"\3\13\3\13\3\13\3\13\3\13\3\13\5\13y\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f" +
					"\3\f\5\f\u0083\n\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u008b\n\r\f\r\16\r\u008e" +
					"\13\r\3\r\3\r\5\r\u0092\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3" +
					"\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a3\n\17\3\17\3\17\5\17\u00a7" +
					"\n\17\3\17\3\17\5\17\u00ab\n\17\3\17\3\17\5\17\u00af\n\17\3\20\3\20\3" +
					"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3" +
					"\20\3\20\5\20\u00c3\n\20\3\20\3\20\5\20\u00c7\n\20\3\20\3\20\3\20\3\20" +
					"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20" +
					"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20" +
					"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20" +
					"\3\20\3\20\5\20\u00f9\n\20\3\20\7\20\u00fc\n\20\f\20\16\20\u00ff\13\20" +
					"\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0107\n\21\f\21\16\21\u010a\13\21" +
					"\3\21\3\21\5\21\u010e\n\21\3\22\3\22\3\22\7\22\u0113\n\22\f\22\16\22\u0116" +
					"\13\22\3\23\3\23\3\23\3\23\3\24\3\24\7\24\u011e\n\24\f\24\16\24\u0121" +
					"\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u012a\n\25\3\26\3\26\3" +
					"\26\2\4\n\36\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\n\4\2" +
					"\5\7\66\66\3\2\37 \3\2$%\3\2!#\3\2&\'\3\2(+\3\2,-\3\2\22\25\u014d\2/\3" +
					"\2\2\2\4\65\3\2\2\2\6A\3\2\2\2\bC\3\2\2\2\nE\3\2\2\2\fQ\3\2\2\2\16[\3" +
					"\2\2\2\20c\3\2\2\2\22f\3\2\2\2\24x\3\2\2\2\26\u0082\3\2\2\2\30\u0084\3" +
					"\2\2\2\32\u0093\3\2\2\2\34\u00ae\3\2\2\2\36\u00c6\3\2\2\2 \u010d\3\2\2" +
					"\2\"\u010f\3\2\2\2$\u0117\3\2\2\2&\u011b\3\2\2\2(\u0129\3\2\2\2*\u012b" +
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
					"\2\2\2xv\3\2\2\2xw\3\2\2\2y\25\3\2\2\2z{\7\34\2\2{|\5\36\20\2|}\7\3\2" +
					"\2}\u0083\3\2\2\2~\177\7\35\2\2\177\u0083\7\3\2\2\u0080\u0081\7\36\2\2" +
					"\u0081\u0083\7\3\2\2\u0082z\3\2\2\2\u0082~\3\2\2\2\u0082\u0080\3\2\2\2" +
					"\u0083\27\3\2\2\2\u0084\u0085\7\26\2\2\u0085\u0086\7\t\2\2\u0086\u0087" +
					"\5\36\20\2\u0087\u0088\7\n\2\2\u0088\u008c\5\24\13\2\u0089\u008b\5\32" +
					"\16\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c" +
					"\u008d\3\2\2\2\u008d\u0091\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7\27" +
					"\2\2\u0090\u0092\5\24\13\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092" +
					"\31\3\2\2\2\u0093\u0094\7\30\2\2\u0094\u0095\7\t\2\2\u0095\u0096\5\36" +
					"\20\2\u0096\u0097\7\n\2\2\u0097\u0098\5\24\13\2\u0098\33\3\2\2\2\u0099" +
					"\u009a\7\31\2\2\u009a\u009b\7\t\2\2\u009b\u009c\5\36\20\2\u009c\u009d" +
					"\7\n\2\2\u009d\u009e\5\24\13\2\u009e\u00af\3\2\2\2\u009f\u00a0\7\32\2" +
					"\2\u00a0\u00a2\7\t\2\2\u00a1\u00a3\5\36\20\2\u00a2\u00a1\3\2\2\2\u00a2" +
					"\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\7\3\2\2\u00a5\u00a7\5\36" +
					"\20\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8" +
					"\u00aa\7\3\2\2\u00a9\u00ab\5\36\20\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3" +
					"\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7\n\2\2\u00ad\u00af\5\24\13\2\u00ae" +
					"\u0099\3\2\2\2\u00ae\u009f\3\2\2\2\u00af\35\3\2\2\2\u00b0\u00b1\b\20\1" +
					"\2\u00b1\u00b2\t\3\2\2\u00b2\u00c7\5\36\20\22\u00b3\u00b4\t\4\2\2\u00b4" +
					"\u00c7\5\36\20\21\u00b5\u00b6\7\62\2\2\u00b6\u00c7\5\36\20\20\u00b7\u00b8" +
					"\7\61\2\2\u00b8\u00c7\5\36\20\17\u00b9\u00ba\7\t\2\2\u00ba\u00bb\5\36" +
					"\20\2\u00bb\u00bc\7\n\2\2\u00bc\u00c7\3\2\2\2\u00bd\u00c7\5*\26\2\u00be" +
					"\u00c7\7\66\2\2\u00bf\u00c0\7\66\2\2\u00c0\u00c2\7\t\2\2\u00c1\u00c3\5" +
					"\"\22\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4" +
					"\u00c7\7\n\2\2\u00c5\u00c7\5 \21\2\u00c6\u00b0\3\2\2\2\u00c6\u00b3\3\2" +
					"\2\2\u00c6\u00b5\3\2\2\2\u00c6\u00b7\3\2\2\2\u00c6\u00b9\3\2\2\2\u00c6" +
					"\u00bd\3\2\2\2\u00c6\u00be\3\2\2\2\u00c6\u00bf\3\2\2\2\u00c6\u00c5\3\2" +
					"\2\2\u00c7\u00fd\3\2\2\2\u00c8\u00c9\f\r\2\2\u00c9\u00ca\t\5\2\2\u00ca" +
					"\u00fc\5\36\20\16\u00cb\u00cc\f\f\2\2\u00cc\u00cd\t\4\2\2\u00cd\u00fc" +
					"\5\36\20\r\u00ce\u00cf\f\13\2\2\u00cf\u00d0\t\6\2\2\u00d0\u00fc\5\36\20" +
					"\f\u00d1\u00d2\f\n\2\2\u00d2\u00d3\t\7\2\2\u00d3\u00fc\5\36\20\13\u00d4" +
					"\u00d5\f\t\2\2\u00d5\u00d6\t\b\2\2\u00d6\u00fc\5\36\20\n\u00d7\u00d8\f" +
					"\b\2\2\u00d8\u00d9\7.\2\2\u00d9\u00fc\5\36\20\t\u00da\u00db\f\7\2\2\u00db" +
					"\u00dc\7/\2\2\u00dc\u00fc\5\36\20\b\u00dd\u00de\f\6\2\2\u00de\u00df\7" +
					"\60\2\2\u00df\u00fc\5\36\20\7\u00e0\u00e1\f\5\2\2\u00e1\u00e2\7\63\2\2" +
					"\u00e2\u00fc\5\36\20\6\u00e3\u00e4\f\4\2\2\u00e4\u00e5\7\64\2\2\u00e5" +
					"\u00fc\5\36\20\5\u00e6\u00e7\f\3\2\2\u00e7\u00e8\7\4\2\2\u00e8\u00fc\5" +
					"\36\20\3\u00e9\u00ea\f\27\2\2\u00ea\u00fc\t\3\2\2\u00eb\u00ec\f\25\2\2" +
					"\u00ec\u00ed\7\16\2\2\u00ed\u00ee\5\36\20\2\u00ee\u00ef\7\17\2\2\u00ef" +
					"\u00fc\3\2\2\2\u00f0\u00f1\f\24\2\2\u00f1\u00f2\7\20\2\2\u00f2\u00fc\7" +
					"\66\2\2\u00f3\u00f4\f\23\2\2\u00f4\u00f5\7\20\2\2\u00f5\u00f6\7\66\2\2" +
					"\u00f6\u00f8\7\t\2\2\u00f7\u00f9\5\"\22\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9" +
					"\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\7\n\2\2\u00fb\u00c8\3\2\2\2\u00fb" +
					"\u00cb\3\2\2\2\u00fb\u00ce\3\2\2\2\u00fb\u00d1\3\2\2\2\u00fb\u00d4\3\2" +
					"\2\2\u00fb\u00d7\3\2\2\2\u00fb\u00da\3\2\2\2\u00fb\u00dd\3\2\2\2\u00fb" +
					"\u00e0\3\2\2\2\u00fb\u00e3\3\2\2\2\u00fb\u00e6\3\2\2\2\u00fb\u00e9\3\2" +
					"\2\2\u00fb\u00eb\3\2\2\2\u00fb\u00f0\3\2\2\2\u00fb\u00f3\3\2\2\2\u00fc" +
					"\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\37\3\2\2" +
					"\2\u00ff\u00fd\3\2\2\2\u0100\u0101\7\33\2\2\u0101\u0102\5\b\5\2\u0102" +
					"\u0103\7\16\2\2\u0103\u0104\5\36\20\2\u0104\u0108\7\17\2\2\u0105\u0107" +
					"\7\65\2\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2" +
					"\u0108\u0109\3\2\2\2\u0109\u010e\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010c" +
					"\7\33\2\2\u010c\u010e\5\b\5\2\u010d\u0100\3\2\2\2\u010d\u010b\3\2\2\2" +
					"\u010e!\3\2\2\2\u010f\u0114\5\36\20\2\u0110\u0111\7\13\2\2\u0111\u0113" +
					"\5\36\20\2\u0112\u0110\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2" +
					"\u0114\u0115\3\2\2\2\u0115#\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0118\7" +
					"\21\2\2\u0118\u0119\7\66\2\2\u0119\u011a\5&\24\2\u011a%\3\2\2\2\u011b" +
					"\u011f\7\f\2\2\u011c\u011e\5(\25\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2" +
					"\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121" +
					"\u011f\3\2\2\2\u0122\u0123\7\r\2\2\u0123\'\3\2\2\2\u0124\u0125\5\n\6\2" +
					"\u0125\u0126\7\66\2\2\u0126\u0127\7\3\2\2\u0127\u012a\3\2\2\2\u0128\u012a" +
					"\5\f\7\2\u0129\u0124\3\2\2\2\u0129\u0128\3\2\2\2\u012a)\3\2\2\2\u012b" +
					"\u012c\t\t\2\2\u012c+\3\2\2\2\34/\65ALQV`jx\u0082\u008c\u0091\u00a2\u00a6" +
					"\u00aa\u00ae\u00c2\u00c6\u00f8\u00fb\u00fd\u0108\u010d\u0114\u011f\u0129";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}