package Tree;

import java.util.ArrayList;
import java.util.List;

public class pathSum {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) return res;
        methodHelper(root, sum, new ArrayList<>());
        return res;
    }

    private void methodHelper(TreeNode root, int target, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null) {
            res.add(new ArrayList<>(list));
        } else {
            methodHelper(root.left, target, list);
            methodHelper(root.right, target, list);
        }
        list.remove(list.size() - 1);
    }
}
