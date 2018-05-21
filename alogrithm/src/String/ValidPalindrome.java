package String;

/**
 * Created by wangxin on 2018/5/7.
 */
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if(s.isEmpty())return true;
        s=s.toLowerCase();
        int i=0,j=s.length()-1;
        while(i<j){
            while(i<j&&!(Character.isAlphabetic(s.charAt(i))||Character.isDigit(s.charAt(i)))) i++;
            while(i<j&&!(Character.isAlphabetic(s.charAt(j))||Character.isDigit(s.charAt(j)))) j--;
            if(i<j&&s.charAt(i)!=s.charAt(j))
                return false;
            i++;j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str="0a";
        System.out.println(isPalindrome(str));
        System.out.println();
    }
}
