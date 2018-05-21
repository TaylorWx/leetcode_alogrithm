package swordOffer;

import java.util.Arrays;

/**
 * Created by wangxin on 2018/5/17.
 */
public class AjusticeNumber {
    public static void change1(int []num){
        if(num==null||num.length==0)
            return;
        int start=0,end=num.length-1;
        int pivot=num[0];
        while(start<end){
            while(start<end && num[end]%2==0) end--;
            num[start]=num[end];
            while(start<end && num[start]%2!=0) start++;
            num[end]=num[start];
        }
        num[start]=pivot;
    }
    public static void change2(int num[]){
        if(num==null||num.length==0)
            return;
        int start=0,end=num.length-1;
        while(start<end){
            while(start<end && function(end,num)) end--;
            while(start<end && !function(start,num)) start++;
            if(start<end){
                int temp=num[start];
                num[start]=num[end];
                num[end]=temp;
            }
        }
    }
    public static boolean function(int i,int num[]){
        if(num[i]%2==0)
            return true;
        else
            return false;
    }
    public static int gg(){
        try{
            int num=9/0;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        int num1[]={1,2,4,6,8,9,3,5,4,7,0};
        int num2[]={1,2,4,6,8,9,3,5,4,7,0};
        change1(num1);
        System.out.println(Arrays.toString(num1));
        change2(num2);
        System.out.println(Arrays.toString(num2));
        System.out.println(gg());

    }
}
