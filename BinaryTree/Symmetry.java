class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int key)
    {
        this.val=key;
         this.left=null;
        this.right=null;       
    }
}
class Symmetry {
    
    public static boolean symmetric(TreeNode left, TreeNode right)
    {
        if(left==null || right==null) return left==right;

        if(left.val!=right.val) return false;

        return symmetric(left.left,right.right) && symmetric(left.right, right.left);
    }

    public boolean isSymmetric(TreeNode root) {
     
     return root==null || symmetric(root.left,root.right);

    }
}