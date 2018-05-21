package Math;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangxin on 2018/4/25.
 */
public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(valid2(i))
                list.add(i);
        }
        return list;
    }
    //将数字直接转化成字符，一个个进行分离运算
    public boolean valid1(int num){
        char[] chars=String.valueOf(num).toCharArray();
        for(char ch:chars){
            if(ch=='0'){
                return false;
            }else{
                if(num%(ch-'0')!=0)
                    return false;
            }
        }
        return true;
    }
    //将数字直接转化成字符，一个个进行分离运算
    public boolean valid2(int num){
        int n=num;
        while(num!=0){
            int c=num%10;
            if(c==0){
                return false;
            }else{
                if(n%c!=0) return false;
            }
            num/=10;
        }
        return true;
    }

    public static void main(String[] args) {
        int num=999;
        char[] chars=String.valueOf(num).toCharArray();
        System.out.println(chars[1]);
    }
}
