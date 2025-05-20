import java.util.List;


class DetectCycleDirectedDFS {

    public static boolean detectcycle(int v, List<List<Integer>> list, int node, boolean vis[], boolean pathvis[])
    {
       vis[node]=true;
       pathvis[node]=true;
       
       List<Integer> temp = list.get(node);
       for(int i=0;i<temp.size();i++)
       {
         if(!vis[temp.get(i)])
         {
            if(detectcycle(v, list, temp.get(i), vis, pathvis)) return true;
         }
         else if(pathvis[temp.get(i)]==true)
         {
            return true;
         }
       }
       return false;
    }
   
   public static boolean isCycle(int v, List<List<Integer>> list)
   {
     boolean vis[] = new boolean[v];
     boolean pathvis[] = new boolean[v];
    
    for(int i=0;i<v;i++){
        if(!vis[i]){
      if(detectcycle(v, list, i, vis,pathvis)) return true;
        }
    }
    return false;
   }
}