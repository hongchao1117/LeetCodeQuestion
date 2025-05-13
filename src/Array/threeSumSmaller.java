package Array;

import java.util.Arrays;

/**
 * 给定一个长度为 n 的整数数组和一个目标值 target ，寻找能够使条件 nums[i] + nums[j] + nums[k] < target 成立的三元组  i, j, k 个数（0 <= i < j < k < n）。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入: nums = [-2,0,1,3], target = 2
 * 输出: 2
 * 解释: 因为一共有两个三元组满足累加和小于 2:
 * [-2,0,1]
 * [-2,0,3]
 * 示例 2：
 * <p>
 * 输入: nums = [], target = 0
 * 输出: 0
 * 示例 3：
 * <p>
 * 输入: nums = [0], target = 0
 * 输出: 0
 */
public class threeSumSmaller {
    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int ct = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > target) {
                break;
            } else {
                ct += twoSumSmaller(nums, i + 1, target - nums[i]);
            }
        }
        return ct;
    }

    public int twoSumSmaller(int[] nums, int start, int target) {
        //nums ordered
        int i = start;
        int j = nums.length - 1;
        int ct = 0;
        while (i < j && nums[i] <= target) {
            int v = nums[i] + nums[j];
            if (v < target) {
                ct += j - i;
                i++;
            } else {
                j--;
            }
        }
        return ct;
    }
}
