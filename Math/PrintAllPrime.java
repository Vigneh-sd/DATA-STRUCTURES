

public class PrintAllPrime {

    public static void main (String[] args) {
      int n=22;
      int boxes[]= new int[n+1];
      for(int i=0;i<boxes.length;i++)
      {
        boxes[i]=1;
      }
      
      for(int i=2;i<=Math.sqrt(n);i++)
      {        
         if(boxes[i]==1)
      {
        for(int j=i*i;j<=n;j+=i)
        {
           if(j%i==0)
           {
            boxes[j]=0;
           }
        }
      }
      }
      for(int i=2;i<boxes.length;i++)
      {
         if(boxes[i]==1)
         {
            System.out.print(i+" ");
         }
      }
    }
}