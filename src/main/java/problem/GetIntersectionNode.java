package problem;

import problem.ListNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GetIntersectionNode {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(1, new ListNode(5))));
        System.out.println(new GetIntersectionNode().getIntersectionNode(listNode, null));
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<Integer, List<ListNode>> hashmap = new HashMap<>();
        while(headA != null) {
            List<ListNode> listNodeList = hashmap.get(headA.val);
            if (listNodeList == null) {
                ArrayList<ListNode> list = new ArrayList<>();
                list.add(headA);
                hashmap.put(headA.val, list);
            }else {
                listNodeList.add(headA);
            }
            headA = headA.next;
        }
        while (headB != null) {
            if (hashmap.containsKey(headB.val)) {
                List<ListNode> listNodeList = hashmap.get(headB.val);
                for (ListNode listNode : listNodeList) {
                    if (listNode == headB) {
                        return headB;
                    }
                }
            }
            headB = headB.next;
        }
        return null;
    }
}
