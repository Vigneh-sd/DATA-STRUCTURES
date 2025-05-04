
import java.util.*;
class MaximalRectangle {
     public int histogram(int[] a) {
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
    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] prefsum= new int[n][m];
        int sum=0;
        for(int j=0;j<m;j++)
        {
            sum=0;
            for(int i=0;i<n;i++)
            {
               if(matrix[i][j]=='1')
               sum+=1;
               else
               sum=0;
               prefsum[i][j]=sum;
            }
        }
        int maxarea=0;
        for(int i=0;i<n;i++)
        {
          maxarea=Math.max(maxarea, histogram(prefsum[i]));
        }
      return maxarea;
    }
}