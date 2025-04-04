

public class FindMinRotatedSorted {
    public static int solution(int a[]) {
      int low=0,min=Integer.MAX_VALUE;
      int high=a.length-1;
      while(low<=high)
      {
        int mid=low+((high-low)/2);
          if(a[low]<=a[high]){
        min=Math.min(a[low],min);
        break;
        }
        if(a[mid] >= a[low])
        {
            min=Math.min(min,a[low]);
            low=mid+1;
        }
        else
        {
            min=Math.min(min, a[mid]);
            high=mid-1;
        }
      }
      if(min==Integer.MAX_VALUE)
      return -1;
      else
      return min;
    }

    public static void main(String[] args) {
        int arr[] = {3, 11, 21,22,2}; 
        int ans = solution(arr);
        System.out.println(ans);
    }
}
