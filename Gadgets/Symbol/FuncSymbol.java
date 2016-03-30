package Gadgets.Symbol;

import Gadgets.Name;
import Gadgets.Scope;
import Gadgets.Type.Type;

import java.util.ArrayList;

/**
 * This derived class represents a function symbol
 * Note that if the function has no return value, the returnType will be set as null.
 * Created by Ficos on 16/3/30.
 */
public class FuncSymbol extends Symbol {
    Type returnType;
    ArrayList<Name> formalParameterName;
    ArrayList<Type> formalParameterType;

    /**
     * Creation function of funcSymbol
     *
     * @param _crrScope   scope the function lies in (prepare for building class function)
     * @param _returnType the function's return type (null if "void")
     * @param FPN         the function's formal parameter Name List
     * @param FPT         the function's formal parameter Type List
     */
    FuncSymbol(Scope _crrScope, Type _returnType, ArrayList<Name> FPN, ArrayList<Type> FPT) {
        super(_crrScope);
        returnType = _returnType;
        formalParameterName = FPN;
        formalParameterType = FPT;
    }

    /**
     * To get the return type of the function that the symbol represents
     *
     * @return the return type
     */
    Type getReturnType() {
        return returnType;
    }

    /**
     * To test whether Actual Parameters are type suitable for Formal Parameters
     *
     * @param APT Actual Parameters Type list (ArrayList)
     * @return true if all right
     */
    public Boolean isValidParameters(ArrayList<Type> APT) {
        if (APT.size() != formalParameterType.size()) return false;
        for (int i = 0; i < APT.size(); ++i) {
            if (!APT.get(i).isSuitableAs(formalParameterType.get(i))) return false;
        }
        return true;
    }
}