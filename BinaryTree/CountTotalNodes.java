class TotalNodes {

    public static int lefttree(TreeNode root) {
        int cnt = 0;
        while (root != null) {
            cnt++;
            root = root.left;
        }
        return cnt;
    }

    public static int righttree(TreeNode root) {
        int cnt = 0;
        while (root != null) {
            cnt++;
            root = root.right;
        }
        return cnt;
    }

    public int countNodes(TreeNode root) {
        if (root == null) return 0;

        int left = lefttree(root);
        int right = righttree(root);

        if (left == right) return (1 << left) - 1;

        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
