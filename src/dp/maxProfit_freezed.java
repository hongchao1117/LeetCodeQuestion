package dp;

public class maxProfit_freezed {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;
        int[][] dp = new int[prices.length][3];
        /** 由于可以无限次交易，所以只定义两个维度，
         *  第一个维度是天数，第二个维度是是否持有股票
         *  0：不持有，1：持有，2：冷冻期
         */
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        dp[0][2] = 0;
        for (int i = 1; i < prices.length; i++) {
            //第i天不持有股票的情况有2种
            //a.第i-1天也不持有股票
            //b.第i-1天是过渡期
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][2]);
            //第i天持有股票有两种情况
            //a.第i-1天也持有股票，第i天不操作
            //b.第i-1天不持有股票，在第i天买入
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
            //第i天是冷冻期只有一种情况，前一天持有股票并卖出
            dp[i][2] = dp[i - 1][1] + prices[i];
        }
        //最大利润为最后一天，不持有股票或者进入冷冻期的情况
        return Math.max(dp[prices.length - 1][0], dp[prices.length - 1][2]);
    }
}
