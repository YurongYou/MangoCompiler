package Gadgets.Symbol;

import Gadgets.Scope;
import Gadgets.Type.Type;

/**
 * Created by Ficos on 16/3/30.
 */
public class TypeSymbol extends Symbol {
    private Type type;

    TypeSymbol(Scope _crrScope, Type _type) {
        super(_crrScope);
        type = _type;
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