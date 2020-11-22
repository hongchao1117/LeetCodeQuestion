package Array;

public class productExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int left = 1, right = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                left = left * nums[i - 1];
            }
            arr[i] = left;
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i < nums.length - 1) {
                right = right * nums[i +1];
            }
            arr[i] *= right;
        }
        return arr;

    }
}
