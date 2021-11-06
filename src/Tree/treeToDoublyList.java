package Tree;

import java.util.ArrayList;

/**
 * 当转化完成以后，树中节点的 左指针需要指向前驱，树中节点的 右指针需要指向后继。
 * 还需要返回链表中的第一个节点的指针。
 */
public class treeToDoublyList {
    public TreeNode treeToDoublyList(TreeNode root) {
        if (root == null) return root;
        ArrayList<TreeNode> list = new ArrayList<>();
        midOrder(list, root);
        TreeNode head = list.get(0);
        TreeNode pre = head;
        for (int i = 1; i < list.size(); i++) {
            TreeNode node = list.get(i);
            pre.right = node;
            node.left = pre;
            pre = node;
        }
        pre.right = head;
        head.left = pre;
        return root;
    }

    private void midOrder(ArrayList<TreeNode> list, TreeNode root) {
        if (root.left != null)
            midOrder(list, root.left);
        list.add(root);
        if (root.right != null)
            midOrder(list, root.right);
    }
}
