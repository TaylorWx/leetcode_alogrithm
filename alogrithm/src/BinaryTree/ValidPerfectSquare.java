package BinaryTree;

/**
 * Created by wangxin on 2018/4/27.
 */
public class ValidPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        /*for(int i=0;i<=num/2;i++){
            if(i*i==num)
                return true;
        }
        return false;*/
        if(num<1) return false;
        if(num==1) return true;
        int left=0,right=num;
        while(left<=num){
            int mid=(left+right)/2;
            int val=mid*mid;
            if(val==num)
                return true;
            if(val>num)
                right=mid-1;
            else
                left=mid+1;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(144));
    }
}
