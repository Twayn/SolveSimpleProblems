package task.twosum;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class TwoSumFinder {
    Pair<Integer, Integer> twoSumBrute(List<Integer> input, Integer tagretSum) {
        for (int i = 0; i < input.size(); i++) {
            for (int j = 0; j < input.size(); j++) {
                if (input.get(i) + input.get(j) == tagretSum) {
                    return new Pair<>(i, j);
                }
            }
        }
        throw new IllegalArgumentException("Array doesn't contains valid values");
    }

    Pair<Integer, Integer> twoSum(List<Integer> input, Integer targetSum) {
        Map<Integer, Integer> elementToPosition = new HashMap<>();

        for (int i = 0; i < input.size(); i++) {
            int delta = targetSum - input.get(i);

            final Integer position = elementToPosition.get(delta);
            if (position != null) {
                return new Pair<>(position, i);
            }

            elementToPosition.put(input.get(i), i);
        }

        throw new IllegalArgumentException("Array doesn't contains valid values");
    }

    static class Pair<L, R> {
        final L left;
        final R right;

        public Pair(L left, R right) {
            this.left = left;
            this.right = right;
        }

        public L getLeft() {
            return left;
        }

        public R getRight() {
            return right;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(getLeft(), pair.getLeft()) && Objects.equals(getRight(), pair.getRight());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getLeft(), getRight());
        }

        @Override
        public String toString() {
            return "Pair{" +
                "left=" + left +
                ", right=" + right +
                '}';
        }
    }
}
