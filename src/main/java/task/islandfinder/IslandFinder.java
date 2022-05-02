package task.islandfinder;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class IslandFinder {
    final int[][] map;
    final int height;
    final int width;

    final Map<Coordinates, ChunkInfo> chunks = new HashMap<>();

    public IslandFinder(int[][] map) {
        this.map = map;

        height = map.length;
        width = map[0].length;

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                chunks.put(new Coordinates(x, y), new ChunkInfo(map[y][x] == 1));
            }
        }
    }

    int countIslands() {
        int islandsCount = 0;

        for (Entry<Coordinates, ChunkInfo> entry : chunks.entrySet()) {
            final ChunkInfo chunk = entry.getValue();
            if (!chunk.isVisited() && chunk.isLand()) {
                chunk.setVisited(true);
                islandsCount = islandsCount + 1;

                markAllLandConnectedToVisitedAsVisited(chunks);
            }
        }

        return islandsCount;
    }

    private void markAllLandConnectedToVisitedAsVisited(Map<Coordinates, ChunkInfo> chunks) {
        boolean markHappened;

        do {
            markHappened = false;

            for (Entry<Coordinates, ChunkInfo> entry : chunks.entrySet()) {
                final ChunkInfo chunk = entry.getValue();
                if (!chunk.isVisited() && chunk.isLand() && isNeighborOfVisited(entry.getKey())) {
                    chunk.setVisited(true);
                    markHappened = true;
                }
            }
        } while (markHappened);
    }

    private boolean isNeighborOfVisited(Coordinates coordinates) {
        final ChunkInfo chunkInfo1 = chunks.get(new Coordinates(coordinates.x, coordinates.y + 1));
        final ChunkInfo chunkInfo2 = chunks.get(new Coordinates(coordinates.x + 1, coordinates.y));
        final ChunkInfo chunkInfo3 = chunks.get(new Coordinates(coordinates.x, coordinates.y - 1));
        final ChunkInfo chunkInfo4 = chunks.get(new Coordinates(coordinates.x - 1, coordinates.y));

        return (chunkInfo1 != null && chunkInfo1.isLand() && chunkInfo1.isVisited())
            || (chunkInfo2 != null && chunkInfo2.isLand() && chunkInfo2.isVisited())
            || (chunkInfo3 != null && chunkInfo3.isLand() && chunkInfo3.isVisited())
            || (chunkInfo4 != null && chunkInfo4.isLand() && chunkInfo4.isVisited());
    }

    private static class ChunkInfo {
        final boolean isLand;

        boolean visited = false;

        public ChunkInfo(boolean isLand) {
            this.isLand = isLand;
        }

        public boolean isLand() {
            return isLand;
        }

        public boolean isVisited() {
            return visited;
        }

        public void setVisited(boolean visited) {
            this.visited = visited;
        }

        @Override
        public String toString() {
            return "ChunkInfo{" +
                "isLand=" + isLand +
                ", visited=" + visited +
                '}';
        }
    }

    record Coordinates(int x, int y) {
    }
}
