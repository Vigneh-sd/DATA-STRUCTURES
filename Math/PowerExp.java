

public class PowerExp {

    public static int pow(int x, int n)
    {
        if(n==0) return 1;
        int ans=pow(x,n/2);
        if(n%2==0) ans=ans*ans;
        else ans=x*ans*ans;
        return ans;
    }
    public static void main (String[] args) {
      int x=2, n=5;
      int ans=pow(x,n);
      System.out.print(ans);
    }
}