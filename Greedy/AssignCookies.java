
import java.util.Arrays;

class AssignCookies {
    public int soln(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int l=0, r=0, cnt=0;
        while(l<g.length && r<s.length)
        {
            if(g[l]<=s[r])
            {
                cnt++;
                r++;
                l++;
            }
            else if(g[l]>s[r])
            {
                r=r+1;
            }
        }
        return cnt;
    }
}