package TwoPointer;

import java.util.Arrays;

/**
 * Created by wangxin on 2018/5/9.
 */
public class MergeSortedArray {
    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
            nums3[i]=nums1[i];
        int i=0,j=0,p=0;
        while(i<m&&j<n){
            if(nums3[i]<=nums2[j]){
                nums1[p++]=nums3[i];
                i++;
            }else if(nums3[i]>nums2[j]){
                nums1[p++]=nums2[j];
                j++;
            }
        }
        while(i<m){
            nums1[p++]=nums3[i];
            i++;
        }
        while(j<n){
            nums1[p++]=nums2[j];
            j++;
        }
        System.out.println(Arrays.toString(nums1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<n;i++)
            nums1[m+i]=nums2[i];
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0}, m = 3;
        int nums2 []= {2,5,6},       n = 3;
        merge(nums1,m,nums2,n);
    }
}
