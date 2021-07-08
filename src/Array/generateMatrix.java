package Array;

/**
 * 给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。
 */
public class generateMatrix {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int j = 0, count = 1;
        while (count <= n * n) {
            for (int i = j; i < n - j; i++) {
                matrix[j][i] = count++;
            }
            for (int i = j + 1; i < n - j; i++) {
                matrix[i][n - j - 1] = count++;
            }
            for (int i = n - j - 2; i >= j; i--) {
                matrix[n - j - 1][i] = count++;
            }
            for (int i = n - j - 2; i > j; i--) {
                matrix[i][j] = count++;
            }
            j++;
        }
        return matrix;
    }
}
