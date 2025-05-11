
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

class CheckBTorBST {
    public boolean isValidBST(TreeNode root) {
        
        return validBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static boolean validBST(TreeNode root, long minval, long maxval)
    {
        if(root==null) return true;
        if(root.val<=minval || root.val>=maxval) return false;
        return validBST(root.left, minval, root.val) && validBST(root.right, root.val, maxval);
    }
}