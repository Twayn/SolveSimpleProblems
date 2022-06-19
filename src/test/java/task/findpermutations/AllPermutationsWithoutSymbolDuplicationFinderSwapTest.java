package task.findpermutations;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AllPermutationsWithoutSymbolDuplicationFinderSwapTest {
    AllPermutationsWithoutSymbolDuplicationSwapFinder finder = new AllPermutationsWithoutSymbolDuplicationSwapFinder();

    @Test
    void findPermutations() {
        final List<char[]> actual = finder.findAllPermutations(new char[]{'a', 'b', 'c'});

        final List<char[]> expected = List.of(
            new char[]{'a', 'b', 'c'},
            new char[]{'a', 'c', 'b'},
            new char[]{'b', 'a', 'c'},
            new char[]{'b', 'c', 'a'},
            new char[]{'c', 'a', 'b'},
            new char[]{'c', 'b', 'a'}
        );

        assertEquals(expected.size(), actual.size());

        for (int i = 0; i < expected.size(); i++) {
            assertArrayEquals(expected.get(i), actual.get(i));
        }
    }

    @Test
    void findPermutationsForDouble() {
        final List<char[]> actual = finder.findAllPermutations(new char[]{'a', 'b'});

        final List<char[]> expected = List.of(
            new char[]{'a', 'b'},
            new char[]{'b', 'a'}
        );

        assertEquals(expected.size(), actual.size());

        for (int i = 0; i < expected.size(); i++) {
            assertArrayEquals(expected.get(i), actual.get(i));
        }
    }

    @Test
    void findPermutationsForSingle() {
        final List<char[]> actual = finder.findAllPermutations(new char[]{'a'});

        final List<char[]> expected = List.of(
            new char[]{'a'}
        );

        assertEquals(expected.size(), actual.size());

        for (int i = 0; i < expected.size(); i++) {
            assertArrayEquals(expected.get(i), actual.get(i));
        }
    }
}