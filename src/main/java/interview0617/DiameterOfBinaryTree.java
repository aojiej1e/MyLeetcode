package interview0617;

import problem.TreeNode;

/**
 * @author aojie
 * @Function
 * @create 2024-06-27 17:38
 */
public class DiameterOfBinaryTree {

    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return res;

    }

    private int dfs(TreeNode node) {
        if (node == null) {
            return 1;
        }
        int leftHigh = dfs(node.left);
        int rightHigh = dfs(node.right);
        res = leftHigh + rightHigh;
        return Math.max(leftHigh, rightHigh) + 1;
    }
}
