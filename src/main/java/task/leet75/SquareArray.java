package task.leet75;

import java.util.Arrays;

public class SquareArray {
    public int[] sortedSquares(int[] nums) {
        if (nums.length == 1) {
            return new int[]{nums[0] * nums[0]};
        }

        int left = 0;
        int right = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                if (i == 0) {
                    left = 0;
                    right = 1;
                } else {
                    left = i - 1;
                    right = i;
                }
                break;
            }
            if (i == nums.length - 1) {
                left = i - 1;
                right = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i]);
        }


        int[] result = new int[nums.length];

        int index = 0;

        for (;;) {
            boolean leftInGame = left >= 0;
            boolean rightInGame = right <= nums.length - 1;

            if (leftInGame && rightInGame){
                if (nums[left] < nums[right]){
                    result[index] = nums[left] * nums[left];
                    index++;
                    left--;
                } else  {
                    result[index] = nums[right] * nums[right];
                    index++;
                    right++;
                }
            } else if (leftInGame){
                result[index] = nums[left] * nums[left];
                index++;
                left--;
            } else if (rightInGame){
                result[index] = nums[right] * nums[right];
                index++;
                right++;
            } else {
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new SquareArray().sortedSquares(new int[]{-4, -1, 0, 3, 10})));
    }
}
