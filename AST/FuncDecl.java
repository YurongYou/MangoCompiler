package AST;

import Gadgets.Position;
import Gadgets.Symbol.FuncSymbol;

/**
 * The function declaration node in AST.
 * Created by Ficos on 16/3/31.
 */
public class FuncDecl extends Decl {
    FuncSymbol info;
    CompoundStmt block;
    /**
     * FuncDelc node initializer
     *
     * @param _block the block subAST
     * @param _pos       the position of the function declaration in the original file
     * @param _info function information
     */
    public FuncDecl(FuncSymbol _info, CompoundStmt _block, Position _pos) {
        super(_pos);
        block = _block;
        info = _info;
    }
}