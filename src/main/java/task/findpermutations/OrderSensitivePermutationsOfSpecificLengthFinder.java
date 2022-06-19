package task.findpermutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderSensitivePermutationsOfSpecificLengthFinder {

    List<char[]> findPermutations(char[] chars, int size) {
        List<char[]> permutations = new ArrayList<>();

        findRecursive(chars, 0, new char[size], 0, size, permutations);

        return permutations;
    }

    private void findRecursive(char[] chars, int initialPosition, char[] buffer, int counter, int size, List<char[]> permutations) {
        if (counter == size) {
            permutations.add(buffer);
            return;
        }

        for (int i = initialPosition; i < chars.length; i++) {
            final char[] currentBuffer = Arrays.copyOf(buffer, buffer.length);
            currentBuffer[counter] = chars[i];

            findRecursive(chars, i + 1, currentBuffer, counter + 1, size, permutations);
        }
    }
}