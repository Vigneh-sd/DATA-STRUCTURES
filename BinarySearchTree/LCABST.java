
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

class LCABST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;

        if(root.val> p.val && root.val>q.val){
        return lowestCommonAncestor(root.left,p,q);
        }
        if(root.val< p.val && root.val<q.val){
        return lowestCommonAncestor(root.right,p,q);
        }

       return root;
    }
}