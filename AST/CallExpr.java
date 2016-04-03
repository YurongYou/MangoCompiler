package AST;

import Gadgets.Position;
import Gadgets.Symbol.FuncSymbol;

import java.util.List;

/**
 * The function call expression in AST.
 * Created by Ficos on 16/3/31.
 */
public class CallExpr extends ExprStmt {
    FuncSymbol funcInfo;
    List<ExprStmt> actualParameter;

    public CallExpr(FuncSymbol _funcInfo, List<ExprStmt> _actualParameter,
                    Position _pos) {
        super(_funcInfo.getReturnType(), _pos);
        funcInfo = _funcInfo;
        actualParameter = _actualParameter;
    }

    public FuncSymbol getFuncInfo() {
        return funcInfo;
    }

    public List<ExprStmt> getActualParameter() {
        return actualParameter;
    }
}