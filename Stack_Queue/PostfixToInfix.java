import java.util.*;

public class PostfixToInfix {
      public static void main(String[] args) {
      String s="AB-DE+F*/";
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
                String last1=st.pop();
                String last2=st.pop();
                String res="("+last2+ch+last1+")";
                st.push(res);
            }
        }
      }
      System.out.println(st);
    }
}