package task.trees;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static task.trees.BalancedBinaryTreeOrderedIterator.TreeNode.leaf;
import static task.trees.BalancedBinaryTreeOrderedIterator.TreeNode.node;

class BalancedBinaryTreeOrderedIteratorTest {

    @Test
    void iteration() {
        var treeSize = 7;
        var root = node(6,
            node(3, leaf(2), leaf(4)),
            node(9, leaf(7), leaf(10))
        );

        var it = new BalancedBinaryTreeOrderedIterator(root, treeSize);

        var result = Stream.generate(() -> null)
            .takeWhile(x -> it.hasNext())
            .map(n -> it.getNext())
            .toList();

        assertEquals(List.of(2, 3, 4, 6, 7, 9, 10), result);
    }

    @Test
    void iteration2() {
        var treeSize = 15;
        var root = node(10,
            node(5,
                node(3, leaf(1), leaf(4)),
                node(7, leaf(6), leaf(8))),
            node(15,
                node(13, leaf(12), leaf(14)),
                node(17, leaf(16), leaf(18)))
        );

        var it = new BalancedBinaryTreeOrderedIterator(root, treeSize);

        var result = Stream.generate(() -> null)
            .takeWhile(x -> it.hasNext())
            .map(n -> it.getNext())
            .toList();

        assertEquals(List.of(1, 3, 4, 5, 6, 7, 8, 10, 12, 13, 14, 15, 16, 17, 18), result);
    }
}