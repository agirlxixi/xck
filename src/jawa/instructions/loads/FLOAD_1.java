package jawa.instructions.loads;

import jawa.instructions.base.NoOperandsInstruction;
import jawa.rtda.Frame;

/**
 * @author xck
 */
public class FLOAD_1 extends NoOperandsInstruction {
    @Override
    public void execute(Frame frame) {
        frame.getOperandStack().pushFloat(frame.getLocalVars().getFloat(1));
    }
}
