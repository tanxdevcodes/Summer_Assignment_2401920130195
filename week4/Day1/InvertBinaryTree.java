class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

class Solution {
    public TreeNode invertTree(TreeNode root) {

        // Base case
        if (root == null) {
            return root;
        }

        // Swap left and right
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Recursive calls
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}

public class InvertBinaryTree {

    // Tree print karne ke liye (Preorder)
    public static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }

    public static void main(String[] args) {

        /*
              4
            /   \
           2     7
          / \   / \
         1  3  6  9
        */

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        Solution obj = new Solution();

        System.out.print("Before Invert: ");
        printTree(root);

        obj.invertTree(root);

        System.out.print("\nAfter Invert: ");
        printTree(root);
    }
}