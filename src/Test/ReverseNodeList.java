package Test;

import LinkedList.ListNode;

public class ReverseNodeList {

    private static ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode pre = null, cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        String string = "abcabc";
        String subStr = "bc";
        System.out.println(findSubString(subStr, string));
    }

    private static int findSubString(String strA, String strB) {
        int l = strA.length();
        int n = strB.length();
        for (int i = 0; i < n - l + 1; i++) {
            if (strB.substring(i, i + l).equals(strA)) {
                return i;
            }
        }
        return -1;
    }
}
