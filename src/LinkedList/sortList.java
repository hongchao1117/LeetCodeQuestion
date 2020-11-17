package LinkedList;

public class sortList {
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }

    private ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode slow = head, fast = head.next.next, l, r;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        r = mergeSort(slow.next);
        slow.next = null;
        l = mergeSort(head);
        return megerList(l, r);
    }

    private ListNode megerList(ListNode l, ListNode r) {
        ListNode tempHead = new ListNode(-1);
        ListNode p = tempHead;
        while (l != null && r != null) {
            if (l.val < r.val) {
                p.next = l;
                l = l.next;
            } else {
                p.next = r;
                r = r.next;
            }
            p = p.next;
        }
        p.next = l == null ? r : l;
        return tempHead.next;
    }
}
