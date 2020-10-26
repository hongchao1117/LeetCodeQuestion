package Array;

/**
 * 需要异或处理
 */
public class singleNumbers {
    public int[] singleNumbers(int[] nums) {
        int[] arr = new int[2];
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        int flag = (-res) & res;
        for (int num : nums) {
            if ((flag & num) == 0) {
                arr[0] ^= num;
            } else {
                arr[1] ^= num;
            }
        }
        return arr;
    }
}
