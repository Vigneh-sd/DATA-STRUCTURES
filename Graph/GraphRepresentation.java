import java.util.ArrayList;
import java.util.List;

class Pair {
    int node, weight;
    Pair(int node, int weight) {
        this.node = node;
        this.weight = weight;
    }
}

public class GraphRepresentation {
    public static void main(String[] args) {
        int n = 4; // number of nodes

        // 1 Adjacency Matrix
        int[][] matrix = new int[n][n];

        // Add undirected weighted edges
        matrix[0][1] = 1; matrix[1][0] = 1;
        matrix[0][2] = 4; matrix[2][0] = 4;
        matrix[1][2] = 2; matrix[2][1] = 2;
        matrix[1][3] = 3; matrix[3][1] = 3;
        matrix[2][3] = 5; matrix[3][2] = 5;

        // 2 Adjacency List
        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges
        adj.get(0).add(new Pair(1, 1));
        adj.get(1).add(new Pair(0, 1));

        adj.get(0).add(new Pair(2, 4));
        adj.get(2).add(new Pair(0, 4));

        adj.get(1).add(new Pair(2, 2));
        adj.get(2).add(new Pair(1, 2));

        adj.get(1).add(new Pair(3, 3));
        adj.get(3).add(new Pair(1, 3));

        adj.get(2).add(new Pair(3, 5));
        adj.get(3).add(new Pair(2, 5));

        
        for (int i = 0; i < n; i++) {
            System.out.print(i + " -> ");
            for (Pair p : adj.get(i)) {
                System.out.print("(" + p.node + ", w=" + p.weight + ") ");
            }
            System.out.println();
        }
    }
}
