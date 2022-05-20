package task.graph;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static task.graph.GraphNode.ofInt;

class GraphTraversalTest {
    private final GraphTraversal<Integer> traversal = new GraphTraversal<>();

    @Test
    void deepFirstTraversal() {
        var root = ofInt(1,
            List.of(ofInt(2), ofInt(3, List.of(ofInt(7), ofInt(8))), ofInt(4))
        );

        assertEquals(
            List.of(1, 2, 3, 7, 8, 4),
            traversal.deepFirstTraversal(root)
        );
    }
}