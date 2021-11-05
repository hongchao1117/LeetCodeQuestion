package Test;

import java.util.Arrays;

public class DidiTest {

    public static void main(String[] args) {
        int[] nums = new int[]{4, 7, 6, 5, 3, 2, 1};
        System.out.println(Arrays.toString(finMaxMinNum(nums)));
    }

    public static int[] finMaxMinNum(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i + 1] < nums[i]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] < nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
        return nums;
    }

    private static void reverse(int[] nums, int i) {
        int start = i, end = nums.length - 1;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
