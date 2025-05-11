                            


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

public class LowestCommonAncestor {
    

     public static Node lca(Node root, Node val1,Node val2)
    {
      if(root==null || root==val1 || root==val2)
      {
        return root;
      }
      
      Node left=lca(root.left, val1,val2);
      Node right=lca(root.right, val1,val2);

      if(left==null)
      {
        return right;
      }
      else if(right==null)
      {
        return left;
      }
      else
      {
        return root;
      }

    }
   

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        
        Node val1=root.left.left;
        Node val2=root.left.right;
        Node result = lca(root,val1,val2);
        System.out.println(result.data);
    }
}
                            
                        