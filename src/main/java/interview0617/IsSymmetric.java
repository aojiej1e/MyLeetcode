package interview0617;

import problem.TreeNode;

/**
 * @author aojie
 * @Function
 * @create 2024-06-27 16:58
 */
public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return comparaTree(root.left, root.right);

    }

    private boolean comparaTree(TreeNode left, TreeNode right) {

        if (left == null && right == null) {
            return true;
        }
        if (left == null) {
            return false;
        }
        if (right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return comparaTree(left.right,right.left) && comparaTree(left.left, right.right);
    }
}
