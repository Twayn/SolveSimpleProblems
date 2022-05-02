package task.islandfinder;

public class RecursiveIslandFinder {
    final int[][] map;
    final int height;
    final int width;

    public RecursiveIslandFinder(int[][] map) {
        this.map = map;

        height = map.length;
        width = map[0].length;
    }

    int countIslands() {
        int islandsCount = 0;

        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                if (map[y][x] == 1) {
                    islandsCount = islandsCount + 1;

                    markConnectedLandAsWater(y, x);
                }
            }
        }

        return islandsCount;
    }

    private void markConnectedLandAsWater(int y, int x) { //to exclude from future search
        if (
            y < 0 || y >= height ||
            x < 0 || x >= width ||
            map[y][x] == 0
        ) {
            return;
        }

        map[y][x] = 0;

        markConnectedLandAsWater(y, x + 1);
        markConnectedLandAsWater(y + 1, x);
        markConnectedLandAsWater(y, x - 1);
        markConnectedLandAsWater(y - 1, x);
    }
}
