package task.leet75;

import java.util.HashMap;

public class MaxNumberOfKSumPairs {
    public int maxOperations(int[] nums, int k) {
        int result = 0;

        HashMap<Integer, Integer> numberToCloseSumCount = new HashMap<>();

        for (int num : nums) {
            if (num >= k) continue;

            if (numberToCloseSumCount.containsKey(num) && numberToCloseSumCount.get(num) > 0) {
                numberToCloseSumCount.computeIfPresent(num, (key, val) -> --val);
                result++;
            } else {
                numberToCloseSumCount.merge(k - num, 1, (oldValue, newValue) -> oldValue + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new MaxNumberOfKSumPairs().maxOperations(new int[]{1, 1, 1, 1}, 2));
        //{2,2,2,3,1,1,4,1}
    }
}
