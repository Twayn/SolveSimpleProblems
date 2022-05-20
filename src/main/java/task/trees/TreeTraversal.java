package task.trees;

import java.util.ArrayList;
import java.util.List;

public class TreeTraversal {

    List<Integer> traverseLeftThenNodeThenRight(TreeNode head) {
        List<Integer> result = new ArrayList<>();

        if (head.left() != null) {
            result.addAll(traverseLeftThenNodeThenRight(head.left()));
        }

        result.add(head.value());

        if (head.right() != null) {
            result.addAll(traverseLeftThenNodeThenRight(head.right()));
        }

        return result;
    }
}
