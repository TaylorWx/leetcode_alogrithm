package String;

/**
 * Created by wangxin on 2018/5/6.
 */
public class RepeatedStringMatch {
    public static int repeatedStringMatch(String A, String B) {
        /*StringBuilder sb = new StringBuilder().append(A);
        for (int i = 1; sb.length() - B.length() <= 2 * A.length(); ++i, sb.append(A))
            if (sb.indexOf(B) != -1)  return i;
        return -1;*/
        int lengthB=B.length();
        String temp=A;
        StringBuilder stringBuffer=new StringBuilder(A);
        for(int i=1;stringBuffer.length()-lengthB<=2 * A.length();i++) {
            if (stringBuffer.indexOf(B) != -1) return i;
            else
                stringBuffer.append(temp);
        }
        return -1;
    }

    public static void main(String[] args) {
        String A="abcd";
        String B="abcdabcdabcd";
        System.out.println(repeatedStringMatch(A,B));
    }
}