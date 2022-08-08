package Sort;

public class quickSort {
    private void quickSorting(int[] nums, int start, int end) {
        if (start >= end) return;
        int left = start, right = end;
        int standard = nums[left];
        while (left < right) {
            while (left < right && standard <= nums[right]) {
                right--;
            }
            if (left < right) {
                nums[left] = nums[right];
            }
            while (left < right && nums[left] < standard) {
                left++;
            }
            if (left < right) {
                nums[right] = nums[left];
            }
        }
        nums[left] = standard;
        quickSorting(nums, start, left);
        quickSorting(nums, left + 1, end);
    }
}
