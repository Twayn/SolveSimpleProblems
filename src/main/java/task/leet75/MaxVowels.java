package task.leet75;

public class MaxVowels {
    public int maxVowels(String s, int k) {
        if (s.length() <= k) {
            return (int) s.chars().mapToObj(i -> (char) i).filter(MaxVowels::isVowel).count();
        }

        final char[] charArray = s.toCharArray();

        int currentVowelsNum = (int) s.chars().limit(k).mapToObj(i -> (char) i).filter(MaxVowels::isVowel).count();
        int maxVowelsNum = currentVowelsNum;

        for (int i = k; i < charArray.length; i++) {
            boolean subtractFromLeft = isVowel(charArray[i - k]);
            boolean addFromRight = isVowel(charArray[i]);
            int res = 0;
            if (subtractFromLeft) {
                res -= 1;
            }
            if (addFromRight) {
                res += 1;
            }
            currentVowelsNum = currentVowelsNum + res;

            maxVowelsNum = Math.max(maxVowelsNum, currentVowelsNum);
        }

        return maxVowelsNum;
    }

    private static boolean isVowel(char ch) {
        return ch == 97 || ch == 101 || ch == 105 || ch == 111 || ch == 117;
    }

    public static void main(String[] args) {
        System.out.println("aeiou".chars().peek(System.out::println).max());
    }
}
