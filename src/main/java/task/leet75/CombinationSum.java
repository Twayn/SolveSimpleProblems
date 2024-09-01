package task.leet75;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();

//        recursive(result, k, 0, n, 0);

        return result;
    }

    private void recursive(List<List<Integer>> result, List<Integer> current, int maxDepth, int currentDepth, int maxSum, int currentSum) {
        if (currentDepth == maxDepth) {
            result.add(current);
        }

//        current.add()
    }

    public static void main(String[] args) {
        final List<List<Integer>> lists = new CombinationSum().combinationSum3(3, 7);
        System.out.println(lists);
    }
}
