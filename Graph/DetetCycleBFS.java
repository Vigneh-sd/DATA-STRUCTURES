import java.util.*;

class Pair{
    int node;
    int parent;

    Pair(int node, int parent)
    {
        this.node= node;
        this.parent=parent;
    }
}


class DetectCycleBFS {

    public static boolean detectcycle(int v, List<List<Integer>> list, int start, boolean vis[])
    {
       Queue<Pair> q = new LinkedList<>();
       q.offer(new Pair(start, -1));
       vis[start]=true;

       while(!q.isEmpty())
       {
        int node=q.peek().node;
        int parent=q.peek().parent;
        q.poll();

        List<Integer> temp = list.get(node);
        for(int i=0;i<temp.size();i++)
        {
            if(vis[temp.get(i)]==false)
            {
                q.offer(new Pair(temp.get(i), node));
                vis[temp.get(i)]=true;
            }
            else if(temp.get(i)!=parent)
            {
                return true;
            }
        }
       }
       return false;
    }
   
   public static boolean isCycle(int v, List<List<Integer>> list)
   {
     boolean vis[] = new boolean[v];
    
     for(int i=0;i<v;i++)
     {
        if(!vis[i])
        {
            if(detectcycle(v, list, i, vis)) return true;
        }
     }
     return false;
   }
}