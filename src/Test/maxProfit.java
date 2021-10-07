package Test;

public class maxProfit {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int max = 0, min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            max = Math.max(max, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return max;
    }
}
