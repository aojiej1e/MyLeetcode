package interview0617;

import problem.TreeNode;

/**
 * @author aojie
 * @Function
 * @create 2024-06-27 16:07
 */
public class MaxDepth {
    public static void main(String[] args) {

    }
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = calcHigh(root.left);
        int right = calcHigh(root.right);
        return Math.max(left, right);

    }

    private int calcHigh(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return Math.max(calcHigh(node.left), calcHigh(node.right)) + 1;
    }
}
