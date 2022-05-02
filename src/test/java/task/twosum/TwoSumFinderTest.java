package task.twosum;

import org.junit.jupiter.api.Test;

import java.util.List;

import task.twosum.TwoSumFinder.Pair;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumFinderTest {
    TwoSumFinder finder = new TwoSumFinder();

    @Test
    void twoSumBrute() {
        final Pair<Integer, Integer> result = finder.twoSumBrute(List.of(9, 12, 5, 6, 20, 3), 11);

        assertEquals(new Pair<>(2, 3), result);
    }

    @Test
    void twoSum() {
        final Pair<Integer, Integer> result = finder.twoSum(List.of(9, 12, 5, 1, 4, 6, 20, 3), 11);

        assertEquals(new Pair<>(2, 5), result);
    }
}