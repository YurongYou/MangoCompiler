package cn.ficos.Compiler.CodeGeneration;

import cn.ficos.Compiler.ControlFlowGraph.BasicBlock;
import cn.ficos.Compiler.ControlFlowGraph.CFG;
import cn.ficos.Compiler.ControlFlowGraph.CFGs;
import cn.ficos.Compiler.Gadgets.CONSTANT;
import cn.ficos.Compiler.Gadgets.Operand.Constant;
import cn.ficos.Compiler.Gadgets.Operand.Operand;
import cn.ficos.Compiler.Gadgets.Operand.Register;
import cn.ficos.Compiler.IR.*;

import java.io.*;

/**
 * This class reads an CFGs and generate the target MIPS codes
 * Created by Ficos on 16/5/4.
 */
public class MIPSGenerator {
    static final String[] regDict = {
            "$t0",
            "$t1",
            "$t2",
            "$t3",
            "$t4",
            "$t5",
            "$t6",
            "$t7",
            "$t8",
            "$t9",
            "$s0",
            "$s1",
            "$s2",
            "$s3",
            "$s4",
            "$s5",
            "$s6",
            "$s7",
            "$gp",
            "$fp",
            "$a0",
            "$a1",
            "$a2",
            "$a3",
    };
    static final boolean[] notSaved = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false,};
    static final boolean[] println = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false,};
    static final boolean[] getString = {true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, false, false,};
    static final boolean[] toString = {true, true, true, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false,};
    static final boolean[] subStringAndConcatenate = {true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, false, false,};
    static final boolean[] parseInt = {true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false,};
    static final boolean[] compare = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, false, false,};
    PrintStream out;
    CFGs CFGList;

    public MIPSGenerator(OutputStream _out, CFGs CFGList) throws Exception {
        out = new PrintStream(_out);
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("src/lib/build_in_functions.s")));
        String line = reader.readLine();
        while (line != null) {
            out.println(line);
            line = reader.readLine();
        }
        this.CFGList = CFGList;
//        first the .data area
        out.println(".data");
        for (String s : CFGList.getData()) {
            out.println(s);
        }
