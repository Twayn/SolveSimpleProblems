package task.findpermutations;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderSensitivePermutationsOfSpecificLengthFinderTest {
    OrderSensitivePermutationsOfSpecificLengthFinder finder = new OrderSensitivePermutationsOfSpecificLengthFinder();

    @Test
    void findPermutations0() {
        final List<char[]> actual = finder.findPermutations(new char[]{'a', 'b', 'c'}, 1);

        final List<char[]> expected = List.of(
            new char[]{'a'},
            new char[]{'b'},
            new char[]{'c'}
        );

        assertEquals(expected.size(), actual.size());

        for (int i = 0; i < expected.size(); i++) {
            assertArrayEquals(expected.get(i), actual.get(i));
        }
    }

    @Test
    void findPermutations() {
        final List<char[]> actual = finder.findPermutations(new char[]{'a', 'b', 'c'}, 2);

        for (char[] chars : actual) {
            System.out.println(Arrays.toString(chars));
        }

        final List<char[]> expected = List.of(
            new char[]{'a', 'b'},
            new char[]{'a', 'c'},
            new char[]{'b', 'c'}
        );

        assertEquals(expected.size(), actual.size());

        for (int i = 0; i < expected.size(); i++) {
            assertArrayEquals(expected.get(i), actual.get(i));
        }
    }

    @Test
    void findPermutations1() {
        final List<char[]> actual = finder.findPermutations(new char[]{'a', 'b', 'c', 'd'}, 2);

        final List<char[]> expected = List.of(
            new char[]{'a', 'b'},
            new char[]{'a', 'c'},
            new char[]{'a', 'd'},
            new char[]{'b', 'c'},
            new char[]{'b', 'd'},
            new char[]{'c', 'd'}
        );

        assertEquals(expected.size(), actual.size());

        for (int i = 0; i < expected.size(); i++) {
            assertArrayEquals(expected.get(i), actual.get(i));
        }
    }

    @Test
    void findPermutations2() {
        final List<char[]> actual = finder.findPermutations(new char[]{'a', 'b', 'c', 'd', 'e'}, 2);

        final List<char[]> expected = List.of(
            new char[]{'a', 'b'},
            new char[]{'a', 'c'},
            new char[]{'a', 'd'},
            new char[]{'a', 'e'},

            new char[]{'b', 'c'},
            new char[]{'b', 'd'},
            new char[]{'b', 'e'},

            new char[]{'c', 'd'},
            new char[]{'c', 'e'},

            new char[]{'d', 'e'}
        );

        assertEquals(expected.size(), actual.size());

        for (int i = 0; i < expected.size(); i++) {
            assertArrayEquals(expected.get(i), actual.get(i));
        }
    }

    @Test
    void findPermutations3() {
        final List<char[]> actual = finder.findPermutations(new char[]{'a', 'b', 'c', 'd', 'e'}, 3);

        for (char[] chars : actual) {
            System.out.println(Arrays.toString(chars));
        }

        final List<char[]> expected = List.of(
            new char[]{'a', 'b', 'c'},
            new char[]{'a', 'b', 'd'},
            new char[]{'a', 'b', 'e'},
            new char[]{'a', 'c', 'd'},
            new char[]{'a', 'c', 'e'},
            new char[]{'a', 'd', 'e'},
            new char[]{'b', 'c', 'd'},
            new char[]{'b', 'c', 'e'},
            new char[]{'b', 'd', 'e'},
            new char[]{'c', 'd', 'e'}
        );

        assertEquals(expected.size(), actual.size());

        for (int i = 0; i < expected.size(); i++) {
            assertArrayEquals(expected.get(i), actual.get(i));
        }
    }

    @Test
    void findPermutations4() {
        final List<char[]> actual = finder.findPermutations(new char[]{'a', 'b', 'c', 'd', 'e', 'f'}, 4);

        for (char[] chars : actual) {
            System.out.println(Arrays.toString(chars));
        }

        final List<char[]> expected = List.of(
            new char[]{'a', 'b', 'c', 'd'},
            new char[]{'a', 'b', 'c', 'e'},
            new char[]{'a', 'b', 'c', 'f'},
            new char[]{'a', 'b', 'd', 'e'},
            new char[]{'a', 'b', 'd', 'f'},
            new char[]{'a', 'b', 'e', 'f'},
            new char[]{'a', 'c', 'd', 'e'},
            new char[]{'a', 'c', 'd', 'f'},
            new char[]{'a', 'c', 'e', 'f'},
            new char[]{'a', 'd', 'e', 'f'},
            new char[]{'b', 'c', 'd', 'e'},
            new char[]{'b', 'c', 'd', 'f'},
            new char[]{'b', 'c', 'e', 'f'},
            new char[]{'b', 'd', 'e', 'f'},
            new char[]{'c', 'd', 'e', 'f'}
        );

        assertEquals(expected.size(), actual.size());

        for (int i = 0; i < expected.size(); i++) {
            assertArrayEquals(expected.get(i), actual.get(i));
        }
    }
}