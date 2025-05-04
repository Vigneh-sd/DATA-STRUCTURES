import java.util.*;

public class PrefixToPostfix {
      public static void main(String[] args) {
      String s="";
      Stack<String> st = new Stack<>();
      for(int i=s.length()-1;i>=0;i--)
      {
        char ch=s.charAt(i);
        if(Character.isLetterOrDigit(ch))
        {
            st.push(Character.toString(ch));
        }
        else{
            if(st.size()>=2)
            {
                String last1=st.pop();
                String last2=st.pop();
                String res=last1+last2+ch;
                st.push(res);
            }
        }
      }
      System.out.println(st);
    }
}