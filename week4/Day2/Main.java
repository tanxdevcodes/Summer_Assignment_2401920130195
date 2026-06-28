
import java.util.ArrayList;
import java.util.List;

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
    private List<Integer> res = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        traverse(root);
        return res;
    }

    private void traverse(TreeNode root) {

        // Base case
        if (root == null) {
            return;
        }

        // Left
        traverse(root.left);

        // Root
        res.add(root.val);

        // Right
        traverse(root.right);
    }
}

public class Main {
    public static void main(String[] args) {

     

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        Solution obj = new Solution();

        List<Integer> result = obj.inorderTraversal(root);

        System.out.println(result);
    }
}