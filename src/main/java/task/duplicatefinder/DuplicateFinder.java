package task.duplicatefinder;

import java.util.HashSet;
import java.util.Set;

public class DuplicateFinder {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<>();

        for (int num : nums) {
            uniques.add(num);
        }

        return uniques.size() != nums.length;
    }
}
