package task.inversewordsorder;

public class WordsOrderInverter {
    public char[] invertWords(char[] input) {
        char[] inverted = invertElements(input);

        int wordFirstLetterIndex = 0;
        int wordLastLetterIndex;

        boolean searchingForFirstLetter = true;
        for (int i = 0; i < inverted.length; i++) {
            if (searchingForFirstLetter && inverted[i] != ' ') {
                wordFirstLetterIndex = i;
                searchingForFirstLetter = false;
            } else if (!searchingForFirstLetter && (inverted[i] == ' ' || i == input.length - 1)) {
                if (i == input.length - 1) {
                    wordLastLetterIndex = i;
                } else {
                    wordLastLetterIndex = i - 1;
                }

                invertElements(input, wordFirstLetterIndex, wordLastLetterIndex);
                searchingForFirstLetter = true;
            }
        }

        return input;
    }

    private char[] invertElements(char[] input, int from, int to) {
        int range = (to - from) + 1;
        int numberOfSwaps = range / 2;

        for (int i = 0; i < numberOfSwaps; i++) {
            swap(input, from + i, to - i);
        }

        return input;
    }

    public char[] invertElements(char[] input) {
        return invertElements(input, 0, input.length - 1);
    }

    private void swap(char[] input, int i1, int i2) {
        final char temp = input[i1];

        input[i1] = input[i2];
        input[i2] = temp;
    }
}
