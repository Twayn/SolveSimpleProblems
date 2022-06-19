package task.findpermutations;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PermutationsOfSpecificLengthFinderTest {
    PermutationsOfSpecificLengthFinder finder = new PermutationsOfSpecificLengthFinder();

    @Test
    void findPermutations() {
        final List<char[]> actual = finder.findPermutations(new char[]{'a', 'b', 'c'}, 2);

        final List<char[]> expected = List.of(
            new char[]{'a', 'b'},
            new char[]{'a', 'c'},
            new char[]{'b', 'a'},
            new char[]{'b', 'c'},
            new char[]{'c', 'a'},
            new char[]{'c', 'b'}

        );

        assertEquals(expected.size(), actual.size());

        for (int i = 0; i < expected.size(); i++) {
            assertArrayEquals(expected.get(i), actual.get(i));
        }
    }

    @Test
    void findPermutations2() {
        final List<char[]> actual = finder.findPermutations(new char[]{'a', 'b', 'c', 'd'}, 2);

        final List<char[]> expected = List.of(
            new char[]{'a', 'b'},
            new char[]{'a', 'c'},
            new char[]{'a', 'd'},
            new char[]{'b', 'a'},
            new char[]{'b', 'c'},
            new char[]{'b', 'd'},
            new char[]{'c', 'a'},
            new char[]{'c', 'b'},
            new char[]{'c', 'd'},
            new char[]{'d', 'a'},
            new char[]{'d', 'b'},
            new char[]{'d', 'c'}
        );

        assertEquals(expected.size(), actual.size());

        for (int i = 0; i < expected.size(); i++) {
            assertArrayEquals(expected.get(i), actual.get(i));
        }
    }

    @Test
    void findPermutations3() {
        final List<char[]> actual = finder.findPermutations(new char[]{'a', 'b', 'c', 'd'}, 3);

        final List<char[]> expected = List.of(
            new char[]{'a', 'b', 'c'},
            new char[]{'a', 'b', 'd'},
            new char[]{'a', 'c', 'b'},
            new char[]{'a', 'c', 'd'},
            new char[]{'a', 'd', 'b'},
            new char[]{'a', 'd', 'c'},
            new char[]{'b', 'a', 'c'},
            new char[]{'b', 'a', 'd'},
            new char[]{'b', 'c', 'a'},
            new char[]{'b', 'c', 'd'},
            new char[]{'b', 'd', 'a'},
            new char[]{'b', 'd', 'c'},
            new char[]{'c', 'a', 'b'},
            new char[]{'c', 'a', 'd'},
            new char[]{'c', 'b', 'a'},
            new char[]{'c', 'b', 'd'},
            new char[]{'c', 'd', 'a'},
            new char[]{'c', 'd', 'b'},
            new char[]{'d', 'a', 'b'},
            new char[]{'d', 'a', 'c'},
            new char[]{'d', 'b', 'a'},
            new char[]{'d', 'b', 'c'},
            new char[]{'d', 'c', 'a'},
            new char[]{'d', 'c', 'b'}
        );

        assertEquals(expected.size(), actual.size());

        for (int i = 0; i < expected.size(); i++) {
            assertArrayEquals(expected.get(i), actual.get(i));
        }
    }
}