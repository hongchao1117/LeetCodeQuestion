package Tree;

public class diameterOfBinaryTree {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root != null) {
            dfs(root);
            return max;
        }
        return 0;
    }

    private int dfs(TreeNode root) {
        if (root != null) {
            int left = dfs(root.left)+1;
            int right = dfs(root.right)+1;
            if (left + right > max) {
                max = left+right;
            }
            return Math.max(left,right);
        }
        return 0;
    }
}
