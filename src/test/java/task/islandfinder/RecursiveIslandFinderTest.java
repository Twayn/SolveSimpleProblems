package task.islandfinder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveIslandFinderTest {
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
        assertEquals(0, new RecursiveIslandFinder(zeroIslands).countIslands());
        assertEquals(1, new RecursiveIslandFinder(oneIsland).countIslands());
        assertEquals(2, new RecursiveIslandFinder(twoIslands).countIslands());
        assertEquals(3, new RecursiveIslandFinder(threeIslands).countIslands());
    }
}