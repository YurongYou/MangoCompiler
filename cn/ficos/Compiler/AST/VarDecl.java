package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Position;
import cn.ficos.Compiler.Gadgets.Symbol.VarSymbol;

/**
 * The variable declaration node (Global) in AST
 * Created by Ficos on 16/3/31.
 */
public class VarDecl extends Decl {
    private VarSymbol var;
    private ExprStmt creation;

    public VarDecl(VarSymbol _var, ExprStmt _creation, Position _pos) {
        super(_pos);
        var = _var;
        creation = _creation;
    }

    public VarSymbol getVar() {
        return var;
    }

    public ExprStmt getCreation() {
        return creation;
    }
}