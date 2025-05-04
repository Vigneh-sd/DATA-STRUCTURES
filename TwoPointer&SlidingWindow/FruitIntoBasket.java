import java.util.*;
public class FruitIntoBasket{

    public static void main(String[] args) {
        
        int a[] = new int[]{};
        int k=2;
        Map<Integer, Integer> map = new HashMap<>();

        int r=0, l=0, max=0;
        while(r<a.length)
        {
            map.put(a[r], map.getOrDefault(a[r],0)+1);
            while(map.size()>k)
            {
                map.put(a[l], map.get(a[l])-1);
                if(map.get(a[l])==0) map.remove(a[l]);
                l=l+1;
            }
           
            max= Math.max(max,r-l+1);
            r++;
        }
    }
}