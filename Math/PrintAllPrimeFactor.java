
import java.util.ArrayList;



public class PrintAllPrimeFactor {
    public static void main (String[] args) {
       int n=22;
       ArrayList<Integer> list = new ArrayList();
       for(int i=2;i<=Math.sqrt(n);i++)
       {
          if(n%i==0)
          {
             list.add(i);
             while(n%i==0)
             {
                n/=i;
             }
          }
       }
       if(n!=1) list.add(n);
       System.out.print(list);
    }
}