import java.util.*;
class AsteroidCollision {
    public int[] solution(int[] asteroids) {
        if(asteroids.length==0) return asteroids;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<asteroids.length;i++)
        {
            if(asteroids[i]>=0)
            {
                st.push(asteroids[i]);
            }
            else
            {
                    while(!st.isEmpty() && st.peek()>=0 && st.peek()<Math.abs(asteroids[i]))
                    {
                        st.pop();
                    }
                    if(!st.isEmpty() && st.peek()>=0 && st.peek()==Math.abs(asteroids[i]))
                    {
                        st.pop();
                    }
                    else if(st.isEmpty() || st.peek()<0)
                    {
                        st.push(asteroids[i]);
                    }
            }
        }


       int[] arr = new int[st.size()];
       for(int i=st.size()-1;i>=0;i--) {
       arr[i] = st.pop();  
       }
      return arr;
    }
}