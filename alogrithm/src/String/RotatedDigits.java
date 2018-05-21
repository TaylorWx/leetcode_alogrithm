package String;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangxin on 2018/5/3.
 */
public class RotatedDigits {
    public static int rotatedDigits(int N) {
        String str1="2569";
        String str2="018";
        List<Integer> list=new ArrayList<>();
        int sum=0;
        for(int i=1;i<=N;i++){
            char[] chars=String.valueOf(i).toCharArray();
            int length=chars.length;
            if(length<=1){
                if(str1.indexOf(chars[0])!=-1){
                    list.add(i);sum++;
                }
            }else{
                boolean flag=true;
                boolean f=false;
                for(int j=0;j<chars.length;j++){
                    if(!((str1.indexOf(chars[j])!=-1)||(str2.indexOf(chars[j])!=-1))){
                        flag=false;
                        break;
                    }else{
                        if(str1.indexOf(chars[j])!=-1) f=true;
                    }
                }
                if(flag&&f){
                    sum++;
                    list.add(i);
                }

            }
        }
        //System.out.println(list);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(rotatedDigits(857));
    }
}
