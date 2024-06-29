package task.reversevowels;

import java.util.List;

public class ReverseVowels {
    public String reverseVowels(String s) {
        char[] result = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (!isVowel(s.charAt(i))){
                result[i] = s.charAt(i);
            }
        }

        int position = s.length() - 1;

        for (int i = 0; i < s.length(); i++) {
            if(isVowel(s.charAt(i))) {
                position = setNextVowelFromPosition(position, s.charAt(i), result);
            }
        }


        return new String(result);
    }

    static int setNextVowelFromPosition(int position, char vowel, char[] result) {
        for (int i = position; i >= 0; i--) {
            if (result[i] == 0) {
                result[i] = vowel;
                return i;
            }
        }
        return 0;
    }

    private static boolean isVowel(char c) {
        return List.of('a', 'e', 'i', 'o', 'u').contains(Character.toLowerCase(c));
    }

    public static void main(String[] args) {
        System.out.println(new ReverseVowels().reverseVowels("aA"));
    }
}
