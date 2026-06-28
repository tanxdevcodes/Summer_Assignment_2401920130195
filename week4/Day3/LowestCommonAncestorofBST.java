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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        while (root != null) {

            
            if (p.val > root.val && q.val > root.val) {
                root = root.right;
            }

            
            else if (p.val < root.val && q.val < root.val) {
                root = root.left;
            }

            
            else {
                return root;
            }
        }

        return null;
    }
}

public class LowestCommonAncestorofBST {
    public static void main(String[] args) {


        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);

        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        TreeNode p = root.left;   
        TreeNode q = root.right;  

        Solution obj = new Solution();

        TreeNode ans = obj.lowestCommonAncestor(root, p, q);

        if (ans != null) {
            System.out.println("LCA = " + ans.val);
        }
    }
}