package task.vectorsimilarity;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VectorSimilarityFinderTest {

    VectorSimilarityFinder finder = new VectorSimilarityFinder();

    @Test
    void calculateSimilarity() {
        final double similarity = finder.calculateSimilarity(
            List.of(2, 4, 6),
            List.of(1.0d, 2.0d, 1.0d),
            List.of(1, 4, 5),
            List.of(1.0d, 2.0d, 1.0d)
        );

        assertEquals(
            new BigDecimal("0.6667"),
            new BigDecimal(similarity).setScale(4, RoundingMode.HALF_UP)
        );
    }
}