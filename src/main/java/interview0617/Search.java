package interview0617;

/**
 * @author aojie
 * @Function
 * @create 2024-07-05 13:29
 */
public class Search {
    public int search(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
