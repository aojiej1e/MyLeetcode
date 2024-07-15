package interview0617;

import problem.TreeNode;

/**
 * @author aojie
 * @Function
 * @create 2024-06-27 16:25
 */
public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode temp = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = temp;
        return root;

    }
}
