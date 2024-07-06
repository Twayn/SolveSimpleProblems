package task.leet75;

import java.util.Arrays;

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        if (nums.length == 1) return;

        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                if (right != left) {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                }
                left++;
            }
        }
    }

    private void moveToTheLeft(int index, int[] nums) {
        boolean canSwap = index != 0 && nums[index - 1] == 0;

        while (canSwap) {


            index--;
            canSwap = index != 0 && nums[index - 1] == 0;
        }
    }

    public static void main(String[] args) {
        final int[] ints = {1, 2, 3};
        new MoveZeros().moveZeroes(ints);
        System.out.println(Arrays.toString(ints));
    }
}
