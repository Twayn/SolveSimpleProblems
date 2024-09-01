package task.leet75.Interview;

public class LongestOnesSequencesWithFlip {
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
    int findSeq(int[] input) {
        int l = 0;
        int r = 0;

        int max = 0;
        int zerosNum = 0;

        while (r < input.length) {
            if (input[r] == 0) {
                zerosNum++;
            }
            r++;

            while (zerosNum == 2) {
                if (input[l] == 0) {
                    zerosNum--;
                }
                l++;
            }

            max = Math.max(r - l, max);
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(new LongestOnesSequencesWithFlip().findSeq(new int[]{1, 1, 1, 0, 0, 1, 1}));
        System.out.println(new LongestOnesSequencesWithFlip().findSeq(new int[]{1, 0, 1, 1, 0, 0, 1, 0, 1}));
        System.out.println(new LongestOnesSequencesWithFlip().findSeq(new int[]{1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0}));
        System.out.println(new LongestOnesSequencesWithFlip().findSeq(new int[]{0, 0, 1, 1, 0, 0, 1, 0, 1}));
    }
}
