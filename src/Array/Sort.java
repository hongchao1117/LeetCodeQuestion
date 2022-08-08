package Array;

/**
 * 对只包含0、1、2三种元素的数组进行排序
 */
public class Sort {

    public static void main(String[] args) {
        int[] nums = {1, 0, 0, 2, 2, 2, 1, 0, 0};
        sort(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    public static void sort(int[] nums) {
        int left = 0, right = nums.length - 1;
        int i = 0;
        while (i < right) {
            if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 0) {
                swap(nums, i, left++);
            } else {
                swap(nums, i, right--);
            }
        }

    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
