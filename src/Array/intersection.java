package Array;

import java.util.HashSet;
import java.util.Set;

public class intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        for (int n : nums1) {
            set.add(n);
        }
        int count = 0;
        for (int n : nums2) {
            if (set.contains(n)) {
                nums1[count++] = n;
                set.remove(n);
            }
        }
        int[] ans = new int[count];
        for (int i = 0; i < count; i++) {
            ans[i] = nums1[i];
        }
        return ans;
    }
}
