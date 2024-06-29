package task.productofarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfFinderTest {

    @Test
    void productOfArrayExceptSelf() {
        int[] input = {1, 2, 3, 4};

        int[] output = new ProductOfArrayExceptSelfFinder().productOfArrayExceptSelf(input);

        assertArrayEquals(
            new int[]{24, 12, 8, 6}, //2*3*4, 1*3*4, 1*2*4, 1*2*3 (element on current index is a product of all array except element on current index)
            output
        );
    }

    @Test
    void productOfArrayExceptSelfWithNegative() {
        int[] input = {-1, 2, -3, 4};

        int[] output = new ProductOfArrayExceptSelfFinder().productOfArrayExceptSelf(input);

        assertArrayEquals(
            new int[]{-24, 12, -8, 6},
            output
        );
    }

    @Test
    void productOfArrayExceptSelf2() {
        int[] input = {1, 2, 3, 4};

        int[] output = new ProductOfArrayExceptSelfFinder().productOfArrayExceptSelf2(input);

        assertArrayEquals(
            new int[]{24, 12, 8, 6}, //2*3*4, 1*3*4, 1*2*4, 1*2*3 (element on current index is a product of all array except element on current index)
            output
        );
    }

    @Test
    void productOfArrayExceptSelfWithNegative2() {
        int[] input = {-1, 2, -3, 4};

        int[] output = new ProductOfArrayExceptSelfFinder().productOfArrayExceptSelf2(input);

        assertArrayEquals(
            new int[]{-24, 12, -8, 6},
            output
        );
    }
}