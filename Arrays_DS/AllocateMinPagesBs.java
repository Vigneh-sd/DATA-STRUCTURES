

public class AllocateMinPagesBs {
    public static int solution(int a[],int m,int n) {
        if (m > n) return -1;
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            max=Math.max(max,a[i]);
            sum+=a[i];
        }
      int low=max;
      int high=sum;
      int ans=-1;
      while(low<=high)
      {
        int mid=low+((high-low)/2);
        if(minbooks(a, mid, m))
        {
            ans=mid;
            high=mid-1; 
        }
        else
        {
            low=mid+1;   
        }
        
      }
    return ans;
    }
    public static boolean minbooks(int a[], int mid, int m)
    {
        int sum=a[0];
        int c=1;
        for(int i=1;i<a.length;i++)
        {
             sum+=a[i];
             if(sum>mid)
             {
                c++;
                sum=a[i];
             }
             if(c>m)
             return false;
        }
       
        return true;
    }

    public static void main(String[] args) {
        int n=5;
        int m=4;
        int arr[] = {25,46,28,49,24}; 
        int ans = solution(arr,m,n);
        System.out.println(ans);
    }
}
