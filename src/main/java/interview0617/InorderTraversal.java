package interview0617;

import problem.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aojie
 * @Function
 * @create 2024-06-27 16:02
 */
public class InorderTraversal {
    public static void main(String[] args) {

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        inOrderTra(root, result);
        return result;
    }

    private void inOrderTra(TreeNode root, ArrayList<Integer> result) {
        if (root == null) {
            return;
        }
        inOrderTra(root.left, result);
        result.add(root.val);
        inOrderTra(root.right, result);
    }
}
