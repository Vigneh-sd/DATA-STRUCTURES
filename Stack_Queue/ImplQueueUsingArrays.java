
import java.util.Arrays;


public class ImplQueueUsingArrays {
     int a[]= new int[10];
     int start=-1, end=-1;
   void push(int x)
   {
     if(start==-1 && end==-1)
     {
        start=end=0;
     }
     else
     {
        end++;
     }
     a[end]=x;
   }
   int peek()
   {
    if(start==-1 && end==-1) return Integer.MIN_VALUE;
    return a[start];
   }
   int pop()
   {
    if(start==-1 && end==-1) return Integer.MIN_VALUE;
    int ele=a[start];
    start=start+1;
    if (start>end) { 
        start=end=-1;
    }
    return ele;
   }
    public static void main (String[] args) {
     ImplQueueUsingArrays q = new ImplQueueUsingArrays();
     q.push(1);
     q.push(2);
     q.push(2);
     q.peek();
     q.pop();
     System.out.println(Arrays.toString(q.a));
    }
}