package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum2 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<Integer>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        getRes(candidates, target, 0);
        return res;
    }

    private void getRes(int[] candidates, int target, int index) {
        if (target == 0) {
            res.add(new ArrayList<>(list));
        } else {
            for (int i = index; i < candidates.length; i++) {
                if (target >= candidates[i]) {
                    if (i > index && candidates[i] == candidates[i - 1]) {
                        continue;
                    }
                    list.add(candidates[i]);
                    getRes(candidates, target - candidates[i], i + 1);
                    list.remove(list.size() - 1);
                }
            }
        }
    }


}
