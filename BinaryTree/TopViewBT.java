import java.util.*;
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

class Pair{
    TreeNode node;
    int x;
    Pair(TreeNode node, int x)
    {
        this.node=node;
        this.x=x;
    }
}
public class TopViewBT{

    public static List<Integer> topview(TreeNode root)
    {
        List<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q= new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty())
        {
            Pair p = q.poll();
            int x=p.x;
            TreeNode node = p.node;

            if(!map.containsKey(x))
            {
                map.put(x, node.val);
            }
            if(node.left!=null)
            {
                q.add(new Pair(node.left,x-1));
            }
            if(node.right!=null)
            {
                q.add(new Pair(node.right,x+1));
            }
        }

        for(Map.Entry<Integer, Integer> it : map.entrySet())
        {
            ans.add(it.getValue());
        }
      return ans;
    
    }

     public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.right.right = new TreeNode(5);
        root.left.right.right.right = new TreeNode(6);

        List<Integer> top = topview(root);
        System.out.println(top); 
    }
}