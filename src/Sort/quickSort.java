package Sort;

public class quickSort {
    public void quickSorting(int[] nums, int start, int end) {
        int left = start, right = end;
        if (left < right) {
            int standard = nums[left];
            while (left < right && nums[right] >= standard) {
                right--;
            }
            if (left < right) {
                nums[left] = nums[right];
            }
            while (left < right && nums[left] < standard) {
                left--;
            }
            if (left < right) {
                nums[right] = nums[left];
            }
            nums[left] = standard;
            quickSorting(nums, start, left);
            quickSorting(nums, left + 1, end);
        }
    }
}
