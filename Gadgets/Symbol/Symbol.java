package Gadgets.Symbol;

import Gadgets.Scope;

/**
 * This abstract class serves as Value in {@link Scope} (which serves as a SymbolTable).
 * There are several extended Symbol type, all of these is intended to record the useful information of a {@link Gadgets.Name}.
 * Created by Ficos on 16/3/30.
 */
public abstract class Symbol {
    private Scope currentScope;

    Symbol(Scope _crrScope) {
        currentScope = _crrScope;
    }

    /**
     * This function returns the Scope where the symbol is defined.
     *
     * @return Original scope
     */
    public Scope getScope() {
        return currentScope;
    }
}