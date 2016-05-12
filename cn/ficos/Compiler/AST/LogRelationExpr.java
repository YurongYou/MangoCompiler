package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Position;
import cn.ficos.Compiler.Gadgets.SymbolTable;

/**
 * Binary Logical Relation: && ||
 * This kind of AST is designed for the convenience of short-cut evaluation in building IR
 */
public class LogRelationExpr extends ExprStmt {
    ExprStmt lhs;
    ExprStmt rhs;
    //    true means &&, false means ||
    private boolean relation;

    public LogRelationExpr(ExprStmt _lhs, boolean _relation, ExprStmt _rhs, Position _pos) {
        super(SymbolTable.BOOL, _pos);
        relation = _relation;
        lhs = _lhs;
        rhs = _rhs;
    }

    public ExprStmt getLhs() {
        return lhs;
    }

    public ExprStmt getRhs() {
        return rhs;
    }

    public boolean isAnd() {
        return relation;
    }
}
