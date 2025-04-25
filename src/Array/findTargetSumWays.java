package Array;

/**
 * @author 洪超
 */
public class findTargetSumWays {
    int count = 0;

    public int findTargetSumWays(int[] nums, int target) {
        getRes(nums, target, 0, 0);
        return count;
    }

    public void getRes(int[] nums, int target, int i, int sum) {
        if (i == nums.length) {
            if (sum == target) {
                count++;
            }
        } else {
            getRes(nums, target, i + 1, sum - nums[i]);
            getRes(nums, target, i + 1, sum + nums[i]);
        }
    }
}