package problem;

import java.util.HashMap;

/**
 * @author aojie
 * @Function
 * @create 2022-11-13 17:59
 */
public class CopyRandomList {
    public static void main(String[] args) {

    }
    public Node copyRandomList(Node head) {
        if (head == null) {
            return head;
        }
        Node newHead = new Node(head.val);
        if (head.next == null) {
            return newHead;
        }
        Node newNext = new Node(head.next.val);
        newHead.next= newNext;
        if (head.random == null) {
            newHead.random = null;
        }else {
            newHead.random = new Node(head.random.val);
        }
        head = head.next;
        while (head != null) {
            Node node = new Node(head.val);
            Node random = head.random;
            newNext.next = node;
            if (head.random == null) {
                newHead.random = null;
            }else {
                newHead.random = new Node(random.val);
            }
            head = head.next;
            newHead = newNext.next;
        }
        return newHead;
    }
}
