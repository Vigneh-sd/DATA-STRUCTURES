import java.util.*;
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}
class RightView {
  
    public static void rightview(TreeNode root, int pos, List<Integer> ans)
    {
        if(root==null) 
        {
            return;
        }
        if(pos==ans.size())
        {
            ans.add(root.val);
        }
        rightview(root.right, pos+1, ans);
        rightview(root.left, pos+1, ans);

    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        rightview(root,0,ans);
        return ans;
    }
}