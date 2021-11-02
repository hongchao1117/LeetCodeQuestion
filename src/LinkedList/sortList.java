package LinkedList;

public class sortList {
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }

    private ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode slow = head, fast = head.next.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode r = mergeSort(slow.next);
        slow.next = null;
        ListNode l = mergeSort(head);
        return merge(l, r);

    }

    private ListNode merge(ListNode l, ListNode r) {
        if (l == null) return r;
        if (r == null) return l;
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;
        while (l != null && r != null) {
            if (l.val < r.val) {
                temp.next = l;
                l = l.next;
            } else {
                temp.next = r;
                r = r.next;
            }
            temp = temp.next;
        }
        temp.next = l == null ? r : l;
        return dummyNode.next;
    }
}
