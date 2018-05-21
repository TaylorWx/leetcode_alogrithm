package String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by wangxin on 2018/5/4.
 */
public class FirstUniqueCharacterinaString {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch))
                map.put(ch,-1);
            else
                map.put(ch,i);
        }
        for(Map.Entry<Character,Integer> mm:map.entrySet()){
            if(mm.getValue()!=-1)
                return mm.getValue();
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
