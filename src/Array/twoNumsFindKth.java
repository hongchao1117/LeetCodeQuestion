package Array;

import java.util.Arrays;

public class twoNumsFindKth {

    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 4, 5, 6};
        int[] num2 = {6, 7, 8, 9};
        System.out.println(calc2(num1, num2, 3));
    }

    public static int calc2(int[] num1, int[] num2, int K) {
        //假定第一个数组长度小
        if (num1.length > num2.length) {
            return calc2(num2, num1, K);
        }
        if (num1.length == 0) {
            return num2[K - 1];
        }
        if (K == 1) {
            return Math.min(num1[K - 1], num2[K - 1]);
        }

        int len1 = num1.length;
        int len2 = num2.length;

        /* 如果两个数组大小不到k/2 取自身大小*/
        int x = Math.min(len1, K / 2);
        int y = Math.min(len2, K / 2);

        if (num1[x - 1] > num2[y - 1]) {
            int[] num2_C = Arrays.copyOfRange(num2, y, num2.length);
            return calc2(num1, num2_C, K - y);
        } else {
            int[] num1_C = Arrays.copyOfRange(num1, x, num1.length);
            return calc2(num1_C, num2, K - x);
        }
    }
}
