package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Position;
import cn.ficos.Compiler.Gadgets.Type.ArrayType;

/**
 * The get-index expression in AST.
 * Created by Ficos on 16/3/31.
 */
public class IndexExpr extends ExprStmt implements LValue {
    ExprStmt base;
    ExprStmt index;

    public IndexExpr(ExprStmt _base, ExprStmt _index, Position _pos) {
        super(((ArrayType) _base.getType()).getBaseType(), _pos);
        base = _base;
        index = _index;
    }

    public ExprStmt getBase() {
        return base;
    }

    public ExprStmt getIndex() {
        return index;
    }
}