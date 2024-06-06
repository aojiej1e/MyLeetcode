package interview0517.backTracke;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author aojie
 * @Function
 * @create 2024-06-05 16:06
 */
public class CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> singleList = new LinkedList<>();
        Arrays.sort(candidates);
        dfs(candidates, target, result, singleList, 0);
        return result;
    }

    private void dfs(int[] candidates, int target, ArrayList<List<Integer>> result, LinkedList<Integer> singleList, int index) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            result.add(new ArrayList<>(singleList));
            return;
        }
        ArrayList<Integer> noRepeatList = new ArrayList<>();
        for (int i = index; i < candidates.length; i++) {
            if (!noRepeatList.contains(candidates[i])) {
                noRepeatList.add(candidates[i]);
                singleList.add(candidates[i]);
                dfs(candidates, target - candidates[i], result,singleList, i + 1);
                singleList.removeLast();
            }
        }
    }


}
