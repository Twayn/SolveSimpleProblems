package task.leet75;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class CloseStrings {
    public boolean closeStrings(String word1, String word2) {
        var w1 = word1.chars().boxed().collect(groupingBy(identity(), counting()));
        var w2 = word2.chars().boxed().collect(groupingBy(identity(), counting()));

        var w11 = w1.values().stream().collect(groupingBy(identity(), counting()));
        var w22 = w2.values().stream().collect(groupingBy(identity(), counting()));

        return w1.keySet().equals(w2.keySet()) && w11.equals(w22);
    }
}