//        then the instructions
        out.println(".text");
        for (CFG function : CFGList.getCFGList()) {
            translate(function);
            out.println();
        }
    }

    private void translate(CFG G) {
//            The first node must be the function label
        for (BasicBlock block : G.getCFG()) {
            for (IRNode node : block.getInstructions()) {
//                out.println("#\t" + node);
                if (node instanceof Binary) {
                    out.println("\t" + ((Binary) node).getOP()
                            + " " + processWrite(((Binary) node).getTarget())
                            + ", " + processRead(G, ((Binary) node).getLhs(), true)
                            + ", " + processRead(G, ((Binary) node).getRhs(), false));
                    processSpill(G, ((Binary) node).getTarget());
                } else if (node instanceof Branch) {
                    out.println("\tbeqz " + processRead(G, ((Branch) node).getCondition(), true)
                            + ", " + ((Branch) node).getF());
                    out.println("\tj " + ((Branch) node).getT());
                } else if (node instanceof Call) {
                    boolean isBuiltIn = ((Call) node).getFuncLabel().getLabelName().startsWith(CONSTANT.builtInFuncPrefix);
                    boolean[] pattern = notSaved;
                    ;
                    if (!isBuiltIn) for (Register reg : node.getLiveOut()) saveReg(G, reg);
                    else {
                        if (((Call) node).getFuncLabel().getLabelName().equals("func__println")) pattern = println;
                        else if (((Call) node).getFuncLabel().getLabelName().equals("func__getString"))
                            pattern = getString;
                        else if (((Call) node).getFuncLabel().getLabelName().equals("func__toString"))
                            pattern = toString;
                        else if (((Call) node).getFuncLabel().getLabelName().equals("func__string.substring"))
                            pattern = subStringAndConcatenate;
                        else if (((Call) node).getFuncLabel().getLabelName().equals("func__string.parseInt"))
                            pattern = parseInt;
                        else if (((Call) node).getFuncLabel().getLabelName().equals("func__stringConcatenate"))
                            pattern = subStringAndConcatenate;
                        else if (((Call) node).getFuncLabel().getLabelName().equals("func__stringIsEqual"))
                            pattern = compare;
                        else if (((Call) node).getFuncLabel().getLabelName().equals("func__stringLess"))
                            pattern = compare;
                        else pattern = notSaved;
                        for (Register reg : node.getLiveOut())
                            if (reg.isColored() && pattern[reg.getColor()]) saveReg(G, reg);
                    }
                    if (((Call) node).getParameters() != null) {
                        int count = 0;
                        for (Operand operand : ((Call) node).getParameters()) {
                            if (operand instanceof Constant) {
                                out.println("\tli $v0, " + ((Constant) operand).getValue());
                                out.println("\tsw $v0, " + count * 4 + "($sp)");
                                if (count < 3 && isBuiltIn) {
                                    out.println("\tli $a" + count + ", " + ((Constant) operand).getValue());
                                }
                                ++count;
                            } else {
                                out.println("\tsw " + processRead(G, (Register) operand, true) + ", " + count * 4 + "($sp)");
                                if (count < 3 && isBuiltIn)
                                    out.println("\tlw $a" + count + ", " + count * 4 + "($sp)");
                                ++count;
                            }
                        }
                    }
                    out.println("\tjal " + ((Call) node).getFuncLabel());
                    if (!isBuiltIn) for (Register reg : node.getLiveOut()) loadBackReg(G, reg);
                    else {
                        for (Register reg : node.getLiveOut())
                            if (reg.isColored() && pattern[reg.getColor()]) loadBackReg(G, reg);
                    }

                    if (((Call) node).getTarget() != null) {
                        out.println("\tmove " + processWrite(((Call) node).getTarget()) + ", $v0");
                        processSpill(G, ((Call) node).getTarget());
                    }
                } else if (node instanceof Jump) {
                    out.println("\tj " + ((Jump) node).getTarget());
                } else if (node instanceof Label) {
                    out.println(node + ":");
                    if (((Label) node).getLabelName().startsWith(CONSTANT.funcPrefix) || ((Label) node).getLabelName().equals("main")) {
                        out.println("\tsubu $sp, $sp, " + G.getFrameSize());
                        out.println("\tsw $ra, " + G.getMaxArgu() * 4 + "($sp)");
                    }
                } else if (node instanceof Load) {
                    out.println("\tlw " + processWrite(((Load) node).getTarget())
                            + ", " + ((Load) node).getOffset()
                            + "(" + processRead(G, ((Load) node).getSource(), true) + ")");
                    processSpill(G, ((Load) node).getTarget());
                } else if (node instanceof LoadAddress) {
                    out.println("\tla " + processWrite(((LoadAddress) node).getTarget())
                            + ", " + ((LoadAddress) node).getLabel());
                    processSpill(G, ((LoadAddress) node).getTarget());
                } else if (node instanceof LoadFromLabel) {
                    out.println("\tlw " + processWrite(((LoadFromLabel) node).getTarget())
                            + ", " + ((LoadFromLabel) node).getLabel());
                    processSpill(G, ((LoadFromLabel) node).getTarget());
                } else if (node instanceof LoadImm) {
                    out.println("\tli " + processWrite(((LoadImm) node).getReg())
                            + ", " + ((LoadImm) node).getImm());
                    processSpill(G, ((LoadImm) node).getReg());
                } else if (node instanceof LoadParameter) {
                    out.println("\tlw " + processWrite(((LoadParameter) node).getTarget())
                            + ", " + (((LoadParameter) node).getNo() * 4 + G.getFrameSize())
                            + "($sp)");
                    processSpill(G, ((LoadParameter) node).getTarget());
                } else if (node instanceof Move) {
                    out.println("\tmove " + processWrite(((Move) node).getTarget())
                            + ", " + processRead(G, ((Move) node).getSource(), true));
                    processSpill(G, ((Move) node).getTarget());
                } else if (node instanceof Neg) {
                    out.println("\tneg " + processWrite(((Neg) node).getTarget())
                            + ", " + ((Neg) node).getSource());
                    processSpill(G, ((Neg) node).getTarget());
                } else if (node instanceof New) {
                    Register holdingA0 = null;
                    for (Register reg : node.getLiveOut()) {
                        if (reg.getColor() == 20) {
                            saveReg(G, reg);
                            holdingA0 = reg;
                            break;
                        }
                    }
                    out.println("\tli $v0, 9");
                    if (((New) node).getSize() instanceof Constant)
                        out.println("\tli $a0, " + ((Constant) ((New) node).getSize()).getValue());
                    else
                        out.println("\tmove $a0, " + processRead(G, ((New) node).getSize(), true));
                    out.println("\tsyscall");
                    if (holdingA0 != null) loadBackReg(G, holdingA0);
                    if (((New) node).getTarget().isColored()) {
                        out.println("\tmove " + regDict[((New) node).getTarget().getColor()] + ", $v0");
                    } else out.println("\tsw $v0, "
                            + (G.getSpills().get(((New) node).getTarget()) + G.getMaxArgu() + 1 + CONSTANT.actualRegNumber) * 4
                            + "($sp)");
                } else if (node instanceof Not) {
                    out.println("\tnot " + processWrite(((Not) node).getTarget())
                            + ", " + processRead(G, ((Not) node).getSource(), true));
                } else if (node instanceof Return) {
                    if (((Return) node).getResult() != null) {
                        if (((Return) node).getResult() instanceof Constant) {
                            out.println("\tli $v0, " + ((Constant) ((Return) node).getResult()).getValue());
                        } else out.println("\tmove $v0, " + processRead(G, ((Return) node).getResult(), false));
                    }
                    out.println("\tlw $ra, " + G.getMaxArgu() * 4 + "($sp)");
                    out.println("\taddu $sp, $sp, " + G.getFrameSize());
                    out.println("\tjr $ra");
                } else if (node instanceof Store) {
                    out.println("\tsw " + processRead(G, ((Store) node).getSource(), true)
                            + ", " + ((Store) node).getOffset()
                            + "(" + processRead(G, ((Store) node).getTarget(), false) + ")");
                } else if (node instanceof StoreLabel) {
                    out.println("\tsw " + processRead(G, ((StoreLabel) node).getSource(), true)
                            + ", " + ((StoreLabel) node).getLabel());
                }
//                out.print("# spill:");
//                for (Register r: node.getLiveOut()) if (!r.isColored()) out.print(r + " ");
                out.println();
            }
        }
        out.println("\tlw $ra, " + G.getMaxArgu() * 4 + "($sp)");
        out.println("\taddu $sp, $sp, " + G.getFrameSize());
        out.println("\tjr $ra");
    }

    private String processRead(CFG G, Operand reg, boolean isLeft) {
        if (reg instanceof Constant) {
            return Integer.toString(((Constant) reg).getValue());
        }
        if (((Register) reg).isColored()) return regDict[((Register) reg).getColor()];
        if (isLeft) {
            out.println("\tlw $v0, "
                    + (G.getSpills().get(reg) + G.getMaxArgu() + 1 + CONSTANT.actualRegNumber) * 4
                    + "($sp)");
            return "$v0";
        } else {
            out.println("\tlw $v1, "
                    + (G.getSpills().get(reg) + G.getMaxArgu() + 1 + CONSTANT.actualRegNumber) * 4
                    + "($sp)");
            return "$v1";
        }
    }

    private String processWrite(Register reg) {
        if (reg.isColored()) return regDict[reg.getColor()];
        return "$v0";
    }

    private void processSpill(CFG G, Register reg) {
        if (reg.isColored()) return;
        out.println("\tsw $v0, "
                + (G.getSpills().get(reg) + G.getMaxArgu() + 1 + CONSTANT.actualRegNumber) * 4
                + "($sp)");
    }

    private void saveReg(CFG G, Register reg) {
        if (!reg.isColored()) return;
        out.println("\tsw " + regDict[reg.getColor()]
                + ", " + (reg.getColor() + G.getMaxArgu() + 1) * 4 + "($sp)");
    }

    private void loadBackReg(CFG G, Register reg) {
        if (!reg.isColored()) return;
        out.println("\tlw " + regDict[reg.getColor()]
                + ", " + (reg.getColor() + G.getMaxArgu() + 1) * 4 + "($sp)");
    }
}
