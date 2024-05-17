package problem;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aojie
 * @Function
 * @create 2023-12-28 0:13
 */
public class ReverseList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3)));
        System.out.println(reverseListPlus(listNode));
    }
    public static ListNode reverseList(ListNode head) {
        ListNode reverseNode = new ListNode(0);
        ListNode reverseHead = reverseNode;
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        for (int i = list.size() - 1; i >= 0 ; i--) {
            reverseNode.next = new ListNode(list.get(i));
           reverseNode = reverseNode.next;
        }
        return reverseHead.next;
    }

    public static ListNode reverseListPlus(ListNode head) {

        return  recursive(head, null);
    }

    private static ListNode recursive(ListNode head, ListNode pre) {
        if (head == null){
            return pre;
        }
        ListNode node = recursive(head.next, head);
        head.next = pre;
        return node;
    }
}
