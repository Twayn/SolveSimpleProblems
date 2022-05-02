package task.correctcapitals;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

public class CorrectCapitalsDetector {
    boolean isCorrectCapitals(String input) {
        if (input.length() < 2) return true;

        if (isUpperCase(input.charAt(0)) && isUpperCase(input.charAt(1))) {
            for (int i = 1; i < input.length(); i++) {
                if (isLowerCase(input.charAt(i))) return false;
            }
        } else {
            for (int i = 1; i < input.length(); i++) {
                if (isUpperCase(input.charAt(i))) return false;
            }
        }

        return true;
    }
}
