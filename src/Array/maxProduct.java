package Array;

import java.util.Arrays;

public class maxProduct {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, -2, 4};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE, tempMax = 1, tempMin = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = tempMax;
                tempMax = tempMin;
                tempMin = temp;
            }
            tempMax = Math.max(nums[i], tempMax * nums[i]);
            tempMin = Math.min(nums[i], tempMin * nums[i]);
            max = Math.max(max, tempMax);
        }
        return max;
    }
}
