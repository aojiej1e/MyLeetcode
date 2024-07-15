package interview0617;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aojie
 * @Function
 * @create 2024-07-03 15:39
 */
public class Subsets {

    public static void main(String[] args) {
        System.out.println(new Subsets().subsets(new int[]{1, 2,3}));
    }

    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> singleResult = new ArrayList<>();
        boolean[] flags = new boolean[nums.length];
        dfs(nums, singleResult, result, flags, 0);
        return result;
    }

    private void dfs(int[] nums, ArrayList<Integer> singleResult, ArrayList<List<Integer>> result, boolean[] flags, int index) {
        if (singleResult.size() == nums.length) {
            result.add(new ArrayList<>(singleResult));
            return;
        }
        result.add(new ArrayList<>(singleResult));
        for (int i = index; i < nums.length; i++) {
            if (!flags[i]) {
                flags[i] = true;
                singleResult.add(nums[i]);
                dfs(nums, singleResult, result, flags, i + 1);
                flags[i] = false;
                singleResult.remove(singleResult.size() - 1);
            }
        }
    }
}
