package task.mergestrings;

import java.util.stream.Collectors;

public class StringMerger {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder stringBuilder = new StringBuilder();

        int lastPosition = 0;

        for (int i = 0; i < word1.length() && i < word2.length(); i++) {
            stringBuilder.append(word1.charAt(i));
            stringBuilder.append(word2.charAt(i));
            lastPosition = i;
        }

        String longerWord = word1.length() > word2.length() ? word1 : word2;

        for (int i = lastPosition + 1; i < longerWord.length(); i++) {
            stringBuilder.append(longerWord.charAt(i));
        }

        return stringBuilder.toString();
    }
}
