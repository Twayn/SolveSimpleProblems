package task.leet75;

public class MaxOnesSeq {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnesSequence = 0;
        boolean sequenceInProgress = false;
        int currentOnesSequence = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                sequenceInProgress = true;
                currentOnesSequence++;
            } else {
                if (sequenceInProgress) {
                    sequenceInProgress = false;
                    maxOnesSequence = Math.max(currentOnesSequence, maxOnesSequence);
                    currentOnesSequence = 0;
                }
            }
        }

        if (sequenceInProgress) {
            maxOnesSequence = Math.max(currentOnesSequence, maxOnesSequence);
        }

        return maxOnesSequence;
    }

    public static void main(String[] args) {
        System.out.println(new MaxOnesSeq().findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
    }
}
