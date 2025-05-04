import java.util.*;

public class PostfixToPrefix {
      public static void main(String[] args) {
      String s="ab-de+f*/";
      Stack<String> st = new Stack<>();
      for(int i=0;i<s.length();i++)
      {
        char ch=s.charAt(i);
        if(Character.isLetterOrDigit(ch))
        {
            st.push(Character.toString(ch));
        }
        else{
            if(st.size()>=2)
            {
                String last2=st.pop();
                String last1=st.pop();
                String res=ch+last1+last2;
                st.push(res);
            }
        }
      }
      System.out.println(st);
    }
}