package AST;

import Gadgets.Name;
import Gadgets.Position;
import Gadgets.Scope.Scope;

/**
 * The class declaration node in AST
 * Created by Ficos on 16/3/31.
 */
public class ClassDecl extends Decl {
    /**
     * Reserve for further usage, all information can be retrieved from the {@link Scope} field in the base class
     */
    Name className;

    public ClassDecl(Scope _currScope, Position _pos) {
        super(_currScope, _pos);
    }
}