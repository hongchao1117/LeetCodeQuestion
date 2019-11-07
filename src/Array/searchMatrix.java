package Array;

public class searchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        /**int i = 0,j = 0;
        boolean flag = false;
        A:while (i<matrix.length && j< matrix[i].length) {
            for (int k = i; k < matrix.length; k++) {
                if (matrix[k][j] == target) {
                    flag = true;
                    break A;
                }
            }
            for (int n = j; n < matrix[i].length; n++) {
                if (matrix[i][n] == target) {
                    flag = true;
                    break A;
                }
            }
            i++;
            j++;
        }
        return flag;*/
        if (matrix==null || matrix.length==0)
            return false;
        int m = 0;
        int n = matrix[0].length-1;
        while (m<matrix.length && n>=0){
            if (matrix[m][n]==target)
                return true;
            else if (matrix[m][n]>target){
                n--;
            }else {
                m++;
            }
        }
        return false;
    }
}
