


public class KthMissingPositiveBS {
    public static int solution(int a[],int k) {
       
      
      int low=0;
      int high=a.length-1;
      while(low<=high)
      {
        int mid=low+((high-low)/2);
        int missing=a[mid]-(mid+1);
        if(missing<k)
        low=mid+1;
        else
        high=mid-1; 
      }
    return low+k;
    }


    public static void main(String[] args) {
        int k=4;
        int arr[] = {1,7,9,10,12}; 
        int ans = solution(arr,k);
        System.out.println(ans);
    }
}
