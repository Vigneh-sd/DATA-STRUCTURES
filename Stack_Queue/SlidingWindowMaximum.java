import java.util.*;
class SlidingWindowMaximum {
    public int[] solution(int[] a, int k) {
        Deque<Integer> q = new ArrayDeque<>();
        int ans[] = new int[a.length-k+1];
        int j=0;
        for(int i=0;i<a.length;i++)
        {
            if(!q.isEmpty() && q.peek()==i-k)
            {
                q.poll();
            }
            while(!q.isEmpty() && a[q.peekLast()]<a[i])
            {
                q.pollLast();
            }
            q.offer(i);
            if(i>=k-1)
            {
                ans[j++]=a[q.peek()];
            }
        }
        return ans;
    }
}