package Array;

import java.util.ArrayList;
import java.util.List;

public class spiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix==null)   return list;
        int row = matrix.length;//行数
        while (row!=0){
            for (int i = 0; i < matrix[0].length; i++) {
                list.add(matrix[0][i]);
            }
            if (row==1)
                break;
            matrix = revert(matrix);
            row = matrix.length;
        }
        return list;
    }

    private int[][] revert(int[][] matrix) {
        int rows = matrix.length;//行数
        int cols = matrix[0].length;//列数
        //新数组
        int[][] arr = new int[cols][rows-1];
        for (int i = cols-1; i >=0 ; i--) {
            for (int j = 1; j < rows; j++) {
                arr[cols-i-1][j-1] = matrix[j][i];
            }
        }
        return arr;

    }
}
