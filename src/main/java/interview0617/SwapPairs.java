package interview0617;

import problem.ListNode;

/**
 * @author aojie
 * @Function
 * @create 2024-06-24 17:24
 */
public class SwapPairs {
    public static void main(String[] args) {
        ListNode req = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        System.out.println(new SwapPairs().swapPairs(req));
    }
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode res = new ListNode(0);
        ListNode resHead = res;
        ListNode slow = head;
        ListNode moreFast = head.next;
        while (moreFast != null) {
            res.next = new ListNode(moreFast.val);
            res = res.next;
            res.next = new ListNode(slow.val);
            res = res.next;;
            slow = slow.next == null ? null : slow.next.next;
            moreFast = moreFast.next == null ? null : moreFast.next.next;
        }
        if (slow != null) {
            res.next = new ListNode(slow.val);
        }
        return resHead.next;
    }
}
