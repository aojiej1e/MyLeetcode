package interview0517.find;

/**
 * @author aojie
 * @Function
 * @create 2024-06-03 15:58
 */
public class BinarySearch {
    public static void main(String[] args) {

    }
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid =  left + (right - left)/2;
            if (nums[mid] > target) {
                right = mid - 1;
            }else if(nums[mid] < target) {
                left = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
