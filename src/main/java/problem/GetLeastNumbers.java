package problem;

import java.util.Arrays;

/**
 * @author aojie
 * @Function
 * @create 2022-11-17 19:21
 */
public class GetLeastNumbers {
    public static void main(String[] args) {
        GetLeastNumbers getLeastNumbers = new GetLeastNumbers();
        int[] req = {1, 2, 5, 34, 12, 5};
        System.out.println(Arrays.toString(getLeastNumbers.getLeastNumbers(req, 3)));
    }

    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr == null) {
            return arr;
        }
        if (arr.length ==1 ) {
            return arr;
        }

        //冒泡
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i -1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        Arrays.sort(arr);
        int[] res = new int[k];
        System.arraycopy(arr, 0, res, 0, k);
        return res;
    }
}
