package Array;

/**
 * 假如有一排房子，共 n 个，每个房子可以被粉刷成红色、蓝色或者绿色这三种颜色中的一种，你需要粉刷所有的房子并且使其相邻的两个房子颜色不能相同。
 * <p>
 * 当然，因为市场上不同颜色油漆的价格不同，所以房子粉刷成不同颜色的花费成本也是不同的。每个房子粉刷成不同颜色的花费是以一个 n x 3 的正整数矩阵 costs 来表示的。
 * <p>
 * 例如，costs[0][0] 表示第 0 号房子粉刷成红色的成本花费；costs[1][2] 表示第 1 号房子粉刷成绿色的花费，以此类推。
 * <p>
 * 请计算出粉刷完所有房子最少的花费成本。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入: costs = [[17,2,17],[16,16,5],[14,3,19]]
 * 输出: 10
 * 解释: 将 0 号房子粉刷成蓝色，1 号房子粉刷成绿色，2 号房子粉刷成蓝色。
 * 最少花费: 2 + 5 + 3 = 10。
 * 示例 2：
 * <p>
 * 输入: costs = [[7,6,2]]
 * 输出: 2
 */
public class minCost {
    public int minCost(int[][] costs) {
        // 计算粉刷完所有房子最少的花费
        int[][] dp = new int[costs.length + 1][3];
        dp[0][0] = costs[0][0];
        dp[0][1] = costs[0][1];
        dp[0][2] = costs[0][2];

        if (costs.length == 1) return Math.min(dp[0][0], Math.min(dp[0][1], dp[0][2]));
        // dp[1][0] = Math.min(dp[0][1],dp[0][2]) + costs[1][0];
        // dp[1][1] = Math.min(dp[0][0],dp[0][2]) + costs[1][1];
        // dp[1][2] = Math.min(dp[0][0],dp[0][1]) + costs[1][2];
        for (int i = 1; i < costs.length; i++) {
            dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + costs[i][0];
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + costs[i][1];
            dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + costs[i][2];
        }

        int len = costs.length - 1;
        return Math.min(dp[len][0], Math.min(dp[len][1], dp[len][2]));
    }
}
