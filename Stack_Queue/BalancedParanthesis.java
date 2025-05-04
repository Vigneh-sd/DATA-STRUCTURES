import java.util.*;

class BalancedParanthesis {
    public boolean isValid(String s) {
        if((s.length() & 1) == 1) return false;
        Stack<Character> st = new Stack();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')
            {
                st.push(s.charAt(i));
            }
            else
            {
                if(st.isEmpty())
                {
                    return false;
                }
                    
                else
                {
                char ch=st.pop();
                if((s.charAt(i)==')' && ch=='(') || (s.charAt(i)==']' && ch=='[') || (s.charAt(i)=='}' && ch=='{'))
                {
                    continue;
                }
                 else
                 {
                    return false;
                 }
                }
            }
        }
        return st.isEmpty();

    }
}