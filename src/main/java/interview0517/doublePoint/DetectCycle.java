package interview0517.doublePoint;

import problem.ListNode;

import java.util.HashMap;

/**
 * @author aojie
 * @Function
 * @create 2024-05-30 15:11
 */
public class DetectCycle {

    public static void main(String[] args) {

    }
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, Integer> hashMap = new HashMap<>();
        int index = 0;
        while (head != null) {
            hashMap.put(head, index);
            head = head.next;
            if (hashMap.containsKey(head)) {
                return head;
            }
        }
        return null;
    }

    //快慢指针
    public ListNode detectCycle2(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                fast = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
