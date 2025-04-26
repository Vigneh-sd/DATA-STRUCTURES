//import java.util.*;

public class DecimalBinaryConversion{

   public static String decimaltobinary(int decimal)
   {
      StringBuilder sb = new StringBuilder();
        while(decimal>=1)                               // Inbuilt func for this method --> Integer.toBinaryString(decimal);
        {
           if(decimal%2==1) sb.append(1);
           else sb.append(0);
            decimal/=2;
        }
        sb.reverse();
        return sb.toString();
   }

   public static int binarytodecimal(String binary)
   {
        int num=0;                                      // Inbuilt func for this method --> Integer.parseInt(binary, 2); 
        int n=1;
        for(int i=binary.length()-1;i>=0;i--)
        {
           if(binary.charAt(i)=='1') num+=n;
           n=2*n;
        }
        return num;
   }
    public static void main(String[] args) {
        int decimal=13;
        String binary="1101";
        String ans1 = decimaltobinary(decimal);
        int ans2 = binarytodecimal(binary);
        System.out.println(ans1);
        System.out.println(ans2);
    }
}