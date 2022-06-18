package task.findpermutations;

import java.util.ArrayList;
import java.util.List;

public class PermutationsFinder {
    List<char[]> findAllPermutations(char[] chars) {
        if (chars.length == 1) {
            return List.of(chars);
        }

        List<char[]> permutations = new ArrayList<>();

        for (int i = 0; i < chars.length; i++) {
            final List<char[]> subPermutations =
                findAllPermutations(deleteFromArrayByIndex(i, chars));

            for (char[] subPermutation : subPermutations) {
                permutations.add(insertInTheBeginningOfArray(chars[i], subPermutation));
            }
        }

        return permutations;
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

