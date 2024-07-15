package interview0617;

/**
 * @author aojie
 * @Function
 * @create 2024-07-09 17:41
 */
public class CanJump {
    public boolean canJump(int[] nums) {
        return dfs(nums, new boolean[nums.length], 0);
    }

    private boolean dfs(int[] nums, boolean[] flags, int index) {
        if (index >= nums.length - 1) {
            return true;
        }
        int currCanJump = nums[index];
        for (int i = 1; i <= currCanJump; i++) {
            if (dfs(nums, flags, index + i)) {
                return true;
            }
        }
        return false;
    }
}
