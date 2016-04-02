package Gadgets.Type;

import Gadgets.Name;
import Gadgets.Symbol.FuncSymbol;
import Gadgets.Symbol.VarSymbol;

import java.util.List;

/**
 * Type for user defined class.
 * It stores all class information, including all class variable, class functions
 * Remember to call ".equals(Type rhs)" to compare types
 * Created by Ficos on 16/3/30.
 */
public class ClassType extends Type {
    List<VarSymbol> variables;
    List<FuncSymbol> functions;
    Name className;

    /**
     * Creation of a ClassType. Note that every class will only be created once.
     *
     * @param _variables all variables in the class. Note that all class variables's name is "ClassName.VarName"
     * @param _functions all functions in the class. Note that all class functions's name is "ClassName.FuncName"
     */
    public ClassType(Name _className, List<VarSymbol> _variables, List<FuncSymbol> _functions) {
        className = _className;
        variables = _variables;
        functions = _functions;
    }

    @Override
    public Boolean isSuitableAs(Type rhs) {
        return (this == rhs);
    }
}