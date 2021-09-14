package Strings;

/**
 * 大数相乘
 */
public class multiply {
    public static void main(String[] args) {
        System.out.println(multiply("1", "456"));
    }

    public static String multiply(String num1, String num2) {
        int len1 = num1.length(), len2 = num2.length();
        if (len1 <= 0 || len2 <= 0) return null;
        int[] nums = new int[len1 + len2];
        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                int carry = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                carry += nums[i + j + 1];
                nums[i + j] += carry / 10;
                nums[i + j + 1] = carry % 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        int i = 0;
        // 去掉前导0
        while (i < nums.length - 1 && nums[i] == 0)
            i++;
        for (; i < nums.length; ++i)
            sb.append(nums[i]);
        return sb.toString();
    }

}
