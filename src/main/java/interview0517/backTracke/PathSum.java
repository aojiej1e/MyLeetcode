package interview0517.backTracke;

import problem.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author aojie
 * @Function
 * @create 2024-06-05 15:06
 */
public class PathSum {
    LinkedList<Integer> singleList = new LinkedList<>();
    List<List<Integer>> result = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        backTrace(root, targetSum);
        return result;
    }

    private void backTrace(TreeNode root, int targetSum) {
        if (root == null) {
            return;
        }
        singleList.add(root.val);
        targetSum -= root.val;
        if (targetSum == 0 && root.left == null && root.right == null) {
            result.add(new ArrayList<>(singleList));
        }
        backTrace(root.left, targetSum);
        backTrace(root.right, targetSum);
        singleList.removeLast();
    }
}
