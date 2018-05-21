package String;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangxin on 2018/5/4.
 */
public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int length1=ransomNote.length();
        int length2=magazine.length();
        if(length1>length2)
            return false;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            if(!map.containsKey(ch))
                return false;
            else{
                if(map.get(ch)==0)
                    return false;
                else
                    map.put(ch,map.get(ch)-1);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str="";
        System.out.println(canConstruct("",""));
        System.out.println(canConstruct("aa","ab"));
        System.out.println(canConstruct("aa","aab"));
    }
}
