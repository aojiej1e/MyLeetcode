package interview0617;

import problem.ListNode;
import problem.TreeNode;

/**
 * @author aojie
 * @Function
 * @create 2024-07-01 15:53
 */
public class IsValidBST {
    public static void main(String[] args) {
        TreeNode listNode = new TreeNode(1, new TreeNode(1), null);
        System.out.println(new IsValidBST().isValidBST(listNode));
    }
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        return isValidBST(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }

    private boolean isValidBST(TreeNode root, long maxValue, long minValue) {
        if (root == null) {
            return true;
        }
        if (root.val >= maxValue || root.val <= minValue) {
            return false;
        }
        return isValidBST(root.left, root.val, minValue) && isValidBST(root.right, maxValue, root.val);
    }
}
