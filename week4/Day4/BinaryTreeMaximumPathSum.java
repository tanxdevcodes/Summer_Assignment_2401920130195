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

    public int maxPathSum(TreeNode root) {
        int[] res = { root.val };   // Maximum path sum store karega
        dfs(root, res);
        return res[0];
    }

    private int dfs(TreeNode node, int[] res) {

        
        if (node == null) {
            return 0;
        }

       
        int leftSum = Math.max(0, dfs(node.left, res));

       
        int rightSum = Math.max(0, dfs(node.right, res));

        
        res[0] = Math.max(res[0], leftSum + rightSum + node.val);

        
        return Math.max(leftSum, rightSum) + node.val;
    }
}

public class BinaryTreeMaximumPathSum {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Solution obj = new Solution();

        int ans = obj.maxPathSum(root);

        System.out.println("Maximum Path Sum = " + ans);
    }
}