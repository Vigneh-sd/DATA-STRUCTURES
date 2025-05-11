import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;


class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
    }
}
class PrintNodesAtDistK {

    public static void markParents(TreeNode root, Map<TreeNode,TreeNode> trackParents)
    {
       Queue<TreeNode> q = new LinkedList<>();
       q.offer(root);
       while(!q.isEmpty())
       {
        TreeNode temp = q.poll();
        if(temp.left!=null)
        {
            trackParents.put(temp.left,temp);
            q.offer(temp.left);
        }
         if(temp.right!=null)
        {
            trackParents.put(temp.right,temp);
            q.offer(temp.right);
        }
       }
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode,TreeNode> trackParents = new HashMap<>();
        markParents(root, trackParents);
        Map<TreeNode,Boolean> visited = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(target);
        visited.put(target,true);
        int cur=0;
        while(!q.isEmpty())
        {
          int size=q.size();
          if(cur==k) break;
          cur++;
          for(int i=0;i<size;i++)
          {
            TreeNode temp=q.poll();
            if(temp.left!=null && visited.get(temp.left)==null)
            {
                q.offer(temp.left);
                visited.put(temp.left,true);
            }
             if(temp.right!=null && visited.get(temp.right)==null)
            {
                q.offer(temp.right);
                visited.put(temp.right,true);
            }
            
             if(trackParents.get(temp)!=null && visited.get(trackParents.get(temp))==null)
            {
                q.offer(trackParents.get(temp));
                visited.put(trackParents.get(temp),true);
            }

          }
        }
        List<Integer> ans = new ArrayList<>();
        while(!q.isEmpty())
        {
            ans.add(q.poll().val);
        }
        return ans;
    }
}