
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    // Constructor
    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class Solution {

    public boolean isValidBST(TreeNode root) {
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean valid(TreeNode node, long minimum, long maximum) {

        // Base case
        if (node == null) {
            return true;
        }

        // Check if current node is in valid range
        if (!(node.val > minimum && node.val < maximum)) {
            return false;
        }

        // Check left and right subtree
        return valid(node.left, minimum, node.val) &&
               valid(node.right, node.val, maximum);
    }
}

public class ValidateBST {
    public static void main(String[] args) {

        /*
                 5
               /   \
              3     7
             / \   / \
            2   4 6   8
        */

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);

        Solution obj = new Solution();

        boolean ans = obj.isValidBST(root);

        System.out.println("Is Valid BST? " + ans);
    }
}