package interview0517.backTracke;

import problem.TreeNode;

/**
 * @author aojie
 * @Function
 * @create 2024-06-05 12:34
 */
public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int maxLeft = maxDepth(root.left);
        int maxRight = maxDepth(root.right);
        return Math.max(maxLeft, maxRight) + 1;
    }

}
