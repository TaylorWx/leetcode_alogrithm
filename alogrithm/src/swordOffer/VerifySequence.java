package swordOffer;

import java.util.Arrays;

/**
 * Created by wangxin on 2018/5/21.
 */
public class VerifySequence {
    //非递归方法
    public static boolean veriftBST(int[] num){
        if(num==null||num.length==0)
            return false;
        //从后往前比较
        int size=num.length;
        while(--size>0){
            int i = 0;
            for (; i < size; ++i) {
                if (num[i] > num[size])
                    break;
            }
            for (; i < size; ++i) {
                if (num[i] < num[size])
                    return false;
            }
        }
        return true;
    }
    //递归方法
    public static boolean veriftBST1(int[] num,int start,int end){
        //叶子节点
        if(start == end)
            return true;
        int root=num[end];
        int i=start;
        for(;i<end;i++){
            if(root<num[i])
                break;
        }
        //找与右边
        int j=i;
        for(;j<end;j++){
            if(num[j]<root)
                return false;
        }
        //然后进行左右两边的子树递归
        boolean left=true,right=true;
        if(i>start && i<end){
            left=veriftBST1(num,start,i-1);
            right=veriftBST1(num,i,end-1);
        }
        return left&&right;
    }
    public static void main(String[] args) {
        int num[]=new int[]{8,6,10,5,7,9,11};
        System.out.println(veriftBST1(num,0,num.length-1));
    }
}
