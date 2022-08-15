package Array;

import java.util.ArrayList;
import java.util.List;

public class permute {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(permute(arr).toString());
    }

    private static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if (nums.length <= 0) return res;
        permuteHelper(res, list, nums, 0);
        return res;
    }

    private static void permuteHelper(List<List<Integer>> res, List<Integer> tempList, int[] nums, int index) {
        if (index == nums.length) {
            res.add(new ArrayList<>(tempList));
            return;//返回上一层递归 or 直接返回
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (!tempList.contains(nums[i])) {
                    tempList.add(nums[i]);
                    permuteHelper(res, tempList, nums, index + 1);
                    tempList.remove(tempList.size() - 1);//回退，进行回溯
                }
            }
        }
    }
}
