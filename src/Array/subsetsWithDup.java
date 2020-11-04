package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetsWithDup {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        getRes(nums, 0, new ArrayList<>(), res);
        res.add(new ArrayList<>());
        return res;

    }

    private void getRes(int[] nums, int start, ArrayList<Integer> list, List<List<Integer>> res) {
        for (int i = start; i < nums.length; i++) {
            list.add(nums[i]);
            res.add(new ArrayList<>(list));
            getRes(nums, i + 1, list, res);
            list.remove(list.size() - 1);
        }
    }
}
