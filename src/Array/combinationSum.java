package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个无重复元素的数组 candidates 和一个目标数 target ，
 * 找出 candidates 中所有可以使数字和为 target 的组合。
 * <p>
 * candidates 中的数字可以无限制重复被选取。
 */
public class combinationSum {
    public static void main(String[] args) {
        String myString = "   \n 给定一个无重复元素的数组 candidates 和一个目标数 target ,\n"+"   fdshfdkshfjldsjfijsaoifjs" +
                "  fdsifhsdkfjlsdjfs   " +
                "  fdsfsdfnjsdlkfjslfks" +
                "   fdsfsd     ";

        String newString = myString.trim();
        System.out.println(newString);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        getResHelper(candidates, target, res, 0, new ArrayList<>());
        return res;
    }

    private void getResHelper(int[] candidates, int target, List<List<Integer>> res, int index, List<Integer> tempList) {
        if (target < 0) return;
        if (target == 0) {
            res.add(new ArrayList<>(tempList));
        }
        for (int i = index; i < candidates.length; i++) {
            tempList.add(candidates[i]);
            getResHelper(candidates, target - candidates[i], res, i, tempList);
            tempList.remove(tempList.size() - 1);
        }
    }
}
