import java.util.*;

public class NearestSmallerElement{

    public static void main(String[] args) {
        int a[]= {4,3,6,9,8,14,19,2,1,7,6};
        
        Stack<Integer> st = new Stack<>();
        int ans[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
          while(!st.isEmpty() && st.peek()>=a[i])
          {
            st.pop();
          }
          if(st.isEmpty())
          {
            ans[i]=-1;
          }
          else
          {
            ans[i]=st.peek();
          }
          st.push(a[i]);
        }
        System.out.println(Arrays.toString(ans));
    }
}