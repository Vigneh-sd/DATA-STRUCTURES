
public class SearchRotatedSortedBS {
    public static int solution(int a[], int k) {
      int low=0;
      int high=a.length-1;
      while(low<=high)
      {
        int mid=low+((high-low)/2);
        if(a[mid]==k)
        {
            return mid;
        }
        else if(a[mid] >= a[low])
        {
          if(a[mid]>=k && a[low]<=k)
          {
            high=mid-1;
          }
          else{
            low=mid+1;
          }
        }
        else
        {
            if(a[mid]<=k && a[high]>=k)
          {
             low=mid+1;
          }
          else{
             high=mid-1;
          }
        }
      }
      return -1;
    }

    public static void main(String[] args) {
        int arr[] = {3, 11, 21,1,2}; 
        int k = 1;
        int ans = solution(arr, k);
        System.out.println(ans);
    }
}
