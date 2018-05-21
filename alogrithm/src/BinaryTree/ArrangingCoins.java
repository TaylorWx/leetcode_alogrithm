package BinaryTree;

/**
 * Created by wangxin on 2018/4/29.
 */
public class ArrangingCoins {
    public  static int arrangeCoins(int n) {
        int cur=1,rem=n-1;
        while(rem>=cur+1){
            cur++;
            rem-=cur;
        }
        return n==0?0:cur;
        /*int start=0,end=n;
        int mid;
        while(start<=end){
            mid=(start+end)/2;
            if((mid*0.5+mid*mid*0.5)<=n)
                start=mid+1;
            else
                end=mid-1;
        }
        return start-1;*/
    }


    public static void main(String[] args) {
        System.out.println(arrangeCoins(6));
    }
}
