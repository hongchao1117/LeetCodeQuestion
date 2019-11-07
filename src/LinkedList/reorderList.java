package LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class reorderList {
    public void reorderList(ListNode head) {
        LinkedList<ListNode> queue = new LinkedList<ListNode>();
        ListNode cur = head;
        while (cur!=null){
            queue.addLast(cur);
            cur = cur.next;
        }
        while (!queue.isEmpty()){
            if (cur==null){
                cur = queue.pollFirst();
            }else {
                cur.next = queue.pollFirst();
                cur = cur.next;
            }
            cur.next = queue.pollLast();
            cur = cur.next;
        }
        if (cur!=null)
            cur.next = null;
    }
}
