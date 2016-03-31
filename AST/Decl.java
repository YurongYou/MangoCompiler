package AST;

import Gadgets.Position;
import Gadgets.Scope.Scope;

/**
 * The abstract node class for declaration in AST
 * Created by Ficos on 16/3/31.
 */
public abstract class Decl extends AST {
    Decl(Scope _currScope, Position _pos) {
        super(_currScope, _pos);
    }
}