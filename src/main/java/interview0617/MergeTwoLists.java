package interview0617;

import problem.ListNode;

/**
 * @author aojie
 * @Function
 * @create 2024-06-24 16:08
 */
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newListNode = new ListNode(0);
        ListNode newListNodePoint = newListNode;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                newListNode.next = list2;
                list2 = list2.next;
            }else {
                newListNode.next = list1;
                list1 = list1.next;
            }
            newListNode = newListNode.next;
        }
        newListNode.next = list1 == null ? list1 : list2;
        return newListNodePoint.next;
    }
}
