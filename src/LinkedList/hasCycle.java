package LinkedList;

public class hasCycle {
    public boolean hasCycle(ListNode head) {
        ListNode pre = head;
        ListNode cur = head;
        while (cur!=null && cur.next!=null){
            pre = pre.next;
            cur = cur.next.next;
            if (pre==cur){
                return true;
            }
        }
        return false;
    }
}
