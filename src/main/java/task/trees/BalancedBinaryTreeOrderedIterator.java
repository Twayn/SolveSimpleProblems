package task.trees;

class BalancedBinaryTreeOrderedIterator {
    private final TreeNode[] stack;

    public BalancedBinaryTreeOrderedIterator(TreeNode root, int treeSize) {
        stack = new TreeNode[(int) Math.ceil(Math.log10(treeSize) / Math.log10(2))];
        int peekIndex = 0;

        while (root != null) {
            stack[peekIndex++] = root;
            root = root.left();
        }
    }

    public boolean hasNext() {
        for (TreeNode treeNode : stack) {
            if (treeNode != null) {
                return true;
            }
        }
        return false;
    }

    public Integer getNext() {
        TreeNode peekNode = null;
        int peekPosition = 0;

        //Pop element from stack and save its position
        for (int i = stack.length - 1; i >= 0; i--) {
            if (stack[i] != null) {
                peekNode = stack[i];
                stack[i] = null;
                peekPosition = i;
                break;
            }
        }

        if (peekNode == null) return null; //if stack is empty iteration is finished

        //If node has right sub-node then push right sub-node into stack
        TreeNode right = peekNode.right();
        if (right != null) {
            stack[peekPosition++] = right;

            //Then push to stack all chain of left sub-nodes of this right sub-node
            TreeNode left = right.left();
            while (left != null) {
                stack[peekPosition++] = left;
                left = left.left();
            }
        }

        return peekNode.value(); //return saved value
    }
}