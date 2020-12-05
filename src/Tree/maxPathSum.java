package Tree;

public class maxPathSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(-10);
        TreeNode left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        root.left = left;
        root.right = right;
        maxPathSum(root);

    }

    static int max = Integer.MIN_VALUE;
    public static int maxPathSum(TreeNode root) {
        if (root.left == null && root.right == null) return root.val;
        getMax(root);
        return max;
    }

    private static int getMax(TreeNode root) {
        if (root == null) return 0;
        int left = Math.max(0, getMax(root.left));
        int right = Math.max(0, getMax(root.right));
        max = Math.max(max, left + right + root.val);
        return Math.max(left, right) + root.val;
    }
}
