
import java.util.Collections;
import java.util.PriorityQueue;

class KthSmallest {
    public int solution(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++)
        {
            pq.add(nums[i]);
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        return pq.peek();
        
    }
}