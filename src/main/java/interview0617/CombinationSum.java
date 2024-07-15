package interview0617;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aojie
 * @Function
 * @create 2024-07-03 17:10
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates.length == 0.) {
            return new ArrayList<>();
        }
        ArrayList<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> singleList = new ArrayList<>();
        dfs(candidates, singleList, result, target, 0);
        return result;

    }

    private void dfs(int[] candidates, ArrayList<Integer> singleList, ArrayList<List<Integer>> result, int target, int index) {
        if (target == 0) {
            result.add(new ArrayList<>(singleList));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            singleList.add(candidates[i]);
            dfs(candidates, singleList, result, target - candidates[i], index + 1);
            singleList.remove(singleList.size() - 1);
        }
    }
}
