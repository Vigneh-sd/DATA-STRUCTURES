import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Pair{
    int weight;
    int node;

    Pair(int weight, int node)
    {
        this.weight=weight;
        this.node=node;
    }
}

class DjisktraAlgorithm {
    
    public List<Integer> shortestPath(List<List<int []>> list,int v,int k) {
       
     PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.weight - b.weight);

     int dis[]= new int[v];
    for(int i=0;i<v;i++)
    {
        dis[i]=(int)(1e9);
    }

    dis[k]=0;
    pq.add(new Pair(0,k));

    while(!pq.isEmpty())
    {
        int weight = pq.peek().weight;
        int node = pq.peek().node;
        pq.poll();

       
        for(int i=0;i<list.get(node).size();i++)
        {
             int[] edge = list.get(node).get(i);
             int wt=edge[1];
             int adj=edge[0];
            if(dis[adj]>weight+wt)
            {
                dis[adj]=weight+wt;
                pq.offer(new Pair(dis[adj], adj));
            }
        }
    }

  List<Integer> ans = new ArrayList<>();
  for(int i=0;i<dis.length;i++)
  {
    if(dis[i]==1e9)
    {
        dis[i]=-1;
    }
    ans.add(dis[i]);
  }
   
   return ans;

       
    }
}