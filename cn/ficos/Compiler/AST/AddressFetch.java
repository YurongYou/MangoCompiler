package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Operand.LocalRegister;

/**
 * This interface is intended to identify Index and FieldAccess note when constructing IR
 * <p>
 * Created by Ficos on 16/4/20.
 */
public interface AddressFetch {
    LocalRegister getAddressOperand();

    LocalRegister getResultOperand();
}