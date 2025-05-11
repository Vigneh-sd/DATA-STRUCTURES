import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
    }
}

public class MaxWidthBT {
    static class Pair {
        TreeNode node;
        int index;
        Pair(TreeNode node, int index) {
            this.node = node;
            this.index = index;
        }
    }

    public static int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        int maxWidth = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            int min = q.peek().index;
            int first = 0, last = 0;

            for (int i = 0; i < size; i++) {
                Pair p = q.poll();
                int currIndex = p.index - min;
                TreeNode node = p.node;
                if (i == 0) first = currIndex;
                if (i == size - 1) last = currIndex;
                if (node.left != null) q.add(new Pair(node.left, 2 * currIndex + 1));
                if (node.right != null) q.add(new Pair(node.right, 2 * currIndex + 2));
            }

            int width = last - first + 1;
            if (width > maxWidth) maxWidth = width;
        }

        return maxWidth;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(9);

        System.out.println(widthOfBinaryTree(root));
    }
}
