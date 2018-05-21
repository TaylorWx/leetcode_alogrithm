package TwoPointer;

/**
 * Created by wangxin on 2018/4/26.
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int length=0;
        int ss=0;
        for(int i=0;i<nums.length;i++){
            if(val!=nums[i]) {
                nums[i-length] = nums[i];
                ss++;
            }else{
                length++;
            }
        }
        return ss;
    }
}
