package Array;

public class findMaxAverage {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0, max = 0;
        int l = 0, r = k - 1;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        max = sum;
        while (r < nums.length - 1) {
            r++;
            l++;
            sum += nums[r] - nums[l - 1];
            max = Math.max(max, sum);
        }
        return (double) max / k;
    }
}
