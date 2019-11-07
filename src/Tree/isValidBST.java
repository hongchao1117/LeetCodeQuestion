package Tree;

import Tree.test.Tree;

import java.util.Stack;

public class isValidBST {
    public boolean isValidBST(TreeNode root) {
//        if (root==null) return true;
//        int last = Integer.MIN_VALUE;
//        if (isValidBST(root.left)){
//            if (last<root.val)
//                last = root.val;
//            return isValidBST(root.right);
//        }
//        return isValidBST(root.right);
        Stack<TreeNode> stack = new Stack<TreeNode>();
        long pre  = Long.MIN_VALUE;
        TreeNode cur;
        while (!stack.isEmpty() || root!=null){
            while (root!=null){
                stack.push(root);
                root = root.left;
            }
            cur = stack.pop();
            if (cur.val>pre)
                pre = cur.val;
            else
                return false;
            root = cur.right;
        }
        return true;
    }
}
