package Tree;

import java.util.ArrayList;
import java.util.List;

public class binaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        getRes(root, "", list);
        return list;
    }

    private void getRes(TreeNode root, String temp, List<String> list) {
        if (root == null) return;
        temp += root.val;
        if (root.left == null && root.right == null) {
            list.add(temp);
        } else {
            getRes(root.left, temp + "->", list);
            getRes(root.right, temp + "->", list);
        }

    }
}
