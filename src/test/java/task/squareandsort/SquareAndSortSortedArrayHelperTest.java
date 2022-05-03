package task.squareandsort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareAndSortSortedArrayHelperTest {
    private final SquareAndSortSortedArrayHelper helper = new SquareAndSortSortedArrayHelper();

    @Test
    void squareAndSortSortedArray() {
        assertArrayEquals(new int[]{1, 4, 9}, helper.squareAndSortSortedArrayUsingExtraSpace(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 4, 9}, helper.squareAndSortSortedArrayUsingExtraSpace(new int[]{-1, -2, -3}));
        assertArrayEquals(new int[]{1, 1, 4, 4}, helper.squareAndSortSortedArrayUsingExtraSpace(new int[]{-2, -1, 1, 2}));
        assertArrayEquals(new int[]{0, 1, 1, 4, 4}, helper.squareAndSortSortedArrayUsingExtraSpace(new int[]{-2, -1, 0, 1, 2}));
        assertArrayEquals(new int[]{0, 1, 4, 16, 25}, helper.squareAndSortSortedArrayUsingExtraSpace(new int[]{-4, -2, 0, 1, 5}));
    }
}