package task.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Lists;

public class GraphTraversal<T> {
    private final ArrayDeque<GraphNode<T>> stack = new ArrayDeque<>();

    public List<T> deepFirstTraversal(GraphNode<T> graphNode) {
        stack.push(graphNode);

        List<T> result = new ArrayList<>();

        while (!stack.isEmpty()) {
            final GraphNode<T> pop = stack.pop();

            result.add(pop.getValue());

            if (!pop.isVisited()) {
                Lists.reverse(pop.getNeighbours()).forEach(stack::push);
            }

            pop.setVisited(true);
        }

        return result;
    }
}
