package LinkedList;

public class reverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummyNode = new ListNode(-1), pre = dummyNode, cur = head, next;
        dummyNode.next = head;
        int len = 0;
        while (head != null) {
            head = head.next;
            len++;
        }
        for (int i = 0; i < len / k; i++) {
            for (int j = 0; j < k - 1; j++) {
                next = cur.next;
                cur.next = next.next;
                next.next = pre.next;
                pre.next = next;
            }
            pre = cur;
            cur = pre.next;
        }
        return dummyNode.next;
    }
}

