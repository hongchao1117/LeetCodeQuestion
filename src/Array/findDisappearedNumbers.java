package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 洪超
 */
public class findDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[Math.abs(nums[i])-1] = -Math.abs(nums[Math.abs(nums[i])-1]);
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res.add(i+1);
            }
        }
        return res;
    }
}
