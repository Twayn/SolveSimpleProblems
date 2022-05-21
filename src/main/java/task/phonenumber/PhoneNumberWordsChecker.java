package task.phonenumber;

import java.util.List;
import java.util.Map;

/*
-------------------------
|       |  ABC  |  DEF  |
|   1   |   2   |   3   |
-------------------------
|  GHI  |  JKL  |  MNO  |
|   4   |   5   |   6   |
-------------------------
| PQRS  |  TUV  | WXYZ  |
|   7   |   8   |   9   |
-------------------------
|       |       |       |
|   *   |   0   |   #   |
-------------------------

Check if input strings is a parts of phone number according to this keypad
 */
public class PhoneNumberWordsChecker {

    private static final Map<Character, String> letterToDigit = Map.ofEntries(
        Map.entry('a', "2"),
        Map.entry('b', "2"),
        Map.entry('c', "2"),

        Map.entry('d', "3"),
        Map.entry('e', "3"),
        Map.entry('f', "3"),

        Map.entry('g', "4"),
        Map.entry('h', "4"),
        Map.entry('i', "4"),

        Map.entry('j', "5"),
        Map.entry('k', "5"),
        Map.entry('l', "5"),

        Map.entry('m', "6"),
        Map.entry('n', "6"),
        Map.entry('o', "6"),

        Map.entry('p', "7"),
        Map.entry('q', "7"),
        Map.entry('r', "7"),
        Map.entry('s', "7"),

        Map.entry('t', "8"),
        Map.entry('u', "8"),
        Map.entry('v', "8"),

        Map.entry('w', "9"),
        Map.entry('x', "9"),
        Map.entry('y', "9"),
        Map.entry('z', "9")
    );


    List<String> check(String phoneNumber, List<String> candidateWords) {
        return candidateWords.stream()
            .filter(candidateWord -> phoneNumber.contains(toPhoneNumber(candidateWord)))
            .toList();
    }

    private String toPhoneNumber(String word) {
        StringBuilder mapped = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            mapped.append(letterToDigit.get(word.charAt(i)));
        }

        return mapped.toString();
    }
}
