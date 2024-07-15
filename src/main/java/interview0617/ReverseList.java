package interview0617;

import problem.ListNode;

/**
 * @author aojie
 * @Function
 * @create 2024-06-21 15:46
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        while (head != null) {
            ListNode temp = new ListNode(head.val);
            temp.next = pre;
            pre = temp;
            head = head.next;
        }
        return pre;
    }
}
