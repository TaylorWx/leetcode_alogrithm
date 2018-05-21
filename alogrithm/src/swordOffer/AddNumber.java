package swordOffer;

/**
 * Created by wangxin on 2018/5/16.
 */
public class AddNumber {
    public static int add(int n){
        if(n==0)
            return 0;
        return add(n-1)+n;
    }
    public static void main(String[] args) {
        System.out.println(add(5000));
    }
}
