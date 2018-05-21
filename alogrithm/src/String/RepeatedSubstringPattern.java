package String;

/**
 * Created by wangxin on 2018/5/6.
 */
public class RepeatedSubstringPattern {
    public static boolean repeatedSubstringPattern(String s) {
        /*int len = s.length();
        String newStr = s + s;
        newStr = newStr.substring(1, 2 * len - 2);
        System.out.println(newStr);
        return newStr.indexOf(s) != -1;*/
        int length=s.length();
        for(int i=length/2;i>=1;i--){
            if(length%i==0){
                //只有这才可能连续
                int m=length/i;
                String sub=s.substring(0,i);
                StringBuffer sb=new StringBuffer();
                for(int j=0;j<m;j++){
                    sb.append(sub);
                }
                if(sb.toString().equals(s)) return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("aaaaaaaaaaaaaaaaaaaaa"));
        System.out.println("aaaaaaaaaaaaaaaaaaaaa".length());
    }
}
