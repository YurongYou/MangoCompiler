package AST;

import Gadgets.Position;
import Gadgets.Scope.Scope;

/**
 * The continue statement node in AST.
 * Created by Ficos on 16/3/31.
 */
public class ContinueStmt extends Stmt {
    public ContinueStmt(Scope _currScope, Position _pos) {
        super(_currScope, _pos);
    }
}
