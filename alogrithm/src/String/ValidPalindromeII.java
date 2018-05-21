package String;

/**
 * Created by wangxin on 2018/5/6.
 */
public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        int i,j;
        int si=0,sj=0;
        int n=s.length();
        int way=0;
        for(i=0,j=n-1;i<j;i++,j--){
            if(s.charAt(i)==s.charAt(j))
                continue;
            else{
                if(way==2){
                    return false;
                }
                if(way==1){
                    way++;
                    i=si;
                    j=sj;
                    j++;
                }
                if(way==0){
                    way++;
                    si=i;
                    sj=j;
                    i--;
                }
            }
        }
        return true;
    }
}
