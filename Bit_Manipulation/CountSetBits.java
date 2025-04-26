//import java.util.*;

public class CountSetBits{
    public static void main(String[] args) {
        
        int n=15;
        int cnt=0;
        //brute
        // while(n>0)
        // {
        //     if(n%2==1) cnt+=1;
        //     n/=2;
        // }
        // System.out.println(cnt);

        //optimised 1
        //  while(n>0)
        // {
        //     cnt+=n&1;
        //     n=n>>1;
        // }
        // System.out.println(cnt);
        
        //optimised 2
         while(n>0)
        {
            n=(n&(n-1));
            cnt++;
        }
        
        System.out.println(cnt);
    
    }
}