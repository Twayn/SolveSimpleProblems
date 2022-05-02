package task.pascaltriangle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class PascalTriangleGenerator {
    public List<List<Integer>> generate(int numRows) {
        if (numRows <= 0) return List.of();

        List<List<Integer>> result = new ArrayList<>();
        result.add(List.of(1));

        if (numRows == 1) return result;

        IntStream.range(1, numRows).forEach(currentRowIndex -> {
            List<Integer> row = new ArrayList<>();
            row.add(1);

            IntStream.range(1, currentRowIndex).forEach(currentColumnIndex ->
                row.add(combineUpperValues(currentRowIndex, currentColumnIndex, result))
            );

            row.add(1);

            result.add(row);
        });

        return result;
    }

    private Integer combineUpperValues(
        final int currentRowIndex,
        final int currentColumnIndex,
        final List<List<Integer>> result
    ) {
        final List<Integer> upperRow = result.get(currentRowIndex - 1);
        return upperRow.get(currentColumnIndex - 1) + upperRow.get(currentColumnIndex);
    }
}
