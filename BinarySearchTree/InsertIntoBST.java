
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}


class insertIntoBST {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode ans = new TreeNode(val);
        if(root==null) return ans;

        TreeNode cur=root;

        while(true)
        {
          if(val<root.val)
          {
            if(root.left!=null)
            {
                root=root.left;
            }
            else
            {
                root.left=ans;
                break;
            }
          }
          else
          {
            if(root.right!=null)
            {
                root=root.right;
            }
            else
            {
                root.right=ans;
                break;
            }
          }
        }
       return cur;
    }
}