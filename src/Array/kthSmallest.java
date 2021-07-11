package Array;

import java.util.Arrays;

/**
 * 给你一个 n x n 矩阵 matrix ，其中每行和每列元素均按升序排序，找到矩阵中第 k 小的元素。
 * 请注意，它是 排序后 的第 k 小元素，而不是第 k 个 不同 的元素。
 */
public class kthSmallest {
    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length, n = matrix[0].length;
        int[] nums = new int[m * n];
        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                nums[index++] = matrix[i][j];
            }
        }
        Arrays.sort(nums);
        return nums[k - 1];
    }
}
