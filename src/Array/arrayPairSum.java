package Array;

import java.util.Arrays;

public class arrayPairSum {
    public int arrayPairSum(int[] nums) {
        if(nums==null || nums.length==0)
            return 0;
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i = i+2) {
            sum += nums[i];
        }
        return sum;
    }
}
