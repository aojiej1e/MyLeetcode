package interview0517.linkedList;

import problem.ListNode;

/**
 * @author aojie
 * @Function
 * @create 2024-05-17 16:44
 */
public class Partition {
    public static void main(String[] args) {

    }
    public ListNode partition(ListNode head, int x) {
        ListNode less = new ListNode(0);
        ListNode great = new ListNode(0);
        ListNode lessHead = less;
        ListNode greatHead = great;
        while (head != null) {
            if (head.val < x) {
                less.next = new ListNode(head.val);
                less = less.next;
            }else {
                great.next = new ListNode(head.val);
                great = great.next;
            }
            head = head.next;
        }
        less.next = greatHead.next;
        return lessHead.next;
    }
}
