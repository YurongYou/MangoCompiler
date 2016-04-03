package AST;

import Gadgets.Position;

import java.util.List;

/**
 * The selection statement node in AST.
 * Note that if there are not any sub-selections, the two list will be set as null.
 * Created by Ficos on 16/3/31.
 */
public class SelectionStmt extends Stmt {
    ExprStmt condition;
    Stmt thenStmt;
    List<ExprStmt> subSelectionConditions;
    List<Stmt> subSelectionThenStmts;
    Stmt elseStmt;

    public SelectionStmt(ExprStmt _condition, Stmt _thenStmt, List<ExprStmt> _subSelectionConditions,
                         List<Stmt> _subSelectionThenStmts, Stmt _elseStmt, Position _pos) {
        super(_pos);
        condition = _condition;
        thenStmt = _thenStmt;
        subSelectionConditions = _subSelectionConditions;
        subSelectionThenStmts = _subSelectionThenStmts;
        elseStmt = _elseStmt;
    }

    public ExprStmt getCondition() {
        return condition;
    }

    public Stmt getThenStmt() {
        return thenStmt;
    }

    public List<ExprStmt> getSubSelectionConditions() {
        return subSelectionConditions;
    }

    public List<Stmt> getSubSelectionThenStmts() {
        return subSelectionThenStmts;
    }

    public Stmt getElseStmt() {
        return elseStmt;
    }
}