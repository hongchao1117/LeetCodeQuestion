package dp;

public class maxProfit {
    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(nums));
    }

    public static int maxProfit(int[] prices) {
        if (prices.length <= 1) return 0;
        int minValue = Integer.MAX_VALUE, res = 0;
        for (int i = 0; i < prices.length; i++) {
            if (minValue > prices[i]) {
                minValue = prices[i];
                continue;
            }
            int profit = prices[i] - minValue;
            res = Math.max(profit, res);
        }
        return res;
    }
}
