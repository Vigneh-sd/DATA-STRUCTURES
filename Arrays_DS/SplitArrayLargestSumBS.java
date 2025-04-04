

public class SplitArrayLargestSumBS {
    public static int solution(int a[],int k) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            max=Math.max(max,a[i]);
            sum+=a[i];
        }
      int low=max;
      int high=sum;
      int ans=-1;
      while(low<=high)
      {
        int mid=low+((high-low)/2);
        if(minsubarray(a, mid, k))
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
    public static boolean minsubarray(int a[], int mid, int k)
    {
        int sum=0,c=1;
        for(int i=0;i<a.length;i++)
        {
          if(sum+a[i]>mid)
          {
            sum=a[i];
            c++;
          }
          else
          {
            sum+=a[i];
          }
          if(c>k)
          return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int k=3;
        int arr[] = {1,2,3,4,5}; 
        int ans = solution(arr,k);
        System.out.println(ans);
    }
}
