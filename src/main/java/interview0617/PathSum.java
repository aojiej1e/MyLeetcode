package interview0617;

import problem.TreeNode;

/**
 * @author aojie
 * @Function
 * @create 2024-07-02 18:38
 */
public class PathSum {
    int res = 0;
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        dfs(root, targetSum);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);
        return res;
    }

    private void dfs(TreeNode root, int targetSum) {
        if (root == null) {
            return;
        }
        targetSum -= root.val;
        if (targetSum < 0) {
            return;
        }
        if (targetSum == 0) {
            res++;
        }
        dfs(root.left, targetSum);
        dfs(root.right, targetSum);
    }
}
