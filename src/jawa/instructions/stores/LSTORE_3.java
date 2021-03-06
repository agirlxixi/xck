package jawa.instructions.stores;

import jawa.instructions.base.NoOperandsInstruction;
import jawa.rtda.Frame;

/**
 * @author xck
 */
public class LSTORE_3 extends NoOperandsInstruction {
    @Override
    public void execute(Frame frame) {
        frame.getLocalVars().setLong(3, frame.getOperandStack().popLong());
    }
}
