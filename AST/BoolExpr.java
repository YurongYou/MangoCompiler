package AST;

import CompileException.TextError;
import Gadgets.Position;
import Gadgets.SymbolTable;

/**
 * The literal bool node in AST
 * Created by Ficos on 16/4/2.
 */
public class BoolExpr extends ExprStmt {
    Boolean value;

    public BoolExpr(String text, Position _pos) throws TextError {
        super(SymbolTable.BOOL, _pos);
        if (text.equals("true")) value = true;
        else if (text.equals("false")) value = false;
        else throw new TextError();
    }

    public Boolean getValue() {
        return value;
    }

    public static void main(String[] args) {
        BoolExpr test = new BoolExpr("false", new Position());
        System.out.println(test.getValue());
    }
}