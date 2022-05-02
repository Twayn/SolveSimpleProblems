package task.correctcapitals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CorrectCapitalsDetectorTest {
    CorrectCapitalsDetector detector = new CorrectCapitalsDetector();

    @Test
    public void testZeroLength(){
        assertTrue(detector.isCorrectCapitals(""));
    }

    @Test
    public void testSingleCharLength(){
        assertTrue(detector.isCorrectCapitals("a"));
        assertTrue(detector.isCorrectCapitals("A"));
    }

    @Test
    public void testCorrect(){
        assertTrue(detector.isCorrectCapitals("Abc"));
        assertTrue(detector.isCorrectCapitals("abc"));
        assertTrue(detector.isCorrectCapitals("ABC"));
    }

    @Test
    public void testIncorrect(){
        assertFalse(detector.isCorrectCapitals("aBC"));
        assertFalse(detector.isCorrectCapitals("abC"));
        assertFalse(detector.isCorrectCapitals("ABc"));
        assertFalse(detector.isCorrectCapitals("AbC"));
    }

}