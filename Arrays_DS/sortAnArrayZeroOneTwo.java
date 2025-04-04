
import java.util.Arrays;

public class sortAnArrayZeroOneTwo{

    public static int []solution(int arr[], int n) {
      int c1=0,c2=0,c3=0;
      for(int i=0;i<n;i++){
        if(arr[i]==0)
        {
            c1++;
        }
         if(arr[i]==1)
        {
            c2++;
        }
         if(arr[i]==2)
        {
            c3++;
        }
      }
      int ans[] = new int[c1+c2+c3];
      int l=0;
      for(int i=0;i<c1;i++)
      {
        ans[l++]=0;
      }
      for(int i=0;i<c2;i++)
      {
        ans[l++]=1;
      }
      for(int i=0;i<c3;i++)
      {
        ans[l++]=2;
      }
      return ans;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{0,2,1,2,0};
        int n=5;
        int ans[] = solution(arr, n);
        System.out.println(Arrays.toString(ans));
    }
}