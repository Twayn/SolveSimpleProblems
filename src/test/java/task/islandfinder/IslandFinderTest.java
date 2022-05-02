package task.islandfinder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IslandFinderTest {
    private final int[][] zeroIslands = {
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
    };

    private final int[][] oneIsland = {
        {1, 1, 1, 1, 0},
        {1, 1, 0, 1, 0},
        {1, 1, 0, 0, 0},
        {0, 0, 0, 0, 0},
    };

    private final int[][] twoIslands = {
        {1, 1, 0, 0, 0},
        {1, 1, 0, 0, 0},
        {0, 0, 1, 1, 0},
        {0, 0, 0, 1, 1},
    };

    private final int[][] threeIslands = {
        {1, 1, 0, 0, 0},
        {1, 1, 0, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 0, 1, 1},
    };

    @Test
    void countIslands() {
        assertEquals(0, new IslandFinder(zeroIslands).countIslands());
        assertEquals(1, new IslandFinder(oneIsland).countIslands());
        assertEquals(2, new IslandFinder(twoIslands).countIslands());
        assertEquals(3, new IslandFinder(threeIslands).countIslands());
    }
}