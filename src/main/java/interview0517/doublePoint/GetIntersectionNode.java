package interview0517.doublePoint;

import problem.ListNode;

/**
 * @author aojie
 * @Function
 * @create 2024-05-30 12:17
 */
public class GetIntersectionNode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode startHeadA = headA;
        ListNode startHeadB = headB;
        while (headA != headB) {
            headA = headA == null ? startHeadB : headA.next;
            headB = headB == null ? startHeadA : headB.next;
        }
        return headA;
    }
}
