import java.util.Arrays;
import java.util.List;



class BellmanFordAlgo {
    
    public int[] shortestPath(List<List<Integer>> list,int n,int k) {
       
      int dis[] = new int[n];
      Arrays.fill(dis, (int)1e9);
      dis[k]=0;
      
      for(int i=0;i<n-1;i++)
      {
          for(int j=0;j<list.size();j++){
          int u= list.get(j).get(0);
          int v= list.get(j).get(1);
          int w= list.get(j).get(2);

          if(dis[u]!=(int)1e9 &&  dis[u]+w < dis[v])
          {
            dis[v]=dis[u]+w;
          }
          }

      }

      for(int j=0;j<list.size();j++)
      {
         int u= list.get(j).get(0);
          int v= list.get(j).get(1);
          int w= list.get(j).get(2);
        if(dis[u]!=(int)1e9 &&  dis[u]+w < dis[v])
          {
            return new int[0];
          }
      }

     return dis;
       
    }
}