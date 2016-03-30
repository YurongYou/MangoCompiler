// Generated from /Users/youyurong/Dropbox/课程/Compiler/Mango/src/Syntax/Mango.g4 by ANTLR 4.5.1
package Syntax;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
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
			T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, CONSTANT = 16,
			INT = 17, STRING = 18, BOOL = 19, NULL = 20, IF = 21, ELSE = 22, ELSEIF = 23, WHILE = 24,
			FOR = 25, NEW = 26, RETURN = 27, BREAK = 28, CONTINUE = 29, PPLUS = 30, MMINUS = 31,
			MULT = 32, DIV = 33, MOD = 34, PLUS = 35, MINUS = 36, SHIFT_L = 37, SHIFR_R = 38, LESS = 39,
			LARGE = 40, LEQ = 41, GEQ = 42, EQ = 43, NEQ = 44, BIT_AND = 45, BIT_XOR = 46, BIT_OR = 47,
			BIT_NOT = 48, LOG_NOT = 49, LOG_AND = 50, LOG_OR = 51, DIM = 52, ID = 53, LINE_COMMENT = 54,
			WS = 55;
	public static final int
			RULE_prog = 0, RULE_decl = 1, RULE_varDecl = 2, RULE_creationExpr = 3,
			RULE_dimExpr = 4, RULE_type = 5, RULE_funcDecl = 6, RULE_formalParameterList = 7,
			RULE_formalParameter = 8, RULE_block = 9, RULE_stmt = 10, RULE_jumpStmt = 11,
			RULE_selectionStmt = 12, RULE_iterationStmt = 13, RULE_expr = 14, RULE_exprList = 15,
			RULE_classDecl = 16, RULE_classBlock = 17, RULE_memberDecl = 18;
	public static final String[] ruleNames = {
			"prog", "decl", "varDecl", "creationExpr", "dimExpr", "type", "funcDecl",
			"formalParameterList", "formalParameter", "block", "stmt", "jumpStmt",
			"selectionStmt", "iterationStmt", "expr", "exprList", "classDecl", "classBlock",
			"memberDecl"
	};

	private static final String[] _LITERAL_NAMES = {
			null, "';'", "'='", "'['", "']'", "'bool'", "'int'", "'string'", "'('",
			"')'", "'void'", "','", "'{'", "'}'", "'.'", "'class'", null, null, null,
			null, "'null'", "'if'", "'else'", "'else if'", "'while'", "'for'", "'new'",
			"'return'", "'break'", "'continue'", "'++'", "'--'", "'*'", "'/'", "'%'",
			"'+'", "'-'", "'<<'", "'>>'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='",
			"'&'", "'^'", "'|'", "'~'", "'!'", "'&&'", "'||'", "'[]'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
			null, null, null, null, null, null, null, null, null, null, null, null,
			null, null, null, null, "CONSTANT", "INT", "STRING", "BOOL", "NULL", "IF",
			"ELSE", "ELSEIF", "WHILE", "FOR", "NEW", "RETURN", "BREAK", "CONTINUE",
			"PPLUS", "MMINUS", "MULT", "DIV", "MOD", "PLUS", "MINUS", "SHIFT_L", "SHIFR_R",
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
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__14) | (1L << ID))) != 0)) {
					{
						{
							setState(38);
							decl();
						}
					}
					setState(43);
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
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			setState(47);
			switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(44);
					varDecl();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(45);
					funcDecl();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(46);
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
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDecl);
		try {
			setState(59);
			switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(49);
					type(0);
					setState(50);
					match(ID);
					setState(51);
					match(T__0);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(53);
					type(0);
					setState(54);
					match(ID);
					setState(55);
					match(T__1);
					setState(56);
					expr(0);
					setState(57);
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

	public static class CreationExprContext extends ParserRuleContext {
		public TerminalNode NEW() {
			return getToken(MangoParser.NEW, 0);
		}

		public TypeContext type() {
			return getRuleContext(TypeContext.class, 0);
		}

		public DimExprContext dimExpr() {
			return getRuleContext(DimExprContext.class, 0);
		}

		public TerminalNode CONSTANT() {
			return getToken(MangoParser.CONSTANT, 0);
		}

		public CreationExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_creationExpr;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).enterCreationExpr(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).exitCreationExpr(this);
		}
	}

	public final CreationExprContext creationExpr() throws RecognitionException {
		CreationExprContext _localctx = new CreationExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_creationExpr);
		try {
			setState(69);
			switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(61);
					match(NEW);
					setState(62);
					type(0);
					setState(64);
					switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
						case 1: {
							setState(63);
							dimExpr();
						}
						break;
					}
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(66);
					match(NEW);
					setState(67);
					type(0);
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(68);
					match(CONSTANT);
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

	public static class DimExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public DimExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_dimExpr;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).enterDimExpr(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).exitDimExpr(this);
		}
	}

	public final DimExprContext dimExpr() throws RecognitionException {
		DimExprContext _localctx = new DimExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dimExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(75);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
						case 1: {
							{
								setState(71);
								match(T__2);
								setState(72);
								expr(0);
								setState(73);
								match(T__3);
							}
						}
						break;
						default:
							throw new NoViableAltException(this);
					}
					setState(77);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
				} while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
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
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_type;
		}

		public TypeContext() {
		}

		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class ArrayTypeContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class, 0);
		}

		public List<TerminalNode> DIM() {
			return getTokens(MangoParser.DIM);
		}

		public TerminalNode DIM(int i) {
			return getToken(MangoParser.DIM, i);
		}

		public ArrayTypeContext(TypeContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).enterArrayType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).exitArrayType(this);
		}
	}

	public static class BoolTypeContext extends TypeContext {
		public BoolTypeContext(TypeContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).enterBoolType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).exitBoolType(this);
		}
	}

	public static class StringTypeContext extends TypeContext {
		public StringTypeContext(TypeContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).enterStringType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).exitStringType(this);
		}
	}

	public static class IDTypeContext extends TypeContext {
		public TerminalNode ID() {
			return getToken(MangoParser.ID, 0);
		}

		public IDTypeContext(TypeContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).enterIDType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).exitIDType(this);
		}
	}

	public static class IntTypeContext extends TypeContext {
		public IntTypeContext(TypeContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).enterIntType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).exitIntType(this);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(84);
				switch (_input.LA(1)) {
					case T__4: {
						_localctx = new BoolTypeContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;

						setState(80);
						match(T__4);
					}
					break;
					case T__5: {
						_localctx = new IntTypeContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(81);
						match(T__5);
					}
					break;
					case T__6: {
						_localctx = new StringTypeContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(82);
						match(T__6);
					}
					break;
					case ID: {
						_localctx = new IDTypeContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(83);
						match(ID);
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				_ctx.stop = _input.LT(-1);
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new ArrayTypeContext(new TypeContext(_parentctx, _parentState));
								pushNewRecursionContext(_localctx, _startState, RULE_type);
								setState(86);
								if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
								setState(88);
								_errHandler.sync(this);
								_alt = 1;
								do {
									switch (_alt) {
										case 1: {
											{
												setState(87);
												match(DIM);
											}
										}
										break;
										default:
											throw new NoViableAltException(this);
									}
									setState(90);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
								} while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
							}
						}
					}
					setState(96);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
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
		public FuncDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_funcDecl;
		}

		public FuncDeclContext() {
		}

		public void copyFrom(FuncDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class ProsedureContext extends FuncDeclContext {
		public TerminalNode ID() {
			return getToken(MangoParser.ID, 0);
		}

		public BlockContext block() {
			return getRuleContext(BlockContext.class, 0);
		}

		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class, 0);
		}

		public ProsedureContext(FuncDeclContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).enterProsedure(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).exitProsedure(this);
		}
	}

	public static class FuncWithReturnContext extends FuncDeclContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class, 0);
		}

		public TerminalNode ID() {
			return getToken(MangoParser.ID, 0);
		}

		public BlockContext block() {
			return getRuleContext(BlockContext.class, 0);
		}

		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class, 0);
		}

		public FuncWithReturnContext(FuncDeclContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).enterFuncWithReturn(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).exitFuncWithReturn(this);
		}
	}

	public final FuncDeclContext funcDecl() throws RecognitionException {
		FuncDeclContext _localctx = new FuncDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcDecl);
		int _la;
		try {
			setState(114);
			switch (_input.LA(1)) {
				case T__4:
				case T__5:
				case T__6:
				case ID:
					_localctx = new FuncWithReturnContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(97);
					type(0);
					setState(98);
					match(ID);
					setState(99);
					match(T__7);
					setState(101);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ID))) != 0)) {
						{
							setState(100);
							formalParameterList();
						}
					}

					setState(103);
					match(T__8);
					setState(104);
					block();
				}
				break;
				case T__9:
					_localctx = new ProsedureContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(106);
					match(T__9);
					setState(107);
					match(ID);
					setState(108);
					match(T__7);
					setState(110);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ID))) != 0)) {
						{
							setState(109);
							formalParameterList();
						}
					}

					setState(112);
					match(T__8);
					setState(113);
					block();
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
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(116);
				formalParameter();
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == T__10) {
					{
						{
							setState(117);
							match(T__10);
							setState(118);
							formalParameter();
						}
					}
					setState(123);
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
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(124);
				type(0);
				setState(125);
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(127);
				match(T__11);
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__11) | (1L << CONSTANT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << NEW) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << PPLUS) | (1L << MMINUS) | (1L << PLUS) | (1L << MINUS) | (1L << BIT_NOT) | (1L << LOG_NOT) | (1L << ID))) != 0)) {
					{
						{
							setState(128);
							stmt();
						}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(134);
				match(T__12);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public BlockContext block() {
			return getRuleContext(BlockContext.class, 0);
		}

		public SelectionStmtContext selectionStmt() {
			return getRuleContext(SelectionStmtContext.class, 0);
		}

		public IterationStmtContext iterationStmt() {
			return getRuleContext(IterationStmtContext.class, 0);
		}

		public JumpStmtContext jumpStmt() {
			return getRuleContext(JumpStmtContext.class, 0);
		}

		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class, 0);
		}

		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).enterStmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stmt);
		int _la;
		try {
			setState(145);
			switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(137);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << CONSTANT) | (1L << NEW) | (1L << PPLUS) | (1L << MMINUS) | (1L << PLUS) | (1L << MINUS) | (1L << BIT_NOT) | (1L << LOG_NOT) | (1L << ID))) != 0)) {
						{
							setState(136);
							expr(0);
						}
					}

					setState(139);
					match(T__0);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(140);
					block();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(141);
					selectionStmt();
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(142);
					iterationStmt();
				}
				break;
				case 5:
					enterOuterAlt(_localctx, 5);
				{
					setState(143);
					jumpStmt();
				}
				break;
				case 6:
					enterOuterAlt(_localctx, 6);
				{
					setState(144);
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

	public static class JumpStmtContext extends ParserRuleContext {
		public JumpStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_jumpStmt;
		}

		public JumpStmtContext() {
		}

		public void copyFrom(JumpStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class ContinueStmtContext extends JumpStmtContext {
		public TerminalNode CONTINUE() {
			return getToken(MangoParser.CONTINUE, 0);
		}

		public ContinueStmtContext(JumpStmtContext ctx) {
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
	}

	public static class BreakStmtContext extends JumpStmtContext {
		public TerminalNode BREAK() {
			return getToken(MangoParser.BREAK, 0);
		}

		public BreakStmtContext(JumpStmtContext ctx) {
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
	}

	public static class ReturnStmtContext extends JumpStmtContext {
		public TerminalNode RETURN() {
			return getToken(MangoParser.RETURN, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public ReturnStmtContext(JumpStmtContext ctx) {
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
	}

	public final JumpStmtContext jumpStmt() throws RecognitionException {
		JumpStmtContext _localctx = new JumpStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_jumpStmt);
		try {
			setState(155);
			switch (_input.LA(1)) {
				case RETURN:
					_localctx = new ReturnStmtContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(147);
					match(RETURN);
					setState(148);
					expr(0);
					setState(149);
					match(T__0);
				}
				break;
				case BREAK:
					_localctx = new BreakStmtContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(151);
					match(BREAK);
					setState(152);
					match(T__0);
				}
				break;
				case CONTINUE:
					_localctx = new ContinueStmtContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(153);
					match(CONTINUE);
					setState(154);
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

	public static class SelectionStmtContext extends ParserRuleContext {
		public TerminalNode IF() {
			return getToken(MangoParser.IF, 0);
		}

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}

		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class, i);
		}

		public List<TerminalNode> ELSEIF() {
			return getTokens(MangoParser.ELSEIF);
		}

		public TerminalNode ELSEIF(int i) {
			return getToken(MangoParser.ELSEIF, i);
		}

		public List<TerminalNode> ELSE() {
			return getTokens(MangoParser.ELSE);
		}

		public TerminalNode ELSE(int i) {
			return getToken(MangoParser.ELSE, i);
		}

		public SelectionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_selectionStmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).enterSelectionStmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).exitSelectionStmt(this);
		}
	}

	public final SelectionStmtContext selectionStmt() throws RecognitionException {
		SelectionStmtContext _localctx = new SelectionStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_selectionStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(157);
				match(IF);
				setState(158);
				match(T__7);
				setState(159);
				expr(0);
				setState(160);
				match(T__8);
				setState(161);
				stmt();
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 17, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(162);
								match(ELSEIF);
								setState(163);
								match(T__7);
								setState(164);
								expr(0);
								setState(165);
								match(T__8);
								setState(166);
								stmt();
							}
						}
					}
					setState(172);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 17, _ctx);
				}
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 18, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(173);
								match(ELSE);
								setState(174);
								stmt();
							}
						}
					}
					setState(179);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 18, _ctx);
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

	public static class IterationStmtContext extends ParserRuleContext {
		public IterationStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_iterationStmt;
		}

		public IterationStmtContext() {
		}

		public void copyFrom(IterationStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class ForLoopContext extends IterationStmtContext {
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

		public ForLoopContext(IterationStmtContext ctx) {
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
	}

	public static class WhileLoopContext extends IterationStmtContext {
		public TerminalNode WHILE() {
			return getToken(MangoParser.WHILE, 0);
		}

		public StmtContext stmt() {
			return getRuleContext(StmtContext.class, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public WhileLoopContext(IterationStmtContext ctx) {
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
	}

	public final IterationStmtContext iterationStmt() throws RecognitionException {
		IterationStmtContext _localctx = new IterationStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_iterationStmt);
		int _la;
		try {
			setState(202);
			switch (_input.LA(1)) {
				case WHILE:
					_localctx = new WhileLoopContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(180);
					match(WHILE);
					setState(181);
					match(T__7);
					setState(183);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << CONSTANT) | (1L << NEW) | (1L << PPLUS) | (1L << MMINUS) | (1L << PLUS) | (1L << MINUS) | (1L << BIT_NOT) | (1L << LOG_NOT) | (1L << ID))) != 0)) {
						{
							setState(182);
							expr(0);
						}
					}

					setState(185);
					match(T__8);
					setState(186);
					stmt();
				}
				break;
				case FOR:
					_localctx = new ForLoopContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(187);
					match(FOR);
					setState(188);
					match(T__7);
					setState(190);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << CONSTANT) | (1L << NEW) | (1L << PPLUS) | (1L << MMINUS) | (1L << PLUS) | (1L << MINUS) | (1L << BIT_NOT) | (1L << LOG_NOT) | (1L << ID))) != 0)) {
						{
							setState(189);
							expr(0);
						}
					}

					setState(192);
					match(T__0);
					setState(194);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << CONSTANT) | (1L << NEW) | (1L << PPLUS) | (1L << MMINUS) | (1L << PLUS) | (1L << MINUS) | (1L << BIT_NOT) | (1L << LOG_NOT) | (1L << ID))) != 0)) {
						{
							setState(193);
							expr(0);
						}
					}

					setState(196);
					match(T__0);
					setState(198);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << CONSTANT) | (1L << NEW) | (1L << PPLUS) | (1L << MMINUS) | (1L << PLUS) | (1L << MINUS) | (1L << BIT_NOT) | (1L << LOG_NOT) | (1L << ID))) != 0)) {
						{
							setState(197);
							expr(0);
						}
					}

					setState(200);
					match(T__8);
					setState(201);
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

	public static class ShiftContext extends ExprContext {
		public Token op;

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public TerminalNode SHIFT_L() {
			return getToken(MangoParser.SHIFT_L, 0);
		}

		public TerminalNode SHIFR_R() {
			return getToken(MangoParser.SHIFR_R, 0);
		}

		public ShiftContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).enterShift(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).exitShift(this);
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
	}

	public static class FieldAndMethodContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public FieldAndMethodContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).enterFieldAndMethod(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).exitFieldAndMethod(this);
		}
	}

	public static class BitOrContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public TerminalNode BIT_OR() {
			return getToken(MangoParser.BIT_OR, 0);
		}

		public BitOrContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).enterBitOr(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).exitBitOr(this);
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
	}

	public static class LogOrContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public TerminalNode LOG_OR() {
			return getToken(MangoParser.LOG_OR, 0);
		}

		public LogOrContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).enterLogOr(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).exitLogOr(this);
		}
	}

	public static class ConstantContext extends ExprContext {
		public TerminalNode CONSTANT() {
			return getToken(MangoParser.CONSTANT, 0);
		}

		public ConstantContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).enterConstant(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).exitConstant(this);
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
	}

	public static class LogAndContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public TerminalNode LOG_AND() {
			return getToken(MangoParser.LOG_AND, 0);
		}

		public LogAndContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).enterLogAnd(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).exitLogAnd(this);
		}
	}

	public static class PlusMinusContext extends ExprContext {
		public Token op;

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public TerminalNode PLUS() {
			return getToken(MangoParser.PLUS, 0);
		}

		public TerminalNode MINUS() {
			return getToken(MangoParser.MINUS, 0);
		}

		public PlusMinusContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).enterPlusMinus(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).exitPlusMinus(this);
		}
	}

	public static class RelationContext extends ExprContext {
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

		public RelationContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).enterRelation(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).exitRelation(this);
		}
	}

	public static class LogNotContext extends ExprContext {
		public TerminalNode LOG_NOT() {
			return getToken(MangoParser.LOG_NOT, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
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
	}

	public static class BitXorContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public TerminalNode BIT_XOR() {
			return getToken(MangoParser.BIT_XOR, 0);
		}

		public BitXorContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).enterBitXor(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).exitBitXor(this);
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
	}

	public static class EqualContext extends ExprContext {
		public Token op;

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public TerminalNode EQ() {
			return getToken(MangoParser.EQ, 0);
		}

		public TerminalNode NEQ() {
			return getToken(MangoParser.NEQ, 0);
		}

		public EqualContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).enterEqual(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).exitEqual(this);
		}
	}

	public static class MulDicModContext extends ExprContext {
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

		public MulDicModContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).enterMulDicMod(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).exitMulDicMod(this);
		}
	}

	public static class BitAndContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public TerminalNode BIT_AND() {
			return getToken(MangoParser.BIT_AND, 0);
		}

		public BitAndContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).enterBitAnd(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).exitBitAnd(this);
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
	}

	public static class BitNotContext extends ExprContext {
		public TerminalNode BIT_NOT() {
			return getToken(MangoParser.BIT_NOT, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
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
	}

	public static class IdContext extends ExprContext {
		public TerminalNode ID() {
			return getToken(MangoParser.ID, 0);
		}

		public IdContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).enterId(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).exitId(this);
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
				setState(226);
				switch (getInterpreter().adaptivePredict(_input, 25, _ctx)) {
					case 1: {
						_localctx = new SelfOpPreContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;

						setState(205);
						((SelfOpPreContext) _localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if (!(_la == PPLUS || _la == MMINUS)) {
							((SelfOpPreContext) _localctx).op = (Token) _errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(206);
						expr(16);
					}
					break;
					case 2: {
						_localctx = new SignContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(207);
						((SignContext) _localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if (!(_la == PLUS || _la == MINUS)) {
							((SignContext) _localctx).op = (Token) _errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(208);
						expr(15);
					}
					break;
					case 3: {
						_localctx = new LogNotContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(209);
						match(LOG_NOT);
						setState(210);
						expr(14);
					}
					break;
					case 4: {
						_localctx = new BitNotContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(211);
						match(BIT_NOT);
						setState(212);
						expr(13);
					}
					break;
					case 5: {
						_localctx = new BracketContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(213);
						match(T__7);
						setState(214);
						expr(0);
						setState(215);
						match(T__8);
					}
					break;
					case 6: {
						_localctx = new ConstantContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(217);
						match(CONSTANT);
					}
					break;
					case 7: {
						_localctx = new IdContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(218);
						match(ID);
					}
					break;
					case 8: {
						_localctx = new CallContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(219);
						match(ID);
						setState(220);
						match(T__7);
						setState(222);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << CONSTANT) | (1L << NEW) | (1L << PPLUS) | (1L << MMINUS) | (1L << PLUS) | (1L << MINUS) | (1L << BIT_NOT) | (1L << LOG_NOT) | (1L << ID))) != 0)) {
							{
								setState(221);
								exprList();
							}
						}

						setState(224);
						match(T__8);
					}
					break;
					case 9: {
						_localctx = new CreationContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(225);
						creationExpr();
					}
					break;
				}
				_ctx.stop = _input.LT(-1);
				setState(273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 27, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(271);
							switch (getInterpreter().adaptivePredict(_input, 26, _ctx)) {
								case 1: {
									_localctx = new FieldAndMethodContext(new ExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(228);
									if (!(precpred(_ctx, 17)))
										throw new FailedPredicateException(this, "precpred(_ctx, 17)");
									setState(229);
									match(T__13);
									setState(230);
									expr(18);
								}
								break;
								case 2: {
									_localctx = new MulDicModContext(new ExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(231);
									if (!(precpred(_ctx, 11)))
										throw new FailedPredicateException(this, "precpred(_ctx, 11)");
									setState(232);
									((MulDicModContext) _localctx).op = _input.LT(1);
									_la = _input.LA(1);
									if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0))) {
										((MulDicModContext) _localctx).op = (Token) _errHandler.recoverInline(this);
									} else {
										consume();
									}
									setState(233);
									expr(12);
								}
								break;
								case 3: {
									_localctx = new PlusMinusContext(new ExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(234);
									if (!(precpred(_ctx, 10)))
										throw new FailedPredicateException(this, "precpred(_ctx, 10)");
									setState(235);
									((PlusMinusContext) _localctx).op = _input.LT(1);
									_la = _input.LA(1);
									if (!(_la == PLUS || _la == MINUS)) {
										((PlusMinusContext) _localctx).op = (Token) _errHandler.recoverInline(this);
									} else {
										consume();
									}
									setState(236);
									expr(11);
								}
								break;
								case 4: {
									_localctx = new ShiftContext(new ExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(237);
									if (!(precpred(_ctx, 9)))
										throw new FailedPredicateException(this, "precpred(_ctx, 9)");
									setState(238);
									((ShiftContext) _localctx).op = _input.LT(1);
									_la = _input.LA(1);
									if (!(_la == SHIFT_L || _la == SHIFR_R)) {
										((ShiftContext) _localctx).op = (Token) _errHandler.recoverInline(this);
									} else {
										consume();
									}
									setState(239);
									expr(10);
								}
								break;
								case 5: {
									_localctx = new RelationContext(new ExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(240);
									if (!(precpred(_ctx, 8)))
										throw new FailedPredicateException(this, "precpred(_ctx, 8)");
									setState(241);
									((RelationContext) _localctx).op = _input.LT(1);
									_la = _input.LA(1);
									if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LARGE) | (1L << LEQ) | (1L << GEQ))) != 0))) {
										((RelationContext) _localctx).op = (Token) _errHandler.recoverInline(this);
									} else {
										consume();
									}
									setState(242);
									expr(9);
								}
								break;
								case 6: {
									_localctx = new EqualContext(new ExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(243);
									if (!(precpred(_ctx, 7)))
										throw new FailedPredicateException(this, "precpred(_ctx, 7)");
									setState(244);
									((EqualContext) _localctx).op = _input.LT(1);
									_la = _input.LA(1);
									if (!(_la == EQ || _la == NEQ)) {
										((EqualContext) _localctx).op = (Token) _errHandler.recoverInline(this);
									} else {
										consume();
									}
									setState(245);
									expr(8);
								}
								break;
								case 7: {
									_localctx = new BitAndContext(new ExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(246);
									if (!(precpred(_ctx, 6)))
										throw new FailedPredicateException(this, "precpred(_ctx, 6)");
									setState(247);
									match(BIT_AND);
									setState(248);
									expr(7);
								}
								break;
								case 8: {
									_localctx = new BitXorContext(new ExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(249);
									if (!(precpred(_ctx, 5)))
										throw new FailedPredicateException(this, "precpred(_ctx, 5)");
									setState(250);
									match(BIT_XOR);
									setState(251);
									expr(6);
								}
								break;
								case 9: {
									_localctx = new BitOrContext(new ExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(252);
									if (!(precpred(_ctx, 4)))
										throw new FailedPredicateException(this, "precpred(_ctx, 4)");
									setState(253);
									match(BIT_OR);
									setState(254);
									expr(5);
								}
								break;
								case 10: {
									_localctx = new LogAndContext(new ExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(255);
									if (!(precpred(_ctx, 3)))
										throw new FailedPredicateException(this, "precpred(_ctx, 3)");
									setState(256);
									match(LOG_AND);
									setState(257);
									expr(4);
								}
								break;
								case 11: {
									_localctx = new LogOrContext(new ExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(258);
									if (!(precpred(_ctx, 2)))
										throw new FailedPredicateException(this, "precpred(_ctx, 2)");
									setState(259);
									match(LOG_OR);
									setState(260);
									expr(3);
								}
								break;
								case 12: {
									_localctx = new AssignContext(new ExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(261);
									if (!(precpred(_ctx, 1)))
										throw new FailedPredicateException(this, "precpred(_ctx, 1)");
									setState(262);
									match(T__1);
									setState(263);
									expr(1);
								}
								break;
								case 13: {
									_localctx = new SelfOpPostContext(new ExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(264);
									if (!(precpred(_ctx, 20)))
										throw new FailedPredicateException(this, "precpred(_ctx, 20)");
									setState(265);
									((SelfOpPostContext) _localctx).op = _input.LT(1);
									_la = _input.LA(1);
									if (!(_la == PPLUS || _la == MMINUS)) {
										((SelfOpPostContext) _localctx).op = (Token) _errHandler.recoverInline(this);
									} else {
										consume();
									}
								}
								break;
								case 14: {
									_localctx = new IndexContext(new ExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(266);
									if (!(precpred(_ctx, 18)))
										throw new FailedPredicateException(this, "precpred(_ctx, 18)");
									setState(267);
									match(T__2);
									setState(268);
									expr(0);
									setState(269);
									match(T__3);
								}
								break;
							}
						}
					}
					setState(275);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 27, _ctx);
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
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(276);
				expr(0);
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == T__10) {
					{
						{
							setState(277);
							match(T__10);
							setState(278);
							expr(0);
						}
					}
					setState(283);
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
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(284);
				match(T__14);
				setState(285);
				match(ID);
				setState(286);
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
	}

	public final ClassBlockContext classBlock() throws RecognitionException {
		ClassBlockContext _localctx = new ClassBlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(288);
				match(T__11);
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ID))) != 0)) {
					{
						{
							setState(289);
							memberDecl();
						}
					}
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(295);
				match(T__12);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class, 0);
		}

		public TerminalNode ID() {
			return getToken(MangoParser.ID, 0);
		}

		public MemberDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_memberDecl;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).enterMemberDecl(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof MangoListener) ((MangoListener) listener).exitMemberDecl(this);
		}
	}

	public final MemberDeclContext memberDecl() throws RecognitionException {
		MemberDeclContext _localctx = new MemberDeclContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_memberDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(297);
				type(0);
				setState(298);
				match(ID);
				setState(299);
				match(T__0);
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
			case 5:
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
				return precpred(_ctx, 17);
			case 2:
				return precpred(_ctx, 11);
			case 3:
				return precpred(_ctx, 10);
			case 4:
				return precpred(_ctx, 9);
			case 5:
				return precpred(_ctx, 8);
			case 6:
				return precpred(_ctx, 7);
			case 7:
				return precpred(_ctx, 6);
			case 8:
				return precpred(_ctx, 5);
			case 9:
				return precpred(_ctx, 4);
			case 10:
				return precpred(_ctx, 3);
			case 11:
				return precpred(_ctx, 2);
			case 12:
				return precpred(_ctx, 1);
			case 13:
				return precpred(_ctx, 20);
			case 14:
				return precpred(_ctx, 18);
		}
		return true;
	}

	public static final String _serializedATN =
			"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\39\u0130\4\2\t\2\4" +
					"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
					"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
					"\4\23\t\23\4\24\t\24\3\2\7\2*\n\2\f\2\16\2-\13\2\3\3\3\3\3\3\5\3\62\n" +
					"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4>\n\4\3\5\3\5\3\5\5\5C\n" +
					"\5\3\5\3\5\3\5\5\5H\n\5\3\6\3\6\3\6\3\6\6\6N\n\6\r\6\16\6O\3\7\3\7\3\7" +
					"\3\7\3\7\5\7W\n\7\3\7\3\7\6\7[\n\7\r\7\16\7\\\7\7_\n\7\f\7\16\7b\13\7" +
					"\3\b\3\b\3\b\3\b\5\bh\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bq\n\b\3\b\3\b" +
					"\5\bu\n\b\3\t\3\t\3\t\7\tz\n\t\f\t\16\t}\13\t\3\n\3\n\3\n\3\13\3\13\7" +
					"\13\u0084\n\13\f\13\16\13\u0087\13\13\3\13\3\13\3\f\5\f\u008c\n\f\3\f" +
					"\3\f\3\f\3\f\3\f\3\f\5\f\u0094\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r" +
					"\u009e\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16" +
					"\u00ab\n\16\f\16\16\16\u00ae\13\16\3\16\3\16\7\16\u00b2\n\16\f\16\16\16" +
					"\u00b5\13\16\3\17\3\17\3\17\5\17\u00ba\n\17\3\17\3\17\3\17\3\17\3\17\5" +
					"\17\u00c1\n\17\3\17\3\17\5\17\u00c5\n\17\3\17\3\17\5\17\u00c9\n\17\3\17" +
					"\3\17\5\17\u00cd\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20" +
					"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00e1\n\20\3\20\3\20\5\20" +
					"\u00e5\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20" +
					"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20" +
					"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20" +
					"\3\20\3\20\3\20\7\20\u0112\n\20\f\20\16\20\u0115\13\20\3\21\3\21\3\21" +
					"\7\21\u011a\n\21\f\21\16\21\u011d\13\21\3\22\3\22\3\22\3\22\3\23\3\23" +
					"\7\23\u0125\n\23\f\23\16\23\u0128\13\23\3\23\3\23\3\24\3\24\3\24\3\24" +
					"\3\24\2\4\f\36\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\b\3\2" +
					" !\3\2%&\3\2\"$\3\2\'(\3\2),\3\2-.\u0156\2+\3\2\2\2\4\61\3\2\2\2\6=\3" +
					"\2\2\2\bG\3\2\2\2\nM\3\2\2\2\fV\3\2\2\2\16t\3\2\2\2\20v\3\2\2\2\22~\3" +
					"\2\2\2\24\u0081\3\2\2\2\26\u0093\3\2\2\2\30\u009d\3\2\2\2\32\u009f\3\2" +
					"\2\2\34\u00cc\3\2\2\2\36\u00e4\3\2\2\2 \u0116\3\2\2\2\"\u011e\3\2\2\2" +
					"$\u0122\3\2\2\2&\u012b\3\2\2\2(*\5\4\3\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2" +
					"+,\3\2\2\2,\3\3\2\2\2-+\3\2\2\2.\62\5\6\4\2/\62\5\16\b\2\60\62\5\"\22" +
					"\2\61.\3\2\2\2\61/\3\2\2\2\61\60\3\2\2\2\62\5\3\2\2\2\63\64\5\f\7\2\64" +
					"\65\7\67\2\2\65\66\7\3\2\2\66>\3\2\2\2\678\5\f\7\289\7\67\2\29:\7\4\2" +
					"\2:;\5\36\20\2;<\7\3\2\2<>\3\2\2\2=\63\3\2\2\2=\67\3\2\2\2>\7\3\2\2\2" +
					"?@\7\34\2\2@B\5\f\7\2AC\5\n\6\2BA\3\2\2\2BC\3\2\2\2CH\3\2\2\2DE\7\34\2" +
					"\2EH\5\f\7\2FH\7\22\2\2G?\3\2\2\2GD\3\2\2\2GF\3\2\2\2H\t\3\2\2\2IJ\7\5" +
					"\2\2JK\5\36\20\2KL\7\6\2\2LN\3\2\2\2MI\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3" +
					"\2\2\2P\13\3\2\2\2QR\b\7\1\2RW\7\7\2\2SW\7\b\2\2TW\7\t\2\2UW\7\67\2\2" +
					"VQ\3\2\2\2VS\3\2\2\2VT\3\2\2\2VU\3\2\2\2W`\3\2\2\2XZ\f\3\2\2Y[\7\66\2" +
					"\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^X\3\2\2\2_b\3" +
					"\2\2\2`^\3\2\2\2`a\3\2\2\2a\r\3\2\2\2b`\3\2\2\2cd\5\f\7\2de\7\67\2\2e" +
					"g\7\n\2\2fh\5\20\t\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\7\13\2\2jk\5\24\13" +
					"\2ku\3\2\2\2lm\7\f\2\2mn\7\67\2\2np\7\n\2\2oq\5\20\t\2po\3\2\2\2pq\3\2" +
					"\2\2qr\3\2\2\2rs\7\13\2\2su\5\24\13\2tc\3\2\2\2tl\3\2\2\2u\17\3\2\2\2" +
					"v{\5\22\n\2wx\7\r\2\2xz\5\22\n\2yw\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2" +
					"\2|\21\3\2\2\2}{\3\2\2\2~\177\5\f\7\2\177\u0080\7\67\2\2\u0080\23\3\2" +
					"\2\2\u0081\u0085\7\16\2\2\u0082\u0084\5\26\f\2\u0083\u0082\3\2\2\2\u0084" +
					"\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2" +
					"\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7\17\2\2\u0089\25\3\2\2\2\u008a\u008c" +
					"\5\36\20\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2" +
					"\u008d\u0094\7\3\2\2\u008e\u0094\5\24\13\2\u008f\u0094\5\32\16\2\u0090" +
					"\u0094\5\34\17\2\u0091\u0094\5\30\r\2\u0092\u0094\5\6\4\2\u0093\u008b" +
					"\3\2\2\2\u0093\u008e\3\2\2\2\u0093\u008f\3\2\2\2\u0093\u0090\3\2\2\2\u0093" +
					"\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\27\3\2\2\2\u0095\u0096\7\35\2" +
					"\2\u0096\u0097\5\36\20\2\u0097\u0098\7\3\2\2\u0098\u009e\3\2\2\2\u0099" +
					"\u009a\7\36\2\2\u009a\u009e\7\3\2\2\u009b\u009c\7\37\2\2\u009c\u009e\7" +
					"\3\2\2\u009d\u0095\3\2\2\2\u009d\u0099\3\2\2\2\u009d\u009b\3\2\2\2\u009e" +
					"\31\3\2\2\2\u009f\u00a0\7\27\2\2\u00a0\u00a1\7\n\2\2\u00a1\u00a2\5\36" +
					"\20\2\u00a2\u00a3\7\13\2\2\u00a3\u00ac\5\26\f\2\u00a4\u00a5\7\31\2\2\u00a5" +
					"\u00a6\7\n\2\2\u00a6\u00a7\5\36\20\2\u00a7\u00a8\7\13\2\2\u00a8\u00a9" +
					"\5\26\f\2\u00a9\u00ab\3\2\2\2\u00aa\u00a4\3\2\2\2\u00ab\u00ae\3\2\2\2" +
					"\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b3\3\2\2\2\u00ae\u00ac" +
					"\3\2\2\2\u00af\u00b0\7\30\2\2\u00b0\u00b2\5\26\f\2\u00b1\u00af\3\2\2\2" +
					"\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\33" +
					"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\7\32\2\2\u00b7\u00b9\7\n\2\2" +
					"\u00b8\u00ba\5\36\20\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb" +
					"\3\2\2\2\u00bb\u00bc\7\13\2\2\u00bc\u00cd\5\26\f\2\u00bd\u00be\7\33\2" +
					"\2\u00be\u00c0\7\n\2\2\u00bf\u00c1\5\36\20\2\u00c0\u00bf\3\2\2\2\u00c0" +
					"\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\7\3\2\2\u00c3\u00c5\5\36" +
					"\20\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6" +
					"\u00c8\7\3\2\2\u00c7\u00c9\5\36\20\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3" +
					"\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\7\13\2\2\u00cb\u00cd\5\26\f\2\u00cc" +
					"\u00b6\3\2\2\2\u00cc\u00bd\3\2\2\2\u00cd\35\3\2\2\2\u00ce\u00cf\b\20\1" +
					"\2\u00cf\u00d0\t\2\2\2\u00d0\u00e5\5\36\20\22\u00d1\u00d2\t\3\2\2\u00d2" +
					"\u00e5\5\36\20\21\u00d3\u00d4\7\63\2\2\u00d4\u00e5\5\36\20\20\u00d5\u00d6" +
					"\7\62\2\2\u00d6\u00e5\5\36\20\17\u00d7\u00d8\7\n\2\2\u00d8\u00d9\5\36" +
					"\20\2\u00d9\u00da\7\13\2\2\u00da\u00e5\3\2\2\2\u00db\u00e5\7\22\2\2\u00dc" +
					"\u00e5\7\67\2\2\u00dd\u00de\7\67\2\2\u00de\u00e0\7\n\2\2\u00df\u00e1\5" +
					" \21\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2" +
					"\u00e5\7\13\2\2\u00e3\u00e5\5\b\5\2\u00e4\u00ce\3\2\2\2\u00e4\u00d1\3" +
					"\2\2\2\u00e4\u00d3\3\2\2\2\u00e4\u00d5\3\2\2\2\u00e4\u00d7\3\2\2\2\u00e4" +
					"\u00db\3\2\2\2\u00e4\u00dc\3\2\2\2\u00e4\u00dd\3\2\2\2\u00e4\u00e3\3\2" +
					"\2\2\u00e5\u0113\3\2\2\2\u00e6\u00e7\f\23\2\2\u00e7\u00e8\7\20\2\2\u00e8" +
					"\u0112\5\36\20\24\u00e9\u00ea\f\r\2\2\u00ea\u00eb\t\4\2\2\u00eb\u0112" +
					"\5\36\20\16\u00ec\u00ed\f\f\2\2\u00ed\u00ee\t\3\2\2\u00ee\u0112\5\36\20" +
					"\r\u00ef\u00f0\f\13\2\2\u00f0\u00f1\t\5\2\2\u00f1\u0112\5\36\20\f\u00f2" +
					"\u00f3\f\n\2\2\u00f3\u00f4\t\6\2\2\u00f4\u0112\5\36\20\13\u00f5\u00f6" +
					"\f\t\2\2\u00f6\u00f7\t\7\2\2\u00f7\u0112\5\36\20\n\u00f8\u00f9\f\b\2\2" +
					"\u00f9\u00fa\7/\2\2\u00fa\u0112\5\36\20\t\u00fb\u00fc\f\7\2\2\u00fc\u00fd" +
					"\7\60\2\2\u00fd\u0112\5\36\20\b\u00fe\u00ff\f\6\2\2\u00ff\u0100\7\61\2" +
					"\2\u0100\u0112\5\36\20\7\u0101\u0102\f\5\2\2\u0102\u0103\7\64\2\2\u0103" +
					"\u0112\5\36\20\6\u0104\u0105\f\4\2\2\u0105\u0106\7\65\2\2\u0106\u0112" +
					"\5\36\20\5\u0107\u0108\f\3\2\2\u0108\u0109\7\4\2\2\u0109\u0112\5\36\20" +
					"\3\u010a\u010b\f\26\2\2\u010b\u0112\t\2\2\2\u010c\u010d\f\24\2\2\u010d" +
					"\u010e\7\5\2\2\u010e\u010f\5\36\20\2\u010f\u0110\7\6\2\2\u0110\u0112\3" +
					"\2\2\2\u0111\u00e6\3\2\2\2\u0111\u00e9\3\2\2\2\u0111\u00ec\3\2\2\2\u0111" +
					"\u00ef\3\2\2\2\u0111\u00f2\3\2\2\2\u0111\u00f5\3\2\2\2\u0111\u00f8\3\2" +
					"\2\2\u0111\u00fb\3\2\2\2\u0111\u00fe\3\2\2\2\u0111\u0101\3\2\2\2\u0111" +
					"\u0104\3\2\2\2\u0111\u0107\3\2\2\2\u0111\u010a\3\2\2\2\u0111\u010c\3\2" +
					"\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114" +
					"\37\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u011b\5\36\20\2\u0117\u0118\7\r" +
					"\2\2\u0118\u011a\5\36\20\2\u0119\u0117\3\2\2\2\u011a\u011d\3\2\2\2\u011b" +
					"\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c!\3\2\2\2\u011d\u011b\3\2\2\2" +
					"\u011e\u011f\7\21\2\2\u011f\u0120\7\67\2\2\u0120\u0121\5$\23\2\u0121#" +
					"\3\2\2\2\u0122\u0126\7\16\2\2\u0123\u0125\5&\24\2\u0124\u0123\3\2\2\2" +
					"\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129" +
					"\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\7\17\2\2\u012a%\3\2\2\2\u012b" +
					"\u012c\5\f\7\2\u012c\u012d\7\67\2\2\u012d\u012e\7\3\2\2\u012e\'\3\2\2" +
					"\2 +\61=BGOV\\`gpt{\u0085\u008b\u0093\u009d\u00ac\u00b3\u00b9\u00c0\u00c4" +
					"\u00c8\u00cc\u00e0\u00e4\u0111\u0113\u011b\u0126";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());

	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}