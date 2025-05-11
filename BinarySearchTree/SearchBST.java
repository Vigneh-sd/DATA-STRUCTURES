
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

public class SearchBST{

   public static TreeNode search(int val, TreeNode root)
   {
     if(root==null || root.val==val) return root;
     
     while(root!=null)
     {
        if(root.val==val)
        {
            return root;
        }
        else if(root.val>val)
        {
            root=root.left;
        }
        else
        {
            root=root.right;
        }
     }

     return null;
   }
}