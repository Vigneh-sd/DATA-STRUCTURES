import java.util.*;
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}
class LeftView {
  
    public static void leftview(TreeNode root, int pos, List<Integer> ans)
    {
        if(root==null) 
        {
            return;
        }
        if(pos==ans.size())
        {
            ans.add(root.val);
        }
        leftview(root.left, pos+1, ans);
        leftview(root.right, pos+1, ans);

    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        leftview(root,0,ans);
        return ans;
    }
}