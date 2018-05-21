package String;

/**
 * Created by wangxin on 2018/5/6.
 */
public class CountandSay {
    public String count(String str){
        StringBuilder builder = new StringBuilder();
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                builder.append(count);
                builder.append(str.charAt(i - 1));
                count = 1;
            }
        }

        builder.append(count);
        builder.append(str.charAt(str.length() - 1));
        return builder.toString();
    }
    public String countAndSay(int n) {
        if(n<1) return null;
        String result="1";
        for(int i=2;i<=n;i++){
            result = count(result);
        }
        return result;
    }
}
