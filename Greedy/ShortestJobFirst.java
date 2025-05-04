
import java.util.Arrays;

class ShortestJobFirst {
    public int soln(int[] a) {
        Arrays.sort(a);
        int t=0,wt=0;
        for(int i=0;i<a.length;i++)
        {
            wt=wt+t;
            t+=a[i];
            
        }
        return wt/a.length;
    }
}