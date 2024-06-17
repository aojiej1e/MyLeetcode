package interview0517.divide;

import problem.TreeNode;

/**
 * @author aojie
 * @Function
 * @create 2024-06-06 16:54
 */
public class IsBalanced {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int leftHigh = calcHigh(root.left, 1);
        int rightHigh = calcHigh(root.right, 1);
        return Math.abs(leftHigh - rightHigh) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    private int calcHigh(TreeNode left, int i) {
        if (left == null) {
            return i;
        }
        return Math.max(calcHigh(left.left, i + 1), calcHigh(left.right, i +1));
    }
}
