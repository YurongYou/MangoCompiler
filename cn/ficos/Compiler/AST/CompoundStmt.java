package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Position;

import java.util.List;

/**
 * The compound statement("{}") node in AST.
 *
 * Created by Ficos on 16/3/31.
 */
public class CompoundStmt extends Stmt {
    List<Stmt> stmts;

    public CompoundStmt(List<Stmt> _stmts, Position _pos) {
        super(_pos);
        stmts = _stmts;
    }

    public List<Stmt> getStmts() {
        return stmts;
    }
}