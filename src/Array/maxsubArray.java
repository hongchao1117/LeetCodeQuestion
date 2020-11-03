package Array;

import java.util.Arrays;
import java.util.Vector;

public class maxsubArray {
    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int maxSubArray = maxSubArray(nums);
        System.out.println(maxSubArray);
    }

    public static int maxSubArray(int[] nums) {
        if (nums==null) return 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int num:nums){
            if (sum>0)
                sum += num;
            else
                sum = num;
            max = Math.max(max,sum);
        }
        return max;
    }

}
