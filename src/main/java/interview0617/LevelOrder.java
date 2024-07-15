package interview0617;

import problem.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author aojie
 * @Function
 * @create 2024-06-28 11:45
 */
public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        ArrayList<List<Integer>> result = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            ArrayList<Integer> singleResult = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode pop = queue.pop();
                singleResult.add(pop.val);
                if (pop.left != null) {
                    queue.offer(pop.left);
                }
                if (pop.right != null) {
                    queue.offer(pop.right);
                }
            }
            result.add(singleResult);
        }
        return result;
    }

}
