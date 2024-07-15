package interview0617;

import problem.TreeNode;

import java.util.HashMap;
import java.util.concurrent.CountDownLatch;

/**
 * @author aojie
 * @Function
 * @create 2024-07-02 18:52
 */
public class pathSumⅡ {
    int res = 0;

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        HashMap<Long, Integer> hashMap = new HashMap<>();
        dfs(root, 0, targetSum, hashMap);
        return res;
    }

    private void dfs(TreeNode root, long sum, int targetSum, HashMap<Long, Integer> hashMap) {
        if (root == null) {
            return;
        }
        sum += root.val;
        res += hashMap.getOrDefault(targetSum - sum, 0);
        hashMap.put(sum, hashMap.getOrDefault(sum, 0) + 1);


    }
}
