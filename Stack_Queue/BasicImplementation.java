import java.util.*;

public class BasicImplementation {

    public static void main (String[] args) {
      Stack<Integer> st = new Stack();
      st.push(2);
      st.push(3);
      st.push(1);
      st.push(4);
      st.pop();
      st.peek();
      st.size();
      System.out.println(st);

      Queue<Integer> q= new LinkedList<>();
      q.add(2);
      q.add(3);
      q.remove();
      q.peek();
      q.size();
      System.out.println(q);


    }
}