package jawa.instructions.base;

import jawa.rtda.Frame;

/**
 * @author xck
 */
public class BranchLogic {
    public static void branch(Frame frame,int offset) {
        int pc = frame.thread().pc();
        int nextPc = pc + offset;
        frame.setNextPc(nextPc);
    }
}
