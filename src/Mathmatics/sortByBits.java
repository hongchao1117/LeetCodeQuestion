package Mathmatics;

import java.util.Arrays;
import java.util.Comparator;

public class sortByBits {
    public int[] sortByBits(int[] arr) {
        Integer[] nums = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }
        Arrays.sort(nums, (o1, o2) -> {
            int bitCount1 = Integer.bitCount(o1);
            int bitCount2 = Integer.bitCount(o2);
            return bitCount1 == bitCount2 ? o1 - o2 : bitCount1 - bitCount2;
        });
        for (int i = 0; i < arr.length; i++) {
            arr[i] = nums[i];
        }
        return arr;
    }
}
