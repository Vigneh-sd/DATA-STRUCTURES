public class DivideTwoIntegers {
   public static int divide(int dividend, int divisor)
   {
     if(divisor==0 || dividend==0) return 0;
       boolean flag=true;
       if((dividend<0 && divisor>0) || (dividend>0 && divisor<0))
       {
        flag=false;
       }
       long num1=Math.abs((long)dividend);
       long num2=Math.abs((long)divisor);
      int ans=0;
       while(num1>=num2)
       {
        int cnt=0;
        while((num2<<(cnt+1))<=num1)
        {
           cnt++;
        }
        num1-=num2<<(cnt);
        ans+=1<<cnt;
       }
       if(flag==false)
       {
         ans=-ans;
       }
        if (ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return ans;
   }
    public static void main (String[] args) {
       int dividend=22;
       int divisor=3;
       int ans=divide(dividend,divisor);
       System.out.println(ans);
    }
}