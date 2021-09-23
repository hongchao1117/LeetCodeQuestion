package Mathmatics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSum {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        getRes(nums, target, 0);

        return res;
    }

    private void getRes(int[] nums, int target, int index) {
        if (target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }

    }
}
