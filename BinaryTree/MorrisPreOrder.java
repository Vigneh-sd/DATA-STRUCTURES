
import java.util.ArrayList;
import java.util.List;


class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class MorrisPreOrder {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        TreeNode cur = root;

        while (cur != null) {
            if (cur.left == null) {
                ans.add(cur.val); 
                cur = cur.right;
            } else {
                TreeNode prev = cur.left;
                while (prev.right != null && prev.right != cur) {
                    prev = prev.right;
                }

                if (prev.right == null) {
                    ans.add(cur.val); 
                    prev.right = cur; 
                    cur = cur.left;
                } else {
                    prev.right = null; 
                    cur = cur.right;
                }
            }
        }

        return ans;
    }
}
