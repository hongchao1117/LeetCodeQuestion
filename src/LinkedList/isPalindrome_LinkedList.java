package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class isPalindrome_LinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head==null) return false;
        LinkedList<Integer> list = new LinkedList<>();
        ListNode temp = head;
        while (temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        boolean flag = true;
        while (head!=null){
            if (list.getLast()==head.val){
                list.removeLast();
                head = head.next;
            }else {
                flag = false;
                break;
            }

        }
        return flag;
    }
}
