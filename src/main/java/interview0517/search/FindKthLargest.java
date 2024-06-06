package interview0517.search;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author aojie
 * @Function
 * @create 2024-06-04 17:22
 */
public class FindKthLargest {
    public static void main(String[] args) {

    }
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> a - b);
        for (int num : nums) {
            priorityQueue.add(num);
            if (priorityQueue.size() == k + 1) {
                return priorityQueue.poll();
            }
        }
        return -1;
    }
}
