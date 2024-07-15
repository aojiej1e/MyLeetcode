package interview0617;

import java.util.*;

/**
 * @author aojie
 * @Function
 * @create 2024-07-08 17:10
 */
public class TopKFrequent {
    public static void main(String[] args) {
        Integer[] req = new Integer[]{1, 2, 1, 2, 2, 3};
        Arrays.sort(req, (x, y) -> y -x);
        System.out.println(Arrays.toString(req));
        System.out.println(Arrays.toString(new TopKFrequent().topKFrequent(null, 2)));
    }

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
        }
        HashMap<Integer, Integer> reverseHash = new HashMap<>();
        for (Map.Entry<Integer, Integer> integerIntegerEntry : hashMap.entrySet()) {
            reverseHash.put(integerIntegerEntry.getValue(), integerIntegerEntry.getKey());
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k, (x, y) -> y - x);
        for (Integer integer : reverseHash.keySet()) {
            priorityQueue.offer(integer);
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = reverseHash.get(priorityQueue.poll());
        }
        return res;

    }
}
