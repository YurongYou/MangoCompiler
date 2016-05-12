package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Position;
import cn.ficos.Compiler.Gadgets.SymbolTable;

/**
 * The logical-not expression in AST.
 */
public class LogNotExpr extends ExprStmt {
    ExprStmt base;

    public LogNotExpr(ExprStmt _base, Position _pos) {
        super(SymbolTable.BOOL, _pos);
        base = _base;
    }

    public ExprStmt getBase() {
        return base;
    }
}
