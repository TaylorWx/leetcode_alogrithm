package TwoPointer;

/**
 * Created by wangxin on 2018/4/26.
 */
public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int k=0,n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                k++;
            }else{
                nums[i-k]=nums[i];
            }
        }
        if(k!=0){
            for(int i=1;i<=k;i++)
                nums[n-i]=0;
        }
    }

    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        moveZeroes(nums);
        for(int i=0;i<nums.length;i++)
            System.out.print(nums[i]+" ");
    }
}
