package task.graph;

import java.util.Collections;
import java.util.List;

public class GraphNode<T> {
    private final T value;
    private final List<GraphNode<T>> neighbours;

    private boolean visited = false;

    public GraphNode(T value, List<GraphNode<T>> neighbours) {
        this.value = value;
        this.neighbours = neighbours;
    }

    public static GraphNode<Integer> ofInt(Integer val, List<GraphNode<Integer>> neighbours) {
        return new GraphNode<>(val, neighbours);
    }

    public static GraphNode<Integer> ofInt(Integer val) {
        return new GraphNode<>(val, Collections.emptyList());
    }

    public T getValue() {
        return value;
    }

    public List<GraphNode<T>> getNeighbours() {
        return neighbours;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}
