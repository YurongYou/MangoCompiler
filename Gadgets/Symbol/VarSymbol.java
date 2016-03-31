package Gadgets.Symbol;

import Gadgets.Scope.Scope;
import Gadgets.Type.Type;

/**
 * This derived class represents a variable symbol
 * Created by Ficos on 16/3/30.
 */
public class VarSymbol extends Symbol {
    Type type;

    VarSymbol(Scope _crrScope, Type _type) {
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
