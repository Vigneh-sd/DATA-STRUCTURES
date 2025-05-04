import java.util.*;

public class InfixToPrefix {
     public static int priority(char c)
     {
         switch (c) {
             case '^':
                 return 3;
             case '*':
             case '/':
                 return 2;
             case '+':
             case '-':
                 return 1;
             default:
                 break;
         }
        return -1;
     }
    public static void main(String[] args) {
        String s="";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)=='(')
            {
                sb.setCharAt(i, ')');
            }
            else if(sb.charAt(i)==')')
            {
               sb.setCharAt(i, '(');
            }
        }
        s=sb.toString();
        Stack<Character> st = new Stack<>();
        int i=0;
        String ans="";
        while(i<s.length())
        {
          if(Character.isLetterOrDigit(s.charAt(i)))
          {
              ans+=s.charAt(i);
          }
          else if(s.charAt(i)=='(')
          {
            st.push(s.charAt(i));
          }
          else if(s.charAt(i)==')')
          {
            while(!st.isEmpty() && st.peek()!='(')
            {
                ans+=st.pop();
            }
            st.pop();
          }
          else
          {
             while(!st.isEmpty() && priority(s.charAt(i))<priority(st.peek())) 
             {
                ans+=st.pop();
             }
                st.push(s.charAt(i));
          }
          i++;
        }
        while(!st.isEmpty())
        {
            ans+=st.pop();
        }
        StringBuilder res=new StringBuilder(ans);
        ans=res.reverse().toString();
        System.out.println(ans);
    }
}