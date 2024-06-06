package interview0517.backTracke;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author aojie
 * @Function
 * @create 2024-06-05 15:40
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> singleList = new LinkedList<>();
        backTrace(candidates, target,0, result, singleList);
        return result;
    }

    private void backTrace(int[] candidates, int target, int index, ArrayList<List<Integer>> result, LinkedList<Integer> singleList) {
        if (target == 0) {
            result.add(new ArrayList<>(singleList));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            target -= candidates[i];
            singleList.add(candidates[i]);
            backTrace(candidates, target, i, result, singleList);
            singleList.removeLast();
            target += candidates[i];
        }
    }
}
