
public class MinDaysMakeMBouquets {
    public static int solution(int a[],int n, int m, int k) {
        if(m*k > n) return -1;
      int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
      for(int i=0;i<a.length;i++)
      {
       max=Math.max(max,a[i]);
       min=Math.min(min,a[i]);
      }
      int low=min;
      int high=max;
      int ans=max;
      while(low<=high)
      {
        int mid=low+((high-low)/2);
        if(days(a,mid,m,k))
        {
           ans=mid;
           high=mid-1;
        }
        else
        {
           low=mid+1;
        }
       
      }
    return ans;
    }
    public static boolean days(int a[], int mid, int m, int k)
    {
        int c=0,temp=0;
          for(int i=0;i<a.length;i++)
          {
            if(a[i]<=mid)
            {
                c++;
                if(c==k)
            {
              temp++;
              c=0;
            }
            }
            else{
              c=0;
            }
            if(temp>=m)
            return true;
          }
         return false;
    }


    public static void main(String[] args) {
        int n=8,m=3,k=2;
        int arr[] = {7,7,7,7,13,11,7,7}; 
        int ans = solution(arr,n,m,k);
        System.out.println(ans);
    }
}
