package interview0617;

import problem.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author aojie
 * @Function
 * @create 2024-07-01 17:23
 */
public class RightSideView {
    public static void main(String[] args) {

    }

    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        ArrayList<Integer> result = new ArrayList<>();
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        while (!deque.isEmpty()) {
            TreeNode treeNode = deque.peekLast();
            result.add(treeNode.val);
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode pop = deque.pop();
                if (pop.left != null) {
                    deque.offer(pop.left);
                }
                if (pop.right != null) {
                    deque.offer(pop.right);
                }
            }
        }
        return result;
    }
}
