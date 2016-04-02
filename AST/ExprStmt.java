package AST;

import Gadgets.Position;
import Gadgets.Type.Type;

/**
 * The expression statement node in AST.
 * Note that every expression must have a Type
 * Created by Ficos on 16/3/31.
 */
public abstract class ExprStmt extends Stmt {
    private Type type;

    public ExprStmt(Type _type, Position _pos) {
        super(_pos);
        type = _type;
    }

    public Type getType() {
        return type;
    }
}