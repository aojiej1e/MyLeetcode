package problem;

import com.sun.org.apache.bcel.internal.generic.IREM;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author aojie
 * @Function
 * @create 2022-11-15 22:41
 */
public class MajorityElement {
    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        int[] req = {};
        System.out.println(majorityElement.majorityElement(req));
    }

    /**
     * map 排序取中位 摩尔投票
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        int x = 0;
        int vote = 0;
        for (int num : nums) {
            if (vote == 0) {
                x = num;
            }
            if (x == num) {
                vote++;
            }else {
                vote--;
            }
        }
        return x;
    }
}
