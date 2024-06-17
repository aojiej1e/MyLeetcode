package interview0517.divide;

import problem.TreeNode;

import java.util.HashMap;

/**
 * @author aojie
 * @Function
 * @create 2024-06-06 17:21
 */
public class BuildTree {
    private HashMap<Integer, Integer> inOrderMap;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int length = preorder.length;
        inOrderMap = new HashMap<>();
        for (int i = 0; i < length; i++) {
            inOrderMap.put(inorder[i], i);
        }
        return buildBinaryTree(preorder, 0, length - 1, 0, length - 1);
    }

    private TreeNode buildBinaryTree(int[] preorder, int start, int end, int left, int right) {
        if (left > right) {
            return null;
        }
        int root = preorder[start];
        TreeNode rootTree = new TreeNode(root);
        Integer indexIn = inOrderMap.get(root);
        int count = indexIn - left;
        rootTree.left = buildBinaryTree(preorder, start + 1, start + count, left, indexIn - 1);
        rootTree.right = buildBinaryTree(preorder, start + count + 1, end, indexIn + 1, right);
        return rootTree;
    }
}
