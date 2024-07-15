package interview0617;

import java.util.Arrays;

/**
 * @author aojie
 * @Function
 * @create 2024-06-20 17:01
 */
public class Rotate {
    public static void main(String[] args) {
        int[] req = {1,2,3,4,5,6,7};
        new Rotate().rotate(req, 3);
        System.out.println(Arrays.toString(req));
    }
    //1,2,3,4,5,6,7
    //7 6 5 4 3 2 1
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int count = k % len;
        if (len == 1 || count == 0) {
            return;
        }
        reverseArr(nums, 0, len - 1);
        reverseArr(nums, 0, count - 1);
        reverseArr(nums, count, len - 1);
    }

    private void reverseArr(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

}
