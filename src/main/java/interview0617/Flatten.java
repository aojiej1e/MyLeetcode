package interview0617;

import problem.TreeNode;

/**
 * @author aojie
 * @Function
 * @create 2024-07-02 15:51
 */
public class Flatten {

    TreeNode tempLeft;
    TreeNode tempRight;

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode curr = root;
        while (curr != null) {
            if (curr.left != null) {
                TreeNode leftTree = curr.left;
                TreeNode left = leftTree;
                while (left.right != null) {
                    left = left.right;
                }
                left.right = curr.right;
                curr.left = null;
                curr.right = leftTree;

            }
            curr = curr.right;
        }
    }


}
