
import java.util.ArrayList;
import java.util.List;

public class FindDivisors {
    public static void main (String[] args) {
       int n=36;
       List<Integer> list= new ArrayList();
       for(int i=1;i<=Math.sqrt(n);i++)
       {
           if(n%i==0)
           {
            list.add(i);
            if(i!=n/i)
            {
               list.add(n/i);
            }           
           }
       }
       System.out.print(list);
    }
}