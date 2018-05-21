package TwoPointer;
import java.util.*;

public class IntersectionArraysII {
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }else if(nums1[i]==nums2[j]){
                list.add(nums1[i]);
                i++;j++;
            }
        }
        int result[]=new int[list.size()];
        for(int p=0;p<list.size();p++)
            result[p]=list.get(p);
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {2,1}, nums2 = {1,1};
        int []sum=intersect(nums1,nums2);
        System.out.println(Arrays.toString(sum));
    }
}
