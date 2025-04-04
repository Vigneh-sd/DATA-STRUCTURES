
public class PeakElement {
    public static int solution(int a[]) {
        int low=1, high=a.length-2;
        if(a.length==1 ) return a[0];
        if(a[0]>a[1]) return a[0];
        if(a[a.length-1]>a[a.length-2]) return a[a.length-1];
        while(low<=high)
        {
            int mid=low+((high-low)/2);
            if(a[mid]>a[mid-1] && a[mid]>a[mid+1])
            return a[mid];
            else if(a[mid]>a[mid-1])
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
      return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,5,2}; 
        int ans = solution(arr);
        System.out.println(ans);
    }
}
