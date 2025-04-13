import java.util.*;
class PalindromePartioning {
    public static void substr(int ind, String s, List<String> lst,  List<List<String>> list)
    {
        if(ind==s.length())
        {
            list.add(new ArrayList<>(lst));
            return;
        }
        for(int i=ind;i<s.length();i++)
        {
            if(palindrome(ind,i,s))
            {
                lst.add(s.substring(ind,i+1));
                substr(i+1,s,lst,list);
                lst.remove(lst.size()-1);
            }
        }
    }
    public static boolean palindrome(int start,int end, String s)
    {
        while(start<end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                return false;
            }
            start=start+1;
            end=end-1;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList();
        List<String> lst = new ArrayList();
        substr(0,s,lst,list);
        return list;
    }
}