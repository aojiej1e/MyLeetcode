package interview0517.doublePoint;

import problem.ListNode;

/**
 * @author aojie
 * @Function
 * @create 2024-05-30 12:07
 */
public class MiddleNode {
    public static void main(String[] args) {

    }
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
