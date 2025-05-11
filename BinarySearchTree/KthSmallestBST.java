
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

class KthSmallestBST {
  
    public static void inorder(TreeNode root, int k, int a[], int cnt[])
    {
        if(root==null || cnt[0]>=k)
        {
            return;
        }
        
        inorder(root.left,k,a,cnt);

        cnt[0]++;

        if(cnt[0]==k)
        {
            a[0]=root.val;
            return;
        }

        inorder(root.right,k,a,cnt);

    }

    public int kthSmallest(TreeNode root, int k) {
        int a[] = new int[]{Integer.MIN_VALUE};
        int cnt[] = new int[1];

        inorder(root,k,a,cnt);

        return a[0];
        
    }
}