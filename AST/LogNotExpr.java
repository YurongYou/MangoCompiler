package AST;

import Gadgets.Position;
import Gadgets.SymbolTable;

/**
 * The logical-not expression in AST.
 * Created by Ficos on 16/3/31.
 */
public class LogNotExpr extends ExprStmt {
    ExprStmt base;

    public LogNotExpr(ExprStmt _base, Position _pos) {
        super(SymbolTable.BOOL, _pos);
        base = _base;
    }
}
