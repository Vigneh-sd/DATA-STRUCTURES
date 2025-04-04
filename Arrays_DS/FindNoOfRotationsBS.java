


public class FindNoOfRotationsBS {
    public static int solution(int a[]) {
      int low=0,min=Integer.MAX_VALUE,index=-1;
      int high=a.length-1;
      while(low<=high)
      {
        int mid=low+((high-low)/2);
          if(a[low]<=a[high]){
       if(a[low]<min)
       {
        min=a[low];
        index=low;
       }
        break;
        }
        if(a[mid] >= a[low])
        {
            if(a[low]<min)
       {
        min=a[low];
        index=low;
       }
            low=mid+1;
        }
        else
        {
            if(a[low]<min)
       {
        min=a[mid];
        index=mid;
       }
            high=mid-1;
        }
      }
     return index;
    }

    public static void main(String[] args) {
        int arr[] = {3,0,1,2}; 
        int ans = solution(arr);
        System.out.println(ans);
    }
}
