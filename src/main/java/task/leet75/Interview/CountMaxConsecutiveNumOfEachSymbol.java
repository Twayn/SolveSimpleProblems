package task.leet75.Interview;

import java.util.HashMap;
import java.util.Map;

public class CountMaxConsecutiveNumOfEachSymbol {
    Map<Character, Integer> countMaxConsecutiveNumOfEachSymbol(String input) {
        Map<Character, Integer> symbolToMaxCount = new HashMap<>();

        final char[] asArray = input.toCharArray();

        int count = 1;
        char currentSymbol = asArray[0];
        symbolToMaxCount.put(currentSymbol, count);


        for (int i = 1; i < asArray.length; i++) {
            if (asArray[i] == currentSymbol) {
                count++;
            } else {
                symbolToMaxCount.merge(currentSymbol, count, (oldVal, newVal) -> newVal > oldVal ? newVal : oldVal);
                currentSymbol = asArray[i];
                count = 1;
            }
        }

        symbolToMaxCount.merge(currentSymbol, count, (oldVal, newVal) -> newVal > oldVal ? newVal : oldVal);

        return symbolToMaxCount;
    }

    public static void main(String[] args) {
        System.out.println(new CountMaxConsecutiveNumOfEachSymbol().countMaxConsecutiveNumOfEachSymbol("cccaafbbbaaacdddffddfqii"));
    }
}
