
import java.util.PriorityQueue;

class SortKSorted {
    public int[] solution(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<=k && i<nums.length;i++)
        {
            pq.add(nums[i]);
        }
       int ind=0;
       for(int i=k+1;i<nums.length;i++)
       {
        nums[ind++]=pq.poll();
        pq.add(nums[i]);
       }
       while(!pq.isEmpty())
       {
        nums[ind++]=pq.poll();
       }
       return nums;
        
    }
}