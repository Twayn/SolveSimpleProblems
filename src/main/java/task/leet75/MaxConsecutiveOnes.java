package task.leet75;

public class MaxConsecutiveOnes {
    public int longestOnes(int[] nums, int k) {
        int longestOnes = 0;
        int currentLongestOnes = 0;

        int currentNumOfTolerableZeros = 0;

        int left = 0;
        int right = 0;

        while (right < nums.length) {
            while (right < nums.length && (nums[right] == 1 || (nums[right] == 0 && currentNumOfTolerableZeros < k))) {
                currentLongestOnes++;
                if (nums[right] == 0) {
                    currentNumOfTolerableZeros++;
                }
                right++;
            }

            longestOnes = Math.max(longestOnes, currentLongestOnes);

            while (currentNumOfTolerableZeros >= k && left < nums.length) {
                if (nums[left] == 0) {
                    currentNumOfTolerableZeros--;
                }
                currentLongestOnes--;
                left++;
            }
        }


        return longestOnes;
    }

    public static void main(String[] args) {
        try{
            System.out.println(new MaxConsecutiveOnes().longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3));
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
