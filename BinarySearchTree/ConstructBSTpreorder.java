
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

class ConstructBSTpreorder {
    public TreeNode bstFromPreorder(int[] preorder) {
        return bstpreorder(preorder, Integer.MAX_VALUE, new int[]{0});
    }

    public static TreeNode bstpreorder(int []preorder, int bound, int[]i)
    {
        if(i[0]==preorder.length || preorder[i[0]]>bound)
        return null;

        TreeNode root = new TreeNode(preorder[i[0]++]);
        root.left=bstpreorder(preorder, root.val,i);
        root.right=bstpreorder(preorder,bound,i);

        return root;
    }

}