package task.duplicatefinder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateFinderTest {
    DuplicateFinder finder = new DuplicateFinder();

    @Test
    void containsDuplicate() {
        assertTrue(finder.containsDuplicate(new int[]{1, 4, 66, 33, 18, 66, 2}));
        assertFalse(finder.containsDuplicate(new int[]{1, 4, 66, 33, 18, 67, 2}));
    }
}