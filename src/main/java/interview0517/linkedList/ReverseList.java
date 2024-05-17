package interview0517.linkedList;

import problem.ListNode;

/**
 * @author aojie
 * @Function
 * @create 2024-05-17 15:05
 */
public class ReverseList {
    public static void main(String[] args) {

    }
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode last = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }
}
