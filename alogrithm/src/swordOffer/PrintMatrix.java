package swordOffer;

import java.util.ArrayList;

/**
 * Created by wangxin on 2018/5/18.
 */
public class PrintMatrix {
    public static ArrayList<Integer> printMatrix(int[][] matrix){
        ArrayList<Integer> result=new ArrayList<>();
        if(matrix == null)
            return result;
        int rows=matrix.length;
        int columns=0;
        if(rows >0){
            columns = matrix[0].length;
        }else{
            return result;
        }
        int start=0;//起始值
        while(rows>start*2 && columns>start*2){
            //循环打印一个圈
            printMatrixInCircle(matrix,columns,rows,start,result);
            start++;
        }
        return result;
    }
    public static void printMatrixInCircle(int[][] matrix, int rows, int columns, int start, ArrayList<Integer> print){
        //打印第一行
        int endC=columns-1-start;//结束的列
        int endR=rows-1-start;//结束的行
        for(int i=start;i<=endC;i++){
            print.add(matrix[start][i]);
        }
        //从上往下，那么结束的行要大于开始的行
        if(start < endR){
            for(int i=start+1;i<=endC;i++){
                print.add(matrix[i][endC]);
            }
        }
        //从左往右，那么结束的行要大于开始的行，结束的列要大于开始的列
        if(start < endC &&start < endR){
            for(int i=endC-1;i>=start;i--){
                print.add(matrix[endR][i]);
            }
        }
        //从下往上，那么结束的列要大于其实的列，结束的行要必须有三行
        if(endC > start && endR-1 >start){
            for(int i=endR-1 ;i<=start+1;i++){
                print.add(matrix[i][start]);
            }
        }
    }

    public static void main(String[] args) {
        int [][]num={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList=printMatrix(num);
        System.out.println(arrayList.toString());
        int [][]nums=new int[5][];
        for(int i=0;i<nums.length;i++){
            nums[i]=new int[5];
            for(int j=0;j<num[0].length;j++){
                nums[i][j]=j;
            }
        }
        arrayList=printMatrix(nums);
        System.out.println(arrayList.toString());
    }
}
