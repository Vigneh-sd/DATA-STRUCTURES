
public class NthRootBS {
    public static int solution(int n, int m) {
       int low=1, high=m;
       long ans;
       while(low<=high)
       {
        int mid=low+((high-low)/2);
        ans=root(n,m,mid);
        if(ans==m)
        return mid;
        else if(ans>m)
        {
            high=mid-1;
        }
        else{
            low=mid+1;
        }
       }
       return -1;

    }
    public static Long root(int n, int m, int mid)
    {
        long ans=1;
        while(n!=0)
        {
            ans=ans*mid;
            if(ans>m) return Long.MAX_VALUE;
            n--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n=4,m=81;
        int ans = solution(n,m);
        System.out.println(ans);
    }
}
