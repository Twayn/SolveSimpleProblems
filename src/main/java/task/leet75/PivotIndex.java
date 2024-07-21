package task.leet75;

import java.util.Arrays;

public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int rightSum = Arrays.stream(nums).sum();

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            rightSum-= nums[i];

            if (rightSum == leftSum) return i;

            leftSum+= nums[i];

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new PivotIndex().pivotIndex(new int[]{1,7,3,6,5,6}));
    }
}
