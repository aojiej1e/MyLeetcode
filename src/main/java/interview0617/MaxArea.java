package interview0617;

/**
 * @author aojie
 * @Function
 * @create 2024-06-17 17:18
 */
public class MaxArea {
    public int maxArea(int[] height) {
        int len = height.length;
        int left = 0;
        int right = len - 1;
        int maxArea = 0;
        while (left < right) {
            int min = Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, min * (right - left));
            if (height[left] > height[right]) {
                left++;
            }else {
                right--;
            }
        }
        return maxArea;
    }
}
