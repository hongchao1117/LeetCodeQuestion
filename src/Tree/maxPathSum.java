package Tree;

public class maxPathSum {
    public int maxPathSum(TreeNode root) {
        if (root.left == null && root.right == null) return root.val;
        return 0;
    }
}
