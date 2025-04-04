
public class FindRowMaxOne {
    public static int solution(int a[][],int n,int m) {
         int max=-1,ans=m,ind=-1;
      for(int i=0;i<n;i++)
      {
        int low=0;
        int high=m-1;
        while(low<=high)
        {
         int mid=low+(high-low)/2;
         if(a[i][mid]==1)
         {
            ans=mid;
            high=mid-1;
         }
         else{
            low=mid+1;
         }
        }
        if(m-ans>max)
        {
            max=m-ans;
            ind=i;
        }
       
      }
      return ind;
    }

    public static void main(String[] args) {
        int n=3,m=3;
        int arr[][] = {{1,0,1},{1,1,1},{1,1,1}}; 
        int ans = solution(arr,n,m);
        System.out.println(ans);
    }
}
