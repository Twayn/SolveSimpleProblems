package task.leet75;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombination {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {return List.of();}

        final Map<Character, List<Character>> map = Map.of(
            '2', List.of('a', 'b', 'c'),
            '3', List.of('d', 'e', 'f'),
            '4', List.of('g', 'h', 'i'),
            '5', List.of('j', 'k', 'l'),
            '6', List.of('m', 'n', 'o'),
            '7', List.of('p', 'q', 'r', 's'),
            '8', List.of('t', 'u', 'v'),
            '9', List.of('w', 'x', 'y', 'z')
        );

        List<List<Character>> allLists = new ArrayList<>();

        for (int i = 0; i < digits.length(); i++) {
            allLists.add(map.get(digits.charAt(i)));
        }

        List<String> result = new ArrayList<>();

        recursive(result, allLists, "", digits.length());

        return result;
    }

    private void recursive(List<String> result, List<List<Character>> allLists, String current, int length) {
        if (current.length() == length) {
            result.add(current);
            return;
        }

        final List<Character> button = allLists.get(0);

        final List<List<Character>> exceptCurrent = new ArrayList<>(allLists);
        exceptCurrent.remove(0);

        for (Character character : button) {
            recursive(result, exceptCurrent, current + character, length);
        }
    }

    public static void main(String[] args) {
        System.out.println(new LetterCombination().letterCombinations("23"));
    }
}
