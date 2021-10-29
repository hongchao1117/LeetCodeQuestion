package Test;

import LinkedList.ListNode;

public class HasCycle {
    public boolean hasCycle(ListNode root) {
        if (root == null) return false;
        ListNode slow = root, fast = root;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
