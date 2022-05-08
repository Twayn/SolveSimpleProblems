package task.longestsubarraybysum;

import java.util.Arrays;

public class LongestSubarrayBySumFinder {
    int[] findLongestSubarrayBySum(int targetSum, int[] source) {
        int currentStartIndex = 0;
        int currentEndIndex = 0;

        int maxLength = 0;
        int currentSum = 0;
        int currentLength = 0;

        int finalStartIndex = 0;
        int finalEndIndex = 0;

        while (currentEndIndex < source.length && currentStartIndex < source.length) {
            if (currentSum + source[currentEndIndex] <= targetSum) {
                currentSum += source[currentEndIndex];
                currentLength++;
                currentEndIndex++;

                if (currentLength > maxLength && currentSum == targetSum) {
                    maxLength = currentLength;
                    finalStartIndex = currentStartIndex;
                    finalEndIndex = currentEndIndex;
                }
            } else {
                currentSum -= source[currentStartIndex];
                currentStartIndex++;
                currentLength--;
            }
        }

        return Arrays.copyOfRange(source, finalStartIndex, finalEndIndex);
    }
}
