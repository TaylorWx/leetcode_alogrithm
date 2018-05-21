package TwoPointer;

import java.util.Arrays;

/**
 * Created by wangxin on 2018/4/26.
 */
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if(nums.length==0||nums.length==1)
            return nums.length;
        int p=0,q=1;
        int length=0;
        while(q<nums.length){
            if(nums[p]==nums[q]){
                q++;
            }else{
                p++;
                nums[p]=nums[q];
                q++;
            }
        }
        return p+1;
    }

    public static void main(String[] args) {
        int [] nums={1,1,2,2,3,3};
        int length=removeDuplicates(nums);
        /*for(int i=0;i<4;i++)
            System.out.print(nums[i]+" ");*/
    }
}
