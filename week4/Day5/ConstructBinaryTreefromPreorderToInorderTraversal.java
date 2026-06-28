import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

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

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        Deque<Integer> preorderQueue = new ArrayDeque<>();

        for (int val : preorder) {
            preorderQueue.offer(val);
        }

        return build(preorderQueue, inorder);
    }

    private TreeNode build(Deque<Integer> preorder, int[] inorder) {

        if (inorder.length > 0) {

            int idx = indexOf(inorder, preorder.poll());

            TreeNode root = new TreeNode(inorder[idx]);

            root.left = build(preorder,
                    Arrays.copyOfRange(inorder, 0, idx));

            root.right = build(preorder,
                    Arrays.copyOfRange(inorder, idx + 1, inorder.length));

            return root;
        }

        return null;
    }

    private int indexOf(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}

public class ConstructBinaryTreefromPreorderToInorderTraversal {

    // Preorder print for checking
    public static void printPreorder(TreeNode root) {
        if (root == null)
            return;

        System.out.print(root.val + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    public static void main(String[] args) {

        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        Solution obj = new Solution();

        TreeNode root = obj.buildTree(preorder, inorder);

        System.out.print("Constructed Tree (Preorder): ");
        printPreorder(root);
    }
}
