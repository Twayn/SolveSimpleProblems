package task.pascaltriangle;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalTriangleGeneratorTest {
    PascalTriangleGenerator generator = new PascalTriangleGenerator();

    @Test
    void generate() {
        final List<List<Integer>> result = generator.generate(5);

        assertEquals(List.of(
            List.of(1),
            List.of(1, 1),
            List.of(1, 2, 1),
            List.of(1, 3, 3, 1),
            List.of(1, 4, 6, 4, 1)
        ), result);
    }

    @Test
    void generate2() {
        final List<List<Integer>> result = generator.generate(4);

        assertEquals(List.of(
            List.of(1),
            List.of(1, 1),
            List.of(1, 2, 1),
            List.of(1, 3, 3, 1)
        ), result);
    }
}