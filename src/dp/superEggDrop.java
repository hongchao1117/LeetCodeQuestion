package dp;

public class superEggDrop {

    public int superEggDrop(int k, int n) {
        //dp[i][j] 表示i步，用j个鸡蛋可以测出最大层数
        int[][] dp = new int[n + 1][k + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                //鸡蛋没碎，数量没变,用了一步，dp[i-1][j] 上层
                //鸡蛋碎了，数量减一，用了一步，dp[i-1][j-1] 下层
                // 1  当前层
                //最大层数 = 上层 + 下层 + 当前层
                dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1] + 1;
                if (dp[i][j] >= n) {
                    return i;
                }
            }
        }
        return n;
    }

}
