package AST;

import Gadgets.Position;
import Gadgets.Scope.Scope;

/**
 * The break statement node in AST.
 * Created by Ficos on 16/3/31.
 */
public class BreakStmt extends Stmt {
    public BreakStmt(Scope _currScope, Position _pos) {
        super(_currScope, _pos);
    }
}
