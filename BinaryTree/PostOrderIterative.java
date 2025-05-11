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
class PostOrderIterative {
     public List<Integer> postorderTraversal(TreeNode root) {
         List<Integer> ans = new ArrayList<>();
         if(root==null) return ans;
         Stack<TreeNode> st = new Stack<>();
         TreeNode cur = root;
         while(cur!=null || !st.isEmpty())
         {
              if(cur!=null)
              {
                st.push(cur);
                cur=cur.left;
              }
              else
              {
                TreeNode temp = st.peek().right;
                if(temp==null)
                {
                  temp=st.pop();
                  ans.add(temp.val);
                  while(!st.isEmpty() && temp==st.peek().right)
                  {
                     temp=st.pop();
                     ans.add(temp.val);
                  }
                }
                else
                {
                    cur=temp;
                }
              }
         }
        
         return ans;
    }
}

// using 2stacks
//    public List<Integer> postorderTraversal(TreeNode root) {
//          List<Integer> ans = new ArrayList<>();
//          if(root==null) return ans;
//          Stack<TreeNode> st1 = new Stack<>();
//          Stack<TreeNode> st2 = new Stack<>();
//          st1.push(root);
//          while(!st1.isEmpty())
//          {
//             TreeNode node = st1.pop();
//             st2.push(node);
//             if(node.left!=null) st1.push(node.left);
//             if(node.right!=null) st1.push(node.right);    
//          }
//          while(!st2.isEmpty())
//          {
//             ans.add(st2.pop().val);
//          }
//          return ans;
//     }