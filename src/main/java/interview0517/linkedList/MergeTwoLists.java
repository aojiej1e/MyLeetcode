package interview0517.linkedList;

import problem.ListNode;

/**
 * @author aojie
 * @Function
 * @create 2024-05-17 11:03
 */
public class MergeTwoLists {
    public static void main(String[] args) {

    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode resultNode = new ListNode(0);
        ListNode resultHead = resultNode;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                resultNode.next = list1;
                list1 = list1.next;
            }else {
                resultNode.next = list2;
                list2 = list2.next;
            }
            resultNode = resultNode.next;
        }
        resultNode.next = list1 == null ? list2 : list1;
        return resultHead.next;

    }
}
