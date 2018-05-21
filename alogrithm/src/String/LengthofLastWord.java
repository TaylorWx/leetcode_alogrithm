package String;

/**
 * Created by wangxin on 2018/5/6.
 */
public class LengthofLastWord {
    public static int lengthOfLastWord(String s) {
        if(s.length()==0)
            return 0;
        System.out.println(s.trim().isEmpty());
        String str[]=s.split(" ");
        if(str.length==0)
            return 0;
        return str[str.length-1].length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("  "));
    }
}
