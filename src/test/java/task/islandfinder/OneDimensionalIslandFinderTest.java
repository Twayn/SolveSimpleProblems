package task.islandfinder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneDimensionalIslandFinderTest {
    OneDimensionalIslandFinder finder = new OneDimensionalIslandFinder();

    private final int[] zeroIslands = {
        0, 0, 0, 0, 0,
    };

    private final int[] oneIsland = {
        1, 1, 1, 1, 0,
    };

    private final int[] twoIslands = {
        1, 1, 0, 1, 0
    };

    private final int[] threeIslands = {
        1, 0, 1, 0, 1,
    };

    @Test
    void countIslands() {
        assertEquals(0, finder.countIslands(zeroIslands));
        assertEquals(1, finder.countIslands(oneIsland));
        assertEquals(2, finder.countIslands(twoIslands));
        assertEquals(3, finder.countIslands(threeIslands));
    }
}