package AST;

import Gadgets.Name;
import Gadgets.Position;
import Gadgets.Scope.Scope;
import Gadgets.Type.Type;

/**
 * The variable declaration node (Local) in AST.
 * Created by Ficos on 16/3/31.
 */
public class VarDeclStmt extends Stmt {
    /**
     * Reserve for further usage, all information can be retrieved from the {@link Scope} field in the base class
     */
    Name VarName;
    Type type;
    ExprStmt creation;

    VarDeclStmt(Name _VarName, Type _type, ExprStmt _creation, Scope _currScope, Position _pos) {
        super(_currScope, _pos);
        VarName = _VarName;
        type = _type;
        creation = _creation;
    }
}