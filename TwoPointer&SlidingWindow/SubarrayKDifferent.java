import java.util.*;
class SubarrayKDifferent{
    public int Solution(int[] a, int k) {
        if(k<0) return 0;
        int l=0,r=0, max=0;
        Map<Integer, Integer> map = new HashMap<>();
        while(r<a.length)
        {
            map.put(a[r], map.getOrDefault(a[r],0)+1);
            while(map.size()>k)
            {
                map.put(a[l], map.get(a[l])-1);
                if(map.get(a[l])==0) map.remove(a[l]);
                l=l+1;
            }
            max=max+r-l+1;
            r=r+1;

        }
        return max-solve(a,k-1);
    }
     public int solve(int[] a, int k) {
        if(k<0) return 0;
        int l=0,r=0, max=0;
        Map<Integer, Integer> map = new HashMap<>();
        while(r<a.length)
        {
            map.put(a[r], map.getOrDefault(a[r],0)+1);
            while(map.size()>k)
            {
                map.put(a[l], map.get(a[l])-1);
                if(map.get(a[l])==0) map.remove(a[l]);
                l=l+1;
            }
            max=max+r-l+1;
            r=r+1;

        }
        return max;
    }
    
}