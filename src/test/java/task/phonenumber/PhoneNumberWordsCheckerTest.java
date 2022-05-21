package task.phonenumber;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PhoneNumberWordsCheckerTest {
    private final PhoneNumberWordsChecker checker = new PhoneNumberWordsChecker();

    @Test
    void check() {
        var input = List.of("foo", "bar", "baz", "foobar", "emo", "cap", "car", "cat");
        var expected = List.of("bar", "cap", "car", "emo", "foo", "foobar");

        assertThat(expected).hasSameElementsAs(checker.check("3662277", input));
    }
}