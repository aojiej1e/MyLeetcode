package problem;

/**
 * @author aojie
 * @Function
 * @create 2022-11-13 17:59
 */
public class Node {

    public int val;

    public Node next;
    public Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
