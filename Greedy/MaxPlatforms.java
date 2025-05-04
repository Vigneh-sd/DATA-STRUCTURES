import java.util.*;

public class MaxPlatforms{

    public static void main(String[] args) {
        int a[] = new int[]{900,1000, 1100};
        int d[] = new int[]{1100,1015,1105};

        Arrays.sort(a);
        Arrays.sort(d);

        int l=0,r=0,cnt=0,max=0;
        while(l<a.length && r<d.length)
        {
            if(a[l]<d[r])
            {
                cnt++;
                l++;
            }
            else
            {
                cnt--;
                r++;
            }
            max=Math.max(max, cnt);
        }
        System.out.println(max);

    }
}