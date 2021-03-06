package jawa.classfiles.members.attributeinfos;

import jawa.classfiles.ClassReader;
import jawa.classfiles.constant.ConstantPool;
import jawa.classfiles.members.AttributeInfo;

import java.util.ArrayList;
import java.util.List;

import static jawa.utils.Sth.getShortIndex;

/**
 * @author xck
 */
public class LocalVariableTableAttribute implements AttributeInfo {
    private ConstantPool cp;
    private List<LocalVariableTableEntry> localVariableTable;

    public LocalVariableTableAttribute(ConstantPool cp) {
        this.cp = cp;
    }

    @Override
    public void readInfo(ClassReader reader) {
        short localVariableTableLength = getShortIndex(reader.readUint16());
        List<LocalVariableTableEntry> localVariableTable = new ArrayList<>();
        for (int i = 0; i < localVariableTableLength; i++) {
            LocalVariableTableEntry l = new LocalVariableTableEntry(cp);
            l.setStartPc(getShortIndex(reader.readUint16()));
            l.setStartPc(getShortIndex(reader.readUint16()));
            l.setNameIdnex(getShortIndex(reader.readUint16()));
            l.setDescriptorIndex(getShortIndex(reader.readUint16()));
            l.setIndex(getShortIndex(reader.readUint16()));
            localVariableTable.add(l);
        }
        this.localVariableTable = localVariableTable;
    }


    public String toString() {
        return "\r\n        localVariableTable=" + localVariableTable;
    }
}
