package interview0517.doublePoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author aojie
 * @Function
 * @create 2024-05-30 16:56
 */
public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = new int[] {4, 6, 1, 3, 5};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int partion = getPartion(arr, start, end);
        quickSort(arr, start, partion - 1);
        quickSort(arr, partion + 1, end);
    }

    private static int getPartion(int[] arr, int start, int end) {
        int base = start;
        while (start < end){
            while (start < end && arr[end] >= arr[base]){
                end--;
            }
            while (start < end && arr[start] <= arr[base]){
                start++;
            }
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        int temp = arr[base];
        arr[base] = arr[start];
        arr[start] = temp;
        return start;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        //排序
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (nums[left] + nums[right] + nums[i] > 0) {
                    right--;
                } else if (nums[left] + nums[right] + nums[i] < 0) {
                    left++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[right - 1] == nums[right]) {
                        right--;
                    }
                    while (left < right && nums[left + 1] == nums[left]) {
                        left++;
                    }
                    left++;
                    right--;
                }
            }
        }
        return res;
    }
}
