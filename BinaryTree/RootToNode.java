                            
import java.util.ArrayList;
import java.util.List;


class Node {
    int data;
    Node left;
    Node right;
    

    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}

public class RootToNode {
    public static List<Integer> roottonode(Node root, int val)
    {
        List<Integer> ans = new ArrayList<>();
        solverootnode(root,val,ans);
        return ans;
    }

     public static boolean solverootnode(Node root, int val,List<Integer> ans)
    {
       if(root==null)
       {
         return false;
       }
       
        ans.add(root.data);

       if(root.data==val) return true;
       
       if(solverootnode(root.left, val, ans) || solverootnode(root.right, val, ans)) return true;

       ans.remove(ans.size()-1);

      return false;


    }
   

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        
        int val=5;
        List<Integer> result = roottonode(root,val);
        System.out.println(result);
    }
}
                            
                        