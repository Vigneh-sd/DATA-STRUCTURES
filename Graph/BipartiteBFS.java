import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BipartiteBFS {

    public static boolean isBipartite(int V, List<List<Integer>> adj) {
        int[] color = new int[V];
        Arrays.fill(color, -1); 

        for (int i = 0; i < V; i++) {
            if (color[i] == -1) {
                if (!checkBipartiteBFS(i, adj, color)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkBipartiteBFS(int start, List<List<Integer>> adj, int[] color) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        color[start] = 0;

        while (!q.isEmpty()) {
            int node = q.poll();

            List<Integer> temp = adj.get(node);
            for (int i = 0; i < temp.size(); i++) {
                int cur = temp.get(i);

                if (color[cur] == -1) {
                    color[cur] = 1 - color[node]; 
                    q.offer(cur);
                } else if (color[cur] == color[node]) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int V = 4;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);

        System.out.println(isBipartite(V, adj)); 
    }
}
