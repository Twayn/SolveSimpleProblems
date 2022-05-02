package task.firstduplicate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstDuplicateFinderTest {
    FirstDuplicateFinder finder = new FirstDuplicateFinder();

    @Test
    void firstDuplicate() {
        assertEquals(1, finder.firstDuplicate(new int[]{1, 2, 1, 2, 3, 3}));
        assertEquals(3, finder.firstDuplicate(new int[]{2, 1, 3, 5, 3, 2}));
        assertEquals(-1, finder.firstDuplicate(new int[]{1, 2, 3, 4, 5, 6}));
    }
}