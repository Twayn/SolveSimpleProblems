package task.longestpalindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromeFinderTest {
    LongestPalindromeFinder finder = new LongestPalindromeFinder();

    @Test
    void isPalindrome() {
        assertTrue(finder.isPalindrome("aaffaa"));
        assertTrue(finder.isPalindrome("Able was I ere I saw Elba"));
        assertFalse(finder.isPalindrome("Some not-palindrome"));
    }

    @Test
    void longestPalindrome() {
        final String s = finder.longestPalindrome("some Able was I ere I saw Elba letters");

        System.out.println(s);
    }
}