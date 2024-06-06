package interview0517.search;

import problem.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author aojie
 * @Function
 * @create 2024-06-04 15:41
 */
public class ZigzagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        ArrayList<List<Integer>> result = new ArrayList<>();
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        boolean flag = true;
        while (!deque.isEmpty()) {
            int size = deque.size();
            LinkedList<Integer> singleResult = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode poll = deque.poll();
                if (flag) {
                    singleResult.addLast(poll.val);
                }else {
                    singleResult.addFirst(poll.val);
                }
                if (poll.left != null) {
                    deque.offer(poll.left);
                }
                if (poll.right != null) {
                    deque.offer(poll.right);
                }
            }
            flag = !flag;
            result.add(singleResult);
        }
        return result;
    }
}
