package TwoPointer;

import java.util.*;

/**
 * Created by wangxin on 2018/5/9.
 */
public class KdiffPairsinanArray {
    public static int findPairs(int[] nums, int k) {
        if(nums==null||k<0)  return 0;
        Set<Integer> set=new HashSet<Integer>();
        Set<Integer> setCount=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]-k)) setCount.add(nums[i]);
            if(set.contains(nums[i]+k)) setCount.add(nums[i]+k);
            set.add(nums[i]);
        }
        return setCount.size();
    }

    public static void main(String[] args) {
        int nums[]={1, 3, 1, 5, 4}, k = 1;
        System.out.println(findPairs(nums,k));
    }
    /*int ans = 0;
    Arrays.sort(nums);
    for (int i = 0, j = 0; i < nums.length; i++) {
        for (j = Math.max(j, i + 1); j < nums.length && (long) nums[j] - nums[i] < k; j++) ;
        if (j < nums.length && (long) nums[j] - nums[i] == k) ans++;
        while (i + 1 < nums.length && nums[i] == nums[i + 1]) i++;
    }
    return ans;


 if (nums == null || nums.length < 2) return 0;
        Arrays.sort(nums);
        int left = 0, count = 0;
        for (int right = 1; right < nums.length; right++) {
            if (nums[right] - nums[left] < k) continue;
            else if (nums[right] - nums[left] == k) {
                count++;
                while (right < nums.length - 1 && nums[right + 1] == nums[right]) right++;
            }
            else {
                while (left < right && nums[right] - nums[left] > k) {
                    left++;
                }
                if (left == right) continue;
                else right--;
            }
        }
        return count;*/
}
