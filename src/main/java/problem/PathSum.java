package problem;

import org.checkerframework.checker.units.qual.A;

import java.util.*;

/**
 * @author aojie
 * @Function
 * @create 2022-11-10 21:50
 */
public class PathSum {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(5);
        TreeNode t2 = new TreeNode(8);
        TreeNode t3 = new TreeNode(13);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(1);
        t1.right = t2;
        t2.left = t3;
        t2.right = t4;
        t4.left = t5;
        t4.right = t6;

        PathSum pathSum = new PathSum();
        System.out.println(pathSum.pathSum(t1, 22));
    }

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        if (root.left == null && root.right == null) {
            if (root.val == target) {
                List<Integer> list = new ArrayList<>();
                list.add(root.val);
                res.add(list);
            }
            return res;
        }
        int sum = root.val;
        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        recursive(root.left, sum, target, list, res);
        List<Integer> list2 = new ArrayList<>();
        list2.add(root.val);
        recursive(root.right, sum, target, list2, res);
        return  res;

    }

    private void recursive(TreeNode treeNode, int sum, int target, List<Integer> list, List<List<Integer>> res) {
        if (treeNode == null) {
            return;
        }
        int newSum = treeNode.val + sum;
        if (newSum > target) {
            return;
        }
        list.add(treeNode.val);
        if (newSum == target && treeNode.left == null && treeNode.right == null) {
            res.add(new ArrayList<>(list));
        }
        recursive(treeNode.left, newSum, target, list, res);
        recursive(treeNode.right, newSum, target, list, res);
        list.remove(list.size() - 1);
    }
}
