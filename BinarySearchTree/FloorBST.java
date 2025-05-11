
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

public class FloorBST{

   public static int search(int val, TreeNode root)
   {
     int ans=-1;
     while(root!=null)
     {
        if(root.val<=val)
        {
           ans=root.val;
           root=root.right;
        }
        else
        {
            root=root.left;
        }
     }

     return ans;
   }
}