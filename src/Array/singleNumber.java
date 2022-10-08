package Array;

/**
 * x & ~x = 0;
 * x & ~0 = x;
 */
public class singleNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2};
        System.out.println(singleNumber(arr));

    }

    public static int singleNumber(int[] nums) {
        int ans = 0;
        for (int num : nums) ans ^= num;
        return ans;
    }
}
