public class SearchInsertPos {
    public static int solution(int a[], int k) {
      int low=0,ans=a.length;
      int high=a.length-1;
      while(low<=high)
      {
        int mid=low+((high-low)/2);
        if(a[mid]==k)
        return mid;

        else if(a[mid]>k)
        {
            ans=Math.min(ans, mid);
            high=mid-1;
        }
        else
        {
            low=mid+1;
        }
      }
    
      return ans;
      
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 11, 21}; 
        int k = 0;
        int ans = solution(arr, k);
        System.out.println(ans);
    }
}
