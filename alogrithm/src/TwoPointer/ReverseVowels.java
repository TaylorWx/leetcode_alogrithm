package TwoPointer;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wangxin on 2018/4/26.
 */
public class ReverseVowels {
    public static String reverseVowels(String s) {
        char[] chars=s.toCharArray();
        String str="aiueoAEUEO";
        Set set=new HashSet();
        for(int i=0;i<str.length();i++)
            set.add(str.charAt(i));
        int p=0,q=chars.length-1;
        while(p<q){
            while(p<chars.length&&!set.contains(chars[p])) p++;
            while(q>0&&!set.contains(chars[q])) q--;
            if(p<q&&p<chars.length&&q>=0){
                char temp;
                temp=chars[p];
                chars[p]=chars[q];
                chars[q]=temp;
            }
            p++;q--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String s="aA";
        //System.out.println(reverseVowels(s));
        System.out.println(s.indexOf('a'));
    }
}
