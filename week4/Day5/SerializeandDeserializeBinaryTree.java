import java.util.LinkedList;
import java.util.Queue;

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

class Codec {

    // Tree -> String
    public String serialize(TreeNode root) {
        if (root == null)
            return "null";

        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();

            if (curr == null) {
                sb.append("null,");
                continue;
            }

            sb.append(curr.val).append(",");
            q.add(curr.left);
            q.add(curr.right);
        }

        return sb.toString();
    }

    // String -> Tree
    public TreeNode deserialize(String data) {
        if (data.equals("null"))
            return null;

        String[] arr = data.split(",");

        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int i = 1;

        while (!q.isEmpty() && i < arr.length) {
            TreeNode curr = q.poll();

            if (!arr[i].equals("null")) {
                curr.left = new TreeNode(Integer.parseInt(arr[i]));
                q.add(curr.left);
            }
            i++;

            if (i < arr.length && !arr[i].equals("null")) {
                curr.right = new TreeNode(Integer.parseInt(arr[i]));
                q.add(curr.right);
            }
            i++;
        }

        return root;
    }
}

public class SerializeandDeserializeBinaryTree {

    // Simple preorder print
    public static void printTree(TreeNode root) {
        if (root == null) {
            System.out.print("null ");
            return;
        }

        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }

    public static void main(String[] args) {

     

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        Codec codec = new Codec();

        // Serialize
        String data = codec.serialize(root);
        System.out.println("Serialized: " + data);

        // Deserialize
        TreeNode newRoot = codec.deserialize(data);

        System.out.print("Deserialized Tree: ");
        printTree(newRoot);
    }
}
