package AST;

import Gadgets.Position;
import Gadgets.SymbolTable;

/**
 * The literal string node in AST
 * Created by Ficos on 16/4/2.
 */
public class StringExpr extends ExprStmt {
    String text;

    public StringExpr(String _text, Position _pos) {
        super(SymbolTable.STRING, _pos);
        text = _text;
    }

    public String getText() {
        return text;
    }
}