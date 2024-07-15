package interview0617;

import problem.ListNode;

/**
 * @author aojie
 * @Function
 * @create 2024-06-24 16:28
 */
public class RemoveNthFromEnd {
    public static void main(String[] args) {
        ListNode req = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        System.out.println(new RemoveNthFromEnd().removeNthFromEnd(req, 2));
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode headPoint  = head;
        int count = 0;
        while (fast != null && fast.next != null) {
            count++;
            fast = fast.next.next;
        }
        int len = fast == null ? 2 * count : (2 * count) + 1;
        int forCount = len - n;
        if (forCount == 0) {
            return headPoint.next;
        }
        for (int i = 0; i < forCount -1; i++) {
            slow = slow.next;
        }
        slow.next = slow.next == null ? null : slow.next.next;
        return headPoint;
    }
}
