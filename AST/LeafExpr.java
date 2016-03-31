package AST;

import Gadgets.Name;
import Gadgets.Position;
import Gadgets.Scope.Scope;
import Gadgets.Type.Type;

/**
 * The node expression node in the AST, it can be ID, int, bool or string or null(set {@link Type} as null in base class {@link ExprStmt}).
 * Created by Ficos on 16/3/31.
 */
public class LeafExpr extends ExprStmt {
    Name name;

    public LeafExpr(Name _name, Type _type, Scope _currScope, Position _pos) {
        super(_type, _currScope, _pos);
        name = _name;
    }
}