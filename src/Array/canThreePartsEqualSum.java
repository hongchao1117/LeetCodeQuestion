package Array;

/**
 * 给你一个整数数组 arr，只有可以将其划分为三个和相等的 非空 部分时才返回 true，否则返回 false。
 * <p>
 * 形式上，如果可以找出索引 i + 1 < j 
 * 且满足 (arr[0] + arr[1] + ... + arr[i] == arr[i + 1] + arr[i + 2] + ... + arr[j - 1] == arr[j] + arr[j + 1] + ... + arr[arr.length - 1]) 就可以将数组三等分。
 */
public class canThreePartsEqualSum {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        if (sum % 3 != 0) {
            return false;
        }
        sum /= 3;
        int tempSum = 0, len = arr.length, count = 0;
        for (int i = 0; i < len - 1; i++) {
            tempSum += arr[i];
            if (tempSum == sum) {
                count++;
                if (count == 2) {
                    return true;
                }
                tempSum = 0;
            }
        }
        return false;
    }
}
