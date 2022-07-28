package Test;

public class DidiDemo {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 6, 3, 5, 5462, 43};
        quickSort(nums, 0, nums.length - 1);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    public static void quickSort(int[] nums, int left, int right) {
        if (left >= right) return;
        int standard = nums[left];
        int i = left;
        int j = right;
        while (i < j) {
            while (i < j && nums[j] >= standard) {
                j--;
            }
            while (i < j && nums[i] <= standard) {
                i++;
            }
            if (i < j) {
                swap(nums, i, j);
            }
        }
        swap(nums, left, i);
        quickSort(nums, left, i - 1);
        quickSort(nums, i + 1, right);

    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
