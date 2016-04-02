package AST;

import Gadgets.Position;
import Gadgets.Symbol.VarSymbol;

/**
 * The variable declaration node (Global) in AST
 * Created by Ficos on 16/3/31.
 */
public class VarDecl extends Decl {
    VarSymbol var;
    ExprStmt creation;

    public VarDecl(VarSymbol _var, ExprStmt _creation, Position _pos) {
        super(_pos);
        var = _var;
        creation = _creation;
    }
}