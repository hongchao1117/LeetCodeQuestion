package LinkedList;

import java.util.Stack;

public class addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode cur = root;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            carry += l1 == null ? 0 : l1.val;
            carry += l2 == null ? 0 : l2.val;
            ListNode tempNode = new ListNode(carry % 10);
            cur.next = tempNode;
            cur = tempNode;
            carry /= 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return root.next;
    }

    public ListNode addTwoNumbers_2(ListNode l1, ListNode l2) {
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();
        while (l1 != null) {
            stack1.push(l1);
            l1 = l1.next;
        }
        while (l2 != null) {
            stack2.push(l2);
            l2 = l2.next;
        }
        int carry = 0;
        ListNode head = null;
        while (!stack1.isEmpty() || !stack2.isEmpty() || carry > 0) {
            int sum = carry;
            sum += stack1.isEmpty() ? 0 : stack1.pop().val;
            sum += stack2.isEmpty() ? 0 : stack2.pop().val;
            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);
            node.next = head;
            head = node;
        }
        return head;
    }
}
