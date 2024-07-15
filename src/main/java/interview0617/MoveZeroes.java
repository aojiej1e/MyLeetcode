package interview0617;

import java.util.Arrays;

/**
 * @author aojie
 * @Function
 * @create 2024-06-17 15:21
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int[] req = new int[]{4,2,4,0,0,3,0,5,1,0};
        new MoveZeroes().moveZeroes(req);
        System.out.println(Arrays.toString(req));
    }
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return;
        }
        int left = 0;
        int right = 0;
        while (right < len) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
            right++;
        }
    }
}
