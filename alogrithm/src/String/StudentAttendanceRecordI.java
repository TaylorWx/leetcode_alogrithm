package String;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangxin on 2018/5/4.
 */
public class StudentAttendanceRecordI {
    public static boolean checkRecord(String s) {
        Map<Character,Integer> map=new HashMap<>();
        map.put('A',1);
        map.put('L',2);
        char pre=' ';
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            //要求连续
            if(pre!=ch){
                map.put('A',1);
                pre=ch;
            }
            if(map.containsKey(ch)){
                if(map.get(ch)==0)
                    return false;
                else
                    map.put(ch,map.get(ch)-1);
            }
        }
        return true;
        //return !s.matches(".*A.*A.*") && !s.matches(".*LLL.*");
    }

    public static void main(String[] args) {
        System.out.println(checkRecord("PPALLP"));
        System.out.println(checkRecord("LALL"));
    }
}
