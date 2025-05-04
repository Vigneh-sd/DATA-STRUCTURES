import java.util.*;

class LargestRectangleHistogram {
    public int solution(int[] a) {
        Stack<Integer> st = new Stack<>();
        int area=0, maxarea=0;
        for(int i=0;i<a.length;i++)
        {   
            while(!st.isEmpty() && a[st.peek()]>= a[i])
            {
                 int val=a[st.peek()];
                 st.pop();
                 int prev= st.isEmpty() ? -1 : st.peek();
                 int width= i;
                 maxarea=Math.max(maxarea, val*(width-prev-1)); 
            } 
              st.push(i);
        }
        while (!st.isEmpty()) {
            int val=a[st.pop()];
            int prev= st.isEmpty() ? -1 : st.peek();
            int width= a.length;
            maxarea = Math.max(maxarea, val*(width-prev-1));
        }
        return maxarea;
    }
}