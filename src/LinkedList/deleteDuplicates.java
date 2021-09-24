package LinkedList;

public class deleteDuplicates {
    /**
     * 删除有重复的结点
     *
     * @param head
     * @return
     */
    public ListNode deleteDuplicates_2(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode next = head.next;
        if (head.val == next.val) {
            while (next != null && next.val == head.val) {
                next = next.next;
            }
            head = deleteDuplicates_2(next);
        } else {
            head.next = deleteDuplicates_2(next);
        }
        return head;
    }

    /**
     * 删除结点中重复的点，使得每个结点只重复一次
     *
     * @param head
     * @return
     */
    public ListNode deleteDuplicates_1(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode cur = head;
        while (cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }
}
