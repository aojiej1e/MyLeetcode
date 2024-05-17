package problem;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aojie
 * @Function
 * @create 2022-11-07 22:16
 */
public class LevelOrder2 {
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

        System.out.println(new LevelOrder2().levelOrder(t1));
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        if (root.left == null && root.right == null) {
            List<Integer> list = new ArrayList<>();
            list.add(root.val);
            res.add(list);
            return res;
        }
        List<TreeNode> treeNodeList = new ArrayList<>();
        treeNodeList.add(root);
        addList(treeNodeList,res);
        return res;
    }

    private void addList(List<TreeNode> treeNodeList, List<List<Integer>> res) {
        if (treeNodeList.isEmpty()) {
            return;
        }
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<TreeNode> newTreeNodeList = new ArrayList<>();
        while (!treeNodeList.isEmpty()) {
            TreeNode remove = treeNodeList.remove(0);
            list.add(remove.val);
            if (remove.left != null) {
                newTreeNodeList.add(remove.left);
            }
            if (remove.right != null) {
                newTreeNodeList.add(remove.right);
            }
        }
        res.add(list);
        addList(newTreeNodeList, res);
    }
}
