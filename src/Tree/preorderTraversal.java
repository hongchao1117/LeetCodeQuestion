package Tree;

import Tree.TreeNode;
import Tree.test.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class preorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        TreeNode temp = root;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(temp);
        while (!stack.isEmpty()) {
            temp = stack.pop();
            list.add(temp.val);
            if (temp.right !=null)
                stack.push(temp.right);
            if (temp.left!=null)
                stack.push(temp.left);
        }
        return list;
    }
}




