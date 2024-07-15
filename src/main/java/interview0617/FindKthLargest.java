package interview0617;

import java.util.PriorityQueue;

/**
 * @author aojie
 * @Function
 * @create 2024-07-08 16:58
 */
public class FindKthLargest {
    public static void main(String[] args) {

    }

    public int findKthLargest(int[] nums, int k) {
        int length = nums.length;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k, (x, y) -> y - x);
        for (int i = 0; i < length; i++) {
            priorityQueue.offer(nums[i]);
        }
        int res = 0;
        for (int i = 0; i < k; i++) {
            res = priorityQueue.poll();
        }
        return res;
    }
}
