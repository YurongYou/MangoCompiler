package AST;

import Gadgets.Position;
import Gadgets.Type.ClassType;

/**
 * The class declaration node in AST
 * Created by Ficos on 16/3/31.
 */
public class ClassDecl extends Decl {
    ClassType classType;

    public ClassDecl(ClassType _classType, Position _pos) {
        super(_pos);
        classType = _classType;
    }
}