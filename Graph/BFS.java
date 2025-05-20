import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS{

    public static List<Integer> bfsTraversal(int v, List<List<Integer>> list, int start)
    {
        boolean visited[] = new boolean[v];
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start]=true;

        List<Integer> ans = new ArrayList<>();

        while(!q.isEmpty())
        {
            int node = q.poll();
            ans.add(node);

            List<Integer> temp = list.get(node);

            for(int i=0;i<temp.size();i++)
            {
                int num = temp.get(i);
                if(!visited[num])
                {
                    visited[num]=true;
                    q.offer(num);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        bfsTraversal(4,list,0);
    }
}