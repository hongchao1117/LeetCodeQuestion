package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permuteUnique {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length <= 0) return res;
        int[] visited = new int[nums.length];
        Arrays.sort(nums);
        getRes(res, nums, visited, new ArrayList<>());
        return res;
    }

    private void getRes(List<List<Integer>> res, int[] nums, int[] visited, ArrayList<Integer> list) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] == 1 || (i > 0 && nums[i] == nums[i - 1] && visited[i - 1] == 1)) {
                continue;
            }
            list.add(nums[i]);
            visited[i] = 1;
            getRes(res, nums, visited, list);
            visited[i] = 0;
            list.remove(list.size() - 1);

        }
    }
}
