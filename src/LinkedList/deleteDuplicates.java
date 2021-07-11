package LinkedList;

public class deleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode next = head.next;
        if (head.val == next.val) {
            while (next != null && next.val == head.val) {
                next = next.next;
            }
            head = deleteDuplicates(next);
        } else {
            head.next = deleteDuplicates(next);
        }
        return head;
    }
}
