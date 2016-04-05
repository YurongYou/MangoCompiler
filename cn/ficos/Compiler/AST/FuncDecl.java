package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Position;
import cn.ficos.Compiler.Gadgets.Symbol.FuncSymbol;

import java.util.List;

/**
 * The function declaration node in AST.
 * Created by Ficos on 16/3/31.
 */
public class FuncDecl extends Decl {
    FuncSymbol info;
    List<Stmt> stmts;

    /**
     * FuncDelc node initializer
     *
     * @param _stmts all statements in the function
     * @param _pos   the position of the function declaration in the original file
     * @param _info  function information
     */
    public FuncDecl(FuncSymbol _info, List<Stmt> _stmts, Position _pos) {
        super(_pos);
        stmts = _stmts;
        info = _info;
    }

    public List<Stmt> getStmts() {
        return stmts;
    }

    public void fillStmts(List<Stmt> _stmts) {
        stmts = _stmts;
    }

    public FuncSymbol getFuncInfo() {
        return info;
    }

    public FuncSymbol getInfo() {
        return info;
    }
}