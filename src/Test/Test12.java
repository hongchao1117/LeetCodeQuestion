package Test;

public class Test12 {

    public static void main(String[] args) throws Exception {

    }

    public static boolean partitionEqualsSubArray(int[] arrs) {
        if (arrs.length < 2) return false;
        int sum = 0;
        for (int arr : arrs) {
            sum += arr;
        }
        if (sum % 2 != 0) {
            return false;
        }
        return partitionEqualsSubsetSum(arrs.length - 1, arrs, sum / 2);
    }

    private static boolean partitionEqualsSubsetSum(int n, int[] arrs, int k) {
        if (k == 0) return true;
        if (n == 0 && arrs[n] == k) {
            return true;
        } else if (n == 0 && arrs[n] != k) {
            return false;
        }
        if (arrs[n] > k) {
            return false;
        }
        return partitionEqualsSubsetSum(n - 1, arrs, k) || partitionEqualsSubsetSum(n - 1, arrs, k - arrs[n]);

    }

}