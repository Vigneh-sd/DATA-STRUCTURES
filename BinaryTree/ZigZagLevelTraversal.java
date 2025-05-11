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
class ZigZagLevelTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean flag=true;
        while(!q.isEmpty())
        {
            List<Integer> lst= new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++)
            {
              TreeNode temp=q.poll();
              if(flag)
              lst.add(temp.val);
              else
              lst.add(0,temp.val);
              if(temp.left!=null) q.add(temp.left);
              if(temp.right!=null) q.add(temp.right);
            }
            flag=!flag;
            ans.add(lst);
        }
     return ans;
    }
}