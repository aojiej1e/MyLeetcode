package interview0617;

import problem.Node;

import java.util.HashMap;

/**
 * @author aojie
 * @Function
 * @create 2024-06-25 16:25
 */
public class CopyRandomList {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> hashMap = new HashMap<>();
        Node oldHead = head;
        Node res = new Node(0);
        Node resHead = res;
        Node tempHead = res;
        while (head != null) {
            Node newNode = new Node(head.val);
            hashMap.put(head, newNode);
            res.next = newNode;
            res = res.next;
            head = head.next;
        }
        while (oldHead != null) {
            tempHead.next.random = hashMap.get(oldHead.random);
            oldHead = oldHead.next;
            tempHead = tempHead.next;
        }
        return resHead.next;


    }
}
