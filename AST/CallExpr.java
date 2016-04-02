package AST;

import Gadgets.Name;
import Gadgets.Position;
import Gadgets.Symbol.FuncSymbol;
import Gadgets.Type.Type;

import java.util.List;

/**
 * The function call expression in AST.
 * Created by Ficos on 16/3/31.
 */
public class CallExpr extends ExprStmt {
    Name funcName;
    FuncSymbol funcInfo;
    List<Name> actualParameterName;
    List<Type> actualParameterType;

    public CallExpr(FuncSymbol _funcInfo, List<Name> _actualParameterName,
                    List<Type> _actualParameterType,
                    Position _pos) {
        super(_funcInfo.getReturnType(), _pos);
        funcInfo = _funcInfo;
        actualParameterName = _actualParameterName;
        actualParameterType = _actualParameterType;
    }
}