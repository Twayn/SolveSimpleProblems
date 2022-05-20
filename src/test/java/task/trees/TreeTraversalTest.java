package task.trees;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static task.trees.TreeNode.leaf;
import static task.trees.TreeNode.node;

class TreeTraversalTest {
    TreeTraversal traversal = new TreeTraversal();

    @Test
    void traverseLeftThenNodeThenRight() {
        var root = node(6,
            node(3, leaf(2), leaf(4)),
            node(9, leaf(7), leaf(10))
        );

        assertEquals(
            List.of(2, 3, 4, 6, 7, 9, 10),
            traversal.traverseLeftThenNodeThenRight(root)
        );

    }
}