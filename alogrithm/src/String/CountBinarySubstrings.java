package String;

import java.util.Arrays;

/**
 * Created by wangxin on 2018/5/3.
 */
public class CountBinarySubstrings {
    public static int countBinarySubstrings(String s) {
        int len=s.length();
        if(len<=1) return 0;
        char[] sc= s.toCharArray();
        int [] count = new int[len];
        int tmp = 0;
        for(int i=0; i<len-1; i++){
            count[tmp] ++;
            if(sc[i] != sc[i+1])
                tmp ++;
        }
        count[tmp] ++;
        int res=0;
        for(int i=0;i<tmp;i++){
            res+=Math.min(count[i],count[i+1]);
        }
        return res;
    }

    public static void main(String[] args) {
        String str="0000000";
        System.out.println(countBinarySubstrings(str));
    }
}
