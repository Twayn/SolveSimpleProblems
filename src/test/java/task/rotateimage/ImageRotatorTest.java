package task.rotateimage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImageRotatorTest {
    private ImageRotator rotator = new ImageRotator();

    @Test
    void rotate90Clockwise() {
        int[][] original = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };

        int[][] rotated = {
            {7, 4, 1},
            {8, 5, 2},
            {9, 6, 3},
        };

        assertArrayEquals(
            rotated,
            rotator.rotate90ClockwiseUsingNSpaceComplexity(original)
        );

        assertArrayEquals(
            rotated,
            rotator.rotate90ClockwiseNoExtraSpace(original)
        );
    }

    @Test
    void rotate90ClockwiseEven() {
        int[][] original = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9,  10, 11, 12},
            {13, 14, 15, 16},
        };

        int[][] rotated = {
            {13, 9,  5, 1},
            {14, 10, 6, 2},
            {15, 11, 7, 3},
            {16, 12, 8, 4},
        };

        assertArrayEquals(
            rotated,
            rotator.rotate90ClockwiseUsingNSpaceComplexity(original)
        );

        assertArrayEquals(
            rotated,
            rotator.rotate90ClockwiseNoExtraSpace(original)
        );
    }
}