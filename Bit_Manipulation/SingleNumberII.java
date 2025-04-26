public class SingleNumberII {
    public static void main (String[] args) {
        int a[]= {1,2,3,2,2,1,1};
        //optimal
       int ones=0;
       int twos=0;
       for(int i=0;i<a.length;i++)
       {
        ones=(ones^a[i]) & ~twos;
        twos=(twos^a[i]) & ~ones;
       }
        System.out.println(ones);


        //better
        //  int flag=0;
        //  Arrays.sort(a);
        //  for(int i=1;i<a.length;i+=3)
        //  {
        //     if(a[i]!=a[i-1])
        //     {
        //         flag=1;
        //         System.out.println(a[i-1]);
        //         break;
        //     }
        //  }
        // if(flag==0)
        // {
        //      System.out.println(a[a.length-1]);
        // }

        //brute
        //  int cnt;
        // int ans=0;
        // for(int bitindex=0;bitindex<31;bitindex++)
        // {
        //     cnt=0;
        //     for(int i=0;i<nums.length;i++)
        //     {
        //         if((nums[i] & (1<<bitindex))!=0)
        //         {
        //            cnt++;
        //         }
        //     }
        //     if(cnt%3==1)
        //     {
        //        ans= ans | (1<<bitindex);
        //     }
        // }
       
       
    }
}