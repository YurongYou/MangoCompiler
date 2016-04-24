package cn.ficos.Compiler.Gadgets.Symbol;

import cn.ficos.Compiler.Gadgets.Name;
import cn.ficos.Compiler.Gadgets.Type.Type;
import cn.ficos.Compiler.IR.Label;

import java.util.List;
import java.util.ListIterator;

/**
 * This derived class represents a function symbol
 * Note that if the function has no return value, the returnType will be set as null.
 * Created by Ficos on 16/3/30.
 */
public class FuncSymbol extends Symbol {
    private Type returnType;
    private List<Type> formalParameterType = null;
    private List<Name> formalParameterName = null;
    private Label funcLabel = null;

    /**
     * Creation function of funcSymbol. Define the formal parameters in the current scope
     *
     * @param _returnType the function's return type (null if "void")
     * @param FPN         the function's formal parameter Name List
     * @param FPT         the function's formal parameter Type List
     */
    public FuncSymbol(Name _funcName, Type _returnType, List<Name> FPN, List<Type> FPT) {
        super(_funcName);
        returnType = _returnType;

        formalParameterName = FPN;
        formalParameterType = FPT;

        funcLabel = new Label("function:" + _funcName);
    }

    public Label getFuncLabel() {
        return funcLabel;
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
     * To get the formal parameters Name list of the function that the symbol represents
     *
     * @return the formal parameters Name list
     */
    public List<Name> getFormalParametersName() {
        return formalParameterName;
    }

    /**
     * To get the formal parameters type list of the function that the symbol represents
     *
     * @return the formal parameters type list
     */
    public List<Type> getFormalParametersType() {
        return formalParameterType;
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
            if (!itrA.next().isSuitableAs(itrF.next())) return false;
        }
        return true;
    }
}