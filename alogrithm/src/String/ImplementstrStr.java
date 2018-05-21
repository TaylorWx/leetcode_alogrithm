package String;

/**
 * Created by wangxin on 2018/5/7.
 */
public class ImplementstrStr {
    public static int strStr(String haystack, String needle) {
        /*if(needle=="")
            return 0;*/
        StringBuilder stringBuilder=new StringBuilder(haystack);
        return stringBuilder.indexOf(needle);
    }

    public static void main(String[] args) {
        String haystack="aaaaa";
        String needle="";
        System.out.println(strStr(haystack,needle));
    }
}
/*
for (int i = 0; ; i++) {
        for (int j = 0; ; j++) {
        if (j == needle.length()) return i;
        if (i + j == haystack.length()) return -1;
        if (needle.charAt(j) != haystack.charAt(i + j)) break;
        }
        }*/
