package interview0617;

import com.sun.org.apache.bcel.internal.generic.NEW;
import problem.TreeNode;

import java.util.Arrays;

/**
 * @author aojie
 * @Function
 * @create 2024-07-01 14:57
 */
public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return new TreeNode(nums[0]);
        }

        return buildTree(nums, 0, len - 1);

    }

    private TreeNode buildTree(int[] nums, int left, int right) {
        if (left < 0 || right >= nums.length) {
            return null;
        }
        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildTree(nums, 0, mid - 1);
        root.right = buildTree(nums, mid + 1, right);
        return root;
    }
}
