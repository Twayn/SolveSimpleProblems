package task.reverseinteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerReverserTest {
    IntegerReverser reverser = new IntegerReverser();

    @Test
    void reverse() {
        assertEquals(54321, reverser.reverse(12345));
    }

    @Test
    void reverseZero() {
        assertEquals(0, reverser.reverse(0));
    }
}