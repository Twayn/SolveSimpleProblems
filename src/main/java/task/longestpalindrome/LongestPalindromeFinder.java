package task.longestpalindrome;

public class LongestPalindromeFinder {

    String longestPalindrome(final String input) {
        return new PalindromeHelper().longestPalindrome(input.toLowerCase());
    }


    boolean isPalindrome(final String input) {
        final String lower = input.toLowerCase();
        return reverse(lower)
            .equals(lower);
    }

    private String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }


    private static class PalindromeHelper {

        int resultStart;
        int resultLength;

        public String longestPalindrome(String s) {
            int strLength = s.length();
            if (strLength < 2) {
                return s;
            }
            for (int start = 0; start < strLength - 1; start++) {
                expandRange(s, start, start);
                expandRange(s, start, start + 1);
            }
            return s.substring(resultStart, resultStart + resultLength);
        }

        private void expandRange(String str, int begin, int end) {
            while (begin >= 0 && end < str.length() &&
                str.charAt(begin) == str.charAt(end)) {
                begin--;
                end++;
            }
            if (resultLength < end - begin - 1) {
                resultStart = begin + 1;
                resultLength = end - begin - 1;
            }
        }
    }
}
