package task.leet75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EqualPairs {
    public int equalPairs(int[][] grid) throws InterruptedException {
        int numberOfEqualPairs = 0;

        Map<List<Integer>, Integer> rows = new HashMap<>();
        Map<List<Integer>, Integer> columns = new HashMap<>();

        for (int[] ints : grid) {
            rows.merge(Arrays.stream(ints).boxed().toList(), 1, (oldValue, newValue) -> ++oldValue);
        }

        for (int i = 0; i < grid.length; i++) {
            List<Integer> column = new ArrayList<>(grid.length);
            for (int[] ints : grid) {
                column.add(ints[i]);
            }
            columns.merge(column, 1, (oldValue, newValue) -> ++oldValue);
        }

        for (Map.Entry<List<Integer>, Integer> entry : rows.entrySet()) {
            if (columns.containsKey(entry.getKey())) {
                numberOfEqualPairs += entry.getValue() * columns.get(entry.getKey());
            }
        }

        return numberOfEqualPairs;
    }

    public static void main(String[] args) throws InterruptedException {
//        System.out.println(new EqualPairs().equalPairs(new int[][]{{3,2,1},{1,7,6},{2,7,7}}));
        System.out.println(new EqualPairs().equalPairs(new int[][]{{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}}));
    }
}
