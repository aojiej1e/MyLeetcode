package problem;

/**
 * @author aojie
 * @Function
 * @create 2022-08-20 23:10
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 6, 8, 9, 13, 15, 46, 48, 55};
        int index = binarySearch(arr, 46);
        System.out.println(index);
    }

    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + (right)) / 2;
            if (arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                right = mid;
            }else {
                left = mid;
            }
        }
        return -1;
    }

}
