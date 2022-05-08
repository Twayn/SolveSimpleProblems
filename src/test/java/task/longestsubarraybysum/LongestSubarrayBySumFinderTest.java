package task.longestsubarraybysum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubarrayBySumFinderTest {
    LongestSubarrayBySumFinder finder = new LongestSubarrayBySumFinder();

    @Test
    void findLongestSubarrayBySum() {
        assertArrayEquals(
            new int[]{1, 2, 3},
            finder.findLongestSubarrayBySum(6, new int[]{1, 2, 3, 4, 5})
        );

        assertArrayEquals(
            new int[]{2, 3, 7}, //not 7,5
            finder.findLongestSubarrayBySum(12, new int[]{1, 2, 3, 7, 5})
        );

        assertArrayEquals(
            new int[]{1, 2, 3, 4, 5}, //not 4,5,6
            finder.findLongestSubarrayBySum(15, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})
        );

        assertArrayEquals(
            new int[]{1, 2, 3, 4, 5, 0, 0}, //not 1,2,3,4,5
            finder.findLongestSubarrayBySum(15, new int[]{1, 2, 3, 4, 5, 0, 0, 6, 7, 8, 9})
        );

        assertArrayEquals(
            new int[]{1, 1, 1}, //not 1,2, not 3
            finder.findLongestSubarrayBySum(3, new int[]{1, 2, 3, 9, 1, 1, 1})
        );
    }
}