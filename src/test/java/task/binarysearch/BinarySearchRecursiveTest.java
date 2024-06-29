package task.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchRecursiveTest {
    @Test
    void testRecursiveBinarySearchTemp() {
        BinarySearch search = new BinarySearchRecursive();
        assertEquals(-1, search.find(12, new int[]{1, 3, 5, 7, 9, 11}));
    }

    @Test
    void testRecursiveBinarySearch() {
        BinarySearch search = new BinarySearchRecursive();

//        assertEquals(-1, search.find(3, new int[0]));
//        assertEquals(-1, search.find(3, new int[]{1}));
//        assertEquals(0, search.find(1, new int[]{1}));
//
//        assertEquals(0, search.find(1, new int[]{1, 3, 5}));
//        assertEquals(1, search.find(3, new int[]{1, 3, 5}));
//        assertEquals(2, search.find(5, new int[]{1, 3, 5}));
//        assertEquals(-1, search.find(0, new int[]{1, 3, 5}));
//        assertEquals(-1, search.find(2, new int[]{1, 3, 5}));
//        assertEquals(-1, search.find(4, new int[]{1, 3, 5}));
//        assertEquals(-1, search.find(6, new int[]{1, 3, 5}));
//
//        assertEquals(0, search.find(1, new int[]{1, 3, 5, 7}));
//        assertEquals(1, search.find(3, new int[]{1, 3, 5, 7}));
//        assertEquals(2, search.find(5, new int[]{1, 3, 5, 7}));
//        assertEquals(3, search.find(7, new int[]{1, 3, 5, 7}));
//        assertEquals(-1, search.find(0, new int[]{1, 3, 5, 7}));
//        assertEquals(-1, search.find(2, new int[]{1, 3, 5, 7}));
//        assertEquals(-1, search.find(4, new int[]{1, 3, 5, 7}));
//        assertEquals(-1, search.find(6, new int[]{1, 3, 5, 7}));
//        assertEquals(-1, search.find(8, new int[]{1, 3, 5, 7}));
//
//        assertEquals(0, search.find(1, new int[]{1, 3, 5, 7, 9}));
//        assertEquals(1, search.find(3, new int[]{1, 3, 5, 7, 9}));
//        assertEquals(2, search.find(5, new int[]{1, 3, 5, 7, 9}));
//        assertEquals(3, search.find(7, new int[]{1, 3, 5, 7, 9}));
//        assertEquals(4, search.find(9, new int[]{1, 3, 5, 7, 9}));
//        assertEquals(-1, search.find(0, new int[]{1, 3, 5, 7, 9}));
//        assertEquals(-1, search.find(2, new int[]{1, 3, 5, 7, 9}));
//        assertEquals(-1, search.find(4, new int[]{1, 3, 5, 7, 9}));
//        assertEquals(-1, search.find(6, new int[]{1, 3, 5, 7, 9}));
//        assertEquals(-1, search.find(8, new int[]{1, 3, 5, 7, 9}));
        assertEquals(-1, search.find(10, new int[]{1, 3, 5, 7, 9}));

//        assertEquals(0, search.find(1, new int[]{1, 3, 5, 7, 9, 11}));
//        assertEquals(1, search.find(3, new int[]{1, 3, 5, 7, 9, 11}));
//        assertEquals(2, search.find(5, new int[]{1, 3, 5, 7, 9, 11}));
//        assertEquals(3, search.find(7, new int[]{1, 3, 5, 7, 9, 11}));
//        assertEquals(4, search.find(9, new int[]{1, 3, 5, 7, 9, 11}));
//        assertEquals(5, search.find(10, new int[]{1, 3, 5, 7, 9, 10}));
//        assertEquals(-1, search.find(0, new int[]{1, 3, 5, 7, 9, 11}));
//        assertEquals(-1, search.find(2, new int[]{1, 3, 5, 7, 9, 11}));
//        assertEquals(-1, search.find(4, new int[]{1, 3, 5, 7, 9, 11}));
//        assertEquals(-1, search.find(6, new int[]{1, 3, 5, 7, 9, 11}));
//        assertEquals(-1, search.find(8, new int[]{1, 3, 5, 7, 9, 11}));
//        assertEquals(-1, search.find(10, new int[]{1, 3, 5, 7, 9, 11}));
//        assertEquals(-1, search.find(12, new int[]{1, 3, 5, 7, 9, 11}));
    }

    @Test
    void testIterativeBinarySearch() {
        BinarySearch search = new BinarySearchIterating();

        assertEquals(-1, search.find(3, new int[0]));
        assertEquals(-1, search.find(3, new int[]{1}));
        assertEquals(0, search.find(1, new int[]{1}));

        assertEquals(0, search.find(1, new int[]{1, 3, 5}));
        assertEquals(1, search.find(3, new int[]{1, 3, 5}));
        assertEquals(2, search.find(5, new int[]{1, 3, 5}));
        assertEquals(-1, search.find(0, new int[]{1, 3, 5}));
        assertEquals(-1, search.find(2, new int[]{1, 3, 5}));
        assertEquals(-1, search.find(4, new int[]{1, 3, 5}));
        assertEquals(-1, search.find(6, new int[]{1, 3, 5}));

        assertEquals(0, search.find(1, new int[]{1, 3, 5, 7}));
        assertEquals(1, search.find(3, new int[]{1, 3, 5, 7}));
        assertEquals(2, search.find(5, new int[]{1, 3, 5, 7}));
        assertEquals(3, search.find(7, new int[]{1, 3, 5, 7}));
        assertEquals(-1, search.find(0, new int[]{1, 3, 5, 7}));
        assertEquals(-1, search.find(2, new int[]{1, 3, 5, 7}));
        assertEquals(-1, search.find(4, new int[]{1, 3, 5, 7}));
        assertEquals(-1, search.find(6, new int[]{1, 3, 5, 7}));
        assertEquals(-1, search.find(8, new int[]{1, 3, 5, 7}));

        assertEquals(0, search.find(1, new int[]{1, 3, 5, 7, 9}));
        assertEquals(1, search.find(3, new int[]{1, 3, 5, 7, 9}));
        assertEquals(2, search.find(5, new int[]{1, 3, 5, 7, 9}));
        assertEquals(3, search.find(7, new int[]{1, 3, 5, 7, 9}));
        assertEquals(4, search.find(9, new int[]{1, 3, 5, 7, 9}));
        assertEquals(-1, search.find(0, new int[]{1, 3, 5, 7, 9}));
        assertEquals(-1, search.find(2, new int[]{1, 3, 5, 7, 9}));
        assertEquals(-1, search.find(4, new int[]{1, 3, 5, 7, 9}));
        assertEquals(-1, search.find(6, new int[]{1, 3, 5, 7, 9}));
        assertEquals(-1, search.find(8, new int[]{1, 3, 5, 7, 9}));
        assertEquals(-1, search.find(10, new int[]{1, 3, 5, 7, 9}));

        assertEquals(0, search.find(1, new int[]{1, 3, 5, 7, 9, 11}));
        assertEquals(1, search.find(3, new int[]{1, 3, 5, 7, 9, 11}));
        assertEquals(2, search.find(5, new int[]{1, 3, 5, 7, 9, 11}));
        assertEquals(3, search.find(7, new int[]{1, 3, 5, 7, 9, 11}));
        assertEquals(4, search.find(9, new int[]{1, 3, 5, 7, 9, 11}));
        assertEquals(5, search.find(10, new int[]{1, 3, 5, 7, 9, 10}));
        assertEquals(-1, search.find(0, new int[]{1, 3, 5, 7, 9, 11}));
        assertEquals(-1, search.find(2, new int[]{1, 3, 5, 7, 9, 11}));
        assertEquals(-1, search.find(4, new int[]{1, 3, 5, 7, 9, 11}));
        assertEquals(-1, search.find(6, new int[]{1, 3, 5, 7, 9, 11}));
        assertEquals(-1, search.find(8, new int[]{1, 3, 5, 7, 9, 11}));
        assertEquals(-1, search.find(10, new int[]{1, 3, 5, 7, 9, 11}));
        assertEquals(-1, search.find(12, new int[]{1, 3, 5, 7, 9, 11}));
    }
}