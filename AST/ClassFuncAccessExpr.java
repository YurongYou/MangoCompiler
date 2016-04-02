package AST;

import Gadgets.Name;
import Gadgets.Position;
import Gadgets.Symbol.FuncSymbol;

/**
 * The Class-function-access expression in AST.
 * Created by Ficos on 16/3/31.
 */
public class ClassFuncAccessExpr extends ExprStmt {
    ExprStmt classExpr;
    Name funcName;
    FuncSymbol funcInfo;

    public ClassFuncAccessExpr(ExprStmt _classExpr, Name _funcName, FuncSymbol _funcInfo,
                               Position _pos) {
        super(_funcInfo.getReturnType(), _pos);
        classExpr = _classExpr;
        funcName = _funcName;
        funcInfo = _funcInfo;
    }
}