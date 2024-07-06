package task.reversewords;

import java.util.Arrays;
import java.util.List;

public class ReverseWords {
    public String reverseWords(String s) {
        final List<String> words = Arrays.stream(s.trim().split("\\s+")).toList();

        StringBuilder result = new StringBuilder();

        for (int i = words.size() - 1; i >= 0; i--) {
            result.append(words.get(i));
            if (i != 0) result.append(" ");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new ReverseWords().reverseWords("  hello world  "));
    }
}
