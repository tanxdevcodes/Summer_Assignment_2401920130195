
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        TreeNode c = root;
        List<List<Integer>> ans = new ArrayList<>();

        if (c == null)
            return ans;

        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        s1.push(root);

        while (!s1.isEmpty() || !s2.isEmpty()) {

            List<Integer> tmp = new ArrayList<>();

            // Left to Right
            while (!s1.isEmpty()) {
                c = s1.pop();
                tmp.add(c.val);

                if (c.left != null)
                    s2.push(c.left);

                if (c.right != null)
                    s2.push(c.right);
            }

            ans.add(tmp);
            tmp = new ArrayList<>();

            // Right to Left
            while (!s2.isEmpty()) {
                c = s2.pop();
                tmp.add(c.val);

                if (c.right != null)
                    s1.push(c.right);

                if (c.left != null)
                    s1.push(c.left);
            }

            if (!tmp.isEmpty())
                ans.add(tmp);
        }

        return ans;
    }
}

public class BinaryTreeZigzagLevelOrderTraversal {
    public static void main(String[] args) {

   

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Solution obj = new Solution();

        List<List<Integer>> result = obj.zigzagLevelOrder(root);

        System.out.println(result);
    }
}