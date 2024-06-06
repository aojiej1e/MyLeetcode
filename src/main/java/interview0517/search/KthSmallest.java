package interview0517.search;

import problem.TreeNode;

/**
 * @author aojie
 * @Function
 * @create 2024-06-04 16:34
 */
public class KthSmallest {
    public static void main(String[] args) {

    }

    int count;
    int res;
    public int kthSmallest(TreeNode root, int k) {
        if (root == null) {
            return  -1;
        }
        count = k;
        midReverse(root);
        return res;
    }

    private void midReverse(TreeNode root) {
        if (root == null) {
            return;
        }
        midReverse(root.left);
        --count;
        if (count == 0) {
            res = root.val;
            return;
        }
        midReverse(root.right);
    }
}
