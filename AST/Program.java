package AST;

import Gadgets.Position;
import Gadgets.Scope;

import java.util.List;

/**
 * The root of AST
 * Created by Ficos on 16/3/31.
 */
public class Program extends AST {
    List<Decl> decls;

    public Program(List<Decl> _decls, Scope _currScope, Position _pos) {
        super(_currScope, _pos);
        decls = _decls;
    }
}