package AST;

import Gadgets.Name;
import Gadgets.Position;
import Gadgets.Type.Type;

/**
 * The variable declaration node (Local) in AST.
 * Created by Ficos on 16/3/31.
 */
public class VarDeclStmt extends Stmt {
    Name VarName;
    Type type;
    ExprStmt creation;

    VarDeclStmt(Name _VarName, Type _type, ExprStmt _creation, Position _pos) {
        super(_pos);
        VarName = _VarName;
        type = _type;
        creation = _creation;
    }
}