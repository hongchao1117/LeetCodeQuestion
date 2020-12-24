package Tree;

import LinkedList.ListNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class listOfDepth {
    public ListNode[] listOfDepth(TreeNode tree) {
        if (tree == null) return new ListNode[0];
        Queue<TreeNode> queue = new LinkedList<>();
        List<ListNode> list = new ArrayList<>();
        ListNode dummyNode = new ListNode(-1);
        queue.add(tree);
        while (!queue.isEmpty()) {
            TreeNode node;
            ListNode cur = dummyNode;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                node = queue.poll();
                cur.next = new ListNode(node.val);
                cur = cur.next;
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            list.add(dummyNode.next);
        }
        ListNode[] res = new ListNode[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
