package cn.ficos.Compiler.CodeGeneration;

import cn.ficos.Compiler.Gadgets.CONSTANT;
import cn.ficos.Compiler.Gadgets.Operand.Constant;
import cn.ficos.Compiler.Gadgets.Operand.Operand;
import cn.ficos.Compiler.Gadgets.Operand.Register;
import cn.ficos.Compiler.Gadgets.Symbol.FuncSymbol;
import cn.ficos.Compiler.Gadgets.Symbol.VarSymbol;
import cn.ficos.Compiler.IR.*;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;

/**
 * This class is used to generate the naive MIPS code.
 * <p>
 * Created by Ficos on 16/4/28.
 */
public class NaiveMIPSGenerator {
    PrintStream out;
    LinkedList<Function> functions = new LinkedList<>();
    LinkedList<String> data;

    public NaiveMIPSGenerator(IRBuilder IR_builder, OutputStream _out) {
        out = new PrintStream(_out);
        data = IR_builder.getData();
        functions.add(new Function(IR_builder.getInitialization(), null));
        ListIterator<LinkedList<IRNode>> funcItr = IR_builder.getFunctions().listIterator(0);
        ListIterator<FuncSymbol> infoItr = IR_builder.getFuncInfo().listIterator();
        while (funcItr.hasNext()) {
            functions.add(new Function(funcItr.next(), infoItr.next()));
        }
        print();
    }

    void print() {
//        first the .data area
        out.println(".data");
        for (String s : data) {
            out.println(s);
        }
//        then the instructions
        out.println(".text");
        for (Function f : functions) {
            f.translate();
            out.println();
        }
    }

    class Function {
        int maxArgu = 0;
        Map<Register, Integer> offset = new HashMap<>();
        LinkedList<IRNode> instructions;

        public Function(LinkedList<IRNode> func, FuncSymbol _info) {
            instructions = func;
            if (_info != null) {
                int count = 0;
                for (VarSymbol var : _info.getParameter()) {
                    offset.put(var.getReg(), count * CONSTANT.wordSize);
                    ++count;
                }
            }
            for (IRNode e : instructions) {
                if (e instanceof Call) {
                    if (((Call) e).getParameters() != null &&
                            ((Call) e).getParameters().size() > maxArgu) maxArgu = ((Call) e).getParameters().size();
                }
            }
            for (IRNode e : instructions) {
                if (e instanceof Binary) {
                    if (!offset.containsKey(((Binary) e).getTarget())) {
                        offset.put(((Binary) e).getTarget(), 4 * (maxArgu + offset.size()));
                    }
                    continue;
                }
                if (e instanceof Call) {
                    if (((Call) e).getTarget() != null && !offset.containsKey(((Call) e).getTarget())) {
                        offset.put(((Call) e).getTarget(), 4 * (maxArgu + offset.size()));
                    }
                    continue;
                }
                if (e instanceof Load) {
                    if (!offset.containsKey(((Load) e).getTarget())) {
                        offset.put(((Load) e).getTarget(), 4 * (maxArgu + offset.size()));
                    }
                    continue;
                }
                if (e instanceof LoadAddress) {
                    if (!offset.containsKey(((LoadAddress) e).getTarget())) {
                        offset.put(((LoadAddress) e).getTarget(), 4 * (maxArgu + offset.size()));
                    }
                    continue;
                }
                if (e instanceof LoadImm) {
                    if (!offset.containsKey(((LoadImm) e).getReg())) {
                        offset.put(((LoadImm) e).getReg(), 4 * (maxArgu + offset.size()));
                    }
                }
                if (e instanceof LoadFromLabel) {
                    if (!offset.containsKey(((LoadFromLabel) e).getTarget())) {
                        offset.put(((LoadFromLabel) e).getTarget(), 4 * (maxArgu + offset.size()));
                    }
                    continue;
                }
                if (e instanceof Move) {
                    if (!offset.containsKey(((Move) e).getTarget())) {
                        offset.put(((Move) e).getTarget(), 4 * (maxArgu + offset.size()));
                    }
                    continue;
                }
                if (e instanceof Neg) {
                    if (!offset.containsKey(((Neg) e).getTarget())) {
                        offset.put(((Neg) e).getTarget(), 4 * (maxArgu + offset.size()));
                    }
                    continue;
                }
                if (e instanceof Not) {
                    if (!offset.containsKey(((Not) e).getTarget())) {
                        offset.put(((Not) e).getTarget(), 4 * (maxArgu + offset.size()));
                    }
                    continue;
                }
                if (e instanceof New) {
                    if (!offset.containsKey(((New) e).getTarget())) {
                        offset.put(((New) e).getTarget(), 4 * (maxArgu + offset.size()));
                    }
                }
            }
//            System.out.println(instructions.getFirst());
//            System.out.println(offset);
//            System.out.println("Total Reg: " + offset.size());
//            System.out.println("Max Arguments: " + maxArgu);
        }

