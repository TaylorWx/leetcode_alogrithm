package swordOffer;

/**
 * Created by wangxin on 2018/5/16.
 */
public class BinaryNumber {
    public static int numberTransfer(String string){
        int num=0;
        for(int i=0;i<string.length();i++){
            num=num*26+((int)(string.charAt(i)-'A')+1);
        }
        return num;
    }

    public static int count1(int n){
        int count=0;
        int flag=-1;
        while(flag!=0){
            if((n&flag)!=0)
                count++;
            flag=flag<<1;
        }
        return count;
    }
    public static int count2(int n){
        int count=0;
        while(n!=0){
            count++;
            n=(n-1)&n;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(numberTransfer("AB"));
        System.out.println(count2(-1));
    }
}
