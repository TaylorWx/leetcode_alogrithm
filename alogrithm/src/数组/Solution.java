package 数组;

import java.util.Arrays;

/**
 * Created by wangxin on 2018/4/23.
 */
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                System.out.println(nums[i] + "");
                sum+=nums[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution a=new Solution();
        int[] nums={1,2,3,2};
        int sum=a.arrayPairSum(nums);
        System.out.println(sum);
    }
}
