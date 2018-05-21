package 数组;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by wangxin on 2018/4/24.
 */
public class MorseWords {
    public static int uniqueMorseRepresentations(String[] words) {
        //将hashcode值保存在hash中
        String[] strings={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<Character,String> hashMap=new HashMap<>();
        char a='a';
        for(int i=0;i<strings.length;i++){
            hashMap.put(a++,strings[i]);
        }

        Set<String> set=new HashSet<>();
        for(int i=0;i<words.length;i++){
            StringBuffer stringBuffer=new StringBuffer();
            String str=words[i];
            for(int j=0;j<str.length();j++){
                stringBuffer.append(hashMap.get(str.charAt(j)));
            }
            System.out.println(stringBuffer.toString());
            set.add(stringBuffer.toString());
        }
        return set.size();
    }

    public static void main(String[] args) {
        String words[]={"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));

    }
}
