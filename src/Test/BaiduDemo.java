package Test;

public class BaiduDemo {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 9};
        System.out.println(findKMInNum(nums, 1));
    }

    public static int findKMInNum(int[] nums, int k) {
        quickSort(nums, k, 0, nums.length - 1);
        return nums[k - 1];
    }

    private static void quickSort(int[] nums, int k, int left, int right) {
        if (left > right) {
            return;
        }
        int base = nums[left];
        int i = left, j = right;
        while (i < j) {
            while (i < j && nums[j] >= base) {
                j--;
            }
            nums[i] = nums[j];
            while (i < j && nums[i] <= base) {
                i++;
            }
            nums[j] = nums[i];
        }
        nums[i] = base;
        if (i == k - 1) {
            return;
        } else if (i < k - 1) {
            quickSort(nums, k, i + 1, right);
        } else {
            quickSort(nums, k, left, i + 1);
        }
    }
}
