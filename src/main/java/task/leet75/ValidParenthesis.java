package task.leet75;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        final char[] asArray = s.toCharArray();

        for (int i = 0; i < asArray.length; i++) {
            final char c = asArray[i];
            if (isOpen(c)) {
                stack.push(c);
            } else {
                if (stack.peek() == null) return false;

                if (canClose(stack.peek(), c)) {
                    stack.pop();
                } else return false;
            }
        }

        return stack.isEmpty();
    }

    private boolean isOpen(Character c) {
        return List.of('(', '[', '{').contains(c);
    }

    private boolean canClose(Character left, Character right) {
        return (left == '(' && right == ')') || (left == '[' && right == ']') || (left == '{' && right == '}');
    }

    public static void main(String[] args) {
        System.out.println(new ValidParenthesis().isValid("()[]{}"));
        System.out.println(new ValidParenthesis().isValid("(({}[]))"));
    }
}
