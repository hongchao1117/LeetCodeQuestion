package Test;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class levelOrder {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return res;
        getRes(root, 0);
        return res;
    }

    private void getRes(TreeNode root, int index) {
        if (root == null) return;
        if (index == res.size()) {
            res.add(new ArrayList<>());
        }
        res.get(index).add(root.val);
        getRes(root.left, index + 1);
        getRes(root.right, index + 1);
    }
}
