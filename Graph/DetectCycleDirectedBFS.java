
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


class DetectCycleDirectedBFS {

    
   public static boolean dtectcycle(int v, List<List<Integer>> list)
   {
     int indeg[]= new int[v];

     for(int i=0;i<v;i++){
       List<Integer> temp = list.get(i);
       for(int j=0;j<temp.size();j++)
       {
         indeg[temp.get(j)]++;
       }
     }

     Queue<Integer> q = new LinkedList<>();

     for(int i=0;i<v;i++)
     {
        if(indeg[i]==0)
        {
            q.offer(i);
        }
     }
  int cnt=0;
     while(!q.isEmpty())
     {
       int top= q.poll();
       cnt++;

       List<Integer> temp = list.get(top);
       for(int i=0;i<temp.size();i++)
       {
        indeg[temp.get(i)]--;
        if(indeg[temp.get(i)]==0)
        {
            q.offer(temp.get(i));
        }
       }
     }
   
   return cnt==v;
   }
}