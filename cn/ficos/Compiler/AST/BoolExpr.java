package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Exceptions.Bug_TextError;
import cn.ficos.Compiler.Gadgets.Position;
import cn.ficos.Compiler.Gadgets.SymbolTable;

/**
 * The literal bool node in AST
 * Created by Ficos on 16/4/2.
 */
public class BoolExpr extends ExprStmt {
    Boolean value;

    public BoolExpr(String text, Position _pos) throws Bug_TextError {
        super(SymbolTable.BOOL, _pos);
        if (text.equals("true")) value = true;
        else if (text.equals("false")) value = false;
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