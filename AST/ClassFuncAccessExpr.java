package AST;

import Gadgets.Position;
import Gadgets.Symbol.FuncSymbol;

/**
 * The Class-function-access expression in AST.
 * Created by Ficos on 16/3/31.
 */
public class ClassFuncAccessExpr extends ExprStmt {
    ExprStmt classExpr;
    FuncSymbol funcInfo;

    public ClassFuncAccessExpr(ExprStmt _classExpr, FuncSymbol _funcInfo,
                               Position _pos) {
        super(_funcInfo.getReturnType(), _pos);
        classExpr = _classExpr;
        funcInfo = _funcInfo;
    }

    public ExprStmt getClassExpr() {
        return classExpr;
    }

    public FuncSymbol getFuncInfo() {
        return funcInfo;
    }
}