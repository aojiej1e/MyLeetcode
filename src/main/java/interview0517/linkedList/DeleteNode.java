package interview0517.linkedList;

import problem.ListNode;

/**
 * @author aojie
 * @Function
 * @create 2024-05-17 16:52
 */
public class DeleteNode {
    public static void main(String[] args) {

    }
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
