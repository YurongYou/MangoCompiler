package AST;

import Gadgets.Position;
import Gadgets.Scope.Scope;
import Gadgets.Type.Type;

/**
 * The atom creation expression (e.g. new int) node in AST
 * Created by Ficos on 16/3/31.
 */
public class AtomCreationExpr extends ExprStmt {
    public AtomCreationExpr(Type _type, Scope _currScope, Position _pos) {
        super(_type, _currScope, _pos);
    }
}
