
import java.util.Arrays;


public class SearchTwoDArrays2 {
    public static int solution(int a[],int k,int m) {
        int low=0;
        int high=m-1;
        while(low<=high)
        {
          int mid=low+(high-low)/2;
          if(a[mid]==k)
          {
            return mid;
          }
          else if(a[mid]>k)
          {
            high=mid-1;
          }
          else{
            low=mid+1;
          }
        
        }
      return -1;
    }
    public static int[] search(int a[][],int k)
    {
       for(int i=0;i<a.length;i++)
       {
         int ans=solution(a[i],k,a[0].length);
         if(ans!=-1)
         return new int[]{i,ans};
       }
    return new int []{-1,-1};
    }

    public static void main(String[] args) {
        int k=8;
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}}; 
        int ans[] = search(arr,k);
        System.out.println(Arrays.toString(ans));
    }
}
