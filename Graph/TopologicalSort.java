import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


class TopologicalSortDFS {

    public static void topo(int v, List<List<Integer>> list, int node, boolean vis[], Stack<Integer>st)
    {
        vis[node]=true;
       
       
       List<Integer> temp = list.get(node);
       for(int i=0;i<temp.size();i++)
       {
         if(!vis[temp.get(i)])
         {
            topo(v, list, temp.get(i), vis, st);
         }
        
       }
        st.push(node);     
       
    }
   
   public static List<Integer> TopoSort(int v, List<List<Integer>> list)
   {
     boolean vis[] = new boolean[v];
     Stack<Integer> st = new Stack<>();
    
    for(int i=0;i<v;i++){
    if(!vis[i]){
      topo(v, list, i, vis,st);
    }
  }
   List<Integer> ans= new ArrayList<>();
   while(!st.isEmpty())
   {
    ans.add(st.pop());
   }
    return ans;
   }
}