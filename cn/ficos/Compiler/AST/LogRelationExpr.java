package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Position;
import cn.ficos.Compiler.Gadgets.SymbolTable;

/**
 * Binary Logical Relation: && ||
 * Created by Ficos on 16/4/25.
 */
public class LogRelationExpr extends ExprStmt {
    ExprStmt lhs;
    ExprStmt rhs;
    //    true means &&, false means ||
    private boolean relation;

    public LogRelationExpr(ExprStmt _lhs, boolean _relation, ExprStmt _rhs, Position _pos) {
        super(SymbolTable.BOOL, _pos, null);
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
