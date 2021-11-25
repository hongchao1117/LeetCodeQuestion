package Array;

/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，
 * 则这两个数字组成一个逆序对。
 * 输入一个数组，求出这个数组中的逆序对的总数。
 */
public class reversePairs {
    int[] nums, temp;

    public int reversePairs(int[] nums) {
        this.nums = nums;
        temp = new int[nums.length];
        return mergeHelper(0, nums.length - 1);
    }

    private int mergeHelper(int l, int r) {
        if (l >= r) return 0;
        int mid = (l + r) / 2;
        int res = mergeHelper(l, mid) + mergeHelper(mid + 1, r);
        int i = l, j = mid + 1;
        for (int k = l; k <= r; k++) {
            temp[k] = nums[k];
        }
        for (int k = l; k <= r; k++) {
            if (i == mid + 1) {
                nums[k] = temp[j++];
            } else if (j == r + 1 || temp[j] >= temp[i]) {
                nums[k] = temp[i++];
            } else {
                nums[k] = temp[j++];
                res += mid - i + 1;
            }
        }
        return res;
    }

}
