package task.leet75;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TwoArrayDifference {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

        List<Integer> distinctOneTwo = Arrays.stream(nums1).boxed().filter(Predicate.not(set2::contains)).distinct().toList();
        List<Integer> distinctTwoOne = Arrays.stream(nums2).boxed().filter(Predicate.not(set1::contains)).distinct().toList();

        return List.of(distinctOneTwo, distinctTwoOne);
    }
}
