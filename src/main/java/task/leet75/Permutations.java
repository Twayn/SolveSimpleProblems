package task.leet75;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        privatePermute(result, new ArrayList<>(), nums);

        return result;
    }

    private void privatePermute(List<List<Integer>> result, List<Integer> current, int[] nums) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (current.contains(nums[i])) continue;
                current.add(nums[i]);
                privatePermute(result, current, nums);
                current.remove(current.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Permutations().permute(new int[]{1,2,3}));
    }
}
