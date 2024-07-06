package task.increaingtriplet;

public class IncreasingTripletFinder {
    public boolean increasingDouble(int[] nums) {
        int currentMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > currentMin){
                return true;
            } else {
                currentMin = nums[i];
            }
        }

        return false;
    }
    public boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= a) {
                a = num;
            } else if (num <= b) {
                b = num;
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(new IncreasingTripletFinder().increasingTriplet(new int[]{2,1,3,4,5}));
    }
}

/*
1, 2, 3 return true;
1, 2, 1, 3



 */