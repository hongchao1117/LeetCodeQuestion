package LinkedList;

import java.util.HashMap;
import java.util.Map;

public class copyRandomList {
    public Node copyRandomList(Node head) {
        if (head==null)
            return head;
        /**
        //1.先复制next
        Node temp = head;
        while (temp!=null){
            Node copyNode = temp;
            copyNode.next = temp.next;
            temp.next = copyNode;
            temp = copyNode.next;
        }
        //2.后复制random
        temp = head;
        while (temp!=null){
            temp.next.random = temp.random == null?null:temp.random.next;
            temp = temp.next.next;
        }
        //3.拆表
        temp = head;
        Node cloneHead = head.next;
        while (temp.next!=null){
            Node cloneNode = temp.next;
            temp.next = temp.next.next;
            temp = cloneNode;
        }
        return cloneHead;
         **/
        //map方法
        Node node = head;
        //使用hash表存储旧结点和新节点的映射
        Map<Node,Node> map = new HashMap<>();
        while (node!=null){
            Node clone = new Node(node.val,null,null);
            map.put(node,clone);
            node = node.next;
        }
        node = head;
        while (node!=null){
            map.get(node).next = map.get(node.next);
            map.get(node).random = map.get(node.random);
            node = node.next;
        }
        return map.get(head);

    }
}
