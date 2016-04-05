package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Name;
import cn.ficos.Compiler.Gadgets.Position;
import cn.ficos.Compiler.Gadgets.Type.Type;

/**
 * The field-access expression in AST.
 * Created by Ficos on 16/3/31.
 */
public class FieldAccessExpr extends ExprStmt implements LValue {
    ExprStmt lhs;
    Name field;

    public FieldAccessExpr(Type _type, ExprStmt _lhs, Name _field, Position _pos) {
        super(_type, _pos);
        lhs = _lhs;
        field = _field;
    }

    public ExprStmt getLhs() {
        return lhs;
    }

    public Name getField() {
        return field;
    }
}