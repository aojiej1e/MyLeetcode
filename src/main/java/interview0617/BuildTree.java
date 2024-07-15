package interview0617;

import problem.TreeNode;

import java.sql.SQLOutput;
import java.util.HashMap;

/**
 * @author aojie
 * @Function
 * @create 2024-07-02 17:32
 */
public class BuildTree {
    public static void main(String[] args) {
        int[] pre = {1, 2, 3};
        int[] in = {2, 3, 1};
        System.out.println(new BuildTree().buildTree(pre, in));
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> inOrderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inOrderMap.put(inorder[i], i);
        }
        return buildTree(preorder, inOrderMap, 0, 0, preorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, HashMap<Integer, Integer> inOrderMap, int rootIndex, int start, int end) {
        if (start > end) {
            return null;
        }
        int rootVal = preorder[rootIndex];
        TreeNode root = new TreeNode(rootVal);
        Integer rootValInorder = inOrderMap.get(rootVal);
        root.left = buildTree(preorder, inOrderMap,  start + 1, start, rootValInorder - 1);
        root.right = buildTree(preorder, inOrderMap, start + rootValInorder +1,  rootValInorder + 1, end);
        return root;
    }
}
