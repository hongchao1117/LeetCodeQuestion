package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class postorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        TreeNode temp = root;
        TreeNode pre = null;
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || temp != null) {
            while (temp != null) {
                stack.push(temp);
                temp = temp.left;
            }
            temp = stack.peek();
            if (temp.right == null || temp.right == pre) {
                list.add(temp.val);
                stack.pop();
                pre = temp;
                temp = null;
            } else {
                temp = temp.right;
            }
        }
        return list;
    }
}
