import java.util.*;

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
class PreOrderIterative {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        List<Integer> ans= new ArrayList<>();
        if(root==null) return ans;
         st.push(root);
        while(!st.isEmpty())
        {
          TreeNode data=st.peek();
          ans.add(st.pop().val);
          if(data.right!=null) st.push(data.right);
          if(data.left!=null) st.push(data.left);
        }
        return ans;
    }
}