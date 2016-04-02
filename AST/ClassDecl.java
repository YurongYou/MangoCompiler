package AST;

import Gadgets.Position;
import Gadgets.Type.ClassType;

import java.util.List;

/**
 * The class declaration node in AST
 * Created by Ficos on 16/3/31.
 */
public class ClassDecl extends Decl {
    private ClassType classType;
    private List<VarDecl> variables;
    private List<FuncDecl> functions;

    public ClassDecl(List<VarDecl> _variables, List<FuncDecl> _functions, ClassType _classType, Position _pos) {
        super(_pos);
        classType = _classType;
        variables = _variables;
        functions = _functions;
    }
}