package LinkedList;

public class reverseList {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }

      public ListNode  append(ListNode node){
            ListNode curNode = this;
            while (true){
                ListNode nextNode = curNode.next;
                if (nextNode==null) break;
                curNode = nextNode;
            }
            curNode.next = node;
            return this;
      }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        //建立链表
        node1.append(node2).append(node3).append(node4).append(node5);

        System.out.println(ReverseList(node1).toString());
    }

    private static ListNode ReverseList(ListNode head) {
       /** ListNode pre = null;
        ListNode cur = head;

        while (cur!=null){
            ListNode nextNode = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nextNode;
        }
        return pre;**/
       if (head==null || head.next==null)   return head;
       ListNode temp = ReverseList(head.next);
       head.next.next = head;
       head.next = null;
       return temp;
    }
}
