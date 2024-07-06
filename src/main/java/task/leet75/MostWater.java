package task.leet75;

public class MostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int maxArea = 0;

        while (left < right) {
            int currentArea = (right - left) * Math.min(height[left], height[right]);

            if (currentArea > maxArea) {
                maxArea = currentArea;
            }

            if (height[left] == height[right]) {
                left++;
                right--;
            } else if (height[left] < height[right]) {
                left++;
            } else right--;
        }

        return maxArea;
    }
}
