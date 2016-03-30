package Gadgets.Symbol;

import Gadgets.Scope;
import Gadgets.Type.Type;

/**
 * Created by Ficos on 16/3/30.
 */
public class FuncSymbol extends Symbol {
    Type returnType;

    FuncSymbol(Scope _crrScope, Type _type) {
        super(_crrScope);
        returnType = _type;
    }

    /**
     * To get the type the symbol represents.
     *
     * @return the representing type
     */
    Type getType() {
        return type;
    }
}
