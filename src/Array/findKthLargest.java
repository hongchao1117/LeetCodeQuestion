package Array;

import java.util.Arrays;

public class findKthLargest {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int len = nums.length -k;
        for (int i = 0; i <= len; i++) {
            if (i==len)
                return nums[len];
        }
        return -1;
    }
}
