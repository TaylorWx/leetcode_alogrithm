package String;

/**
 * Created by wangxin on 2018/5/7.
 */
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String str="";
        if(strs.length==0) return "";
        if(strs.length==1) return strs[0];
        StringBuilder stringBuilder=new StringBuilder(0);
        int curr=0;
        while(curr<strs[0].length()){
            char c=strs[0].charAt(curr);
            boolean flag=true;
            for(int i=1;i<strs.length;i++){
                if(curr>=strs[i].length()||c!=strs[i].charAt(curr)){
                    flag=false;
                    break;
                }
            }
            if(flag)
                stringBuilder.append(c);
            else
                break;
            curr++;
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String[] str={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(str));
    }
}
