package Tree;

import java.util.LinkedList;

/**
 * 给定一个二叉树，确定它是否是一个完全二叉树。
 * <p>
 * 百度百科中对完全二叉树的定义如下：
 * <p>
 * 若设二叉树的深度为 h，除第 h 层外，其它各层 (1～h-1) 的结点数都达到最大个数，
 * 第 h 层所有的结点都连续集中在最左边，这就是完全二叉树。
 */
public class isCompleteTree {
    public boolean isCompleteTree(TreeNode root) {
        if (root == null) return true;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode temp;
        while ((temp = queue.removeFirst()) != null) {
            queue.add(temp.left);
            queue.add(temp.right);
        }
        while (!queue.isEmpty()) {
            if (queue.removeLast() != null) {
                return false;
            }
        }
        return true;
    }
}
