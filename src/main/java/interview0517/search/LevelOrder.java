package interview0517.search;


import problem.TreeNode;

import java.util.*;

/**
 * @author aojie
 * @Function
 * @create 2024-06-04 14:22
 */
public class LevelOrder {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3, new TreeNode(9), new TreeNode(10));
        System.out.println(new LevelOrder().levelOrder(treeNode));
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        ArrayList<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> singleResult = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                singleResult.add(poll.val);
                if (poll.left != null) {
                    queue.offer(poll.left);
                }
                if (poll.right != null) {
                    queue.offer(poll.right);
                }
            }
            result.add(singleResult);
        }
        return result;

    }
}
