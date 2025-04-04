


public class MedianTwoSortedArray {
    public static double solution(int a[], int b[]) {
        int n1=a.length, n2=b.length;
        int n=n1+n2;
       if(n1>n2) return solution(b,a);
       int left=(n1+n2+1)/2;
       int low=0;
       int high=n1;
       while(low<=high)
       {
        int mid1=low+(high-low)/2;
        int mid2=left-mid1;
        int l1= (mid1>0) ? a[mid1-1] : Integer.MIN_VALUE;
        int l2= (mid2>0) ? b[mid2-1] : Integer.MIN_VALUE;
        int r1= (mid1<n1) ? a[mid1] : Integer.MAX_VALUE;
        int r2= (mid2<n2) ? b[mid2] : Integer.MAX_VALUE;

        if(l1<=r2 && l2<=r1)
        {
            if(n%2==0)
            {
                return (Math.max(l1, l2)+ Math.min(r1, r2))/2.0;
            }
            else
            {
                return Math.max(l1, l2);
            }
        }
        else if(l1>r2)
        {
            high=mid1-1;
        }
        else{
            low=mid1+1;
        }
       }


       return 0.0;
    }
    public static void main(String[] args) {
        int a[] = {1,3,7,9}; 
        int b[] = {2,2,5,7,8};
        double ans = solution(a,b);
        System.out.println(ans);
    }
}
