package AST;

import Gadgets.Name;
import Gadgets.Position;
import Gadgets.Scope.Scope;
import Gadgets.Symbol.FuncSymbol;

/**
 * The function declaration node in AST.
 * Created by Ficos on 16/3/31.
 */
public class FuncDecl extends Decl {
    /**
     * Reserve for further usage, all information can be retrieved from the {@link Scope} field in the base class
     */
    Name funcName;
    FuncSymbol info;
    CompoundStmt block;
    /**
     * FuncDelc node initializer
     *
     * @param _currScope the scope the function is in,
     *                   note that the scope should contain the funcSymbol
     *                   and the formal parameters VarSymbols of the function (if there are any)
     * @param _block the block subAST
     * @param _pos       the position of the function declaration in the original file
     * @param _funcName the {@link Name} object that refers to the function
     * @param _info function information
     */
    public FuncDecl(Name _funcName, FuncSymbol _info, CompoundStmt _block, Scope _currScope, Position _pos) {
        super(_currScope, _pos);
        funcName = _funcName;
        block = _block;
        info = _info;
    }
}