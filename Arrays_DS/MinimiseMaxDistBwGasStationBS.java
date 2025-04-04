

public class MinimiseMaxDistBwGasStationBS {
    public static double solution(int a[],int k,int n) {
       int howmany[]=new int[n-1];
       for(int gs=1;gs<=k;gs++)
       {
         double max=-1;
        int maxind=-1;
        for(int i=0;i<a.length-1;i++)
        {
            int diff=a[i+1]-a[i];
            double ans= (double)(diff/(howmany[i]+1));
            if(ans>max)
            {
                max=ans;
                maxind=i;
            }
        }
         howmany[maxind]++;
       }
         double maxans=-1;
       for(int i=0;i<n-1;i++)
       {
        int diff=a[i+1]-a[i];
        double seclen=(double)(diff/(howmany[i]+1));
        maxans=Math.max(maxans, seclen);
       }
       return maxans;
       
    }
  

    public static void main(String[] args) {
        int n=5;
        int k=5;
        int arr[] = {1,13,17,20,23}; 
        double ans = solution(arr,k,n);
        System.out.println(ans);
    }
}

// Binary Search - Optimal One


// import java.util.*;

// public class MinimiseMaxDistBwGasStationBS {
//     public static int numberOfGasStationsRequired(double dist, int[] arr) {
//         int n = arr.length; // size of the array
//         int cnt = 0;
//         for (int i = 1; i < n; i++) {
//             int numberInBetween = (int)((arr[i] - arr[i - 1]) / dist);
//             if ((arr[i] - arr[i - 1]) == (dist * numberInBetween)) {
//                 numberInBetween--;
//             }
//             cnt += numberInBetween;
//         }
//         return cnt;
//     }

//     public static double minimiseMaxDistance(int[] arr, int k) {
//         int n = arr.length; // size of the array
//         double low = 0;
//         double high = 0;

//         //Find the maximum distance:
//         for (int i = 0; i < n - 1; i++) {
//             high = Math.max(high, (double)(arr[i + 1] - arr[i]));
//         }

//         //Apply Binary search:
//         double diff = 1e-6 ;
//         while (high - low > diff) {
//             double mid = (low + high) / (2.0);
//             int cnt = numberOfGasStationsRequired(mid, arr);
//             if (cnt > k) {
//                 low = mid;
//             } else {
//                 high = mid;
//             }
//         }
//         return high;
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         int k = 4;
//         double ans = minimiseMaxDistance(arr, k);
//         System.out.println("The answer is: " + ans);
//     }
// }


