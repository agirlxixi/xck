package jawa.instructions.stores;

import jawa.instructions.base.NoOperandsInstruction;
import jawa.rtda.Frame;

/**
 * @author xck
 */
public class DSTORE_0 extends NoOperandsInstruction {
    @Override
    public void execute(Frame frame) {
        frame.getLocalVars().setDouble(0, frame.getOperandStack().popDouble());
    }
}
