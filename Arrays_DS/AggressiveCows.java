
import java.util.Arrays;




public class AggressiveCows {
    public static int solution(int a[],int k) {
       Arrays.sort(a);
      int low=1;
      int high=a[a.length-1]-a[0];
      int ans=-1;
      while(low<=high)
      {
        int mid=low+((high-low)/2);
        if(placecows(a, mid, k))
        {
            ans=mid;
            low=mid+1;   
        }
        else
        {
            high=mid-1;
        }
        
      }
    return ans;
    }
    public static boolean placecows(int a[], int mid, int k)
    {
        int dif=a[0],c=1;
        for(int i=1;i<a.length;i++)
        {
            if(a[i]-dif>=mid)
            {
                c++;
                dif=a[i];
            }
            if(c>=k)
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int k=4;
        int arr[] = {0,3,4,7,9,10}; 
        int ans = solution(arr,k);
        System.out.println(ans);
    }
}
