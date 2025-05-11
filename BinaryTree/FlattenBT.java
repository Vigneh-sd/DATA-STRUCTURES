import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class FlattenBT {

    // 1 Recursive (Reverse Postorder: right → left → root)
    public void flattenRecursive(TreeNode root) {
        flattenRecur(root, new TreeNode[]{null});
    }

    private void flattenRecur(TreeNode root, TreeNode[] prev) {
        if (root == null) return;
        flattenRecur(root.right, prev);
        flattenRecur(root.left, prev);
        root.right = prev[0];
        root.left = null;
        prev[0] = root;
    }

    // 2 Stack-based Iterative
    public void flattenStack(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while (!st.isEmpty()) {
            TreeNode curr = st.pop();
            if (curr.right != null) st.push(curr.right);
            if (curr.left != null) st.push(curr.left);
            if (!st.isEmpty()) curr.right = st.peek();
            curr.left = null;
        }
    }

    // 3 Morris Traversal (O(1) space)
    public void flattenMorris(TreeNode root) {
        TreeNode curr = root;
        while (curr != null) {
            if (curr.left != null) {
                TreeNode pred = curr.left;
                while (pred.right != null) {
                    pred = pred.right;
                }
                pred.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
    }
}
