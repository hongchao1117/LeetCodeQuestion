package Tree;

public class isBalanced {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return Math.abs(depth(root.left) - depth(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    private int depth(TreeNode root) {
        if (root == null)
            return 0;
        int left = depth(root.left) + 1;
        int right = depth(root.right) + 1;
        return Math.max(left, right);

    }

}
