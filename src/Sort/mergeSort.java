package Sort;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] nums = new int[]{12, 354, 5, 6, 567, 876, 876, 53, 544, 76, 76, 876};
        int[] sort = MergeSort(nums);
        System.out.println(Arrays.toString(sort));
    }

    public static int[] MergeSort(int[] array) {
        if (array.length < 2) {
            return array;
        }
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);
        return merge(MergeSort(left), MergeSort(right));
    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        for (int index = 0, i = 0, j = 0; index < result.length; index++) {
            if (i >= left.length) {
                result[index] = right[j++];
            } else if (j >= right.length) {
                result[index] = left[i++];
            } else if (left[i] > right[j]) {
                result[index] = right[j++];
            } else {
                result[index] = left[i++];
            }
        }
        return result;

    }

}
