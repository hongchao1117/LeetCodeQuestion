package Array;

public class canArrange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 10, 6, 7, 8, 9};
        int k = 5;
        boolean res = canArrange(arr, k);
        System.out.println(res);
    }

    public static boolean canArrange(int[] arr, int k) {
        int[] helper = new int[k];
        for (int num : arr) {
            int mod = num % k;
            // 把负余数变成正余数
            if (mod < 0) mod += k;
            helper[mod]++;
        }
        // 单独判断一下余数为0的情况
        if ((helper[0] & 1) == 1) {
            return false;
        }
        // 这地方余数i从1开始枚举，因为为0的情况已经判断了，若是从0开始枚举的话会出现数组越界
        for (int i = 1; i <= k / 2; i++) {
            if (helper[i] != helper[k - i]) {
                return false;
            }
        }
        return true;
    }
}
