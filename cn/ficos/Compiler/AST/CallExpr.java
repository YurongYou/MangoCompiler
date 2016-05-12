package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Operand.Operand;
import cn.ficos.Compiler.Gadgets.Position;
import cn.ficos.Compiler.Gadgets.Symbol.FuncSymbol;

import java.util.List;

/**
 * The function call expression in AST.
 */
public class CallExpr extends ExprStmt {
    FuncSymbol funcInfo;
    List<ExprStmt> actualParameter;

    /**
     * This kind of initializing function automatically set result operand as a local register
     *
     * @param _funcInfo        the function symbol
     * @param _actualParameter the function actual parameters (ASTs)
     * @param _pos             the position
     */
    public CallExpr(FuncSymbol _funcInfo, List<ExprStmt> _actualParameter,
                    Position _pos) {
        super(_funcInfo.getReturnType(), _pos);
        funcInfo = _funcInfo;
        actualParameter = _actualParameter;
    }

    /**
     * Support for null return functions (specify the operand as null)
     * @param _funcInfo the function symbol
     * @param _actualParameter the function actual parameters (ASTs)
     * @param _pos the position
     * @param _operand the result operand
     */
    public CallExpr(FuncSymbol _funcInfo, List<ExprStmt> _actualParameter,
                    Position _pos, Operand _operand) {
        super(_funcInfo.getReturnType(), _pos, _operand);
        funcInfo = _funcInfo;
        actualParameter = _actualParameter;
    }

    /**
     * get the corresponding function symbol
     * @return the function symbol
     */
    public FuncSymbol getFuncInfo() {
        return funcInfo;
    }

    public List<ExprStmt> getActualParameter() {
        return actualParameter;
    }
}