//import java.util.*;

public class CountNoOfFlips{
    public static void main(String[] args) {
        
       int start=10;
       int goal=7;
       int ans=start^goal;
       int cnt=0;
       while(ans>0)
       {
        ans=ans&(ans-1);
        cnt++;
       }
        System.out.println(cnt);
    
    }
}