package String;

/**
 * Created by wangxin on 2018/5/3.
 */
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangxin on 2018/5/3.
 */
public class MostCommonWord {
    public static String mostCommonWord(String paragraph, String[] banned) {
        String reg = "[^a-zA-Z]";
        String[] strings=paragraph.toLowerCase().split(" ");

        for(int i=0;i<strings.length;i++)
            strings[i]=strings[i].replaceAll(reg,"");
        Map<String,Integer> map=new HashMap<>();

        for(int i=0;i<strings.length;i++){
            if(map.containsKey(strings[i]))
                map.put(strings[i],map.get(strings[i])+1);
            else
                map.put(strings[i],1);
        }
        for(int i=0;i<banned.length;i++){
            if(map.containsKey(banned[i]))
                map.put(banned[i],0);
        }
        int sum=0;
        String ss=null;
        for(Map.Entry<String,Integer> m:map.entrySet()){
            if(sum<m.getValue()){
                sum=m.getValue();
                ss=m.getKey();
            }
        }
        return ss;
    }

    public static void main(String[] args) {
        String str="Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned={"hit"};
        String[] words = str.toLowerCase().split("[ !?',;.]+");
        for(int i=0;i<words.length;i++){
            System.out.println(words[i]);
        }
        //System.out.println(mostCommonWord(str,banned));
    }
}
