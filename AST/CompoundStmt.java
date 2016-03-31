package AST;

import Gadgets.Position;
import Gadgets.Scope.Scope;

import java.util.List;

/**
 * The compound statement("{}") node in AST.
 *
 * Created by Ficos on 16/3/31.
 */
public class CompoundStmt extends Stmt {
    List<Stmt> stmts;

    public CompoundStmt(List<Stmt> _stmts, Scope _currScope, Position _pos) {
        super(_currScope, _pos);
        stmts = _stmts;
    }
}