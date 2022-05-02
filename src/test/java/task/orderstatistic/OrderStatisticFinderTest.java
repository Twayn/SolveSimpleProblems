package task.orderstatistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderStatisticFinderTest {
    OrderStatisticFinder finder = new OrderStatisticFinder();

    @Test
    public void shouldFindFirstOrderStatistic(){
        int[] input = {99, 13, 24, 78, 95, 11, 65};
        final int result = finder.firstOrderStatistic(input);

        assertEquals(11, result);
    }

    @Test
    public void shouldFindSecondOrderStatistic(){
        int[] input = {99, 13, 24, 78, 95, 11, 65, 12};
        final int result = finder.secondOrderStatistic(input);

        assertEquals(12, result);
    }
}