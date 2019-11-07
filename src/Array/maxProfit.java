package Array;

public class maxProfit {
    public int maxProfit(int[] nums) {
        if (nums.length<=1) return 0;
        int min = nums[0];
        int sum = 0;//交易利润
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(sum, nums[i] - min);
            min = Math.min(min, nums[i]);
        }
        return sum;
    }
}
