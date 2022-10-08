package dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个包含非负整数的 m x n 网格，
 * 请找出一条从左上角到右下角的路径，
 * 使得路径上的数字总和为最小。
 * <p>
 * 说明：每次只能向下或者向右移动一步。
 */
public class minPathSum {
    public int minPathSum(int[][] grid) {
        if (grid == null) return 0;
        int m = grid.length, n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i][j - 1], dp[i - 1][j]) + grid[i][j];
            }
        }
        return dp[m - 1][n - 1];

    }

    public static void main(String[] args) {
        int num = 4;
        String[] nums = {"123", "45", "678", "23"};
        System.out.println(getResHelper(num, nums));
    }

    public static String getResHelper(int number, String[] nums) {
        if (number == 0) {
            return "0";
        }
        Arrays.sort(nums, (o1, o2) -> o2.charAt(0) - o1.charAt(0));
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < number; i++) {
            res.append(nums[i]);
        }
        return res.toString();
    }

    public List<Integer> getNumberList(int number, int[][] nums) {
        List<Integer> res = new ArrayList<>();
        for (int[] num : nums) {
            int left = num[0];
            int right = num[1];
            int count = 0;
            while (left != right) {
                if (left * 8 < right) {
                    left *= 8;
                    count++;
                }
                if (left * 4 < right) {
                    left *= 4;
                    count++;
                }
                if (left * 2 < right) {
                    left *= 2;
                    count++;
                }
                if (left / 2 < right) {
                    left /= 2;
                    count++;
                }
                if (left / 4 < right) {
                    left /= 4;
                    count++;
                }
                if (left / 8 < right) {
                    left /= 8;
                    count++;
                }
            }
            res.add(count);
        }
        return res;
    }

}
