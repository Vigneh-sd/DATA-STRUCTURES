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
class BoundaryTraversal{

    static boolean isLeaf(TreeNode root)
    {
       return (root !=null && root.left==null && root.right==null);
    }

    static void addLeft(TreeNode root, List<Integer> ans)
    {
       TreeNode cur = root.left;
       while(cur!=null)
       {
        if(isLeaf(cur)==false) ans.add(cur.val);
        if(cur.left!=null) cur=cur.left;
        else cur=cur.right;
       }
    }

    static void addRight(TreeNode root, List<Integer> ans)
    {
        List<Integer> temp = new ArrayList<>();
       TreeNode cur = root.right;
       while(cur!=null)
       {
        if(isLeaf(cur)==false) temp.add(cur.val);
        if(cur.right!=null) cur=cur.right;
        else cur=cur.left;
       }
       for(int i=temp.size()-1;i>=0;i--)
       {
        ans.add(temp.get(i));
       }
    }

    static void addLeaf(TreeNode root, List<Integer> ans)
    {
       if(isLeaf(root)==true){
        ans.add(root.val); 
        return;
       }
       if(root.left!=null) addLeaf(root.left, ans);
       if(root.right!=null) addLeaf(root.right, ans);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        
        List<Integer> ans = new ArrayList<>();
        if(isLeaf(root)==false) ans.add(root.val);
        addLeft(root,ans);
        addLeaf(root,ans);
        addRight(root,ans);
        System.out.println(ans);
    }
}