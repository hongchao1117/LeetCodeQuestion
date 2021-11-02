package Array;

import java.util.Arrays;

public class canPartitionKSubsets {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum % k != 0) {
            return false;
        }
        sum /= k;
        Arrays.sort(nums);
        if (nums[nums.length - 1] > sum) {
            return false;
        }
        int[] arr = new int[k];
        Arrays.fill(arr, sum);
        return getRes(nums, nums.length - 1, arr, k);
    }

    private boolean getRes(int[] nums, int cur, int[] arr, int k) {
        if (cur < 0) {
            return true;
        }
        for (int i = 0; i < k; i++) {
            if (arr[i] == nums[cur] || (cur > 0 && arr[i] - nums[cur] >= nums[0])) {
                arr[i] -= nums[cur];
                if (getRes(nums, cur - 1, arr, k)) {
                    return true;
                }
                arr[i] += nums[cur];
            }
        }
        return false;
    }
}
