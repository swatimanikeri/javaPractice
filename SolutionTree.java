class SolutionTree {
    public int maxDepth(TreeNode root) {
        // Base case: if tree is empty
        if (root == null) {
            return 0;
        }

        // Recursively find depth of left and right subtrees
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        // Return the maximum depth + 1 (for current node)
        return Math.max(leftDepth, rightDepth) + 1;
    }
