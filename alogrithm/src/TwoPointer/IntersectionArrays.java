package TwoPointer;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by wangxin on 2018/4/26.
 */
public class IntersectionArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                list.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int []result=new int[list.size()];
        for(int i=0;i<list.size();i++)
            result[i]=list.get(i);
        return result;
    }

    public static void main(String[] args) {
       int[] nums1 = {1, 2, 2, 1}, nums2 = {2, 2};
       int []sum=intersection(nums1,nums2);
        System.out.println(Arrays.toString(sum));
    }
}
