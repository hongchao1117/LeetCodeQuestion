package Test;

import java.util.PriorityQueue;

public class TCDemo {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        ListNode dummyNode = new ListNode(0);
        ListNode cur = dummyNode;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((o1, o2) -> o1.val - o2.val);
        for (ListNode list : lists) {
            if (list == null) continue;
            pq.add(list);
        }
        while (!pq.isEmpty()) {
            ListNode next = pq.poll();
            cur.next = next;
            cur = next;
            if (next.next != null) {
                pq.add(next.next);
            }
        }
        return dummyNode.next;

    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
