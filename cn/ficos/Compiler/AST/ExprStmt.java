package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Operand.LocalRegister;
import cn.ficos.Compiler.Gadgets.Operand.Operand;
import cn.ficos.Compiler.Gadgets.Position;
import cn.ficos.Compiler.Gadgets.Type.Type;

/**
 * The expression statement node in AST.
 * Note that every expression must have a Type
 * It contains a operand of localRegister
 * Created by Ficos on 16/3/31.
 */
public abstract class ExprStmt extends Stmt {
    private Type type;
    private Operand operand;

    public ExprStmt(Type _type, Position _pos) {
        super(_pos);
        type = _type;
        operand = new LocalRegister();
    }

    public ExprStmt(Type _type, Position _pos, Operand _operand) {
        super(_pos);
        type = _type;
        operand = _operand;
    }

    public Operand getOperand() {
        return operand;
    }

    public void changeOperand(Operand _operand) {
        operand = _operand;
    }

    public Type getType() {
        return type;
    }
}