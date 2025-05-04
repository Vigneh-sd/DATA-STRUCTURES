import java.util.*;

class SUmSubArrayRanges {
    public long solution(int[] a) {
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
        st.clear();

        int prevmax[] = new int[a.length];
        int nextmax[] = new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            while(!st.isEmpty() && a[i] > a[st.peek()])
            {
                st.pop();
            }
            prevmax[i]= st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        st.clear();

         for(int i=a.length-1;i>=0;i--)
        {
            while(!st.isEmpty() && a[i]>= a[st.peek()])
            {
                st.pop();
            }
            nextmax[i]= st.isEmpty() ? a.length : st.peek();
            st.push(i);
        }
        st.clear();

       long total=0;
        for(int i=0;i<a.length;i++)
        {
            int leftmin=i-prevmin[i];
            int rightmin=nextmin[i]-i;
            int leftmax=i-prevmax[i];
            int rightmax=nextmax[i]-i;
            long smaller=(1L*leftmin*rightmin*a[i]);
            long greater=(1L*leftmax*rightmax*a[i]);
            total=total+(greater-smaller);
        }
        return total;
    }
}