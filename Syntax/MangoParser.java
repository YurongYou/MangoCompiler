// Generated from /Users/youyurong/Dropbox/课程/Compiler/Mango/src/SyntaxAnalysis/Mango.g4 by ANTLR 4.5.1
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
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, CONSTANT = 17,
            INT = 18, STRING = 19, BOOL = 20, NULL = 21, IF = 22, ELSE = 23, ELSEIF = 24, WHILE = 25,
            FOR = 26, NEW = 27, RETURN = 28, BREAK = 29, CONTINUE = 30, PPLUS = 31, MMINUS = 32,
            MULT = 33, DIV = 34, MOD = 35, PLUS = 36, MINUS = 37, SHIFT_L = 38, SHIFR_R = 39, LESS = 40,
            LARGE = 41, LEQ = 42, GEQ = 43, EQ = 44, NEQ = 45, BIT_AND = 46, BIT_XOR = 47, BIT_OR = 48,
            BIT_NOT = 49, LOG_NOT = 50, LOG_AND = 51, LOG_OR = 52, ID = 53, LINE_COMMENT = 54,
            WS = 55;
    public static final int
            RULE_prog = 0, RULE_decl = 1, RULE_varDecl = 2, RULE_creationExpr = 3,
            RULE_dimExpr = 4, RULE_type = 5, RULE_returnType = 6, RULE_funcDecl = 7,
            RULE_formalParameterList = 8, RULE_formalParameter = 9, RULE_block = 10,
            RULE_stmt = 11, RULE_jumpStmt = 12, RULE_selectionStmt = 13, RULE_iterationStmt = 14,
            RULE_expr = 15, RULE_exprList = 16, RULE_classDecl = 17, RULE_classBlock = 18,
            RULE_memberDecl = 19;
    public static final String[] ruleNames = {
            "prog", "decl", "varDecl", "creationExpr", "dimExpr", "type", "returnType",
            "funcDecl", "formalParameterList", "formalParameter", "block", "stmt",
            "jumpStmt", "selectionStmt", "iterationStmt", "expr", "exprList", "classDecl",
            "classBlock", "memberDecl"
    };

    private static final String[] _LITERAL_NAMES = {
            null, "';'", "'='", "'['", "']'", "'bool'", "'int'", "'string'", "'[]'",
            "'void'", "'('", "')'", "','", "'{'", "'}'", "'.'", "'class'", null, null,
            null, null, "'null'", "'if'", "'else'", "'else if'", "'while'", "'for'",
            "'new'", "'return'", "'break'", "'continue'", "'++'", "'--'", "'*'", "'/'",
            "'%'", "'+'", "'-'", "'<<'", "'>>'", "'<'", "'>'", "'<='", "'>='", "'=='",
            "'!='", "'&'", "'^'", "'|'", "'~'", "'!'", "'&&'", "'||'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, "CONSTANT", "INT", "STRING", "BOOL", "NULL",
            "IF", "ELSE", "ELSEIF", "WHILE", "FOR", "NEW", "RETURN", "BREAK", "CONTINUE",
            "PPLUS", "MMINUS", "MULT", "DIV", "MOD", "PLUS", "MINUS", "SHIFT_L", "SHIFR_R",
            "LESS", "LARGE", "LEQ", "GEQ", "EQ", "NEQ", "BIT_AND", "BIT_XOR", "BIT_OR",
            "BIT_NOT", "LOG_NOT", "LOG_AND", "LOG_OR", "ID", "LINE_COMMENT", "WS"
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
                setState(43);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__15) | (1L << ID))) != 0)) {
                    {
                        {
                            setState(40);
                            decl();
                        }
                    }
                    setState(45);
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
            setState(49);
            switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(46);
                    varDecl();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(47);
                    funcDecl();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(48);
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
            setState(61);
            switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(51);
                    type(0);
                    setState(52);
                    match(ID);
                    setState(53);
                    match(T__0);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(55);
                    type(0);
                    setState(56);
                    match(ID);
                    setState(57);
                    match(T__1);
                    setState(58);
                    expr(0);
                    setState(59);
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

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitCreationExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final CreationExprContext creationExpr() throws RecognitionException {
        CreationExprContext _localctx = new CreationExprContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_creationExpr);
        try {
            setState(71);
            switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(63);
                    match(NEW);
                    setState(64);
                    type(0);
                    setState(66);
                    switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
                        case 1: {
                            setState(65);
                            dimExpr();
                        }
                        break;
                    }
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(68);
                    match(NEW);
                    setState(69);
                    type(0);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(70);
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

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitDimExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final DimExprContext dimExpr() throws RecognitionException {
        DimExprContext _localctx = new DimExprContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_dimExpr);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(77);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1: {
                            {
                                setState(73);
                                match(T__2);
                                setState(74);
                                expr(0);
                                setState(75);
                                match(T__3);
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(79);
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
        public TerminalNode ID() {
            return getToken(MangoParser.ID, 0);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
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
        int _startState = 10;
        enterRecursionRule(_localctx, 10, RULE_type, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(86);
                switch (_input.LA(1)) {
                    case T__4: {
                        setState(82);
                        match(T__4);
                    }
                    break;
                    case T__5: {
                        setState(83);
                        match(T__5);
                    }
                    break;
                    case T__6: {
                        setState(84);
                        match(T__6);
                    }
                    break;
                    case ID: {
                        setState(85);
                        match(ID);
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                _ctx.stop = _input.LT(-1);
                setState(96);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new TypeContext(_parentctx, _parentState);
                                pushNewRecursionContext(_localctx, _startState, RULE_type);
                                setState(88);
                                if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                                setState(90);
                                _errHandler.sync(this);
                                _alt = 1;
                                do {
                                    switch (_alt) {
                                        case 1: {
                                            {
                                                setState(89);
                                                match(T__7);
                                            }
                                        }
                                        break;
                                        default:
                                            throw new NoViableAltException(this);
                                    }
                                    setState(92);
                                    _errHandler.sync(this);
                                    _alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
                                } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
                            }
                        }
                    }
                    setState(98);
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

    public static class ReturnTypeContext extends ParserRuleContext {
        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_returnType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).enterReturnType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MangoListener) ((MangoListener) listener).exitReturnType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitReturnType(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ReturnTypeContext returnType() throws RecognitionException {
        ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_returnType);
        try {
            setState(101);
            switch (_input.LA(1)) {
                case T__4:
                case T__5:
                case T__6:
                case ID:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(99);
                    type(0);
                }
                break;
                case T__8:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(100);
                    match(T__8);
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

    public static class FuncDeclContext extends ParserRuleContext {
        public ReturnTypeContext returnType() {
            return getRuleContext(ReturnTypeContext.class, 0);
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
        enterRule(_localctx, 14, RULE_funcDecl);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(103);
                returnType();
                setState(104);
                match(ID);
                setState(105);
                match(T__9);
                setState(107);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ID))) != 0)) {
                    {
                        setState(106);
                        formalParameterList();
                    }
                }

                setState(109);
                match(T__10);
                setState(110);
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
        enterRule(_localctx, 16, RULE_formalParameterList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(112);
                formalParameter();
                setState(117);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__11) {
                    {
                        {
                            setState(113);
                            match(T__11);
                            setState(114);
                            formalParameter();
                        }
                    }
                    setState(119);
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
        enterRule(_localctx, 18, RULE_formalParameter);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(120);
                type(0);
                setState(121);
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
        enterRule(_localctx, 20, RULE_block);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(123);
                match(T__12);
                setState(127);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__12) | (1L << CONSTANT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << NEW) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << PPLUS) | (1L << MMINUS) | (1L << PLUS) | (1L << MINUS) | (1L << BIT_NOT) | (1L << LOG_NOT) | (1L << ID))) != 0)) {
                    {
                        {
                            setState(124);
                            stmt();
                        }
                    }
                    setState(129);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(130);
                match(T__13);
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

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitStmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public final StmtContext stmt() throws RecognitionException {
        StmtContext _localctx = new StmtContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_stmt);
        int _la;
        try {
            setState(141);
            switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(133);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << CONSTANT) | (1L << NEW) | (1L << PPLUS) | (1L << MMINUS) | (1L << PLUS) | (1L << MINUS) | (1L << BIT_NOT) | (1L << LOG_NOT) | (1L << ID))) != 0)) {
                        {
                            setState(132);
                            expr(0);
                        }
                    }

                    setState(135);
                    match(T__0);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(136);
                    block();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(137);
                    selectionStmt();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(138);
                    iterationStmt();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(139);
                    jumpStmt();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(140);
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

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitContinueStmt(this);
            else return visitor.visitChildren(this);
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

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitBreakStmt(this);
            else return visitor.visitChildren(this);
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

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitReturnStmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public final JumpStmtContext jumpStmt() throws RecognitionException {
        JumpStmtContext _localctx = new JumpStmtContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_jumpStmt);
        try {
            setState(151);
            switch (_input.LA(1)) {
                case RETURN:
                    _localctx = new ReturnStmtContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(143);
                    match(RETURN);
                    setState(144);
                    expr(0);
                    setState(145);
                    match(T__0);
                }
                break;
                case BREAK:
                    _localctx = new BreakStmtContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(147);
                    match(BREAK);
                    setState(148);
                    match(T__0);
                }
                break;
                case CONTINUE:
                    _localctx = new ContinueStmtContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(149);
                    match(CONTINUE);
                    setState(150);
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

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitSelectionStmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SelectionStmtContext selectionStmt() throws RecognitionException {
        SelectionStmtContext _localctx = new SelectionStmtContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_selectionStmt);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(153);
                match(IF);
                setState(154);
                match(T__9);
                setState(155);
                expr(0);
                setState(156);
                match(T__10);
                setState(157);
                stmt();
                setState(166);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 16, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(158);
                                match(ELSEIF);
                                setState(159);
                                match(T__9);
                                setState(160);
                                expr(0);
                                setState(161);
                                match(T__10);
                                setState(162);
                                stmt();
                            }
                        }
                    }
                    setState(168);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 16, _ctx);
                }
                setState(173);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 17, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(169);
                                match(ELSE);
                                setState(170);
                                stmt();
                            }
                        }
                    }
                    setState(175);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 17, _ctx);
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

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitForLoop(this);
            else return visitor.visitChildren(this);
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

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitWhileLoop(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IterationStmtContext iterationStmt() throws RecognitionException {
        IterationStmtContext _localctx = new IterationStmtContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_iterationStmt);
        int _la;
        try {
            setState(198);
            switch (_input.LA(1)) {
                case WHILE:
                    _localctx = new WhileLoopContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(176);
                    match(WHILE);
                    setState(177);
                    match(T__9);
                    setState(179);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << CONSTANT) | (1L << NEW) | (1L << PPLUS) | (1L << MMINUS) | (1L << PLUS) | (1L << MINUS) | (1L << BIT_NOT) | (1L << LOG_NOT) | (1L << ID))) != 0)) {
                        {
                            setState(178);
                            expr(0);
                        }
                    }

                    setState(181);
                    match(T__10);
                    setState(182);
                    stmt();
                }
                break;
                case FOR:
                    _localctx = new ForLoopContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(183);
                    match(FOR);
                    setState(184);
                    match(T__9);
                    setState(186);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << CONSTANT) | (1L << NEW) | (1L << PPLUS) | (1L << MMINUS) | (1L << PLUS) | (1L << MINUS) | (1L << BIT_NOT) | (1L << LOG_NOT) | (1L << ID))) != 0)) {
                        {
                            setState(185);
                            expr(0);
                        }
                    }

                    setState(188);
                    match(T__0);
                    setState(190);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << CONSTANT) | (1L << NEW) | (1L << PPLUS) | (1L << MMINUS) | (1L << PLUS) | (1L << MINUS) | (1L << BIT_NOT) | (1L << LOG_NOT) | (1L << ID))) != 0)) {
                        {
                            setState(189);
                            expr(0);
                        }
                    }

                    setState(192);
                    match(T__0);
                    setState(194);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << CONSTANT) | (1L << NEW) | (1L << PPLUS) | (1L << MMINUS) | (1L << PLUS) | (1L << MINUS) | (1L << BIT_NOT) | (1L << LOG_NOT) | (1L << ID))) != 0)) {
                        {
                            setState(193);
                            expr(0);
                        }
                    }

                    setState(196);
                    match(T__10);
                    setState(197);
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

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitShift(this);
            else return visitor.visitChildren(this);
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

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitFieldAndMethod(this);
            else return visitor.visitChildren(this);
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

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitBitOr(this);
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

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitLogOr(this);
            else return visitor.visitChildren(this);
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

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitConstant(this);
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

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitLogAnd(this);
            else return visitor.visitChildren(this);
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

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitPlusMinus(this);
            else return visitor.visitChildren(this);
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

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitRelation(this);
            else return visitor.visitChildren(this);
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

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitLogNot(this);
            else return visitor.visitChildren(this);
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

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitBitXor(this);
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

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitEqual(this);
            else return visitor.visitChildren(this);
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

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitMulDicMod(this);
            else return visitor.visitChildren(this);
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

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitBitAnd(this);
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

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitBitNot(this);
            else return visitor.visitChildren(this);
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

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitId(this);
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
        int _startState = 30;
        enterRecursionRule(_localctx, 30, RULE_expr, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(222);
                switch (getInterpreter().adaptivePredict(_input, 24, _ctx)) {
                    case 1: {
                        _localctx = new SelfOpPreContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(201);
                        ((SelfOpPreContext) _localctx).op = _input.LT(1);
                        _la = _input.LA(1);
                        if (!(_la == PPLUS || _la == MMINUS)) {
                            ((SelfOpPreContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                        } else {
                            consume();
                        }
                        setState(202);
                        expr(16);
                    }
                    break;
                    case 2: {
                        _localctx = new SignContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(203);
                        ((SignContext) _localctx).op = _input.LT(1);
                        _la = _input.LA(1);
                        if (!(_la == PLUS || _la == MINUS)) {
                            ((SignContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                        } else {
                            consume();
                        }
                        setState(204);
                        expr(15);
                    }
                    break;
                    case 3: {
                        _localctx = new LogNotContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(205);
                        match(LOG_NOT);
                        setState(206);
                        expr(14);
                    }
                    break;
                    case 4: {
                        _localctx = new BitNotContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(207);
                        match(BIT_NOT);
                        setState(208);
                        expr(13);
                    }
                    break;
                    case 5: {
                        _localctx = new BracketContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(209);
                        match(T__9);
                        setState(210);
                        expr(0);
                        setState(211);
                        match(T__10);
                    }
                    break;
                    case 6: {
                        _localctx = new ConstantContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(213);
                        match(CONSTANT);
                    }
                    break;
                    case 7: {
                        _localctx = new IdContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(214);
                        match(ID);
                    }
                    break;
                    case 8: {
                        _localctx = new CallContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(215);
                        match(ID);
                        setState(216);
                        match(T__9);
                        setState(218);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << CONSTANT) | (1L << NEW) | (1L << PPLUS) | (1L << MMINUS) | (1L << PLUS) | (1L << MINUS) | (1L << BIT_NOT) | (1L << LOG_NOT) | (1L << ID))) != 0)) {
                            {
                                setState(217);
                                exprList();
                            }
                        }

                        setState(220);
                        match(T__10);
                    }
                    break;
                    case 9: {
                        _localctx = new CreationContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(221);
                        creationExpr();
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(269);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 26, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(267);
                            switch (getInterpreter().adaptivePredict(_input, 25, _ctx)) {
                                case 1: {
                                    _localctx = new FieldAndMethodContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(224);
                                    if (!(precpred(_ctx, 17)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 17)");
                                    setState(225);
                                    match(T__14);
                                    setState(226);
                                    expr(18);
                                }
                                break;
                                case 2: {
                                    _localctx = new MulDicModContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(227);
                                    if (!(precpred(_ctx, 11)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                                    setState(228);
                                    ((MulDicModContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0))) {
                                        ((MulDicModContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        consume();
                                    }
                                    setState(229);
                                    expr(12);
                                }
                                break;
                                case 3: {
                                    _localctx = new PlusMinusContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(230);
                                    if (!(precpred(_ctx, 10)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                                    setState(231);
                                    ((PlusMinusContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == PLUS || _la == MINUS)) {
                                        ((PlusMinusContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        consume();
                                    }
                                    setState(232);
                                    expr(11);
                                }
                                break;
                                case 4: {
                                    _localctx = new ShiftContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(233);
                                    if (!(precpred(_ctx, 9)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                                    setState(234);
                                    ((ShiftContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == SHIFT_L || _la == SHIFR_R)) {
                                        ((ShiftContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        consume();
                                    }
                                    setState(235);
                                    expr(10);
                                }
                                break;
                                case 5: {
                                    _localctx = new RelationContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(236);
                                    if (!(precpred(_ctx, 8)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                                    setState(237);
                                    ((RelationContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LARGE) | (1L << LEQ) | (1L << GEQ))) != 0))) {
                                        ((RelationContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        consume();
                                    }
                                    setState(238);
                                    expr(9);
                                }
                                break;
                                case 6: {
                                    _localctx = new EqualContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(239);
                                    if (!(precpred(_ctx, 7)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                                    setState(240);
                                    ((EqualContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == EQ || _la == NEQ)) {
                                        ((EqualContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        consume();
                                    }
                                    setState(241);
                                    expr(8);
                                }
                                break;
                                case 7: {
                                    _localctx = new BitAndContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(242);
                                    if (!(precpred(_ctx, 6)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                                    setState(243);
                                    match(BIT_AND);
                                    setState(244);
                                    expr(7);
                                }
                                break;
                                case 8: {
                                    _localctx = new BitXorContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(245);
                                    if (!(precpred(_ctx, 5)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                                    setState(246);
                                    match(BIT_XOR);
                                    setState(247);
                                    expr(6);
                                }
                                break;
                                case 9: {
                                    _localctx = new BitOrContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(248);
                                    if (!(precpred(_ctx, 4)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    setState(249);
                                    match(BIT_OR);
                                    setState(250);
                                    expr(5);
                                }
                                break;
                                case 10: {
                                    _localctx = new LogAndContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(251);
                                    if (!(precpred(_ctx, 3)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(252);
                                    match(LOG_AND);
                                    setState(253);
                                    expr(4);
                                }
                                break;
                                case 11: {
                                    _localctx = new LogOrContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(254);
                                    if (!(precpred(_ctx, 2)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                    setState(255);
                                    match(LOG_OR);
                                    setState(256);
                                    expr(3);
                                }
                                break;
                                case 12: {
                                    _localctx = new AssignContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(257);
                                    if (!(precpred(_ctx, 1)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                                    setState(258);
                                    match(T__1);
                                    setState(259);
                                    expr(1);
                                }
                                break;
                                case 13: {
                                    _localctx = new SelfOpPostContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(260);
                                    if (!(precpred(_ctx, 20)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 20)");
                                    setState(261);
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
                                    setState(262);
                                    if (!(precpred(_ctx, 18)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 18)");
                                    setState(263);
                                    match(T__2);
                                    setState(264);
                                    expr(0);
                                    setState(265);
                                    match(T__3);
                                }
                                break;
                            }
                        }
                    }
                    setState(271);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 26, _ctx);
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
                setState(272);
                expr(0);
                setState(277);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__11) {
                    {
                        {
                            setState(273);
                            match(T__11);
                            setState(274);
                            expr(0);
                        }
                    }
                    setState(279);
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
                setState(280);
                match(T__15);
                setState(281);
                match(ID);
                setState(282);
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
                setState(284);
                match(T__12);
                setState(288);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ID))) != 0)) {
                    {
                        {
                            setState(285);
                            memberDecl();
                        }
                    }
                    setState(290);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(291);
                match(T__13);
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

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MangoVisitor) return ((MangoVisitor<? extends T>) visitor).visitMemberDecl(this);
            else return visitor.visitChildren(this);
        }
    }

    public final MemberDeclContext memberDecl() throws RecognitionException {
        MemberDeclContext _localctx = new MemberDeclContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_memberDecl);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(293);
                type(0);
                setState(294);
                match(ID);
                setState(295);
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
            case 15:
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
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\39\u012c\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\3\2\7\2,\n\2\f\2\16\2/\13\2\3\3\3\3\3\3" +
                    "\5\3\64\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\5\3\5\3" +
                    "\5\5\5E\n\5\3\5\3\5\3\5\5\5J\n\5\3\6\3\6\3\6\3\6\6\6P\n\6\r\6\16\6Q\3" +
                    "\7\3\7\3\7\3\7\3\7\5\7Y\n\7\3\7\3\7\6\7]\n\7\r\7\16\7^\7\7a\n\7\f\7\16" +
                    "\7d\13\7\3\b\3\b\5\bh\n\b\3\t\3\t\3\t\3\t\5\tn\n\t\3\t\3\t\3\t\3\n\3\n" +
                    "\3\n\7\nv\n\n\f\n\16\ny\13\n\3\13\3\13\3\13\3\f\3\f\7\f\u0080\n\f\f\f" +
                    "\16\f\u0083\13\f\3\f\3\f\3\r\5\r\u0088\n\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r" +
                    "\u0090\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u009a\n\16\3\17" +
                    "\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00a7\n\17\f\17" +
                    "\16\17\u00aa\13\17\3\17\3\17\7\17\u00ae\n\17\f\17\16\17\u00b1\13\17\3" +
                    "\20\3\20\3\20\5\20\u00b6\n\20\3\20\3\20\3\20\3\20\3\20\5\20\u00bd\n\20" +
                    "\3\20\3\20\5\20\u00c1\n\20\3\20\3\20\5\20\u00c5\n\20\3\20\3\20\5\20\u00c9" +
                    "\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21" +
                    "\3\21\3\21\3\21\3\21\3\21\5\21\u00dd\n\21\3\21\3\21\5\21\u00e1\n\21\3" +
                    "\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3" +
                    "\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3" +
                    "\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3" +
                    "\21\7\21\u010e\n\21\f\21\16\21\u0111\13\21\3\22\3\22\3\22\7\22\u0116\n" +
                    "\22\f\22\16\22\u0119\13\22\3\23\3\23\3\23\3\23\3\24\3\24\7\24\u0121\n" +
                    "\24\f\24\16\24\u0124\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\2\4\f \26" +
                    "\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\b\3\2!\"\3\2&\'\3\2#%" +
                    "\3\2()\3\2*-\3\2./\u0150\2-\3\2\2\2\4\63\3\2\2\2\6?\3\2\2\2\bI\3\2\2\2" +
                    "\nO\3\2\2\2\fX\3\2\2\2\16g\3\2\2\2\20i\3\2\2\2\22r\3\2\2\2\24z\3\2\2\2" +
                    "\26}\3\2\2\2\30\u008f\3\2\2\2\32\u0099\3\2\2\2\34\u009b\3\2\2\2\36\u00c8" +
                    "\3\2\2\2 \u00e0\3\2\2\2\"\u0112\3\2\2\2$\u011a\3\2\2\2&\u011e\3\2\2\2" +
                    "(\u0127\3\2\2\2*,\5\4\3\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\3\3" +
                    "\2\2\2/-\3\2\2\2\60\64\5\6\4\2\61\64\5\20\t\2\62\64\5$\23\2\63\60\3\2" +
                    "\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64\5\3\2\2\2\65\66\5\f\7\2\66\67\7\67" +
                    "\2\2\678\7\3\2\28@\3\2\2\29:\5\f\7\2:;\7\67\2\2;<\7\4\2\2<=\5 \21\2=>" +
                    "\7\3\2\2>@\3\2\2\2?\65\3\2\2\2?9\3\2\2\2@\7\3\2\2\2AB\7\35\2\2BD\5\f\7" +
                    "\2CE\5\n\6\2DC\3\2\2\2DE\3\2\2\2EJ\3\2\2\2FG\7\35\2\2GJ\5\f\7\2HJ\7\23" +
                    "\2\2IA\3\2\2\2IF\3\2\2\2IH\3\2\2\2J\t\3\2\2\2KL\7\5\2\2LM\5 \21\2MN\7" +
                    "\6\2\2NP\3\2\2\2OK\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\13\3\2\2\2S" +
                    "T\b\7\1\2TY\7\7\2\2UY\7\b\2\2VY\7\t\2\2WY\7\67\2\2XS\3\2\2\2XU\3\2\2\2" +
                    "XV\3\2\2\2XW\3\2\2\2Yb\3\2\2\2Z\\\f\3\2\2[]\7\n\2\2\\[\3\2\2\2]^\3\2\2" +
                    "\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`Z\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2" +
                    "\2\2c\r\3\2\2\2db\3\2\2\2eh\5\f\7\2fh\7\13\2\2ge\3\2\2\2gf\3\2\2\2h\17" +
                    "\3\2\2\2ij\5\16\b\2jk\7\67\2\2km\7\f\2\2ln\5\22\n\2ml\3\2\2\2mn\3\2\2" +
                    "\2no\3\2\2\2op\7\r\2\2pq\5\26\f\2q\21\3\2\2\2rw\5\24\13\2st\7\16\2\2t" +
                    "v\5\24\13\2us\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\23\3\2\2\2yw\3\2" +
                    "\2\2z{\5\f\7\2{|\7\67\2\2|\25\3\2\2\2}\u0081\7\17\2\2~\u0080\5\30\r\2" +
                    "\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2" +
                    "\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7\20\2\2\u0085" +
                    "\27\3\2\2\2\u0086\u0088\5 \21\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2" +
                    "\2\u0088\u0089\3\2\2\2\u0089\u0090\7\3\2\2\u008a\u0090\5\26\f\2\u008b" +
                    "\u0090\5\34\17\2\u008c\u0090\5\36\20\2\u008d\u0090\5\32\16\2\u008e\u0090" +
                    "\5\6\4\2\u008f\u0087\3\2\2\2\u008f\u008a\3\2\2\2\u008f\u008b\3\2\2\2\u008f" +
                    "\u008c\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\31\3\2\2" +
                    "\2\u0091\u0092\7\36\2\2\u0092\u0093\5 \21\2\u0093\u0094\7\3\2\2\u0094" +
                    "\u009a\3\2\2\2\u0095\u0096\7\37\2\2\u0096\u009a\7\3\2\2\u0097\u0098\7" +
                    " \2\2\u0098\u009a\7\3\2\2\u0099\u0091\3\2\2\2\u0099\u0095\3\2\2\2\u0099" +
                    "\u0097\3\2\2\2\u009a\33\3\2\2\2\u009b\u009c\7\30\2\2\u009c\u009d\7\f\2" +
                    "\2\u009d\u009e\5 \21\2\u009e\u009f\7\r\2\2\u009f\u00a8\5\30\r\2\u00a0" +
                    "\u00a1\7\32\2\2\u00a1\u00a2\7\f\2\2\u00a2\u00a3\5 \21\2\u00a3\u00a4\7" +
                    "\r\2\2\u00a4\u00a5\5\30\r\2\u00a5\u00a7\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a7" +
                    "\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00af\3\2" +
                    "\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7\31\2\2\u00ac\u00ae\5\30\r\2\u00ad" +
                    "\u00ab\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2" +
                    "\2\2\u00b0\35\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7\33\2\2\u00b3\u00b5" +
                    "\7\f\2\2\u00b4\u00b6\5 \21\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6" +
                    "\u00b7\3\2\2\2\u00b7\u00b8\7\r\2\2\u00b8\u00c9\5\30\r\2\u00b9\u00ba\7" +
                    "\34\2\2\u00ba\u00bc\7\f\2\2\u00bb\u00bd\5 \21\2\u00bc\u00bb\3\2\2\2\u00bc" +
                    "\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\7\3\2\2\u00bf\u00c1\5 " +
                    "\21\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2" +
                    "\u00c4\7\3\2\2\u00c3\u00c5\5 \21\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2" +
                    "\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7\r\2\2\u00c7\u00c9\5\30\r\2\u00c8" +
                    "\u00b2\3\2\2\2\u00c8\u00b9\3\2\2\2\u00c9\37\3\2\2\2\u00ca\u00cb\b\21\1" +
                    "\2\u00cb\u00cc\t\2\2\2\u00cc\u00e1\5 \21\22\u00cd\u00ce\t\3\2\2\u00ce" +
                    "\u00e1\5 \21\21\u00cf\u00d0\7\64\2\2\u00d0\u00e1\5 \21\20\u00d1\u00d2" +
                    "\7\63\2\2\u00d2\u00e1\5 \21\17\u00d3\u00d4\7\f\2\2\u00d4\u00d5\5 \21\2" +
                    "\u00d5\u00d6\7\r\2\2\u00d6\u00e1\3\2\2\2\u00d7\u00e1\7\23\2\2\u00d8\u00e1" +
                    "\7\67\2\2\u00d9\u00da\7\67\2\2\u00da\u00dc\7\f\2\2\u00db\u00dd\5\"\22" +
                    "\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e1" +
                    "\7\r\2\2\u00df\u00e1\5\b\5\2\u00e0\u00ca\3\2\2\2\u00e0\u00cd\3\2\2\2\u00e0" +
                    "\u00cf\3\2\2\2\u00e0\u00d1\3\2\2\2\u00e0\u00d3\3\2\2\2\u00e0\u00d7\3\2" +
                    "\2\2\u00e0\u00d8\3\2\2\2\u00e0\u00d9\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1" +
                    "\u010f\3\2\2\2\u00e2\u00e3\f\23\2\2\u00e3\u00e4\7\21\2\2\u00e4\u010e\5" +
                    " \21\24\u00e5\u00e6\f\r\2\2\u00e6\u00e7\t\4\2\2\u00e7\u010e\5 \21\16\u00e8" +
                    "\u00e9\f\f\2\2\u00e9\u00ea\t\3\2\2\u00ea\u010e\5 \21\r\u00eb\u00ec\f\13" +
                    "\2\2\u00ec\u00ed\t\5\2\2\u00ed\u010e\5 \21\f\u00ee\u00ef\f\n\2\2\u00ef" +
                    "\u00f0\t\6\2\2\u00f0\u010e\5 \21\13\u00f1\u00f2\f\t\2\2\u00f2\u00f3\t" +
                    "\7\2\2\u00f3\u010e\5 \21\n\u00f4\u00f5\f\b\2\2\u00f5\u00f6\7\60\2\2\u00f6" +
                    "\u010e\5 \21\t\u00f7\u00f8\f\7\2\2\u00f8\u00f9\7\61\2\2\u00f9\u010e\5" +
                    " \21\b\u00fa\u00fb\f\6\2\2\u00fb\u00fc\7\62\2\2\u00fc\u010e\5 \21\7\u00fd" +
                    "\u00fe\f\5\2\2\u00fe\u00ff\7\65\2\2\u00ff\u010e\5 \21\6\u0100\u0101\f" +
                    "\4\2\2\u0101\u0102\7\66\2\2\u0102\u010e\5 \21\5\u0103\u0104\f\3\2\2\u0104" +
                    "\u0105\7\4\2\2\u0105\u010e\5 \21\3\u0106\u0107\f\26\2\2\u0107\u010e\t" +
                    "\2\2\2\u0108\u0109\f\24\2\2\u0109\u010a\7\5\2\2\u010a\u010b\5 \21\2\u010b" +
                    "\u010c\7\6\2\2\u010c\u010e\3\2\2\2\u010d\u00e2\3\2\2\2\u010d\u00e5\3\2" +
                    "\2\2\u010d\u00e8\3\2\2\2\u010d\u00eb\3\2\2\2\u010d\u00ee\3\2\2\2\u010d" +
                    "\u00f1\3\2\2\2\u010d\u00f4\3\2\2\2\u010d\u00f7\3\2\2\2\u010d\u00fa\3\2" +
                    "\2\2\u010d\u00fd\3\2\2\2\u010d\u0100\3\2\2\2\u010d\u0103\3\2\2\2\u010d" +
                    "\u0106\3\2\2\2\u010d\u0108\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2" +
                    "\2\2\u010f\u0110\3\2\2\2\u0110!\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0117" +
                    "\5 \21\2\u0113\u0114\7\16\2\2\u0114\u0116\5 \21\2\u0115\u0113\3\2\2\2" +
                    "\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118#\3" +
                    "\2\2\2\u0119\u0117\3\2\2\2\u011a\u011b\7\22\2\2\u011b\u011c\7\67\2\2\u011c" +
                    "\u011d\5&\24\2\u011d%\3\2\2\2\u011e\u0122\7\17\2\2\u011f\u0121\5(\25\2" +
                    "\u0120\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123" +
                    "\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\7\20\2\2" +
                    "\u0126\'\3\2\2\2\u0127\u0128\5\f\7\2\u0128\u0129\7\67\2\2\u0129\u012a" +
                    "\7\3\2\2\u012a)\3\2\2\2\37-\63?DIQX^bgmw\u0081\u0087\u008f\u0099\u00a8" +
                    "\u00af\u00b5\u00bc\u00c0\u00c4\u00c8\u00dc\u00e0\u010d\u010f\u0117\u0122";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}