package HashTable;

import java.util.*;

/**
 * Created by wangxin on 2018/4/25.
 */
public class Keyboard {
    public static void main(String[] args) {
        Set<String> set= new HashSet<String>();
        String[] str={"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
    }
    public String[] findWords(String[] words) {
        Map<Character,Integer> map=new HashMap();
        String[] str={"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};

        for(int i=0;i<str.length;i++){
            String string=str[i];
            for(int j=0;j<string.length();j++)
                map.put(string.charAt(j),i+1);
        }
        int sum=0;
        List<String> list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            int flag=0;
            boolean ff=true;
            String word=words[i].toUpperCase();
            for(int j=0;j<word.length();j++){
                if (flag==0){
                    flag=map.get(word.charAt(j));
                }else{
                    if(flag!=map.get(word.charAt(j)))
                        ff=false;
                }
            }
            if(ff)
                list.add(words[i]);
        }
        String[]ss=new String[list.size()];
        for(int i=0;i<list.size();i++)
            ss[i]=list.get(i);
        return list.toArray(new String[0]);
    }
}
