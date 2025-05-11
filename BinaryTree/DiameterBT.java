
   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}

class DiameterBT {
    public static int depth(TreeNode root, int max[])
    {
        if(root==null) return 0;
        int left = depth(root.left, max);
        int right = depth(root.right,max);
        max[0]=Math.max(left+right,max[0]);
        return Math.max(left,right)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int max[]=new int[1];
         int ans=depth(root,max);
         return max[0];

    }
}