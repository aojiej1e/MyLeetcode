package interview0617;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author aojie
 * @Function
 * @create 2024-07-10 15:38
 */
public class Generate {
    public static void main(String[] args) {
        System.out.println(new Generate().generate(3));

    }
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i ; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                }else {
                    list.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
            result.add(list);
        }
        return result;
    }
}
