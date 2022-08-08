package LinkedList;

public class RotateRight {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        int count = 1;
        ListNode temp = head;
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }
        k %= count;
        if (k == 0) return head;
        temp.next = head;
        for (int i = 0; i < count - k; i++) {
            temp = temp.next;
        }
        ListNode newNode = temp.next;
        temp.next = null;
        return newNode;
    }

}
