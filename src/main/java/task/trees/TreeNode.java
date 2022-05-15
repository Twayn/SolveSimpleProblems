package task.trees;

public record TreeNode(int value, TreeNode left, TreeNode right) {
    public static TreeNode node(final int value, final TreeNode left, final TreeNode right) {
        return new TreeNode(value, left, right);
    }

    public static TreeNode leaf(final int value) {
        return new TreeNode(value, null, null);
    }
}
