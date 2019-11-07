package LinkedList;

public class divideDoubleList {
    public void method(Node head){
        Node p1 = head;
        Node p2 = head.next;
        while (p1!=null && p2!=null) {
            p1.next = p2.next;
            p2.next.pre = p1;
            p1 = p1.next;
            p2.next = p1.next;
            p1.next.pre = p2;
            p2 = p2.next;
        }
    }
    class Node{
        int val;
        Node pre;
        Node next;
    }

}
