package swordOffer;

/**
 * Created by wangxin on 2018/5/16.
 */
public class BinarySearch {
    public int binary_Search(int []num,int k){
        if(num==null||num.length==0)
            return -1;
        int low=0,high=num.length-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(num[mid]==k)
                return mid;
            if(num[mid]>k)
                high=mid-1;
            if(num[mid]<k)
                low=mid+1;
        }
        return -1;
    }
    public static int recursiveBinarySearch(int[] data, int low, int high, int key) {
        if (data == null || data.length <= 0) {
            return -1;
        }
        if (low <=high) {
            int mid = (low + high) / 2;
            if (data[mid] == key) {
                return mid;
            } else if (data[mid] > key) {
                return recursiveBinarySearch(data, low, mid - 1, key);
            } else if (data[mid] < key) {
                return recursiveBinarySearch(data, mid + 1, high, key);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        BinarySearch aa=new BinarySearch();
        int a[]={1,2,3,4,5,6,8,9,10};
        System.out.println(recursiveBinarySearch(a,0,a.length-1,2));
        System.out.println(aa.binary_Search(a,11));
    }
}
