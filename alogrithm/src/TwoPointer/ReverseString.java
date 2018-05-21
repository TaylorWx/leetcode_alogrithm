package TwoPointer;

/**
 * Created by wangxin on 2018/4/26.
 */
public class ReverseString {
    public static String reverseString(String s) {
        if(s==null)return s;
        char[] ch=new char[s.length()];
        for(int i=s.length()-1,j=0;i>=0;i--,j++)
            ch[j]=s.charAt(i);
        String str=new String(ch);
        return str;
    }

    public static void main(String[] args) {
        String str="hello";
        System.out.println(reverseString(str).toString());
    }
}
