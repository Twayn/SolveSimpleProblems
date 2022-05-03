package task.squareandsort;

public class SquareAndSortSortedArrayHelper {
    int[] squareAndSortSortedArrayUsingExtraSpace(int[] input) {
        int leftCursor = 0;
        int rightCursor = input.length - 1;

        int[] output = new int[input.length];
        int outputCursor = input.length - 1;

        while (leftCursor <= rightCursor) {
            int left = input[leftCursor];
            int right = input[rightCursor];

            if (Math.abs(right) >= Math.abs(left)) {
                output[outputCursor] = right * right;
                rightCursor--;
            } else {
                output[outputCursor] = left * left;
                leftCursor++;
            }

            outputCursor--;
        }

        return output;
    }
}
