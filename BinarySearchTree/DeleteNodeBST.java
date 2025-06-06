
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

class DeleteNodeBST {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(root.val==key)
        {
            return helper(root);
        }

        TreeNode dummy = root;
        while(root!=null)
        {
            if(root.val>key)
            {
                if(root.left!=null && root.left.val==key)
                {
                    root.left=helper(root.left);
                    break;
                }
                else
                {
                    root=root.left;
                }
            }
            else
            {
                if(root.right!=null && root.right.val==key)
                {
                    root.right=helper(root.right);
                    break;
                }
                else
                {
                    root=root.right;
                }
            }
        }
   return dummy;
    }

    public static TreeNode helper(TreeNode root)
    {
       if(root.left==null)
       {
        return root.right;
       }
       else if(root.right==null)
       {
        return root.left;
       }
       else{
       TreeNode rightchild = root.right;
       TreeNode lastright = findlastright(root.left);
       lastright.right=rightchild;
       return root.left;
       }
    }

    public static TreeNode findlastright(TreeNode root)
    {
        if(root.right==null) return root;
        return findlastright(root.right);
    }
}