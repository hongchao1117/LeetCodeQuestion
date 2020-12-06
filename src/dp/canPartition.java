package dp;

public class canPartition {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 != 0) return false;
        int target = sum/2;
        int[] dp = new int[target+1];
        for(int i:nums){
            for (int j = target; j >=i; j--) {
                dp[j] = Math.max(dp[j], dp[j - i] + i);
            }
        }
        return dp[target] == target;
    }
}
