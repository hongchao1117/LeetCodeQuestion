package Array;

import java.util.Arrays;

/**
 * 给定一个数组 A[0,1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，
 * 其中 B 中的元素 B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。
 * 不能使用除法。
 */
public class constructArr {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] arr = constructArr(nums);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] constructArr(int[] a) {
        int len = a.length;
        int[] nums = new int[len];
        for (int i = 0, cur = 1; i < len; i++) {
            nums[i] = cur;
            cur *= a[i];
        }
        for (int i = len - 1, cur = 1; i >= 0; i--) {
            nums[i] *= cur;
            cur *= a[i];
        }
        return nums;
    }
}
