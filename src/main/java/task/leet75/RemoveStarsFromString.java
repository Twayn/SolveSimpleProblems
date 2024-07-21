package task.leet75;

import java.util.ArrayDeque;

public class RemoveStarsFromString {
    public String removeStars(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c != '*') {
                stack.push(c);
            } else {
                stack.pop();
            }
        }

        StringBuilder builder = new StringBuilder();

        for (Character c : stack) {
            builder.append(c);
        }

        return builder.reverse().toString();
    }
}
