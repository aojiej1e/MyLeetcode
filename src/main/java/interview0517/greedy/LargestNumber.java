package interview0517.greedy;

import java.util.Arrays;
import java.util.Objects;

/**
 * @author aojie
 * @Function
 * @create 2024-06-17 13:34
 */
public class LargestNumber {
    public static void main(String[] args) {

    }
    public String largestNumber(int[] nums) {
        StringBuilder sb = new StringBuilder();
        String[] numsStrArr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsStrArr[i] = String.valueOf(nums[i]);
        }
        //排序
        Arrays.sort(numsStrArr, (x, y) -> (x + y).compareTo(y + x));
        if (Objects.equals(numsStrArr[0], "0")) {
            return "0";
        }
        for (String s : numsStrArr) {
            sb.append(s);
        }
        return sb.toString();
    }
}
