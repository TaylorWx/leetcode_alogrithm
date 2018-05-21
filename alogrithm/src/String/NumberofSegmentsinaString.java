package String;

/**
 * Created by wangxin on 2018/5/6.
 */
public class NumberofSegmentsinaString {
    public static int countSegments(String s) {
        int count = 0;
        for(int i=0; i < s.length(); i++){
            if(i == s.length() -1) {
                if(s.charAt(i) != ' ')
                    return ++count;
                else
                    return count;
            }
            if(s.charAt(i) != ' ' && s.charAt(i+1) == ' '){
                count++;
            }
        }
        //return s.split("\\s+").length;
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSegments("H   n"));
    }
}
