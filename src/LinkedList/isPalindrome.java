package LinkedList;

import java.util.List;
import java.util.Stack;

public class isPalindrome {
    public static void main(String[] args) {

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public boolean IsPalindrome(ListNode head) {
        ListNode fast =  head,slow =  head;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast!=null){//fast不为空，链表为奇数个
            slow =slow.next;
        }
        slow = reverse(slow);
        fast = head;
        while (slow!=null){
            if (fast.val!=slow.val)
                return false;
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode pre = null;
        while (head!=null){
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

}
