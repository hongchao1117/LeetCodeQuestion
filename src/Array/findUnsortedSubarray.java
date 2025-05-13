package Array;


public class findUnsortedSubarray {
    public int findUnsortedSubarray(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        int l = 0, r = 0;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < max) {
                r = i;
            }
            max = Math.max(nums[i], max);
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > min) {
                l = i;
            }
            min = Math.min(nums[i], min);
        }
        return r == l ? 0 : r - l + 1;

    }
}
