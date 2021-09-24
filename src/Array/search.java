package Array;

//搜索旋转排序数组
public class search {
    public int search(int[] nums, int target) {
        int left = 0;//最左边的数
        int right = nums.length - 1;//最右边的数
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] < nums[right]) {//右边可能未发生旋转
                if (nums[mid] < target && target <= nums[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            } else {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;

    }

    /**
     * 二分查找
     *
     * @param nums
     * @param target
     * @return
     */
    public int binSearch(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
