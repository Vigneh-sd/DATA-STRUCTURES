import java.util.*;

class SumSubarrayMin {
    public int solution(int[] a) {
        int prevmin[] = new int[a.length];
        int nextmin[] = new int[a.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<a.length;i++)
        {
            while(!st.isEmpty() && a[i]< a[st.peek()])
            {
                st.pop();
            }
            prevmin[i]= st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        st.clear();

         for(int i=a.length-1;i>=0;i--)
        {
            while(!st.isEmpty() && a[i]<= a[st.peek()])
            {
                st.pop();
            }
            nextmin[i]= st.isEmpty() ? a.length : st.peek();
            st.push(i);
        }
       long total=0;
       int mod=(int)1e9+7;
        for(int i=0;i<a.length;i++)
        {
            int left=i-prevmin[i];
            int right=nextmin[i]-i;
            total=(total+(a[i]*left*right)%mod)%mod;
        }
        return (int)total;
    }
}