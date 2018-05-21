package HashTable;

import java.util.HashMap;

/**
 * Created by wangxin on 2018/4/24.
 */
public class Jewels {
    public static int numJewelsInStones(String J, String S) {
        HashMap<Character,Integer> hashMap=new HashMap<>();
        int sum=0;
        for(int i=0;i<J.length();i++){
            hashMap.put(J.charAt(i),i);
        }
        for(int j=0;j<S.length();j++){
            if (hashMap.containsKey(S.charAt(j)))
                sum++;
        }
        return sum;
    }

    public static void main(String[] args) {
        String J = "z";
        String S= "ZZ";
        System.out.println(numJewelsInStones(J,S));
    }
}
