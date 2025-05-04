import java.util.*;


class MinStack {
    Stack<Long>  st=new Stack<Long>();
    long mini;
    public MinStack() {
       mini= Long.MAX_VALUE;
    }
    
    public void push(int x) {
        
        Long val = Long.valueOf(x);
        if(st.isEmpty())
        {
            mini=val;
            st.push(val);
        }
        else
        {
           if(mini>val)
           {
             st.push(2*val-mini);
             mini=val;
           }
           else
           {
            st.push(val);
           }
        }
    }
    
    public void pop() {
        if(st.isEmpty())
        {
            return;
        }
        else
        {
            long x= st.peek();
            st.pop();
            if(x<mini)
            {
               mini=2*mini-x;
            }
        }
    }
    
    public int top() {
        long x= st.peek();
        if(x>mini)
        {
            return (int)x;
        }
        return (int)mini;
    }
    
    public int getMin() {
        return(int)mini;
    }
}

//brute
// class Pair{

//    int x;
//    int y;

//    Pair(int x, int y)
//    {
//      this.x=x;
//      this.y=y;
//    }  

// }

// public class MinStack {
//      Stack<Pair> st = new Stack<>();
//       public void push(int k)
//       {
//         int min=k;
//         if(st.isEmpty())
//         {
//            min=k;
//         }
//         else{
//            min =Math.min(st.peek().y, k);
//         }
//         st.push(new Pair(k,min));
//       }

//       public int peek()
//       {
//         return st.peek().x;
//       }

//        public void pop()
//       {
//           st.pop();
//       }

//      public int getmin()
//      {
//         return st.peek().y;
//      }

//       public static void main(String[] args) {
        
        

//     }
// }