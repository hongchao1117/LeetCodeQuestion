package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

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
        int a = 0,b = 0;
        for (int i:nums){
            b = (b ^ i) & ~a;
            a = (a ^ i) & ~b;
        }
        return b;
    }
}
