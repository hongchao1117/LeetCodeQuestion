package LinkedList;

/**
 * 给定一个链表，
 * 删除链表的倒数第 n 个节点，并且返回链表的头结点。
 */
public class removeNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode pre = dummyHead;
        ListNode left = dummyHead,right = head;
        int count =1;
        while (right.next!=null){
            count++;
            right = right.next;
            if (count==n){
                left = left.next;
            }else if (count>n){
                pre = pre.next;
                left = left.next;
            }
        }
        pre.next = left.next;
        left.next = null;
        return dummyHead.next;


    }
}
