package String;

/**
 * Created by wangxin on 2018/5/3.
 */
public class DetectCapital {
    public static boolean detectCapitalUse(String word) {
        //全部大写/全部小写，只有第一个小写
        char[] chars=word.toCharArray();
        String upperstr=word.toUpperCase();
        String lowerstr=word.toLowerCase();
        //全部大写
        boolean bool1=upperstr.equals(word);
        boolean bool2=lowerstr.equals(word);
        boolean bool3=false;
        if(chars[0]>='A'&&chars[0]<='Z'){
            chars[0]+=32;
            bool3=lowerstr.equals(new String(chars));
        }
        return bool1||bool2||bool3;
    }

    public static void main(String[] args) {
        String str="Leetcode";
        System.out.println(detectCapitalUse(str));
    }
}
