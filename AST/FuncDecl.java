package AST;

import Gadgets.Name;
import Gadgets.Position;
import Gadgets.Scope;

/**
 * The function declaration node in AST
 * Created by Ficos on 16/3/31.
 */
public class FuncDecl extends Decl {
    //for further convenience
    Name funcName;

    /**
     * FuncDelc node initializer
     *
     * @param _currScope the scope the function is in, note that the scope should contain the formal parameters of the function (if there are any)
     * @param _pos       the position of the function declaration in the original file
     * @param _functName the {@link Name} object that refers to the function
     */
    public FuncDecl(Scope _currScope, Position _pos, Name _functName) {
        super(_currScope, _pos);
        funcName = _functName;
    }
}