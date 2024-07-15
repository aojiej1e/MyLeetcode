package interview0617;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author aojie
 * @Function
 * @create 2024-06-19 18:19
 */
public class Merge {
    public static void main(String[] args) {
        //,[0,2] [[1,4],[3,5]]
        int[][] req1 = {{0,2}, {1,4},{3,5}};
        int[][] req2 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        System.out.println(Arrays.deepToString(new Merge().merge(req1)));
    }

    public int[][] merge(int[][] intervals) {
        int length = intervals.length;
        if (length == 1) {
            return intervals;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] interval1, int[] interval2) {
                return interval1[0] - interval2[0];
            }
        });
        ArrayList<int[]> result = new ArrayList<>();
        int left = 0;
        int right = 0;
        while (right < length) {
            int tempRight = intervals[right][1];
            int max = tempRight;
            while (right < length - 1 && tempRight >= intervals[right + 1][0]) {
                tempRight = Math.max(max, intervals[right + 1][1]);
                max = Math.max(max, tempRight);
                right++;
            }
            result.add(new int[]{intervals[left][0], max});
            left = ++right;
        }
        return result.toArray(new int[result.size()][]);

    }
}
