package cn.ficos.Compiler.Gadgets.Operand;

import java.util.HashSet;
import java.util.Set;

/**
 * This class means the operand is a reg
 */
public abstract class Register extends Operand implements Comparable<Register> {
    private static int count = 0;
    // this field is for the convenience of coloring
    public int nowAdj = 0;
    protected int ID;
    int color = -1;
    Set<Register> interference = new HashSet<>();
    Register() {
        ID = count++;
    }

    public int getID() {
        return ID;
    }

    public Set<Register> getInterference() {
        return interference;
    }

    public void addInterference(Register r) {
        if (r == this) return;
        interference.add(r);
    }

    public int getColor() {
        return color;
    }

    public void setColor(int _color) {
        color = _color;
    }

    public boolean isColored() {
        return color >= 0;
    }

    @Override
    public String toString() {
        return "$R" + ID;
    }

    @Override
    /**
     * This class is intended to let Register can be used in PriorityQueue in coloring process.
     */
    public int compareTo(Register o) {
        if (nowAdj < o.nowAdj) return -1;
        if (nowAdj > o.nowAdj) return 1;
        return 0;
    }
}