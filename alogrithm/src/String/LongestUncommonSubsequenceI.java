package String;

/**
 * Created by wangxin on 2018/5/3.
 */
public class LongestUncommonSubsequenceI {
    public int findLUSlength(String a, String b){
        int a_length = a.length();
        int b_length = b.length();
        if(a.equals(b))
            return -1;
        else
            return a_length>b_length ? a_length : b_length;
    }

}
