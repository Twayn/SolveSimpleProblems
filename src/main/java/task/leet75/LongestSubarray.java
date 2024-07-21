package task.leet75;

import java.util.Arrays;

public class LongestSubarray {
    public int longestSubarray(int[] nums) {
        if (Arrays.stream(nums).sum() == nums.length) {
            return nums.length - 1;
        }

        int result = 0;
        int currentSequenceLength = 0;

        int left = 0;
        int right = 0;

        int numberOfZerosInWindow = 0;

        while (right < nums.length) {
            while (numberOfZerosInWindow < 2 && right < nums.length) {
                if (nums[right] == 1) {
                    currentSequenceLength++;
                } else {
                    numberOfZerosInWindow++;
                }
                right++;
            }

            result = Math.max(result, currentSequenceLength);

            while (numberOfZerosInWindow > 1) {
                if (nums[left] == 1) {
                    currentSequenceLength--;
                } else {
                    numberOfZerosInWindow--;
                }

                left++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new LongestSubarray().longestSubarray(new int[]{1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1}));
    }
}
