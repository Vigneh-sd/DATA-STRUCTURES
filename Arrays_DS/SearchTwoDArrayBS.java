

public class SearchTwoDArrayBS {
    public static boolean solution(int a[],int k,int m) {
        int low=0;
        int high=m-1;
        while(low<=high)
        {
          int mid=low+(high-low)/2;
          if(a[mid]==k)
          {
            return true;
          }
          else if(a[mid]>k)
          {
            high=mid-1;
          }
          else{
            low=mid+1;
          }
        
        }
      return false;
    }
    public static boolean search(int a[][], int n, int m, int k)
    {
       for(int i=0;i<n;i++)
       {
         boolean ans=solution(a[i],k,m);
         if(ans)
         return true;
       }
        return false;
    }

    public static void main(String[] args) {
        int n=3,m=4,k=8;
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}}; 
        boolean ans = search(arr,n,m,k);
        System.out.println(ans);
    }
}
