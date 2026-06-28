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

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> al = new ArrayList<>();
        pre(root, 0, al);
        return al;
    }

    public static void pre(TreeNode root, int l, List<List<Integer>> al) {

        // Base case
        if (root == null) {
            return;
        }

        // New level create karo
        if (al.size() == l) {
            List<Integer> li = new ArrayList<>();
            li.add(root.val);
            al.add(li);
        } else {
            al.get(l).add(root.val);
        }

        // Left and right subtree
        pre(root.left, l + 1, al);
        pre(root.right, l + 1, al);
    }
}

public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {


        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Solution obj = new Solution();

        List<List<Integer>> result = obj.levelOrder(root);

        System.out.println(result);
    }
}
