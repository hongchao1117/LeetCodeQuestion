package LinkedList;

public class removeElements {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode cur = head;
        ListNode tempNode;
        while (cur != null) {
            if (cur.val == val) {
                tempNode = cur.next.next;
                cur = cur.next;
                cur.next = tempNode;
            } else
                cur = head.next;
        }
        return cur;
    }
}