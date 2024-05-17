package interview0517.linkedList;

import problem.Node;

import java.util.HashMap;

/**
 * @author aojie
 * @Function
 * @create 2024-05-17 17:08
 */
public class CopyRandomList {
    public static void main(String[] args) {

    }
    public Node copyRandomList(Node head) {
        Node copyHead = head;
        Node result = new Node(0);
        Node resultHead = result;
        HashMap<Node, Node> randomNodeMap = new HashMap<>();
        while (head != null) {
            Node curr = new Node(head.val);
            result.next = curr;
            randomNodeMap.put(head, curr);
            head = head.next;
            result = result.next;
        }
        Node resNode = resultHead.next;
        while (copyHead != null) {
            resNode.random = randomNodeMap.get(copyHead.random);
            copyHead = copyHead.next;
            resNode = resNode.next;
        }
        return resultHead.next;

    }
}
