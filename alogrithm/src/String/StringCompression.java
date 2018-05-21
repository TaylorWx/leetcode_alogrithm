package String;

/**
 * Created by wangxin on 2018/5/6.
 */
public class StringCompression {
    public static int compress(char[] chars) {
        if(chars.length<=1)
            return chars.length;
        int count=1;
        StringBuffer stringBuffer=new StringBuffer();
        for(int i=1;i<chars.length;i++){
            if(chars[i]==chars[i-1]){
                count++;
            }else{
                stringBuffer.append(chars[i-1]);
                if(count>1){
                    stringBuffer.append(count);
                }
                count=1;
            }
        }
        stringBuffer.append(chars[chars.length-1]);
        if(count>1)
            stringBuffer.append(count);
        char[] newchars=stringBuffer.toString().toCharArray();
        for(int i=0;i<newchars.length;i++)
            chars[i]=newchars[i];
        return newchars.length;
    }

    public static void main(String[] args) {
        System.out.println(compress("aabbccc".toCharArray()));
    }
}
