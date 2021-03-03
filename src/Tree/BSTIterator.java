package Tree;

import java.util.Deque;
import java.util.LinkedList;

public class BSTIterator {

    Deque<Integer> queue = new LinkedList<>();
    public BSTIterator(TreeNode root) {
        midOrder(root);
    }

    private void midOrder(TreeNode root) {
        if (root==null) return;
        midOrder(root.left);
        queue.add(root.val);
        midOrder(root.right);
    }

    public int next() {
        return queue.removeFirst();
    }

    public boolean hasNext() {
        return !queue.isEmpty();
    }

}
