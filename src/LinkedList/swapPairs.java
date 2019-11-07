package LinkedList;

public class swapPairs {
    public ListNode swapPairs(ListNode head) {
        if (head==null || head.next==null)
            return head;
        /**ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;**/
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }
}
