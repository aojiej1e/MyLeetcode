package problem;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author aojie
 * @Function
 * @create 2022-11-07 22:05
 */
public class LevelOrder {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t3.right = t5;
        t5.left = t6;

        LevelOrder levelOrder = new LevelOrder();
        System.out.println(Arrays.toString(levelOrder.levelOrder(t1)));

    }

    public int[] levelOrder(TreeNode root) {
        if (root == null) {
            return new int[]{};
        }
        if (root.left == null && root.right == null) {
            return new int[]{root.val};
        }

        List<Integer> result = new ArrayList<>();
        List<TreeNode> treeNodeList = new ArrayList<>();
        treeNodeList.add(root);
        int index = 0;
        while (index != treeNodeList.size()) {
            TreeNode treeNode = treeNodeList.get(index++);
            result.add(treeNode.val);
            if (treeNode.left != null) {
                treeNodeList.add(treeNode.left);
            }
            if (treeNode.right != null) {
                treeNodeList.add(treeNode.right);
            }
        }
        int[] resArr = new int[result.size()];
        int indexArr = 0;
        for (Integer integer : result) {
            resArr[indexArr++] = integer;
        }
        return resArr;
    }
}
