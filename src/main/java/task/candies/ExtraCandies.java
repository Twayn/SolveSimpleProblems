package task.candies;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class ExtraCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().orElse(Integer.MIN_VALUE);
        return Arrays.stream(candies).mapToObj(it -> it + extraCandies >= max).collect(toList());
    }
}
