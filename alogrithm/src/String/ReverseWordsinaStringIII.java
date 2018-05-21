package String;

/**
 * Created by wangxin on 2018/5/3.
 */
public class ReverseWordsinaStringIII {
    public static String reverseWords(String s) {
        char[] chars=s.toCharArray();
        String [] str=s.split(" ");
        int length=str.length;
        StringBuffer stringBuffer=new StringBuffer();
        for(int i=0;i<length;i++){
            stringBuffer.append(reverse(str[i]));
        }
        int k=0,p=0;
        while(k<chars.length&&p<stringBuffer.length()){
            if(chars[k]!=' '){
                chars[k]=stringBuffer.charAt(p);
                p++;
            }
            k++;
        }
        return new String(chars);
    }
    public static String reverse(String string){
        char[] ch=new char[string.length()];
        for(int i=0;i<string.length();i++){
            ch[i]=string.charAt(string.length()-1-i);
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        String s="Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
