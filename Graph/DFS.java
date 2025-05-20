import java.util.ArrayList;
import java.util.List;


public class DFS{

    public static List<Integer> dfsTraversal(int v, List<List<Integer>> list)
    {
       boolean visited[] = new boolean[v];
       int start =0;
       List<Integer> ans = new ArrayList<>();
       dfs(start, list, ans, visited);
       return ans;
    }

    public static void dfs(int node, List<List<Integer>> list, List<Integer> ans, boolean visited[])
    {
        visited[node]=true;
        ans.add(node);

        List<Integer> temp = list.get(node);

        for(int i=0;i<temp.size();i++)
        {
            if(!visited[temp.get(i)])
            {
                dfs(temp.get(i), list, ans, visited);
            }
        }

    }

    public static void main(String[] args) {
       
    }
}