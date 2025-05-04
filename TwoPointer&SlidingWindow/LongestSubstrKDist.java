
import java.util.*;
public class LongestSubstrKDist{

    public static void main(String[] args) {
        
        String a= "akdbaheeadsl";
        int k=2;
        Map<Character, Integer> map = new HashMap<>();

        int r=0, l=0, max=0;
        while(r<a.length())
        {
           char ch=a.charAt(r);
           map.put(ch, map.getOrDefault(ch, 0)+1);
           while(map.size()>k)
           {
             map.put(a.charAt(l),map.get(a.charAt(l))-1);
             if(map.get(a.charAt(l))==0) map.remove(a.charAt(l));
             l=l+1;
           }
           max=Math.max(max, r-l+1);
           r=r+1;

        }
        System.out.println(max);
    }
}