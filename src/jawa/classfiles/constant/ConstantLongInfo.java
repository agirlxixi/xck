package jawa.classfiles.constant;

import jawa.classfiles.ClassReader;
import lombok.Getter;

import static jawa.Utils.Sth.getLongIndex;

/**
 * @author xck
 */

public class ConstantLongInfo implements ConstantInfo{
    private long value;

    public long getValue() {
        return value;
    }

    public void readInfo(ClassReader reader){
        value = getLongIndex(reader.readUint64());
    }

    public String toString() {
        return "ConstantLongInfo{" +
                "value=" + value +
                '}';
    }
}