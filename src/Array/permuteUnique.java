package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个可包含重复数字的序列 nums ，按任意顺序 返回所有不重复的全排列。
 */
public class permuteUnique {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        Arrays.sort(nums);
        int[] visited = new int[nums.length];
        getRes(res, nums, visited, new ArrayList<Integer>());
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
