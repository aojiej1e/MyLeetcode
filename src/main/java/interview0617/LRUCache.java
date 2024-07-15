package interview0617;

import problem.ListNode;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author aojie
 * @Function
 * @create 2024-06-25 17:33
 */
public class LRUCache {

    static class Node{
        int key;
        int value;
        Node pre;
        Node next;
        public Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    HashMap<Integer, Node> hashMap;

    Node sentinel = new Node(0, 0);
    int size;
    public LRUCache(int capacity) {
        hashMap = new HashMap<Integer, Node>(capacity);
        sentinel.pre = sentinel;
        sentinel.next = sentinel;
    }

    public int get(int key) {
        Node inNode = getInNode(key);
        return inNode == null ? -1 : inNode.value;
    }

    public void put(int key, int value) {
        //从书中找是否存在
        Node node = getInNode(key);
        if (node != null) {
            node.value = value;
            return;
        }
        Node newNode = new Node(key, value);
        hashMap.put(key, newNode);
        pushFront(newNode);
        if (hashMap.size() > size) {
            Node pre = sentinel.pre;
            removeNode(pre);
            hashMap.remove(pre.key);
        }
    }

    private Node getInNode(int key) {
        if (!hashMap.containsKey(key)) {
            return null;
        }
        Node node = hashMap.get(key);
        removeNode(node);
        pushFront(node);
        return node;
    }

    private void pushFront(Node node) {
        node.pre = sentinel;
        node.next = sentinel.next;
        node.pre.next = node;
        node.next.pre = node;
    }

    private void removeNode(Node node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(2, 1);
        lruCache.put(1, 1);
        lruCache.put(2, 3);
        lruCache.put(4, 1);
        System.out.println(lruCache.get(1));
        System.out.println(lruCache.get(2));
    }
}
