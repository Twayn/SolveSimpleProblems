package task.leet75.Interview;

public class LongestOnesSequencesWithFlipIllegal {
    /*
     * Given array of 0 and 1, find maximum length of consecutive ones. You must flip one 0 to 1
     *
     * 1, 1, 1, 0, 0, 1, 1 = 4
     * 1, 0, 1, 1, 0, 0, 1, 0, 1 = 4
     * 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0 = 6
     *
     * 0, 0, 1, 1, 0, 0, 1, 0, 1 = 3
     * 0, 0, 0 = 1
     * */
    int findSeq(int[] nums) {
        int left = 0;
        int right = 0;
        int zerosAllowed = 1;

        while (right < nums.length) {
            if (nums[right++] == 0) {
                zerosAllowed--;
            }
            if (zerosAllowed < 0 && nums[left++] == 0) {
                zerosAllowed++;
            }
        }
        return right - left;
    }

    public static void main(String[] args) {
        System.out.println(new LongestOnesSequencesWithFlipIllegal().findSeq(new int[]{1, 1, 1, 0, 0, 1, 1}));
        System.out.println(new LongestOnesSequencesWithFlipIllegal().findSeq(new int[]{1, 0, 1, 1, 0, 0, 1, 0, 1}));
        System.out.println(new LongestOnesSequencesWithFlipIllegal().findSeq(new int[]{1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0}));
        System.out.println(new LongestOnesSequencesWithFlipIllegal().findSeq(new int[]{0, 0, 1, 1, 0, 0, 1, 0, 1}));
    }
}
