package String;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangxin on 2018/5/3.
 */
public class GoatLatin {
    public static String toGoatLatin(String S) {
        //1首字母是元音ma
        //2其他的，去掉首字母加上ma
        //加上a
        char [] chars=S.toCharArray();
        String[] strings=S.split(" ");
        StringBuffer stringBuffer=new StringBuffer();
        for(int i=0;i<strings.length;i++){
            stringBuffer.append(change(strings[i])+"ma");
            for(int j=0;j<=i;j++)
                stringBuffer.append("a");
            if(i!=strings.length-1)
                stringBuffer.append(" ");
        }

        return new String(stringBuffer);
    }
    public static String change(String str){
        List<Character> list=new ArrayList<>();
        String string=new String();
        boolean flag=false;
        String ss="aeiouAOEIU";
        char ch=' ';
        if(ss.indexOf(str.charAt(0))!=-1){
            list.add(str.charAt(0));

        }else{
            flag=true;
            ch=str.charAt(0);
        }
        for(int i=1;i<str.length();i++){
            list.add(str.charAt(i));
        }
        if(flag)
            list.add(ch);
        for(int i=0;i<list.size();i++)
            string+=list.get(i);
        return string;
    }
    public static void main(String[] args) {
        String str="over";
        System.out.println(toGoatLatin(str));
        String s1="heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa veromaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa";
        String s2="heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa";
    }
}
