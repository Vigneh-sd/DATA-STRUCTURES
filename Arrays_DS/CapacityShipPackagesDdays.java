

public class CapacityShipPackagesDdays {
    public static int solution(int a[],int d) {
       
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
        if(weight(a, mid, d))
        {
            ans=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }

       
      }
    return ans;
    }
    public static boolean weight(int a[], int mid, int d)
    {
        int sum=0,c=1;
       for(int i=0;i<a.length;i++)
       {
           sum+=a[i];
           if(sum>mid)
           {
             c++;
             sum=a[i];
           }
          if(c>d)
          return false;
       }
       return true;
    }


    public static void main(String[] args) {
        int d=1;
        int arr[] = {1,2,3,4,5}; 
        int ans = solution(arr,d);
        System.out.println(ans);
    }
}
