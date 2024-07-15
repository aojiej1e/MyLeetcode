package interview0617;

import problem.ListNode;

import java.util.ArrayList;

/**
 * @author aojie
 * @Function
 * @create 2024-06-21 16:07
 */
public class IsPalindrome {
    public static void main(String[] args) {
        ListNode req = new ListNode(1, new ListNode(0, new ListNode(0)));
        System.out.println(new IsPalindrome().isPalindrome(req));
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode pre = null;
        while (fast != null && fast.next != null) {
            ListNode listNode = new ListNode(slow.val);
            listNode.next = pre;
            pre = listNode;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null && pre != null) {
            slow = slow.next;
        }
        while (slow != null && pre != null) {
            if (slow.val != pre.val) {
                return false;
            }
            slow = slow.next;
            pre = pre.next;
        }
        return true;
    }
}
