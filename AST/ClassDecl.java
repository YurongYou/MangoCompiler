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

    public ClassDecl(ClassType _classType, Position _pos) {
        super(_pos);
        classType = _classType;
    }
}