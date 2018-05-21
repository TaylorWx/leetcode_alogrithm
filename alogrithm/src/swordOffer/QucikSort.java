package swordOffer;

import java.util.Arrays;

/**
 * Created by wangxin on 2018/5/16.
 */
public class QucikSort {
    public int partition(int[] num,int low,int high){
        //选择第一个元素作为枢纽值
        int pivot=num[low];
        while(low<high){
            while(low<high && num[high]>=pivot) high--;
            num[low]= num[high];//把最小的移动到左边
            while(low<high && num[low]<=pivot) low++;
            num[high]=num[low];//把最大的移动到右边
        }
        num[low]=pivot;
        return low;
    }
    public void sort(int[] num,int low,int high){
        if(low<high){//递归跳出的条件
            int pivotpoint=partition(num,low,high);
            sort(num,low,pivotpoint-1);
            sort(num,pivotpoint+1,high);
        }
    }

    public static void main(String[] args) {
        QucikSort qucikSort=new QucikSort();
        int a[]={1,8,9,56,4,3,99,6,22,4,0,-5,4,67};
        qucikSort.sort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
