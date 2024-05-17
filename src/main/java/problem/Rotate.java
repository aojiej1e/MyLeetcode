package problem;

import java.util.Arrays;

/**
 * @author aojie
 * @Function
 * @create 2024-02-29 20:05
 */
public class Rotate {
    public static void main(String[] args) {
        int[] req = {1,2,3,4,5,6,7};
        //5,6,7,1,2,3,4
        new Rotate().rotate(req, 3);
        System.out.println(Arrays.toString(req));
    }
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        for (int i = 0; i < k; i++) {
            int index = len + k - 1 - i;
            while (index > 0) {
                nums[(index) % len] = nums[(index - k) % len];
                index -= k;
            }
        }
    }
}
