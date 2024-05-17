package problem;

/**
 * @author aojie
 * @Function
 * @create 2022-10-22 19:08
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }
    public ListNode(int x, ListNode listNode) {
        val = x;
        this.next = listNode;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
