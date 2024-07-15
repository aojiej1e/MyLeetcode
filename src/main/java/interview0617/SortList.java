package interview0617;

import problem.ListNode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author aojie
 * @Function
 * @create 2024-06-25 16:39
 */
public class SortList {
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        Collections.sort(list);
        ListNode res = new ListNode(0);
        ListNode resHead = res;
        for (Integer integer : list) {
            res.next = new ListNode(integer);
            res = res.next;
        }
        return resHead.next;

    }
    public ListNode sortList2(ListNode head) {
        //归并排序
        if (head == null || head.next == null) {
            return head;
        }
        //快慢指针找出中间
        ListNode slow  = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = slow.next;
        slow.next = null;
        ListNode left = sortList2(head);
        ListNode right = sortList2(temp);
        ListNode res = new ListNode(0);
        ListNode resHead = res;
        if (left != null && right != null) {
            if (left.val <= right.val) {
                res.next = left;
                res = res.next;
                res.next = right;
            }else {
                res.next = right;
                res = res.next;
                res.next = left;
            }
        }
        return resHead.next;

    }
}
