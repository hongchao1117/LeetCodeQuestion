package Test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine().trim();
        String[] array1 = line.split(",");
        String[] array2 = line.split(",");
        int[] nums1 = new int[array1.length];
        int[] nums2 = new int[array2.length];
        for (int i = 0; i < array1.length; i++) {
            nums1[i] = Integer.parseInt(array1[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            nums2[i] = Integer.parseInt(array2[i]);
        }

        scanner.close();
    }

    public static int[] getSortArray(int[] arr1, int[] arr2) {
        if (arr1 == null) return arr2;
        if (arr2 == null) return arr1;
        int len1 = arr1.length, len2 = arr2.length;
        int i = 0, j = 0, count = 0;
        int[] nums = new int[len1 + len2];
        while (i < len1 && j < len2) {
            if (arr1[i] < arr2[j]) {
                nums[count++] = arr1[i++];
            } else {
                nums[count++] = arr2[j++];
            }
        }
        while (i < len1) {
            nums[count++] = arr1[i++];
        }
        while (j < len2) {
            nums[count++] = arr2[j++];
        }
        return nums;
    }
}
