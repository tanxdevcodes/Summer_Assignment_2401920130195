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
    int res = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return res;
    }

    private int dfs(TreeNode root) {

        // Base case
        if (root == null) {
            return 0;
        }

        
        int l = dfs(root.left);

        
        int r = dfs(root.right);

        
        res = Math.max(res, l + r);

       
        return 1 + Math.max(l, r);
    }
}

public class DiameterofBinaryTree {
    public static void main(String[] args) {


        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Solution obj = new Solution();

        int diameter = obj.diameterOfBinaryTree(root);

        System.out.println("Diameter = " + diameter);
    }
}
