package BinaryTree;

import java.util.Arrays;

/**
 * Created by wangxin on 2018/4/27.
 */
public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        //i最后停在比目标大的位置，j停在比目标晓得位置
        if(nums.length==0)
            return 0;
        int i=0,j=nums.length-1;
        while(i<=j){
            int m=(i+j)/2;
            if(nums[m]==target)
                return m;
            if(target>nums[m]){
                i=m+1;
            }else{
                j=m-1;
            }
        }
        return i;

    }

    public static void main(String[] args) {
        int [] nums={1,3};
        System.out.println(searchInsert(nums,0));
        String str=new String();
        System.out.println(str.length());
    }
}
