
//import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Pair{

    int weight;
    int node;
    int parent;

    Pair(int weight, int node, int parent)
    {
        this.weight=weight;
        this.node= node;
        this.parent=parent;
    }
}

public class PrimsAlgoMST{

    public static int minsum(List<List<int []>> list, int v)
    {
       boolean vis[] = new boolean[v];
       //List<List<Integer>> ans = new ArrayList<>();
       
       PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.weight - b.weight);

       pq.offer(new Pair(0,0,-1));
       int sum=0;

       while(!pq.isEmpty())
       {
          Pair p= pq.poll();
          int weight=p.weight;
          int node=p.node;
          int parent=p.parent;

          if(vis[node]) continue;

          sum+=weight;
          vis[node]=true;

          if(parent!=-1){
        //   List<Integer> temp = new ArrayList<>();
        //   temp.add(parent);
        //   temp.add(node);
          //ans.add(temp);
          }
          
            for(int i=0;i<list.get(node).size();i++)
            {
                int [] edge = list.get(node).get(i);
                int n= edge[0];
                int w= edge[1];

                if(!vis[n])
                {
                    pq.offer(new Pair(w,n,node));
                }

            }

       }

       return sum;
    }
}