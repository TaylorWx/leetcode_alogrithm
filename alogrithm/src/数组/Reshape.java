package 数组;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangxin on 2018/4/24.
 */
public class Reshape {
    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        int m = nums.length, n = nums[0].length;
        //改造
        if (m * n == r * c) {
            List list = new ArrayList<>();
            int[][] newMartix = new int[r][c];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    list.add(nums[i][j]);
                }
            }
            int key=0;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    newMartix[i][j]=(Integer) list.get(key);
                    key++;
                }
            }
            return newMartix;
        }else
        return nums;
}

    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}};
        int[][] newMatrix = matrixReshape(matrix,1,4);
        for(int i=0;i<newMatrix.length;i++){
            for(int j=0;j<newMatrix[0].length;j++){
                System.out.print(newMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
