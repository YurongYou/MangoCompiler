package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Exceptions.Bug_TextError;
import cn.ficos.Compiler.Gadgets.Operand.Constant;
import cn.ficos.Compiler.Gadgets.Position;
import cn.ficos.Compiler.Gadgets.SymbolTable;

/**
 * The literal bool node in AST
 */
public class BoolExpr extends ExprStmt {
    Boolean value;

    public BoolExpr(String text, Position _pos) throws Bug_TextError {
        super(SymbolTable.BOOL, _pos, new Constant(parseBool(text)));
        if (text.equals("true")) value = true;
        else if (text.equals("false")) value = false;
        else throw new Bug_TextError();
    }

    private static int parseBool(String text) {
        if (text.equals("true")) return 1;
        else if (text.equals("false")) return 0;
        else throw new Bug_TextError();
    }

    public static void main(String[] args) {
        BoolExpr test = new BoolExpr("false", new Position(0));
        System.out.println(test.getValue());
    }

    public Boolean getValue() {
        return value;
    }
}