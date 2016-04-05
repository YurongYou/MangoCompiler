package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Position;
import cn.ficos.Compiler.Gadgets.SymbolTable;

/**
 * The sign expression in AST.
 * Created by Ficos on 16/3/31.
 */
public class SignExpr extends ExprStmt {
    ExprStmt base;
    Boolean op;

    public SignExpr(Boolean _op, ExprStmt _base, Position _pos) {
        super(SymbolTable.INT, _pos);
        base = _base;
        op = _op;
    }

    public ExprStmt getBase() {
        return base;
    }

    public Boolean getOp() {
        return op;
    }
}