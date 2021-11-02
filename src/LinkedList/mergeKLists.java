package LinkedList;

public class mergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        /**if (lists.length==0 )   return null;
        ListNode dummyNode = new ListNode(-1);
        ListNode cur = dummyNode;
        Queue<ListNode> queue = new PriorityQueue<>(((o1, o2) -> o1.val-o2.val));

        for(ListNode list:lists){//添加排序后链表的各个头结点至优先队列
            if (list==null)
                continue;
            queue.add(list);
        }

        while (!queue.isEmpty()){
            ListNode next = queue.poll();//出头结点
            cur.next = next;
            cur = cur.next;
            if (next.next!=null){
                queue.add(next.next);//入队头结点之后的那个节点
            }
        }
        return dummyNode.next;*/
        if (lists.length == 0) return null;
        ListNode res = null;
        for (int i = 0; i < lists.length; i++) {
            res = mergeTwoList(res,lists[i]);
        }
        return res;
    }

    private ListNode mergeTwoList(ListNode a, ListNode b) {
        if (a==null) return b;
        if (b==null) return a;
        if (a.val<b.val){
            a.next = mergeTwoList(a.next,b);
            return a;
        }else{
            b.next = mergeTwoList(a,b.next);
            return b;
        }
    }
}
