package interview0617;

import problem.ListNode;

/**
 * @author aojie
 * @Function
 * @create 2024-06-24 16:16
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode resNode = new ListNode(0);
        ListNode resPoint = resNode;
        while (l1 != null || l2 != null) {
            int l1Val = l1 == null ? 0 : l1.val;
            int l2Val = l2 == null ? 0 : l2.val;
            int tempSum = l1Val + l2Val + carry;
            int temp = tempSum % 10;
            carry = tempSum / 10;
            resNode.next = new ListNode(temp);
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
            resNode = resNode.next;
        }
        if (carry == 1) {
            resNode.next = new ListNode(1);
        }
        return resPoint.next;
    }
}
