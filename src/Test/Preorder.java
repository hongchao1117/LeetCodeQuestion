package Test;

import Tree.TreeNode;

import java.util.Stack;

public class Preorder {
    public void pre(TreeNode root) {
        if (root == null) return;
        System.out.println(root.val);
        pre(root.left);
        pre(root.right);
    }

    public void pre_2(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode temp = root;
        while (!stack.isEmpty()) {
            temp = stack.pop();
            if (temp != null) {
                System.out.println(temp.val);
            }
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }

}
