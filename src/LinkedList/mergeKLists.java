package LinkedList;

import java.util.PriorityQueue;

public class mergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        ListNode res = null;
        for (ListNode list : lists) {
            res = mergeTwoList(res, list);
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
        PriorityQueue<ListNode> pq = new PriorityQueue<>((o1, o2) -> o1.val - o2.val);
        for (ListNode list : lists) {
            if (list == null) continue;
            pq.add(list);
        }
        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            cur.next = node;
            cur = node;
            if (node.next != null) {
                pq.add(node.next);
            }
        }
        return dummyNode.next;
    }
}
