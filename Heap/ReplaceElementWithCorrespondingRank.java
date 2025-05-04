
import java.util.*;

class ReplaceElementWithCorrespondingRank
 {
    public int[] solution(int[] a) {
        int ans[] = new int[a.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            pq.add(a[i]);
        }
      int ind=0;
       while(!pq.isEmpty())
       {
        map.put(pq.poll(),ind++);
       }
       

       for(int i=0;i<a.length;i++)
       {   
            ans[i]=map.get(a[i]);
       }

       return ans;
        
        
    }
}