public class CeilFloorSortedArrayBS {
    public static int ceil(int a[], int k) {
      int low=0,ceil=a.length;
      int high=a.length-1;
      while(low<=high)
      {
        int mid=low+((high-low)/2);

       if(a[mid]>=k)
        {
            ceil=Math.min(ceil, mid);
            high=mid-1;
        }
        else
        {
            low=mid+1;
        }
      }
    
      return ceil;
      
    }
     public static int floor(int a[], int k) {
      int low=0,floor=-1;
      int high=a.length-1;
      while(low<=high)
      {
        int mid=low+((high-low)/2);

       if(a[mid]<=k)
        {
            floor=Math.max(floor, mid);
            low=mid+1;
            
        }
        else
        {
           high=mid-1;
        }
      }
    
      return floor;
      
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 11, 21}; 
        int k = 4;
        int ans1 = ceil(arr, k);
        int ans2 = floor(arr, k);
        System.out.println(ans1);
        System.out.println(ans2);

    }
}
