public class SmallestPositiveMissingNum{
     
     public static int solution(int arr[], int n)
     {
        for(int i=0;i<n;i++)
        {
            while(arr[i] > 0 && arr[i] <=n && (arr[arr[i]-1]!= arr[i]) )
            {
                int temp = arr[i];
                arr[i] = arr[arr[i]-1];
                arr[temp-1] = temp;
            }
        }
        int res=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=i+1)
             {
                res= i+1;
                break;
            }
        }
        return res;
     }
   public static void main(String[] args) {
       int arr[] = new int[]{-1,1,2,3,5,-6,0,-8};
       int n = 8;
       int ans = solution(arr,n);
       System.out.println("" + ans);
   }
}