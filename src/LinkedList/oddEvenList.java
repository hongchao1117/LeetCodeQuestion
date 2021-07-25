package LinkedList;

public class oddEvenList {
    public ListNode oddEvenList(ListNode head) {
        if (head==null || head.next==null)  return head;
        //奇数链表表头
        ListNode p1 = head;
        //偶数链表表头
        ListNode p2 = head.next;
        //偶数链表结尾的结点
        ListNode p2end = p2;
        while (p1.next!=null && p2end.next!=null){
            p1.next = p2end.next;
            p1 = p1.next;
            p2end.next = p1.next;
            p2end = p2end.next;
        }
        p1.next = p2;
        return head;
    }
}
