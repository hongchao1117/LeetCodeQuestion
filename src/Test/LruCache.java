package Test;

import java.util.HashMap;
import java.util.Map;

public class LruCache {
    static class DLinkedNode {
        int key;//键名
        int value; //数值
        DLinkedNode pre; //前指针
        DLinkedNode next; //后指针

        public DLinkedNode(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public DLinkedNode() {
        }
    }

    private Map<Integer, DLinkedNode> cache = new HashMap<>();
    private final int capacity;
    private int size;
    private DLinkedNode head, tail;

    public LruCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        head = new DLinkedNode();//头结点
        tail = new DLinkedNode();//尾部结点
        head.next = tail;
        tail.pre = head;
    }

    public void put(int key, int value) {
        DLinkedNode node = cache.get(key);
        if (node == null) { // 缓存中不存在该结点数据
            DLinkedNode newNode = new DLinkedNode(key, value);
            cache.put(key, newNode);
            //添加到链表头部
            addToHead(newNode);
            size++;
            if (size > capacity) { //如果超过容量，则要删除尾部结点
                DLinkedNode tail = removeTail();
                cache.remove(tail.key);
                size--;
            }
        } else {//如果缓存中有这个节点
            node.value = value;
            moveToHead(node);//移到链表头部
        }
    }

    public int get(int key) {
        DLinkedNode node = cache.get(key);
        if (node == null) { //缓存中不存在这个数据
            return -1;
        } else {
            moveToHead(node);
            return node.value;
        }
    }

    private void moveToHead(DLinkedNode node) {
        removeNode(node);
        addToHead(node);
    }

    private void removeNode(DLinkedNode node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    private DLinkedNode removeTail() {
        DLinkedNode res = tail.pre;
        removeNode(res);
        return res;
    }

    private void addToHead(DLinkedNode newNode) {
        newNode.pre = head;
        newNode.next = head.next;
        head.next.pre = newNode;
        head.next = newNode;
    }
}
