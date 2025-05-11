
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
 
class LevelOrderTraveral {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
         Queue<TreeNode> q = new LinkedList<>();
         if(root==null) return ans;
         q.offer(root);
         while(!q.isEmpty()){
            int size=q.size();
         List<Integer> lst = new ArrayList<>();
         for(int i=0;i<size;i++)
         {
           if(q.peek().left!=null)
           {
            q.offer(q.peek().left);
           }
           if(q.peek().right!=null)
           {
            q.offer(q.peek().right);
           }
           lst.add(q.poll().val);
         }
         ans.add(lst);

         }
         return ans;
    }
}