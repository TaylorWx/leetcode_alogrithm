package String;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Created by wangxin on 2018/5/6.
 */
public class AddBinary {
    public static String addBinary(String a, String b) {
        /*BigInteger b1=new BigInteger(a,2);
        BigInteger b2=new BigInteger(b,2);
        BigInteger b3=b1.add(b2);
        return b3.toString();*/
        StringBuffer s=new StringBuffer();
        int i=a.length()-1,j=b.length()-1;
        int carray=0,sum=0;
        while(i>=0||j>=0){
            sum=carray;
            if(i>=0) sum+=a.charAt(i)-'0';
            if(j>=0) sum+=b.charAt(j)-'0';
            s.append(sum%2);
            carray=sum/2;
            i--;j--;
        }
        if(carray!=0)s.append(carray);
        return s.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("1","111"));
    }
}
