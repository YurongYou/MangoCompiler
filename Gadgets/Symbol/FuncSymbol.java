package Gadgets.Symbol;

import CompileException.Redefine;
import Gadgets.Name;
import Gadgets.Scope.Scope;
import Gadgets.Type.Type;

import java.util.List;
import java.util.ListIterator;

/**
 * This derived class represents a function symbol
 * Note that if the function has no return value, the returnType will be set as null.
 * Created by Ficos on 16/3/30.
 */
public class FuncSymbol extends Symbol {
    Type returnType;
    List<Type> formalParameterType;

    //just to make printing easy
    List<Name> formalParameterName;

    /**
     * Creation function of funcSymbol. Define the formal parameters in the current scope
     *
     * @param _crrScope   scope the function lies in (prepare for building class function)
     * @param _returnType the function's return type (null if "void")
     * @param FPN         the function's formal parameter Name List
     * @param FPT         the function's formal parameter Type List
     */
    public FuncSymbol(Scope _crrScope, Type _returnType, List<Name> FPN, List<Type> FPT) throws Redefine {
        super(_crrScope);
        _crrScope = new Scope(_crrScope);

        if (FPN != null) {
            ListIterator<Name> itrN = FPN.listIterator(0);
            ListIterator<Type> itrT = FPT.listIterator(0);
            while (itrN.hasNext()) {
                VarSymbol var = new VarSymbol(_crrScope, itrT.next());
                _crrScope.define(itrN.next(), var);
            }
        }

        returnType = _returnType;

        formalParameterName = FPN;
        formalParameterType = FPT;
    }

    /**
     * To get the return type of the function that the symbol represents
     *
     * @return the return type
     */
    public Type getReturnType() {
        return returnType;
    }

    /**
     * To test whether Actual Parameters are type suitable for Formal Parameters
     *
     * @param APT Actual Parameters Type list (LinkedList)
     * @return true if all right
     */
    public Boolean isValidParameters(List<Type> APT) {
        if (APT.size() != formalParameterType.size()) return false;

        ListIterator<Type> itrA = APT.listIterator(0);
        ListIterator<Type> itrF = formalParameterType.listIterator(0);

        while (itrA.hasNext()) {
            if (itrA.next() != itrF.next()) return false;
        }
        return true;
    }
}