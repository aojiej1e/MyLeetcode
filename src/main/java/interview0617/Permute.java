package interview0617;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aojie
 * @Function
 * @create 2024-07-03 15:24
 */
public class Permute {
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        dfs(nums, result, new ArrayList<Integer>(), new boolean[nums.length]);
        return result;
    }

    private void dfs(int[] nums, ArrayList<List<Integer>> result, ArrayList<Integer> singleResult, boolean[] flags) {
        if (singleResult.size() == nums.length) {
            result.add(new ArrayList<>(singleResult));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!flags[i]) {
                flags[i] = true;
                singleResult.add(nums[i]);
                dfs(nums, result, singleResult, flags);
                flags[i] = false;
                singleResult.remove(singleResult.size() - 1);
            }
        }
    }
}
