package task.leet75;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        final Map<Character, Long> collect = s.chars().mapToObj(i -> (char) i).collect(groupingBy(identity(), counting()));
        final Map<Character, Long> collect2 = t.chars().mapToObj(i -> (char) i).collect(groupingBy(identity(), counting()));

        return collect.equals(collect2);
    }
}