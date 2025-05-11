import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

 class VerticalOrderTraversal {

    static class NodeInfo {
        TreeNode node;
        int x, y;

        NodeInfo(TreeNode node, int x, int y) {
            this.node = node;
            this.x = x;
            this.y = y;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<NodeInfo> q = new LinkedList<>();

        q.offer(new NodeInfo(root, 0, 0));

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                NodeInfo temp = q.poll();
                TreeNode node = temp.node;
                int x = temp.x;
                int y = temp.y;

                map.putIfAbsent(x, new TreeMap<>());
                map.get(x).putIfAbsent(y, new PriorityQueue<>());
                map.get(x).get(y).offer(node.val);

                if (node.left != null) q.offer(new NodeInfo(node.left, x - 1, y + 1));
                if (node.right != null) q.offer(new NodeInfo(node.right, x + 1, y + 1));
            }
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (int x : map.keySet()) {
            List<Integer> col = new ArrayList<>();
            TreeMap<Integer, PriorityQueue<Integer>> ys = map.get(x);
            for (int y : ys.keySet()) {
                PriorityQueue<Integer> pq = ys.get(y);
                while (!pq.isEmpty()) {
                    col.add(pq.poll());
                }
            }
            ans.add(col);
        }

        return ans;
    }
}
