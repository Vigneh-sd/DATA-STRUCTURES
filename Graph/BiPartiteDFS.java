import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BiPartiteDFS {

    public static boolean isBipartite(int V, List<List<Integer>> adj) {
        int[] color = new int[V];
        Arrays.fill(color, -1); 

        for (int i = 0; i < V; i++) {
            if (color[i] == -1) {
                if (!checkBipartiteDFS(i, 0, color, adj)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkBipartiteDFS(int node, int col, int[] color, List<List<Integer>> adj) {
        color[node] = col;

        List<Integer> neighbors = adj.get(node);
        for (int i = 0; i < neighbors.size(); i++) {
            int neighbor = neighbors.get(i);

            if (color[neighbor] == -1) {
                if (!checkBipartiteDFS(neighbor, 1 - col, color, adj)) {
                    return false;
                }
            } else if (color[neighbor] == color[node]) {
                return false;
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
