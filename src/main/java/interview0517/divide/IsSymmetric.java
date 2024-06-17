package interview0517.divide;

import problem.TreeNode;

/**
 * @author aojie
 * @Function
 * @create 2024-06-06 15:58
 */
public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return judgeSymmetric(root.left, root.right);
    }

    private boolean judgeSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return judgeSymmetric(left.left, right.right) && judgeSymmetric(left.right, right.left);
    }
}
