package interview0617;

import problem.ListNode;

/**
 * @author aojie
 * @Function
 * @create 2024-06-21 15:29
 */
public class GetIntersectionNode {
    public static void main(String[] args) {

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode headAPoint = headA;
        ListNode headBPoint = headB;
        while (headA != headB) {
            headA = headA == null ? headBPoint : headA.next;
            headB = headB == null ? headAPoint : headB.next;
        }
        return headA;
    }
}