        public void translate() {
            ListIterator<IRNode> itr = instructions.listIterator(0);
            IRNode node = itr.next();
            out.println(node + ":");
            out.println("\tsubu $sp, $sp, " + (maxArgu + 1 + offset.size()) * 4);
            out.println("\tsw $ra, " + maxArgu * 4 + "($sp)");

            while (itr.hasNext()) {
                node = itr.next();
                if (node instanceof Label) {
//                    indeed this will not happen
                    out.println(node + ":");
                    continue;
                }
                if (node instanceof Binary) {
                    out.println("\tlw $v0, " + offset.get(((Binary) node).getLhs()) + "($sp)");
                    if (((Binary) node).getRhs() instanceof Register) {
                        out.println("\tlw $v1, " + offset.get(((Binary) node).getRhs()) + "($sp)");
                    } else {
                        out.println("\tli $v1, " + ((Constant) ((Binary) node).getRhs()).getValue());
                    }
                    out.println("\t" + ((Binary) node).getOP() + " $v0, $v0, $v1");
                    out.println("\tsw $v0, " + offset.get(((Binary) node).getTarget()) + "($sp)");
                    continue;
                }
                if (node instanceof Branch) {
                    if (((Branch) node).getCondition() instanceof Constant) {
                        if (((Constant) ((Branch) node).getCondition()).getValue() == 1) {
                            out.println("\tj " + ((Branch) node).getT());
                        } else {
                            out.println("\tj " + ((Branch) node).getF());
                        }
                    }
                    out.println("\tbeqz " + ((Branch) node).getCondition() + ", " + ((Branch) node).getF());
                    out.println("\tj " + ((Branch) node).getT());
                    continue;
                }
                if (node instanceof Call) {
                    if (((Call) node).getParameters() != null) {
                        int count = 0;
                        ListIterator<Operand> parameter = ((Call) node).getParameters().listIterator();
                        while (parameter.hasNext()) {
                            Operand temp = parameter.next();
                            if (temp instanceof Constant) {
                                out.println("\tli $v0, " + ((Constant) temp).getValue());
                                out.println("\tsw $v0, " + count * 4 + "($sp)");
                                ++count;
                            } else {
                                out.println("\tlw $v0, " + offset.get((Register) temp) + "($sp)");
                                out.println("\tsw $v0, " + count * 4 + "($sp)");
                            }
                        }
                    }
                    out.println("\tjal " + ((Call) node).getFuncLabel());
                    if (((Call) node).getTarget() != null)
                        out.println("\tsw $v0" + offset.get(((Call) node).getTarget()) + "($sp)");
                }
                if (node instanceof Jump) {
                    out.println("\tj " + ((Jump) node).getTarget());
                }
                if (node instanceof Load) {
//                    get address
                    out.println("\tlw $v0, " + offset.get(((Load) node).getSource()) + "($sp)");
//                    perform the load
                    out.println("\tlw $v0, " + ((Load) node).getOffset() + "($v0)");
//                    save it
                    out.println("\tsw $v0, " + offset.get(((Load) node).getTarget()) + "($sp)");
                }
                if (node instanceof LoadAddress) {
                    out.println("\tla $v0, " + ((LoadAddress) node).getLabel());
                    out.println("\tsw $v0, " + offset.get(((LoadAddress) node).getTarget()) + "($sp)");
                }
                if (node instanceof LoadImm) {
                    out.println("\tli $v0, " + ((LoadImm) node).getImm());
                    out.println("\tsw $v0, " + offset.get(((LoadImm) node).getReg()) + "($sp)");
                }
                if (node instanceof LoadFromLabel) {
                    out.println("\tlw $v0, " + ((LoadFromLabel) node).getLabel());
                    out.println("\tsw $v0, " + offset.get(((LoadFromLabel) node).getTarget()) + "($sp)");
                }
                if (node instanceof Move) {
//                    if (((Move) node).getSource() instanceof Constant){
//                        out.println("\tli $v0, " + ((Constant) ((Move) node).getSource()).getValue());
//                        out.println("\tsw $v0, " + offset.get(((Move) node).getTarget()) + "($sp)");
//                    }
//                    else {
                    out.println("\tlw $v0, " + offset.get(((Move) node).getSource()) + "($sp)");
                    out.println("\tsw $v0, " + offset.get(((Move) node).getTarget()) + "($sp)");
//                    }
                }
                if (node instanceof Neg) {
                    out.println("\tlw $v1, " + offset.get(((Neg) node).getSource()) + "($sp)");
                    out.println("\tneg $v0, $v1");
                    out.println("\tsw $v0, " + offset.get(((Neg) node).getTarget()) + "($sp)");
                }
                if (node instanceof New) {
                    if (((New) node).getSize() instanceof Constant) {
                        out.println("\tli $a0, " + ((Constant) ((New) node).getSize()).getValue());
                    } else {
                        out.println("\tlw $v0, " + offset.get((Register) ((New) node).getSize()) + "($sp)");
                        out.println("\tmove $a0, $v0");
                        out.println("\tli $v0, 9");
                        out.println("\tsyscall");
                        out.println("\tsw $v0, " + offset.get(((New) node).getTarget()) + "($sp)");
                    }

                }
                if (node instanceof Not) {
                    out.println("\tlw $v1, " + offset.get(((Not) node).getSource()) + "($sp)");
                    out.println("\tnot $v0, $v1");
                    out.println("\tsw $v0, " + offset.get(((Not) node).getTarget()) + "($sp)");
                }
                if (node instanceof Return) {
                    if (((Return) node).getResult() != null) {
                        if (((Return) node).getResult() instanceof Constant) {
                            out.println("\tli $v0, " + ((Constant) ((Return) node).getResult()).getValue());
                        } else {
                            out.println("\tlw $v0, " + offset.get((Register) ((Return) node).getResult()) + "($sp)");
                        }
                    }
                    out.println("\tlw $ra, " + maxArgu * 4 + "($sp)");
                    out.println("\tjr $ra");
                }
                if (node instanceof Store) {
//                    get value
                    out.println("\tlw $v0, " + offset.get(((Store) node).getSource()) + "($sp)");
//                    get address
                    out.println("\tlw $v1, " + offset.get(((Store) node).getTarget()) + "($sp)");
                    out.println("\tsw $v0, " + ((Store) node).getOffset() + "($v1)");
                }
                if (node instanceof StoreLabel) {
//                    load the value
                    out.println("\tlw $v0, " + offset.get(((StoreLabel) node).getSource()) + "($sp)");
//                    store it back
                    out.println("\tsw $v0, " + ((StoreLabel) node).getLabel());
                }
            }
            out.println("\tlw $ra, " + maxArgu * 4 + "($sp)");
            out.println("\taddu $sp, $sp, " + (maxArgu + 1 + offset.size()) * 4);
        }

    }
}