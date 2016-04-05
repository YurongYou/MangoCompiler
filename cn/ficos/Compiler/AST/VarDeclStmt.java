package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Position;
import cn.ficos.Compiler.Gadgets.Symbol.VarSymbol;

/**
 * The variable declaration node (Local) in AST.
 * Created by Ficos on 16/3/31.
 */
public class VarDeclStmt extends Stmt {
    VarSymbol varInfo;
    ExprStmt creation;

    public VarDeclStmt(VarSymbol _varInfo, ExprStmt _creation, Position _pos) {
        super(_pos);
        varInfo = _varInfo;
        creation = _creation;
    }

    public VarSymbol getVarInfo() {
        return varInfo;
    }

    public ExprStmt getCreation() {
        return creation;
    }
}