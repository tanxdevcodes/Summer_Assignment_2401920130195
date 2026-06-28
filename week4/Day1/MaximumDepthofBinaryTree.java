class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    // Constructor
    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

class Solution {
    public int maxDepth(TreeNode root) {

        // Base case: agar tree empty hai
        if (root == null) {
            return 0;
        }

        // Left subtree depth
        int leftDepth = maxDepth(root.left);

        // Right subtree depth
        int rightDepth = maxDepth(root.right);

        // Jo depth zyada ho usme 1 add karo (current node)
        return 1 + Math.max(leftDepth, rightDepth);
    }
}

public class MaximumDepthofBinaryTree {
    public static void main(String[] args) {

        /*
               1
             /   \
            2     3
           /
          4
        */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        Solution obj = new Solution();

        int depth = obj.maxDepth(root);

        System.out.println("Maximum Depth = " + depth);
    }
}
