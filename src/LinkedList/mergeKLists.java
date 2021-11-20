package LinkedList;

import java.util.Comparator;
import java.util.PriorityQueue;

public class mergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        ListNode res = null;
        for (int i = 0; i < lists.length; i++) {
            res = mergeTwoList(res, lists[i]);
        }
        return res;
    }

    private ListNode mergeTwoList(ListNode a, ListNode b) {
        if (a == null) return b;
        if (b == null) return a;
        if (a.val < b.val) {
            a.next = mergeTwoList(a.next, b);
            return a;
        } else {
            b.next = mergeTwoList(a, b.next);
            return b;
        }
    }

    public ListNode mergeKLists_pq(ListNode[] lists) {
        if (lists.length == 0) return null;
        ListNode dummyNode = new ListNode(0);
        ListNode cur = dummyNode;
        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        for (ListNode list : lists) {
            if (list == null) continue;
            pq.add(list);
        }
        while (!pq.isEmpty()) {
            ListNode next = pq.poll();
            cur.next = next;
            if (next.next != null) {
                pq.add(next.next);
            }
            cur = next;
        }
        return dummyNode.next;
    }
}
