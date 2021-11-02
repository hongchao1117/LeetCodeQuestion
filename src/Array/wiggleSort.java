package Array;

import java.util.Arrays;

public class wiggleSort {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int right = nums.length - 1, left = right / 2, mid = right / 2;
        int[] newArr = new int[right + 1];
        int count = 0;
        while (left >= 0 || right > mid) {
            if (left >= 0) {
                newArr[count++] = nums[left--];
            }
            if (right > mid) {
                newArr[count++] = nums[right--];
            }
        }
        System.arraycopy(newArr, 0, nums, 0, newArr.length);
    }
}
