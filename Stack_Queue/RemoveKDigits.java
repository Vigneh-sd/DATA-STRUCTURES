import java.util.*;

class RemoveKDigits {
    public String solution(String num, int k) {

        if(k==0 || num.length()==0) return num;
        if(k>=num.length()) return "0";

        Stack<Character> st = new Stack<>();
        for(int i=0;i<num.length();i++)
        {
            char ch = num.charAt(i);
            while(!st.isEmpty() && ch<st.peek() && k!=0)
            {
                st.pop();
                k--;
            }
            st.push(ch);

        }

        while(k>0)
        {
            st.pop();
            k--;
        }
            StringBuilder sb = new StringBuilder();
                while(!st.isEmpty())
                {
                    sb.append(st.pop());
                }
            sb.reverse();

            while(sb.length()>1 && sb.charAt(0)=='0')
            {
                sb.deleteCharAt(0);
            }

            return sb.toString();
    }
}