
public class SmallestDivisorBs {
    public static int solution(int a[],int limit) {
       
      int max=Integer.MIN_VALUE;
      for(int i=0;i<a.length;i++)
      {
       max=Math.max(max,a[i]);
      }
      int low=1;
      int high=max;
      int ans=0;
      while(low<=high)
      {
        int mid=low+((high-low)/2);
        if(divisor(a,mid,limit))
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
    public static boolean divisor(int a[], int mid, int limit)
    {
        int ceil=0;
          for(int i=0;i<a.length;i++)
          {
           ceil+=(a[i]+mid-1)/mid;
           if(ceil>limit)
           return false;
          }
         return true;
    }


    public static void main(String[] args) {
        int limit=8;
        int arr[] = {1,2,3,4,5}; 
        int ans = solution(arr,limit);
        System.out.println(ans);
    }
}
