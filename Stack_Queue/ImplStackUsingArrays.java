
import java.util.Arrays;


public class ImplStackUsingArrays {
     int a[]= new int[10];
     int top=-1;
   
   void push(int x)
   {
     top=top+1;
     a[top]=x;
   }
   int peek()
   {
    if(top==-1) return Integer.MIN_VALUE;
    return a[top];
   }
   int pop()
   {
    if(top==-1) return Integer.MIN_VALUE;
    int ele=a[top];
    top=top-1;
    return ele;
   }
   int size()
   {
    if(top==-1) return 0;
    return top+1;
   }
    public static void main (String[] args) {
     ImplStackUsingArrays st = new ImplStackUsingArrays();
     st.push(1);
     st.push(2);
     st.push(2);
     st.peek();
     st.pop();
     st.size();
     System.out.println(Arrays.toString(st.a));
    }
}