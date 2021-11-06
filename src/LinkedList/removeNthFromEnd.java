package LinkedList;

/**
 * 给定一个链表，
 * 删除链表的倒数第 n 个节点，并且返回链表的头结点。
 */
public class removeNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode pre = dummyNode, left = dummyNode, right = head;
        int count = 0;
        while (right != null) {
            right = right.next;
            count++;
            if (count == n) {
                left = left.next;
            } else if (count > n) {
                pre = left;
                left = left.next;
            }

        }
        pre.next = left.next;
        left.next = null;
        return dummyNode.next;
    }

}
