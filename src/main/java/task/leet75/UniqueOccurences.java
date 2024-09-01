package task.leet75;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class UniqueOccurences {
    public boolean uniqueOccurrences(int[] arr) {
        final Map<Integer, Long> collect = Arrays.stream(arr).boxed().collect(groupingBy(identity(), counting()));

        final long distinct = collect.values().stream().distinct().count();

        return distinct == collect.values().size();
    }
}
