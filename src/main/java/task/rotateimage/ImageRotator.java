package task.rotateimage;

import java.util.Arrays;

public class ImageRotator {
    int[][] rotate90ClockwiseUsingNSpaceComplexity(int[][] toRotate) {
        int[][] copy = Arrays.stream(toRotate).map(int[]::clone).toArray(int[][]::new);

        int width = toRotate[0].length;
        int height = toRotate.length;

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < toRotate[y].length; x++) {
                final int current = toRotate[y][x];
                copy[x][width - y - 1] = current;
            }
        }

        return copy;
    }

    int[][] rotate90ClockwiseNoExtraSpace(int[][] toRotate) {
        int width = toRotate[0].length;
        int height = toRotate.length;

        for (int y = 0; y < height; y++) {
            for (int x = y + 1; x < width; x++) {
                final int temp = toRotate[y][x];
                toRotate[y][x] = toRotate[x][y];
                toRotate[x][y] = temp;
            }
        }

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width / 2; x++) {
                final int temp = toRotate[y][x];
                toRotate[y][x] = toRotate[y][width - x - 1];
                toRotate[y][width - x - 1] = temp;
            }
        }

        return toRotate;
    }
}
