
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

public class CeilBST{

   public static int search(int val, TreeNode root)
   {
     int ans=-1;
     while(root!=null)
     {
        if(root.val>=val)
        {
           ans=root.val;
           root=root.left;
        }
        else
        {
            root=root.right;
        }
     }

     return ans;
   }
}