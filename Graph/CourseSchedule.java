import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


class CourseSchedule {

    
   public static List<Integer> kahn(int n, int m, int v, int preerq[][])
   {
    List<List<Integer>> list = new ArrayList<>();
    
    for(int i=0;i<n;i++)
    {
        list.add(new ArrayList<>());
    }

    for(int i=0;i<m;i++)
    {
       list.get(preerq[i][1]).add(preerq[i][0]);
    }

     

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
   List<Integer> ans = new ArrayList<>();
     while(!q.isEmpty())
     {
       int top= q.poll();
       ans.add(top);

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
   
   return ans;
   }
}