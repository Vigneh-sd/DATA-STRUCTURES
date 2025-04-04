

public class KakoEatingBananas {
    public static int solution(int a[],int n, int h) {
      int max=Integer.MIN_VALUE;
      for(int i=0;i<a.length;i++)
      {
       max=Math.max(max,a[i]);
      }
      int low=1;
      int high=max;
      int ans=max;
      while(low<=high)
      {
        int mid=low+((high-low)/2);
        int hours=time(a,mid,h);
        if(hours<=h)
        {
          ans=mid;
          high=mid-1;
          
        }
        else{
             low=mid+1;
        }
      }
    return ans;
    }
    public static int time(int a[], int mid, int h)
    {
           int ans=0;
           for(int i=0;i<a.length;i++)
           {
            ans+=(a[i] + mid -1)/mid;
           }
             
         return ans;
    }


    public static void main(String[] args) {
        int n=4,h=8;
        int arr[] = {7,15,6,3}; 
        int ans = solution(arr,n,h);
        System.out.println(ans);
    }
}
