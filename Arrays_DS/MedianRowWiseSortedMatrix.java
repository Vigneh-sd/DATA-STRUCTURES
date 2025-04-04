public class MedianRowWiseSortedMatrix {
     public static int upperbound(int a[], int k)
     {
        int low=0;
        int high=a.length-1;
        int ct=0;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(a[mid]>k)
            {
               ct=mid;
               high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ct;
     }

     public static int median(int a[][],int n,int m)
     {
        int med=(n*m)/2;
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            low=Math.min(low,a[i][0]);
            high=Math.max(high,a[i][m-1]);
        }
        while(low<=high)
        {
            int cnt=0;
            int mid=low+(high-low)/2;
            for(int i=0;i<a.length;i++)
            {
               cnt+=upperbound(a[i],mid);
            }
            if(cnt>=med)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;
     }
    


    public static void main(String[] args) {
        int a[][] = {
            {2,5,6,7,9},
            {1,3,3,6,8},
            {5,7,8,9,10}
        };
        int n=a.length;
        int m=a[0].length;
        int ans = median(a,n,m);
        System.out.println(ans);   
    }
}
