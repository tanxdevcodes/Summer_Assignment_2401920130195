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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        // Dono null hain
        if (p == null && q == null) {
            return true;
        }

        // Dono non-null aur values same
        if (p != null && q != null && p.val == q.val) {
            return isSameTree(p.left, q.left) &&
                   isSameTree(p.right, q.right);
        }

        // Kisi ek me difference mila
        return false;
    }
}

public class SameTree {
    public static void main(String[] args) {

        // Tree 1
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        // Tree 2
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        Solution obj = new Solution();

        boolean result = obj.isSameTree(p, q);

        System.out.println(result);
    }
}