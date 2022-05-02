package task.islandfinder;

public class OneDimensionalIslandFinder {
    int countIslands(int[] map) {
        int islandsCount = 0;

        boolean islandIterationInProgress = false;

        for (final int current : map) {
            if (!islandIterationInProgress && current == 1) {
                islandIterationInProgress = true;
                islandsCount = islandsCount + 1;
            } else if (current == 0) {
                islandIterationInProgress = false;
            }
        }

        return islandsCount;
    }
}
