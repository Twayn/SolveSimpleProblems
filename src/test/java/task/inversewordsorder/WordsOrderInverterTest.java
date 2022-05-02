package task.inversewordsorder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class WordsOrderInverterTest {
    WordsOrderInverter inverter = new WordsOrderInverter();

    @Test
    void testWordsInvertItThreeSpaces() {
        char [] input = {'b', 'e', ' ', ' ', ' ', 'f', 'r', 'e', 'e'};
        char [] expected = {'f', 'r', 'e', 'e', ' ', ' ', ' ', 'b', 'e'};

        final char[] inverted = inverter.invertWords(input);

        assertArrayEquals(expected, inverted);
    }

    @Test
    void testWordsInvertItTwoSpaces() {
        char [] input = {'b', 'e', ' ', ' ', 'f', 'r', 'e', 'e'};
        char [] expected = {'f', 'r', 'e', 'e', ' ', ' ', 'b', 'e'};

        final char[] inverted = inverter.invertWords(input);

        assertArrayEquals(expected, inverted);
    }

    @Test
    void testWordsInvert() {
        char [] input = {'b', 'e', ' ', 'f', 'r', 'e', 'e'};
        char [] expected = {'f', 'r', 'e', 'e', ' ', 'b', 'e'};

        final char[] inverted = inverter.invertWords(input);

        assertArrayEquals(expected, inverted);
    }

    @Test
    void testLettersInvertInOddLengthArray() {
        char [] input = {'a', 'b', 'c', 'd', 'e'};
        char [] expected = {'e', 'd', 'c', 'b', 'a'};

        final char[] inverted = inverter.invertElements(input);

        assertArrayEquals(expected, inverted);
    }

    @Test
    void testLettersInvertInEvenLengthArray() {
        char [] input = {'a', 'b', 'c', 'd'};
        char [] expected = {'d', 'c', 'b', 'a'};

        final char[] inverted = inverter.invertElements(input);

        assertArrayEquals(expected, inverted);
    }

    @Test
    void testLettersInvertTwoElementArray() {
        char [] input = {'a', 'b'};
        char [] expected = {'b', 'a'};

        final char[] inverted = inverter.invertElements(input);

        assertArrayEquals(expected, inverted);
    }

    @Test
    void testLettersInvertOneElementArray() {
        char [] input = {'a'};
        char [] expected = {'a'};

        final char[] inverted = inverter.invertElements(input);

        assertArrayEquals(expected, inverted);
    }
}