package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeAllNums {

    public static int[] mergerAll(ArrayList<int[]> list, int left, int right) {
        if (left >= right) {
            return list.get(left);
        }
        int mid = (left + right) / 2;
        int[] l = mergerAll(list, left, mid);
        int[] r = mergerAll(list, mid + 1, right);
        return mergeNums(l, r);
    }

    private static int[] mergeNums(int[] l, int[] r) {
        int m = 0, n = 0;
        int[] res = new int[l.length + r.length];
        int count = 0;
        while (m < l.length || n < r.length) {
            if (m >= l.length) {
                res[count++] = r[n++];
            } else if (n >= r.length) {
                res[count++] = l[m++];
            } else if (l[m] > r[n]) {
                res[count++] = r[n++];
            } else {
                res[count++] = l[m++];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 5, 20};
        int[] arr2 = {2, 4, 6, 8, 10, 12};
        int[] arr3 = {1, 9, 11};
        ArrayList<int[]> list = new ArrayList<>();
        list.add(arr1);
        list.add(arr2);
        list.add(arr3);
        int[] merge = mergerAll(list, 0, list.size() - 1);
        System.out.println(Arrays.toString(merge));
    }
}
