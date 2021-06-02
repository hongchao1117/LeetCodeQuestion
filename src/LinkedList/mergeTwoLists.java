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
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
