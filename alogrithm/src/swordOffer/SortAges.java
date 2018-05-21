package swordOffer;

import java.util.Arrays;

/**
 * Created by wangxin on 2018/5/16.
 */
public class SortAges {
    public static void SortAge(int ages[],int len) {
        if(ages == null || ages.length<1)
            return ;
        int timesOfAge[]=new int[100];
        int i;
        //计算每个年龄员工的个数
        for(i=0;i<len;i++) {
            if(ages[i]<=99 && ages[i]>=0)
                timesOfAge[ages[i]]++;
        }
        //对ages进行排序
        int index = 0;
        for(i=0;i<100;i++){
            int j = 0;
            while(j<timesOfAge[i]) {
                ages[index++] = i;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int ages[] = {33,34,45,24,36,23,21,22,19,26,45,34,21,34,34,33,52,22,32,25,27,43,22,21,20,33,26,27,15,29};
        int len = 30;
        SortAge(ages,len);
        System.out.println(Arrays.toString(ages));
    }
}
