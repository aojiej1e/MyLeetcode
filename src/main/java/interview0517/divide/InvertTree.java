package interview0517.divide;

import problem.TreeNode;

/**
 * @author aojie
 * @Function
 * @create 2024-06-06 15:21
 */
public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode left = invertTree(root.right);
        root.right = invertTree(root.left);
        root.left = left;
        return root;
    }
}
