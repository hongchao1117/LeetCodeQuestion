package LinkedList;

import java.util.Iterator;

public class deleteNode {
    public static void main(String[] args) {
        ListNode head = new ListNode(5);
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public static ListNode DeleteNode(ListNode head) {
        ListNode pre = null;    //前结点
        ListNode cur = head;    //当前结点

        //每次循环，都将当前结点指向它前面的结点，然后当前结点和前结点后移
        while (cur != null){
            //临时结点指向其前面的结点
            ListNode nextNode = cur.next;
            //将当前结点指向它前面的结点
            cur.next = pre;
            //前指针后移
            pre = cur;
            //当前指针后移
            cur = nextNode;
        }
        return pre;//返回新的头引用
    }

}
