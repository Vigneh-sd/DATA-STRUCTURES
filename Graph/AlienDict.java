import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


class AlienDict {

    public static String aliendict(String ar[], int n, int k)
    {
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0;i<k;i++)
        {
            list.add(new ArrayList<>());
        }

        for(int i=0;i<n-1;i++)
        {
            String s1=ar[i];
            String s2=ar[i+1];

            int len= Math.min(s1.length(),s2.length());

            for(int j=0;j<len;j++)
            {
               if(s1.charAt(j)!=s2.charAt(j))
               {
                list.get(s1.charAt(j) - 'a').add(s2.charAt(j) - 'a');
                break;
               }
            }
        }

        List<Integer> ans = new ArrayList<>();
        ans=kahn(k,list);

        String res="";

        for(int i=0;i<ans.size();i++)
        {
            res+=(char)(ans.get(i) + 'a');
        }
        return res;
    }

    
   public static List<Integer> kahn(int v, List<List<Integer>> list)
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