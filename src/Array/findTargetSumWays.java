package Array;

/**
 * @author 洪超
 */
public class findTargetSumWays {
    int count = 0;
    public int findTargetSumWays(int[] nums, int S) {
        getRes(nums, 0, 0, S);
        return count;
    }

    private void getRes(int[] nums, int i, int sum, int s) {
        if (i == nums.length) {
            if (sum == s) {
                count++;
            } else {
                getRes(nums, i + 1, sum + nums[i], s);
                getRes(nums, i + 1, sum - nums[i], s);
            }
        }
    }
}