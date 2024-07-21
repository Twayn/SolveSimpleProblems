package task.leet75;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.stream.IntStream;

public class MaximumAverageSubarray {
    public double findMaxAverage(int[] nums, int k) {
        if (nums.length <= k) {
            return IntStream.of(nums).average().getAsDouble();
        }

        double currentSum = IntStream.of(nums).limit(k).sum();
        double maxSum = currentSum;

        for (int i = k; i < nums.length; i++) {
            currentSum = currentSum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum / k;
    }


    public static void main(String[] args) {
        System.out.println(new MaximumAverageSubarray().findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4));
    }
}