

public class SearchRotatedSortedDuplicatesBS {
    public static boolean solution(int a[], int k) {
      int low=0;
      int high=a.length-1;
      while(low<=high)
      {
        int mid=low+((high-low)/2);
        if(a[mid]==k)
        {
            return true;
        }
        else if(a[low]==a[mid] && a[mid]==a[high])
        {
            low=low+1;
            high=high-1;
            continue;
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
      return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 11, 1,1,1}; 
        int k = 11;
        boolean ans = solution(arr, k);
        System.out.println(ans);
    }
}
