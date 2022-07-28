package Test;

import Tree.TreeNode;

public class TALDemo {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }
        if (left != null) {
            return left;
        }
        if (right != null) {
            return right;
        }
        return null;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(2);
        TreeNode leftLeft = new TreeNode(3);
        TreeNode LeftRight = new TreeNode(4);
        TreeNode rightLeft = new TreeNode(5);
        TreeNode rightRight = new TreeNode(6);
        root.left = left;
        root.right = right;
        left.left = leftLeft;
        left.right = LeftRight;
        right.left = rightLeft;
        right.right = rightRight;
        TreeNode p = leftLeft;
        TreeNode q = LeftRight;
        System.out.println(lowestCommonAncestor(root, p, q).val);

    }
}
