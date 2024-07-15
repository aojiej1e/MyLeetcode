package interview0617;

import problem.TreeNode;

import java.util.PriorityQueue;

/**
 * @author aojie
 * @Function
 * @create 2024-07-01 16:38
 */
public class KthSmallest {
    int k = 0;
    int res = -1;


    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        midOrder(root);
        return res;
    }

    private void midOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        midOrder(root.left);
        k--;
        if (k == 0) {
            res = root.val;
            return;
        }
        midOrder(root.right);
    }

}
