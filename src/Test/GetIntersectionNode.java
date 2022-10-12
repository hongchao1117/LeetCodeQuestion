package Test;

public class GetIntersectionNode {
    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode tempA = headA, tempB = headB;
        while (tempA != tempB) {
            tempA = tempA != null ? tempA.next : headB;
            tempB = tempB != null ? tempB.next : headA;
        }
        return tempB;
    }
}
