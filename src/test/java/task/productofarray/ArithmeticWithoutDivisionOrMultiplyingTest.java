package task.productofarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static task.productofarray.ArithmeticWithoutDivisionOrMultiplying.multiplyUsingAdd;
import static task.productofarray.ArithmeticWithoutDivisionOrMultiplying.divideUsingSubtraction;

class ArithmeticWithoutDivisionOrMultiplyingTest {

    @Test
    void multiplyUsingAddTest() {
        assertEquals(40, multiplyUsingAdd(4, 10));
        assertEquals(1, multiplyUsingAdd(1, 1));
        assertEquals(42, multiplyUsingAdd(6, 7));

        assertEquals(-42, multiplyUsingAdd(-6, 7));
        assertEquals(-42, multiplyUsingAdd(6, -7));
        assertEquals(42, multiplyUsingAdd(-6, -7));
    }

    @Test
    void divideUsingSubtractionTest() {
        assertEquals(5, divideUsingSubtraction(30, 6));
        assertEquals(1, divideUsingSubtraction(1, 1));
        assertEquals(6, divideUsingSubtraction(6, 1));
        assertEquals(6, divideUsingSubtraction(42, 7));

        assertEquals(-6, divideUsingSubtraction(42, -7));
        assertEquals(-6, divideUsingSubtraction(-42, 7));
        assertEquals(6, divideUsingSubtraction(-42, -7));
    }
}