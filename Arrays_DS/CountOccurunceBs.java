
public class CountOccurunceBs {
    public static int first(int a[], int k) {
      int low=0,first=-1;
      int high=a.length-1;
      while(low<=high)
      {
        int mid=low+((high-low)/2);
        if(a[mid]==k)
        {
            first=mid;
            high=mid-1;
        }
        else if(a[mid]>k)
        {
            high=mid-1;
        }
        else
        {
            low=mid+1;
        }
      }
      return first;
      
    }
     public static int last(int a[], int k) {
      int low=0,last=-1;
      int high=a.length-1;
      while(low<=high)
      {
        int mid=low+((high-low)/2);
        if(a[mid]==k)
        {
            last=mid;
            low=mid+1;
        }
        else if(a[mid]>k)
        {
            high=mid-1;
        }
        else
        {
            low=mid+1;
        }
      }
      return last;
      
    }
    public static int count(int arr[],int k)
    {
        int ans = (last(arr, k)) - (first(arr, k));
        if(first(arr, k) == -1 || last(arr, k) == -1)
        return -1;
        else
         return ans+1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3,3,3, 11, 21}; 
        int k = 3;
        System.out.print(first(arr, k)+","+last(arr, k)+" ");
        System.out.println(count(arr,k));
      

    }
}
