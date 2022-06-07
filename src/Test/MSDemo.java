package Test;

import java.util.HashMap;

public class MSDemo {
    static class ListNode {
        int value;
        ListNode next;

        public ListNode(int value) {
            this.value = value;
        }

        public ListNode() {
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 3, 1};
        removeDuplicates(nums);
    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null) return true;

        ListNode firstHalfEnd = endOfFirstHalf(head);
        ListNode secondHalfStart = reverse(firstHalfEnd.next);

        ListNode p1 = head;
        ListNode p2 = secondHalfStart;
        boolean res = true;
        while (res && p2 != null) {
            if (p1.value != p2.value) {
                res = false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        firstHalfEnd.next = reverse(secondHalfStart);
        while (head != null) {
            System.out.println(head.value);
            head = head.next;
        }
        return res;
    }

    private static ListNode endOfFirstHalf(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    private static ListNode reverse(ListNode head) {
        ListNode pre = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static int[] removeDuplicates(int[] nums) {
        if (nums == null) return null;
        int len = nums.length;
        if (len < 1) {
            return null;
        }
        int repeatSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>(len, 1.0F);
        for (int i = 0; i < len; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
                if (map.get(nums[i]) >= 2) {
                    repeatSum++;
                }
            } else {
                map.put(nums[i], 1);
            }
        }
        int[] res = new int[len - repeatSum];
        int m = 0;
        for (int i = 0; i < len; i++) {
            if (map.get(nums[i]) == 1) {
                res[m++] = nums[i];
            }
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
        return res;
    }

    public String findMaxLenSubstring(String s) {
        if (s == null || s.length() == 0) return "";
        char[] chars = s.toCharArray();
        int count1 = 0, count2 = 0;
        String res = "";
        int index1 = 0, index2 = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) {
                count1++;
            } else if (Character.isDigit(chars[i])) {
                count2++;
            }
            map.put(count1 - count2, i);
        }
        return res;
    }

}
