package task.findpermutations;

import java.util.ArrayList;
import java.util.List;

public class PermutationsFinder {
    List<char[]> findPermutations(char[] chars) {
        return findPermutations(chars, chars.length);
    }

    List<char[]> findPermutations(char[] chars, int size) {
        //TODO do not use new arrays
        if (size == 1) {
            return tryEveryElement(chars);
        }

        List<char[]> permutations = new ArrayList<>();

        for (int i = 0; i < chars.length; i++) {
            final char[] withoutCurrentElement = deleteFromArrayByIndex(i, chars);

            final List<char[]> subPermutations = findPermutations(withoutCurrentElement, size - 1);

            for (char[] subPermutation : subPermutations) {
                permutations.add(insertInTheBeginningOfArray(chars[i], subPermutation));
            }
        }

        return permutations;
    }

    private List<char[]> tryEveryElement(char[] chars) {
        List<char[]> result = new ArrayList<>();

        for (char aChar : chars) {
            result.add(new char[]{aChar});
        }

        return result;
    }

    private static char[] insertInTheBeginningOfArray(char toInsert, char[] array) {
        char[] withInsertion = new char[array.length + 1];
        withInsertion[0] = toInsert;

        System.arraycopy(array, 0, withInsertion, 1, array.length);

        return withInsertion;
    }

    private static char[] deleteFromArrayByIndex(int index, char[] array) {
        char[] withDeleted = new char[array.length - 1];

        System.arraycopy(array, 0, withDeleted, 0, index);
        System.arraycopy(array, index + 1, withDeleted, index, array.length - index - 1);

        return withDeleted;
    }
}

