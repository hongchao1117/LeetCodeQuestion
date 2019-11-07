package LinkedList;

public class mergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       /** ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        while (l1!=null && l2!=null){
            if (l1.val<l2.val){
                cur.next = l1;
                l1 = l1.next;
                cur = cur.next;
            }else {
                cur.next = l2;
                l2 = l2.next;
                cur = cur.next;
            }
        }
        if (l1!=null)
            cur.next = l1;
        else
            cur.next = l2;
        return dummyHead.next;**/
       if (l1==null)    return l2;
       if (l2==null)    return l1;
       ListNode head = null;
       if (l1.val<=l2.val){
           head = l1;
           head.next = mergeTwoLists(l1.next,l2);
       }else {
           head = l2;
           head.next =  mergeTwoLists(l1,l2.next);
       }
       return head;
    }
}
