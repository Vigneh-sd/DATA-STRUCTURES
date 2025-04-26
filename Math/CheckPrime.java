

public class CheckPrime {
    public static void main (String[] args) {
       int n=36;
       if(n <= 1) {
       System.out.println("not prime");
       return;
}
       int cnt=0;
       for(int i=2;i<=Math.sqrt(n);i++)
       {
           
           if(n%i==0)
           {
                if(i==n/i)
                {
                    cnt+=1;
                }
                else{
                    cnt+=2;
                }
           }

       }
       if(cnt==0) 
       System.out.print("prime");
       else
       System.out.println("not prime");
    }
}