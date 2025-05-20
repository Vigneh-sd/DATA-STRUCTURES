import java.util.List;


class DetectCycleDFS {

    public static boolean detectcycle(int v, List<List<Integer>> list, int node, boolean vis[], int parent)
    {
       vis[node]=true;
       
       List<Integer> temp = list.get(node);
       for(int i=0;i<temp.size();i++)
       {
         if(!vis[temp.get(i)])
         {
            if(detectcycle(v, list, temp.get(i), vis, node)) return true;
         }
         else if(temp.get(i)!=parent)
         {
            return true;
         }
       }
       return false;
    }
   
   public static boolean isCycle(int v, List<List<Integer>> list)
   {
     boolean vis[] = new boolean[v];
    
    for(int i=0;i<v;i++){
        if(!vis[i]){
      if(detectcycle(v, list, i, vis,-1)) return true;
        }
    }
    return false;
   }
}