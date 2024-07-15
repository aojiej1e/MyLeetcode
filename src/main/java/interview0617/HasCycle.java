package interview0617;

import problem.ListNode;

/**
 * @author aojie
 * @Function
 * @create 2024-06-21 17:31
 */
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
