public class UpperBoundBS {
    public static int solution(int a[], int k) {
      int low=0,ans=Integer.MAX_VALUE;
      int high=a.length-1;
      while(low<=high)
      {
        int mid=low+((high-low)/2);
        if(a[mid]>k)
        {
            ans=Math.min(ans, mid);
            high=mid-1;
        }
        else
        {
            low=mid+1;
        }
      }
      if(ans==Integer.MAX_VALUE)
      return -1;
      else
      return ans;
      
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 11, 21}; 
        int k = 2;
        int ans = solution(arr, k);
        System.out.println(ans);
    }
}
