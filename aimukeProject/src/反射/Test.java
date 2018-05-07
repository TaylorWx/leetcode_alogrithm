package 反射;

import com.sun.org.apache.bcel.internal.generic.InstructionConstants;

/**
 * Created by wangxin on 2018/4/24.
 */
public class Test {
    public static void main(String[] args) {
        String str="oo";
        //ClassUtil.printClassMethodMessage(str);
        //ClassUtil.getClassFieldMessage(new Integer(1));
        ClassUtil.getConMessage(new Integer(1));
    }
}
