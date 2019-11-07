package LinkedList;

import java.util.Comparator;
import java.util.PriorityQueue;

public class mergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length==0 )   return null;
        ListNode dummyNode = new ListNode(-1);
        ListNode cur = dummyNode;
        PriorityQueue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val-o2.val;
            }
        });

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
        return dummyNode.next;
    }
}
