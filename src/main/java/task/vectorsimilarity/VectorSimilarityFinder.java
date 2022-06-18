package task.vectorsimilarity;

import java.util.List;

public class VectorSimilarityFinder {
    double calculateSimilarity(List<Integer> a_indexes, List<Double> a_values, List<Integer> b_indexes, List<Double> b_values) {
        var magnitudeOfFirst = magnitude(a_values);
        var magnitudeOfSecond = magnitude(b_values);

        var dotProduct = dotProduct(a_indexes, a_values, b_indexes, b_values);

        return dotProduct / (magnitudeOfFirst * magnitudeOfSecond);
    }

    private double dotProduct(
        List<Integer> a_indexes,
        List<Double> a_values,
        List<Integer> b_indexes,
        List<Double> b_values
    ) {
        int currentAIndex = 0;
        int currentBIndex = 0;

        int dotProduct = 0;

        while (currentAIndex < a_indexes.size() - 1 || currentBIndex < b_indexes.size() - 1) {
            final int compareResult = a_indexes.get(currentAIndex).compareTo(b_indexes.get(currentBIndex));

            if (compareResult == 0) {
                dotProduct += a_values.get(currentAIndex) * b_values.get(currentBIndex);
                currentAIndex++;
                currentBIndex++;
            } else if (compareResult < 0) {
                currentAIndex++;
            } else {
                currentBIndex++;
            }
        }

        return dotProduct;
    }

    private double magnitude(List<Double> values) {
        double sumOfSquares = 0;

        for (Double value : values) {
            sumOfSquares += Math.pow(value, 2);
        }

        return Math.sqrt(sumOfSquares);
    }
}
