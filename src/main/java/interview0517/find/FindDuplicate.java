package interview0517.find;

/**
 * @author aojie
 * @Function
 * @create 2024-06-03 16:37
 */
public class FindDuplicate {
    public static void main(String[] args) {

    }
    public int findDuplicate(int[] nums) {
        int len = nums.length;
        boolean[] flagArr = new boolean[len];
        for (int i = 0; i < len - 1; i++) {
            if (flagArr[nums[i]]) {
                return nums[i];
            }else{
                flagArr[nums[i]] = true;
            }
        }
        return -1;
    }
}
